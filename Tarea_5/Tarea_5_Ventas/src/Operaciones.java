import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;

public class Operaciones {
    Scanner sc = new Scanner(System.in);
    Main data = new Main();
   static Producto  datos = new Producto();

    static void catalogo(String nombres[], int info[][])
    {
        int i=0;
        System.out.println("\tProducto\tCodigo\tPrecio");

        for(i=0; i<datos.info.length; i++){
            System.out.println((i+1)+".\t"+nombres[i]+"\t"+info[i][0]+"\t"+info[i][1]);
        }

    }

    static int venta(String nombres[], int info[][]){
        Scanner sc = new Scanner(System.in);
       int i =0;
       int op;
       int bought;
       int total=0;

       do{
           System.out.println("Ingrese el nombre de los productos a comprar");
           catalogo(nombres, info);
           op = sc.nextInt();
       } while(op<1|| op>datos.info.length);

       System.out.println("Cantidad de productos que comprará");
       bought=sc.nextInt();

       System.out.println("Venta: "+nombres[op-1]);

       //Suma de la venta realizada
       total= info[0][op]*bought;

       System.out.println("La cantidad a pagar es: "+total);
        return total;

    }

    static void delete(){


    }

    static void total_recibo_ventas(int total){
        System.out.println("Total de pagos del recibo "+total);

    }






    static int mayor(){
        int x =0;
        return x;
    }




}