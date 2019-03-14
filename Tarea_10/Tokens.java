import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokens {

    /*private Type tipo;
    private String cadena;
    private int linea;*/
    public String[] Tokens() {
        //Scanner sc = new Scanner(System.in);
        //String s = " a * 6 + b + e * 1/2 f * g * 8 ^ ";
        String s = "(3x^2)*(x^2+1)^3-(e^2x)";



        //String [] tok = s.split("\\s");
        String [] tok = s.split("\\*");
        int contm =0;

        String [] tok2 = tok[1].split("(\\-)");

        System.out.println(Arrays.toString(tok));
        System.out.println(Arrays.toString(tok2));

        String [] tok3 = {tok[0]+tok2[0]+tok2[1]};
        return tok3;
        }




}
