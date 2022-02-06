package edu.poniperro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.poniperro.domain.bicicleta.Bicicleta;
import edu.poniperro.domain.estacion.Estacion;
import edu.poniperro.domain.tarjetausuario.TarjetaUsuario;

public class EstacionTest {

    /**
	 * Historia de usuario: visualizar estado de la estacion:
	 * muestra id, direccion, anclaje
	 */
    @Test
    public void crearEstacionTest() {
        Estacion columnas = new Estacion( 1 , "Columnas" , 6);
        assertEquals("Es la estación con id : 1 en direccion Columnas", columnas.toString());
    }
    
    /**
	 * Historia de usuario: visualizar anclajes libres
	 */

    @Test
    public void comprobarAnclajesLibresTest(){
        Estacion columnas = new Estacion(1 , "Columnas", 6);
        assertEquals(6, columnas.anclajesLibres());
    }
    /**
	 * Historia de usuario: anclar bicicleta(s)
	 */

    @Test
    public void anclarBicletaTest(){
        Estacion columnas = new Estacion(1 , "Columnas", 1);
        Bicicleta uno = new Bicicleta(1);
        columnas.anclarBicicleta(uno);
        assertEquals(columnas.anclajesLibres(), 0);
    }
    @Test
    public void anclarBicletaTestDos(){
        Estacion perGarau = new Estacion(1 , "Columnas", 4);
            Bicicleta dos = new Bicicleta(2);
            Bicicleta tres = new Bicicleta(3);
            perGarau.anclarBicicleta(dos);
            perGarau.anclarBicicleta(tres);
            assertEquals(perGarau.anclajesLibres(), 2);
    }
    /**
	 * Historia de usuario: consultar bicicletas ancladas
	 */

    
     /**
	 * Historia de usuario: retirar bicicleta
	 */
    @Test
    public void retirarBicicletaTest(){
        Estacion perGarau = new Estacion(1 , "Columnas", 4);
            Bicicleta dos = new Bicicleta(2);
            Bicicleta tres = new Bicicleta(3);
            perGarau.anclarBicicleta(dos);
            perGarau.anclarBicicleta(tres);
            TarjetaUsuario kuzan = new TarjetaUsuario("82517234D", true);
            assertEquals(perGarau.anclajesLibres(), 2);
            perGarau.retirarBicicleta(kuzan);
            assertEquals(perGarau.anclajesLibres(), 3);
    }
     /**
	 * Historia de usuario: tarjeta inactiva
	 */
    @Test
    public void tarjetasInactivaTest(){
        TarjetaUsuario luffy = new TarjetaUsuario("82517234D", false);
        assertEquals(luffy.isActivada(), false);
        TarjetaUsuario zoro = new TarjetaUsuario("68468234D", true);
        zoro.setActivada(false);
        assertEquals(zoro.isActivada(), false);
    }
}