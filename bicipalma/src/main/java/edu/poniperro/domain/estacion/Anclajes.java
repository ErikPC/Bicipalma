package edu.poniperro.domain.estacion;

import edu.poniperro.domain.bicicleta.Movil;

public class Anclajes {

    private Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclaje();
    }

    private void crearAnclaje() {
        for (int i = 0; i < numAnclajes(); i++) {
            anclajes()[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes() {
        return this.anclajes;
    }

    int numAnclajes() {
        return anclajes().length;
    }

    void ocuparAnclaje(int anclaje, Movil bici) {
        anclajes()[anclaje].anclarBici(bici);
    }

    boolean isAnclajeOcupado(int anclaje) {
        return anclajes()[anclaje].isOcupado();
    }

    void liberarAnclaje(int anclaje) {
        anclajes()[anclaje].liberarBici();
    }

    Movil getBiciAt(int anclaje) {
        return anclajes()[anclaje].getBici();
    }

    int seleccionarAnclaje() {
        for (int i = 0; i < numAnclajes(); i++) {
            if (!anclajes()[i].isOcupado()) {
                return i;
            }
        }
        return -1;
    }

    int seleccionarAnclajeOcupado() {
        for (int i = 0; i < numAnclajes(); i++) {
            if (anclajes()[i].isOcupado()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "La bicicleta ha sido liberada";
    }
}
