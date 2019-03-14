import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        árbol ae = new árbol();
        newarbol nae = new newarbol();

        Tokens token = new Tokens();
        Shuting_Yard SY = new Shuting_Yard();
        //SY.postfix(token.Tokens());
        token.Tokens();
        
        //nae.ArbolC(token.Tokens());
        /*int i, longitud=0, aux=0;
        String q= SY.postfix(token.Tokens());


        String nuevo_2=q.replace(" ", "");
        System.out.println(nuevo_2);
        char[] charArray = nuevo_2.toCharArray();
        Nodo root = ae.ArbolC(q);
        System.out.println("-----");
        ae.Orden(root);*/

        Arbol3 arbol;
        Nodos a1, a2, a, a3;
        Stack<Nodos> st = new Stack<>();

        a1 = Arbol3.nuevoArbol(null, "e^2x",null);
        a2 = Arbol3.nuevoArbol(a1, "-", null);
        a= Arbol3.nuevoArbol(a2,"(x^2+1)^3",null);
        st.push(a);

        a1 = Arbol3.nuevoArbol(null,"3x^2", null);
        a3 = Arbol3.nuevoArbol(a1,"*",a);
        st.push(a3);
        arbol = new Arbol3(a2);
        arbol = new Arbol3(a3);


       Arbol3 ae3 = new Arbol3();
       ae3.preorden(a3);
       ae3.preorden(a2);



        }















}
