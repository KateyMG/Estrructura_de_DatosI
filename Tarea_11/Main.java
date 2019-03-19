import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BTree<String, String> st = new BTree<String, String>();

        /*BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "words_alpha.txt"));
            String line = reader.readLine();

            while (line != null) {
            if(line
                for (int i=0; i<1000; i++){
                    st.put(line, Integer.toString(i));
                    i++;
                    line = reader.readLine();
                }

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();*/


        /*String nombreFichero = "words_alpha.txt";

        FileReader fr = null;
        try {

            fr = new FileReader(nombreFichero);

            char caract = (char) fr.read();
            //Se recorre el fichero hasta encontrar el carácter -1
            //   que marca el final del fichero
            while (fr != null) {
                if (caract == 'a') {
                    st.put("A", fr.toString());


                    caract = (char) fr.read();
                }
            }
        }catch (FileNotFoundException e) {

                System.out.println("Error");

                System.out.println(e.getMessage());
        }*/



            st.put("A", "aa");
            st.put("A", "aaa");
            st.put("A", "aah");
            st.put("A", "aahed");
            st.put("B", "ba");
            st.put("B", "bar");
            st.put("B", "bart");
            st.put("B", "bat");
            st.put("C", "ccc");
            st.put("C", "cca");
            st.put("C", "ccb");
            st.put("C", "ccd");
            st.put("D", "ddd");
            st.put("D", "dda");
            st.put("D", "ddb");
            st.put("D", "ddc");
            st.put("E", "eee");
            st.put("E", "eea");
            st.put("E", "eeb");
            st.put("E", "eec");
            st.put("F", "fff");
            st.put("F", "ffa");
            st.put("F", "ffb");
            st.put("F", "ffc");
            st.put("G", "7");
            st.put("G", "7");
            st.put("H", "8");
            st.put("I", "9");
            st.put("J", "10");
            st.put("K", "11");
            st.put("L", "12");
            st.put("M", "13");
            st.put("N", "14");
            st.put("O", "15");
            st.put("P", "16");
            st.put("Q", "17");
            st.put("R", "18");
            st.put("S", "19");
            st.put("T", "20");
            st.put("U", "21");
            st.put("V", "22");
            st.put("W", "23");
            st.put("X", "24");
            st.put("Y", "25");
            st.put("Z", "za");
            st.put("Z", "zab");
            st.put("Z", "zac");
            st.put("Z", "zad");



            System.out.println();

            System.out.println("size:    " + st.size());
            System.out.println("height:  " + st.altura());
            System.out.println(st);
            System.out.println();


        }
    }