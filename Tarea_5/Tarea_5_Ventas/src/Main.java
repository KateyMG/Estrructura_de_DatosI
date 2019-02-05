import java.util.Scanner;

public class Main {
    public int op;
    static public int tventas = 0;
    static Operaciones ops = new Operaciones();
    static Producto datos = new Producto();


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int op;
        int saldo;
        int dinero=0;
        int promedio;
        int cont=0;
        int tventas=0;
        do{
            op=bienvenida();
            switch (op) {
                case 1:
                    ops.catalogo(datos.nombres, datos.info);
                    break;
                case 2:
                    tventas = ops.venta(datos.nombres, datos.info) + tventas;
                    cont++;
                    break;
                case 3:
                    ops.total_recibo_ventas(tventas);
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Ingrese la cantidad que pagará");
                    dinero =sc.nextInt();
                    saldo = tventas- dinero;
                    if (saldo==0){
                        System.out.println("No tiene saldo");
                    }else if(saldo<0){
                        System.out.println("Tiene un saldo acreedor de: "+saldo*-1);
                    }else{
                        System.out.println("Tiene un saldo deudor de: "+saldo);
                    }
                case 6:
                    promedio = tventas/cont;
                    System.out.println("El promedio del precio es " +promedio);
                    break;
                case 8:
                    break;
                case 9:
                    ops.delete();
                    ops.catalogo(datos.nombres, datos.info);
                    break;


            }
        } while(op!=0);
    }




    static int bienvenida() {
        int op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Catalogo de productos");
            System.out.println(" Elija una opción del menú principal");
            System.out.println("1. Mostrar catalogo");
            System.out.println("2. Vender un producto");
            System.out.println("3. Total del recibo de ventas");
            System.out.println("4. Total de pagos del recibo");
            System.out.println("5. Saldo pendiente a pagar");
            System.out.println("6. Promedio de precio por item");
            System.out.println("7. Precio del producto más caro");
            System.out.println("8. Recibo de compra con pagos ingresados");
            System.out.println("9. Delete");
            System.out.println("10. Salir");
            op = sc.nextInt();
        }
        while (op < 0 || op > 11);
        return op;
    }


}
