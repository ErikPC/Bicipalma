package edu.poniperro.domain.estacion;

import edu.poniperro.domain.bicicleta.Movil;

public class Anclaje {

    private boolean ocupado;
    private Movil bici;

    Anclaje() {
    }

    boolean isOcupado() {
        return ocupado;
    }

    Movil getBici() {
        return bici;
    }

    void anclarBici(Movil bici) {
        this.bici = bici;
        ocupado = true;
    }

    void liberarBici() {
        ocupado = false;
    }

    @Override
    public String toString() {
        return isOcupado() ? "El anclajes esta ocupado por la bici " + getBici() : "No esta ocupado";
    }
}
