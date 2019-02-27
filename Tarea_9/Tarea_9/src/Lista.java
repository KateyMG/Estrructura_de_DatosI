public class Lista {
    public Nodo_Lista primero;


    public Lista insertar (int Numero_Seguridad, String Nombre, int trabajo_dias){
       Nodo_Lista nuevo;
       nuevo = new Nodo_Lista (Numero_Seguridad, Nombre, trabajo_dias);
       if(primero == null)
           primero = nuevo;
       else if(Numero_Seguridad < primero.Numero_Seguridad){
           nuevo.setEnlace(primero);
           primero = nuevo;
       }
       else
       {
        Nodo_Lista anterior, p;
        anterior = p = primero;
        while ((p.getEnlace() != null) && (Numero_Seguridad > p.getDato())){
            anterior = p;
            p = p.getEnlace();

       }
       if (Numero_Seguridad > p.getDato())
           anterior = p;

       nuevo.setEnlace(anterior.getEnlace());
       anterior.setEnlace(nuevo);
       }
       return this;

   }

   public void ver()
   {
       Nodo_Lista n;
       int k =0;
       n = primero;
       while (n != null){
           System.out.print(n.Numero_Seguridad +" "+ n.Nombre+" "+n.trabajo_dias+"\n");
           n = n.enlace;
           k++;
   }
   }



}
