package com.company;

public class Nodos {

    public String Nombre;
    public String Artista;
    public boolean reproduccion;
    public int posicion;

    public Nodos enlace;

    public Nodos(String Nombre, String Artista, int posicion)
    {
        this.Nombre = Nombre;
        this.Artista = Artista;
        this.reproduccion=false;
        this.posicion = posicion;
        enlace=null;
    }

    public Nodos(String Nombre, String Artista, boolean reproduccion, int posicion)
    {
        this.Nombre = Nombre;
        this.Artista = Artista;
        this.reproduccion=reproduccion;
        this.posicion = posicion;
        enlace=null;

    }





}
