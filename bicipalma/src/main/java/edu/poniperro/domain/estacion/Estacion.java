package edu.poniperro.domain.estacion;

import edu.poniperro.domain.tarjetausuario.Autentication;
import edu.poniperro.domain.bicicleta.Movil;

public class Estacion {

    private final int id;
    private final String direccion;
    private Anclajes anclajes;

    public Estacion(int id, String direccion , int numAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.anclajes = numAnclajes;
        
    }
    private int getId(){
        return this.id;
    }
    private String getDireccion(){
        return this.direccion;
    }
    @Override
    public String toString() {
        return "Es la estación con id : " + getId() + " en direccion " + getDireccion() ;
    }
    private Anclaje[] anclajes(){
        return 
    } 
    private int numAclajes(){
        return
    }
    public void consultarEstacion(){

    }
    public int anclajesLibres(){
        return
    }
    public void anclarBicicleta(){

    }
    public boolean leerTarjetaUsuario(Autentication activada){
        return
    }
    public void SretirarBicicleta(Autentication id){

    }
    private void mostrarBocicleta( Movil , int ){

    }
    private void mostrarAnclaje(Movil , int) {

    }
    public void consultarAnclajes(){
        
    }

}
