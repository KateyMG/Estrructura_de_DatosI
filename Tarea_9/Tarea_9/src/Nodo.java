public class Nodo {

    public int Numero_Seguridad;
    public String Nombre;
    public boolean trabajo;
    public int total_dias;


    public Nodo enlace;

    Nodo elemento;
    Nodo siguiente;

    public Nodo(Nodo x){
        elemento = x;
        siguiente = null;

    }

    public Nodo(int Numero_Seguridad, String Nombre)
    {
        this.Nombre = Nombre;
        this.Numero_Seguridad = Numero_Seguridad;

        this.trabajo = false;

        enlace=null;
    }

    public Nodo(int Numero_Seguridad, String Nombre, int total_dias, boolean trabajo)
    {
        this.Nombre = Nombre;
        this.Numero_Seguridad = Numero_Seguridad;
        this.total_dias=total_dias;
        this.trabajo = true;
        enlace=null;

    }




}
