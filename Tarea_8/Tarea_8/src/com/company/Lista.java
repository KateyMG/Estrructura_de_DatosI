package com.company;

public class Lista {

    private Nodos primero;


    public int posicion;

    public Lista()
    {
        posicion=1;
        primero = null;
    }

    public void insertarCabezaLista(String Nombre, String Artista ){
        Nodos nuevo;

        nuevo= new Nodos(Nombre, Artista, posicion);
        nuevo.enlace= primero;
        posicion++;
        primero = nuevo;

    }

    public void insertarCabezaLista(String Nombre, String Artista, boolean reproduccion ){
        Nodos nuevo;

        nuevo= new Nodos(Nombre, Artista, reproduccion, posicion);
        nuevo.enlace= primero;
        posicion++;
        primero = nuevo;



    }

    public void List_Songs(){
        Nodos n;


        n = primero;
        while (n!= null){
            System.out.println(n.Nombre+" "+n.Artista+" "+n.posicion);
            n = n.enlace;

        }



    }

    public Nodos Activo(){
        Nodos t2=null;
        Nodos t=primero;
        while(t!= null){
            if(t.reproduccion==true){
                t2=t;
                break;
            }
            t=t.enlace;
        }


        return t2;
    }

    public Nodos Next(int activo){
        Nodos t2=null;
        Nodos t=primero;
        while(t!= null){
            if(t.posicion==activo+1){
                t2=t;
                break;
            }
            t=t.enlace;
        }

        return t2;
    }

    public Nodos Previous(int activo){

        Nodos t2=null;
        Nodos t=primero;
        while(t!= null){
            if(t.posicion==activo-1){
                t2=t;
                break;
            }
            t=t.enlace;
        }

        return t2;

    }




}
