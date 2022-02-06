package edu.poniperro.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.poniperro.domain.bicicleta.Bicicleta;

public class AnclajeTest {
    @Test
    public void anclajeVacioToStringTest() {
        Anclaje nuevo = new Anclaje();
        assertEquals("No esta ocupado", nuevo.toString());
    }

    @Test
    public void anclajeOcupadoToStringTest() {
        Anclaje nuevo = new Anclaje();
        nuevo.anclarBici(new Bicicleta(2));
        assertEquals("El anclajes esta ocupado por la bici 2", nuevo.toString());
    }
}
