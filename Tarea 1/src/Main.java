import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Algoritmo que encuentra las suma de los primeros N numeros naturales");
        System.out.println("");
        System.out.println("Ingrese un número N: ");
        int n=0;
        int sum=0;
        n= sc.nextInt();

        for(int i=0; i < n+1; i++ )
        {
            sum += i;
        }

        System.out.println("La suma de los primeros numeros naturales hasta " +n+ " es:  "+sum);





    }
}
