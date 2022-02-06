package edu.poniperro.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.poniperro.domain.bicicleta.Bicicleta;

public class AnclajesTest {
    @Test
    public void toStringTest() {
        Anclajes nuevo = new Anclajes(3);
        assertEquals(nuevo.toString(), "La bicicleta ha sido liberada");
    }

    @Test
    public void seleccionarAnclajeOcupadoTest() {
        Anclajes nuevo = new Anclajes(1);
        assertEquals(-1, nuevo.seleccionarAnclajeOcupado());
    }

    @Test
    public void seleccionarAnclajeLibreTest() {
        Anclajes nuevo = new Anclajes(1);
        nuevo.ocuparAnclaje(0, new Bicicleta(1));
        assertEquals(-1, nuevo.seleccionarAnclaje());
    }
}
