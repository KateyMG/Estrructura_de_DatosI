public class Queue {

    public Nodo frente;
    public Nodo fin;



    public Queue(){
        frente= fin = null;
    }

    public void insertar(Nodo elemento){
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()){
            frente = a;
        }
        else{
            fin.siguiente =a;
        }
        fin = a;


    }
     public Nodo quitar() throws Exception
     {
         Nodo aux;
         if (!colaVacia()){
             aux = frente.elemento;
             frente = frente.siguiente;
         }
         else
             throw new Exception("Delete empty queue");
         //System.out.println(aux.Nombre + aux.Numero_Seguridad);
         return aux;
     }

     public void borrarCola()
     {
         for(; frente != null;){
             frente = frente.siguiente;
         }
         System.gc();
     }

     public Nodo frenteCola()throws Exception
     {
         if(colaVacia())
         {
             throw new Exception("Cola Vacia");
         }
         return (frente.elemento);
     }
     public boolean colaVacia(){

         return (frente == null);
     }
    public void ver()
    {
        Nodo n;
        int k =0;
        n = frente;
        while (n != null){
            System.out.print(n.elemento.Numero_Seguridad +" "+ n.elemento.Nombre+"\n");
            n = n.siguiente;
            k++;
        }}

    public void mostrarCola(Queue q) throws Exception
    {
        while (!q.colaVacia()){
            Nodo v;
            v = (Nodo) q.quitar();
            System.out.println(v.Numero_Seguridad+" "+ v.Nombre);
        }
    }




}
