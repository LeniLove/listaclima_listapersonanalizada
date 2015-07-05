package com.listaclima.elena.listaclima;

/**
 * Created by gh on 05/07/2015.
 */
public class Datos {
    private int imagen;
    private String dia;
    private String clima;
    private String temperatura;

    public Datos(int imagen, String dia, String clima, String temperatura) {
        this.imagen = imagen;
        this.dia = dia;
        this.clima = clima;
        this.temperatura = temperatura;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
