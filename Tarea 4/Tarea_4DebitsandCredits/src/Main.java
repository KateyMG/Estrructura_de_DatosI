import java.util.Scanner;

public class Main {

    public static int cantidad;
    public static double saldo;
    static Debit d;
    static Credit c;
    static void saldo(){
        System.out.println("Ingrese su saldo");
        Scanner sc = new Scanner(System.in);
        int sald = sc.nextInt();

        saldo = sald;
    }

    public static void main(String[] args) {
        //menu();
        //Operations datos = new Operations();
        //Scanner sc = new Scanner(System.in);

        saldo();
        if (saldo>0)
        {
            menu();
        }
        else
        {
            System.out.println("Su saldo es nulo");
        }

    }

    static void bienvenida(){
        System.out.println("Debits and Credits");
        System.out.println("1. Ingresar débito");
        System.out.println("2. Ingresar crédito");
        System.out.println("3. Total de Débitos");
        System.out.println("4. Total de Créditos");
        System.out.println("5. Saldo");
        System.out.println("6. Promedio de Débito");
        System.out.println("7. Monto de débitos más grande");
        System.out.println("8. Número de débitos y créditos realizados");
        System.out.println("9. Débitos y créditos realizados con montos");
        System.out.println("10. Delete");
        System.out.println("11. Salir");
    }


    static void menu() {
        bienvenida();
        Scanner sc = new Scanner(System.in);
        Operations datos = new Operations();
        int x = sc.nextInt();

        switch (x) {
            case 1:

                if (datos.espaciosarrayd<15)
                {
                    System.out.println("Ingrese el monto de su débito");
                    int monto=sc.nextInt();
                   datos.debito(monto);
                }
                else{
                    System.out.println("Ya no puede realizar más débitos");
                }


                menu();


                break;
            case 2:
                if (datos.espaciosarrayd<15)
                {
                    System.out.println("Ingrese el monto de su crédito");
                    int monto=sc.nextInt();
                    datos.credito(monto);
                }
                else{
                    System.out.println("Ya no puede realizar más créditos");
                }


                menu();
                break;
            case 3:
                System.out.println("El total de débitos realizado es: "+datos.sumad());

                menu();
                break;
            case 4:
                System.out.println("El total de créditos realizados es: "+datos.sumac());

                menu();
                break;
            case 5:
                datos.saldo();
                menu();

                break;
            case 6:
                System.out.println("El promedio de débitos es: "+datos.pormedioD());

                menu();
                break;
            case 7:

                menu();
                break;
            case 8:
                System.out.println("El número de débitos realizados es: "+datos.contadord);
                System.out.println("El número de créditos realizados es: "+datos.contadorc);

                menu();
                break;
            case 9:

                menu();
                break;
            case 10:

                menu();
                break;
            case 11:
                System.out.println("Usted ha salido del programa");
                break;
            default:
                System.out.println("Ingrese una opción invalida");
                menu();
                break;
        }
    }
}