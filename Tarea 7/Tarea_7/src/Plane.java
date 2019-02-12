import java.util.Scanner;
public class Plane {


    static void Plane(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Point x: ");
        int x =sc.nextInt();
        System.out.println("Point y: ");
        int y=sc.nextInt();

        if(x>0&&y>0){
            System.out.println("PRIMER CUADRANTE\n");
        }else if(x<0 && y>0){
            System.out.println("SEGUDO CUADRANTE\n");
                    }else if(x<0&& y<0){
            System.out.println("TERCER CUADRANTE\n");
        }else if(x>0&&y<0){
            System.out.println("CUARTO CUADRANTE\n");
        }else if(x==0 && y==0){
            System.out.println("ORIGEN");

        }else{
            System.out.println("NINGUN CUADRANTE");
        }




    }


}
