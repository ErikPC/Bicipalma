package edu.poniperro.domain.bicicleta;

public class Bicicleta implements Movil {

    private final int id;

    Bicicleta(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public String toString() {
        return "La id de la bicleta es:" + getId();
    }
}
