import org.junit.Assert;
import org.junit.Test;

public class Testing {
    Queue cola = new Queue();
    Lista lista = new Lista();

    @Test
    public void FirstTest(){
        
        lista.insertar(7,"a",7);
        lista.insertar(7,"b",7);
        lista.insertar(7,"b",7);

        lista.ver();


        Nodo x = new Nodo(6, "a"+6);
        cola.insertar(x);
        x = new Nodo(7, "a"+7);
        cola.insertar(x);



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


        Assert.assertTrue(true);
    }
}
