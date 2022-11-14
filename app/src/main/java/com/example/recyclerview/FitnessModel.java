package com.example.recyclerview;

public class FitnessModel {

    String nombre;
    String nombreAbr;
    String nombreLetra;
    int image;

    public FitnessModel(String nombre, String nombreAbr, String nombreLetra, int image) {
        this.nombre = nombre;
        this.nombreAbr = nombreAbr;
        this.nombreLetra = nombreLetra;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreAbr() {
        return nombreAbr;
    }

    public String getNombreLetra() {
        return nombreLetra;
    }

    public int getImage() {
        return image;
    }
}
