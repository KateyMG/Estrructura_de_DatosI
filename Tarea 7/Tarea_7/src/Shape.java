import java.lang.Math;
public class Shape {



    static void circle(double radio){
        double area =0;
        double pi=Math.PI;

        area = pi*radio;
        System.out.println(area+"\n");
    }


    static void rectangle(double base, double h ){
        double area =0;
        area = base*h;
        System.out.println(area+"\n");

    }

    static void triangule(double l1, double l2, double l3){
        double area =0;
        double p =0;
        double exp=0;
        p= (l1+l2+l3)/2;
        exp= p*(p-l1)*(p-l2)*(p-l3);
        area = Math.sqrt(exp);
        System.out.println(area+"\n");

    }
}
