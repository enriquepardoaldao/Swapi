import React, {useState} from 'react';

const Formulario = ({guardarBusquedaPersonaje}) => {

    const [busqueda, guardarBusqueda] = useState({
        peronaje: ''
    });

    const {personaje} = busqueda;

    const actualizarState = e =>{
        guardarBusqueda({
            ...busqueda,
            [e.target.name] : e.target.value
        })
    }

    const buscarInformacion = e =>{
        e.preventDefault();

        guardarBusquedaPersonaje(busqueda);
        
    }

    return (
        <div className="bg-info">
            <div className="container">
                <div className = 'row'>
                    <form onSubmit = {buscarInformacion}>
                        <fieldset>
                            <legend className="text-center">Buscador personajes</legend>

                            <div className="row">
                                <div className="col-md-6">
                                    <div className="form-group">
                                        <label>Personaje</label>
                                        <input type = "text" className="form-control" name="personaje" placeholder="Nombre Personaje" onChange = {actualizarState} value = {personaje}/>
                                        
                                    </div>
                                </div>
                            </div>

                            <button type="submit">
                                Buscar
                            </button>
                        </fieldset>





                    </form>
                </div>
            </div>
        </div>
    )
}

export default Formulario;