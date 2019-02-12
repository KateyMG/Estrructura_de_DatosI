import java.util.Scanner;

public class Menus{

    static void menushape(){

        System.out.println("Elija la  figura");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Regresar al menu anterior");
    }
    static void menus(){
        menushape();
        Shape s = new Shape();
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        Main m = new Main();

        switch (x){
            case 1:
                System.out.println("Ingrese el radio");
                double radio = sc.nextInt();
                s.circle(radio);
                m.menu();
            case 2:
                System.out.println("Ingrese la base");
                double base = sc.nextInt();
                System.out.println("Ingrese la altura");
                double h = sc.nextInt();
                s.rectangle(base,h);
                m.menu();
            case 3:
                System.out.println("Ingrese lado 1");
                double l1 = sc.nextInt();
                System.out.println("Ingrese lado 2");
                double l2 = sc.nextInt();
                System.out.println("Ingrese lado 3");
                double l3 = sc.nextInt();
                s.triangule(l1,l2,l3);
                m.menu();
            case 4:
                m.menu();
        }

    }
}
