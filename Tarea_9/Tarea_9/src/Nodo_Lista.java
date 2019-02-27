public class Nodo_Lista {

    public int Numero_Seguridad;
    public String Nombre;
    public int trabajo_dias;

    public Nodo_Lista enlace;


    public Nodo_Lista(int Numero_Seguridad, String Nombre, int trabajo_dias){

        this.Numero_Seguridad = Numero_Seguridad;
        this.Nombre = Nombre;
        this.trabajo_dias =trabajo_dias;
        enlace = null;


    }

    public void setEnlace(Nodo_Lista enlace){
        this.enlace= enlace;
    }

    public int getDato(){
        return Numero_Seguridad;
    }

    public Nodo_Lista getEnlace(){
        return enlace;
    }


}
