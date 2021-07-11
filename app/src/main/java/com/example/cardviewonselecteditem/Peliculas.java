package com.example.cardviewonselecteditem;

public class Peliculas {
    private String titulo;

    @Override
    public String toString() {
        return  titulo;
    }

    public Peliculas(String titulo, String distribuidor, int foto) {
        this.titulo = titulo;
        this.distribuidor = distribuidor;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    private String distribuidor;
    private int foto;
}

