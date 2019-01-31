import java.util.Scanner;

public class Operations {
    Main ingresar = new Main();
    Scanner sc = new Scanner(System.in);
    public int sald=0;
    public Credit [] credits=new Credit[15];
    public Debit [] debits= new Debit[15];

    int[] Debit = new int[15];
    int[] Credit = new int[15];

    int d=0;
    int contadord=0;
    int contadorc=0;
    int espaciosarrayd=0;
    int espaciosarrayc=0;


    public void debito(int monto){


        for(int i=0; i < Debit.length; i++)
        {


                Debit[i]=monto;
                contadord++;
                espaciosarrayd++;
                sald+=monto;
             System.out.println(Debit);

        }

        System.out.println("Su saldo actual es: "+sald);
    }


    public void credito(int monto){

        for(int i=0; i<Credit.length;i++){

                Debit[i]=monto;
                contadorc++;
                espaciosarrayc++;
                sald+=monto;


        }

    }

    public int sumad(){
        int Total =0;
        for(int i=0; i< Debit.length; i++){
            Total+=Debit[i];
        }
        return Total;

    }

    public int sumac(){
        int Total =0;
        for(int i=0; i< Debit.length; i++){
            Total+=Credit[i];
        }
        return Total;

    }


     public int saldo(){

        int x = sumad()+sumac()+this.sald;
        return x;
     }

     public void showdebits(){
         for(int i=0; i < debits.length; i++)
         {

         }
     }

     public int pormedioD(){
        int promedio =0;
        if(espaciosarrayd!=0){
            promedio = sumad()/espaciosarrayd;
        }
        return promedio;
     }
}
