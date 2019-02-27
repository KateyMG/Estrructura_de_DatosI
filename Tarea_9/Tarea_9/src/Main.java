import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Queue cola = new Queue();
    Nodo n = new Nodo(1,"aaa" );
    cola.insertar(n);
    n = new Nodo(2,"bbb");
    cola.insertar(n);
    n = new Nodo(4,"ccc");
    cola.insertar(n);

    Nodo t;

    Lista lista;
    lista = new Lista();


    //Ingresa datos desordenados
        System.out.println("Elementos de la lista, trabajadores");
        lista.insertar(1, "a"+1, 1 );
        lista.insertar(8, "a"+8, 8 );
        lista.insertar(2, "a"+2, 2 );
        lista.insertar(3, "a"+3, 3 );
        lista.insertar(9, "a"+9, 9 );
        lista.insertar(6, "a"+6, 6 );
        lista.insertar(5, "a"+5, 5 );

        //Imprime datos ordenados
        lista.ver();

        System.out.println("Elementos de la cola, agencias");
        Nodo x = new Nodo(6, "a"+6);
        cola.insertar(x);


        cola.ver();

    //Recorrer cola para ver asignación

        Nodo no=null;
        Nodo_Lista n2 =lista.primero;

        int k =0;


        while (n2 != null){

            System.out.print(n2.Numero_Seguridad +" "+ n2.Nombre+" "+n2.trabajo_dias+"\n");
            no=cola.frente;
            while(no!=null){

                if(no.elemento.Numero_Seguridad==n2.Numero_Seguridad){

                    n2.trabajo_dias=n2.trabajo_dias+1;
                    System.out.println("El repartidor "+n2.Numero_Seguridad+" fue asignado");
                    System.out.println(n2.Numero_Seguridad +" "+ n2.Nombre+" "+n2.trabajo_dias+"\n");


                }else{



                }

                no = no.siguiente;


            }n2= n2.enlace;

            k++;}

    }






}
