import NetworkError from './NetworkError';



let networkErrorCallback;


const isJson = response => {

    const contentType = response.headers.get("content-type");

    return contentType && contentType.indexOf("application/json") !== -1;

}

const handleOkResponse = (response, onSuccess) => {

    if (!response.ok) {
        return false;
    }

    if (!onSuccess) {
        return true;
    }

    if (response.status === 204) {
        onSuccess();
        return true;
    }

    if (isJson(response)) {
        response.json().then(payload => onSuccess(payload));
    }

    return true;

}

const handle4xxResponse = (response, onErrors) => {

    if (response.status < 400 || response.status >= 500) {
        return false;
    }

    if (!isJson(response)) {
        throw new NetworkError();
    }

    if (onErrors) {

        response.json().then(payload => {
            if (payload.globalError || payload.fieldErrors) {
                onErrors(payload);
            }
        });

    }

    return true;

}

const handleResponse = (response, onSuccess, onErrors) => {

    if (handleOkResponse(response, onSuccess)) {
        return;
    }

    if (handle4xxResponse(response, onErrors)) {
        return;
    }

    throw new NetworkError();
    
}

export const init = callback => networkErrorCallback = callback;

export const config = (method, body) => {

    const config = {};

    config.method = method;

    if (body) {
        if (body instanceof FormData) {
            config.body = body;
        } else  {
            config.headers = {'Content-Type': 'application/json'};
            config.body = JSON.stringify(body);
        }
    }

    return config;

}

export const appFetch = (path, options, onSuccess, onErrors) =>
    fetch(`${process.env.REACT_APP_BACKEND_URL}${path}`, options)
        .then(response => handleResponse(response, onSuccess, onErrors))
        .catch(networkErrorCallback);
