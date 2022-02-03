package edu.poniperro.domain.tarjetausuario;

public class TarjetaUsuario implements Autentication {

    private final String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    @Override
    public boolean isActivada() {
        return this.activada;
    }
    public void setActivada(boolean activada){
        this.activada = activada;
    }
    @Override
    public String toString(){
        return "La tarjeta de usuario " + this.id + "esta en estado " + this.activada; 
    }
}
