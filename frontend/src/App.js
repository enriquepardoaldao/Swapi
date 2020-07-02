import React, {Fragment, useState, useEffect} from 'react';
import Formulario from './components/Formulario';
import axios from 'axios';



function App() {


  const[busquedaPersonaje, guardarBusquedaPersonaje] = useState ({});

  useEffect(() =>{
    if(Object.keys(busquedaPersonaje).lengh === 0) return;

      const consultarApi = async()=>{

        const {personaje} = busquedaPersonaje;
        const url = 'https://swapi.dev/api/people/${personaje}/';

        const resultado = await axios(url);

        console.log(resultado);

      }

      consultarApi();

    console.log('no se ejecuta');
  }, [busquedaPersonaje]);

  return (
    
    <Fragment>
        <Formulario guardarBusquedaPersonaje={guardarBusquedaPersonaje}/>
    </Fragment>
  );
}

export default App;
