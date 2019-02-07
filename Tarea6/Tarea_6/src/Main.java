import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Archivo Txt
        Leerarchivo leer = new Leerarchivo();
        String Texto = leer.leer("C:\\Users\\yohan\\IdeaProjects\\Tarea_6\\Texto.txt");
        String minusculas = Texto.toLowerCase();
        contar(minusculas);


        //Output desde consola
        /*String texto;
        System.out.println("Introduzca el texto");
        texto =sc.nextLine();
        texto = texto.toLowerCase();
        contar(texto);*/

        //Desde el main
        /*contar("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc at tempor ante. Vivamus dignissim felis dui, in fermentum urna malesuada sit amet. Fusce bibendum quis leo eu dapibus. Nullam et tortor vel lacus consequat finibus. Nam viverra risus quis sem aliquet, vel accumsan mi ullamcorper. Sed metus libero, tristique ut augue non, luctus pretium sapien. Quisque eu convallis nisi. Aenean nec nibh vitae nunc hendrerit ornare sed vel odio. Sed egestas semper sem, bibendum ultricies lectus lacinia quis. Etiam et pretium sem. Sed commodo eleifend mollis. Vivamus finibus turpis eu nisi fermentum, ut sodales elit posuere. Aenean tincidunt libero odio, et aliquam nibh pellentesque eget. Donec sit amet enim id sapien dignissim congue. Ut sit amet sapien eget purus efficitur tincidunt.\n" +
                "\n" +
                "Praesent convallis nibh id rutrum molestie. Fusce ullamcorper suscipit condimentum. Phasellus quis pretium est. In tempus enim eget purus pharetra, vel placerat quam volutpat. Maecenas venenatis elit sed iaculis dignissim. Integer auctor venenatis neque nec facilisis. Nulla non nibh ut nunc mattis congue ac sed ante. Donec viverra quam finibus nulla auctor suscipit. Nam in blandit mi. Integer tortor magna, ornare vitae eros nec, luctus consectetur massa. Aliquam tincidunt urna sit amet feugiat elementum.\n" +
                "\n" +
                "Sed placerat, mauris eget fermentum bibendum, elit dui blandit arcu, sit amet faucibus velit mauris et ipsum. Curabitur ut erat odio. Sed bibendum euismod pharetra. Cras et pretium ante, ac congue ipsum. Mauris in quam posuere nisl elementum tempus. Duis laoreet leo nibh. Morbi nulla ante, porttitor id nibh vel, blandit ultrices lectus. Quisque at aliquet sapien. Vestibulum arcu lorem, rhoncus sed turpis in, porta feugiat magna.\n" +
                "\n" +
                "Curabitur iaculis feugiat est, vitae interdum justo eleifend non. Nulla pretium, purus quis mollis dignissim, eros nisi ornare mi, quis volutpat mi mi non elit. Mauris vitae congue nisl, sed lacinia quam. Donec purus dui, euismod et ornare ac, vestibulum at arcu. Sed quam ligula, egestas sit amet lacinia ut, consequat non elit. Etiam consectetur aliquet sapien nec hendrerit. Vestibulum dictum nulla eros, a molestie dolor fermentum sit amet. Etiam semper tincidunt pellentesque. Mauris mattis ultrices urna at tristique. Cras quis nibh magna.\n" +
                "\n" +
                "Pellentesque iaculis in nunc a imperdiet. Vivamus commodo tortor et bibendum imperdiet. Nullam bibendum a enim tempus suscipit. Nunc vitae sapien a lacus bibendum ullamcorper. Suspendisse potenti. Duis sollicitudin est eget bibendum gravida. Fusce et faucibus enim. In condimentum, nibh et tempus efficitur, ex orci tincidunt orci, et volutpat mi tellus in enim. Phasellus pellentesque laoreet luctus. Quisque interdum nisl id magna dapibus ullamcorper. Aliquam id egestas leo. Pellentesque sit amet velit pulvinar, volutpat risus ac, tempor magna.\n" +
                "\n");*/

    }

    public static void contar(String texto)
    {
        String abecedario="abcdefghijklmnopqrstuvwxyz";
        int cont[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};


        for(int i=0;i<texto.length();i++) {
            for (int j = 0; j < abecedario.length(); j++) {
                if (texto.charAt(i) == abecedario.charAt(j)) {
                    cont[j]++;

                }
            }
        }

        for(int i=0;i<abecedario.length();i++)
        {
            System.out.println("Letra "+abecedario.charAt(i)+": "+cont[i]+" veces");

        }

        System.out.println("***************");

        System.out.println("Las 6 letras que más aparecen son: ");
        Arrays.sort(cont);
        for(int i =cont.length-1;i>=20;i--){
            System.out.println("Letra "+abecedario.charAt(i)+": "+cont[i]+" veces");

        }







    }


}
