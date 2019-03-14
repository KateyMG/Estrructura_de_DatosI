public class Nodos {
    public String dato;
    public Nodos izdo;
    public Nodos dcho;
    public Nodos(String valor){
        dato = valor;
        izdo = dcho = null;

    }

    public void visitar(){
        System.out.print(dato +" ");
    }

    public void derivar(){
        if(dato == "*"){
            System.out.println("DERIVADA");
            if(izdo.dato!=null)
            {
                String [] der= izdo.dato.split("x");
                String [] x= der[1].split("\\^");
                //System.out.println(x[1]);

                int coef = Integer.parseInt(der[0]);
                int pot = Integer.parseInt(x[1]);
                int xc = coef*pot;
                int xf = pot-1;
                System.out.println(xc+"x^"+xf+" " +dcho.dato);


            }
            System.out.println("+");
            if(dcho.dato!=null){
                String [] dere= dcho.dato.split("\\)");
                //System.out.println(dere[0]);
                String [] x= dere[1].split("\\^");
                String [] q = dere[0].split("x");
                String [] w= q[1].split("\\^");
                String [] y= w[1].split("\\+");// aqui esta el 2


                int pot1= Integer.parseInt(x[1]);
                int xf = pot1-1;
                int pot2= Integer.parseInt(y[0]);
                int xf1 = pot2-1;
                System.out.println(pot1+dere[0]+")^"+xf+ " "+pot2+"x^"+xf1+" "+izdo.dato);
                System.out.println("+");
                System.out.println("e^2x*2");


          }
        }
        }

    public Nodos(Nodos ramaIzdo, String valor, Nodos ramaDcho){
        this.dato= valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

    public String valorNodos(){return this.dato;}
    public Nodos SubarbolIzdo(){return izdo;}
    public Nodos SubarbolDcho(){ return dcho;}
    public void nuevoValor(String d){dato = d;}
    public void ramaIzdo(Nodos n){ izdo = n;}
    public void ramaDcho(Nodos n){ dcho = n;}
}
