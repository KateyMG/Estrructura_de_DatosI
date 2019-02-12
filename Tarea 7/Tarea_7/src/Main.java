import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       menu();

    }

    static void output(){

        System.out.println("Elija el programa a utilizar");
        System.out.println("1. Plane");
        System.out.println("2. Shape");


    }
    static void menu(){
        output();
        Plane p = new Plane();
        Menus ms = new Menus();
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();

        switch (x){
            case 1:
                p.Plane();
                menu();
                break;

            case 2:
                ms.menus();
                menu();
                break;
            default:
                System.out.println("Salio del programa");
        }

    }
}
