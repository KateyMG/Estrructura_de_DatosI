import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Leerarchivo {

    public String leer(String Texto){

        String text="";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(Texto));
            String save = "";
            String Lectura;
            while((Lectura = bf.readLine())!= null){
                save = save + Lectura;
            }
            text=save;

    }catch (Exception e){
            System.out.println("No se encontro el archivo");
        }
        return text;
    }
}
