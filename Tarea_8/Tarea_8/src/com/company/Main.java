package com.company;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r;
        int d;
        Lista Lista;
        int k =10;

        r = new Random();
        Lista = new Lista();

        for (int i=0; i<k;i++){

            d = r.nextInt();
            if(i==5)
                Lista.insertarCabezaLista("Cancion "+i, "Artista "+i, true);
            else
                Lista.insertarCabezaLista("Cancion "+i, "Artista "+i);

        }
        Lista.List_Songs();



        Nodos t= Lista.Activo();
        System.out.println(t.Nombre);
        System.out.println(Lista.Next(t.posicion).Nombre);
        System.out.println(Lista.Previous(t.posicion).Nombre);




    }
}
