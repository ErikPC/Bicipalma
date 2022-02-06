package edu.poniperro.domain.estacion;

import edu.poniperro.domain.tarjetausuario.Autentication;
import edu.poniperro.domain.bicicleta.Movil;

public class Estacion {

    private final int id;
    private final String direccion;
    private Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);

    }

    private int getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "Es la estación con id : " + getId() + " en direccion " + getDireccion();
    }

    // private Anclaje[] anclajes() {
    // return anclajes.anclajes();
    // }

    private int numAclajes() {
        return anclajes.numAnclajes();
    }

    public void consultarEstacion() {
        System.out.println(this);
        consultarAnclajes();
    }

    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (int i = 0; i < numAclajes(); i++) {
            if (!anclajes.isAnclajeOcupado(i)) {
                anclajesLibres++;
            }
        }
        return anclajesLibres;

    }

    public void anclarBicicleta(Movil bici) {
        int anclajeLibre = anclajes.seleccionarAnclaje();
        if (anclajeLibre >= 0) {
            anclajes.ocuparAnclaje(anclajeLibre, bici);
        } else {
            System.out.println("Todos los anclajes estan ocupado");
        }
    }

    public boolean leerTarjetaUsuario(Autentication tarjeta) {
        return tarjeta.isActivada();
    }

    public void retirarBicicleta(Autentication tarjeta) {
        int anclaje = anclajes.seleccionarAnclajeOcupado();
        if (leerTarjetaUsuario(tarjeta)) {
            if (anclaje >= 0) {
                anclajes.liberarAnclaje(anclaje);
                mostrarBicicleta(anclajes.getBiciAt(anclaje), anclaje);
            } else {
                System.out.println("No hay anclajes ocupados");
            }
        }
    }

    private void mostrarBicicleta(Movil bici, int anclaje) {
        System.out.println("La bicicleta " + bici + " del anclaje " + anclaje + " ha sido liberada");
    }

    private void mostrarAnclaje(Movil bici, int anclaje) {
        System.out.println("La bicicleta " + bici + " esta en el anclaje nº " + anclaje);
    }

    public void consultarAnclajes() {
        for (int i = 0; i < numAclajes(); i++) {
            if (anclajes.isAnclajeOcupado(i)) {
                mostrarAnclaje(anclajes.getBiciAt(i), i);
            } else {
                System.out.println("El anclaje esta libre");
            }
        }
    }
}
