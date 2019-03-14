import java.util.Stack;

public class árbol {
    Stack<Nodo> st = new Stack();

    public boolean Operador(String c){
        if( c == "+" || c == "-"
                || c == "*" || c == "/"
                || c == "^"  ){
            return true;
        }
        return false;

    }

    public void Orden (Nodo t){
        if (t != null){
            Orden(t.left);
            System.out.print(t.value + " ");
            Orden(t.right);
        }

    }

    public Nodo ArbolC(String token3[]){
        //Stack<Nodo> st = new Stack();
        Nodo t, t1, t2;
        for (int i =0; i <token3.length; i++){

            if(!Operador(token3[i])){

                t = new Nodo(token3[i]);
                st.push(t);
            }else{
                //System.out.println(postfix[i]);
                t = new Nodo(token3[i]);

                t1 = st.pop();
                t2 = st.pop();

                t.right = t1;
                t.left = t2;
                System.out.print(t.value);
                st.push(t);
            }

        }
        t = st.peek();

        st.pop();

        return t;

    }


}
