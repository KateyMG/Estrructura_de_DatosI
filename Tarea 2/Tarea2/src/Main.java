import java.util.Scanner;

public class Main {
    public static Array a = new Array();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        Menuuu();
    }

    public static void Menuuu(){
        System.out.println("Stack");
        System.out.println("Seleccione la función que utilizará");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Clear");
        System.out.println("4. Salir del programa");
        Scanner sc= new Scanner(System.in);
        int op=0;
        op =sc.nextInt();
        switch(op){
            case 1:
                int x=0;
                System.out.println("Ingrese el valor");
                x= sc.nextInt();
                a.push(x);//
                break;

            case 2:
                a.pop();

                break;
            case 3:
                a.clear();

                break;
            case 4:
                System.out.println("Usted ha salido del programa");
                break;
            default: System.out.println("Opción invaílda");
        }

    }


    public static int Tamaño(){
        System.out.println("Ingrese el tamaño del arreglo: -");
        Scanner sc= new Scanner(System.in);
        int x=0;
        x= sc.nextInt();

        return x;


    }

}
