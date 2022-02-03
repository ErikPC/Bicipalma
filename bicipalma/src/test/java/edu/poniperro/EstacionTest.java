package edu.poniperro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.poniperro.domain.estacion.Estacion;

public class EstacionTest {

    /**
	 * Historia de usuario: visualizar estado de la estacion:
	 * muestra id, direccion, anclaje
	 */
    @Test
    public void crearEstacion() {
        Estacion columnas = new Estacion( 1 , "Columnas" , 6);
        assertEquals("Es la estacion con id 1 en direccion columnas", columnas.toString());
    }
    /**
	 * Historia de usuario: visualizar anclajes libres
	 */

    @Test
    public void comprobarAnclajesLibres(){
        Estacion columnas = new Estacion(1 , "Columnas", 6);
        assertEqual( 6 , columnas.consultarAnclajes());
    }
    /**
	 * Historia de usuario: anclar bicicleta(s)
	 */

    /**
	 * Historia de usuario: consultar bicicletas ancladas
	 */

     /**
	 * Historia de usuario: retirar bicicleta
	 */

     /**
	 * Historia de usuario: tarjeta inactiva
	 */

}
