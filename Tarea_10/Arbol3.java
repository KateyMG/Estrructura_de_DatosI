public class Arbol3 {
    public Nodos raiz;
    public Arbol3(){
        raiz = null;
    }
    public Arbol3(Nodos raiz){
        this.raiz = raiz;

    }
    public Nodos raizArbol(){
        return raiz;
    }
    boolean esVacio(){
        return raiz== null;
    }

    public static Nodos nuevoArbol(Nodos ramaIzqda, String dato, Nodos ramaDrcha){
        return new Nodos(ramaIzqda, dato, ramaDrcha);

    }



    public static void preorden(Nodos r)
    {
        if(r!= null){
            r.derivar();
            //r.visitar();
            preorden(r.izdo);

            preorden(r.dcho);

        }
    }




}
