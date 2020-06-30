import {config, appFetch} from './appFetch';

export const findPeopleById = (id, onSuccess) =>
    appFetch('people/${id}', config('GET'), onSuccess);