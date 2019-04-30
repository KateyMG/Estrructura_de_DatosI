public class Main {

    public static void main(String[] args) {
        Table_Hash table_hash = new Table_Hash();
        Hashss h= new Hashss();




         for(Integer i =-50; i <= 50; i++){
             /*int key=i;
             if(key<0){
                 key =key*-1;
             }else{
                 key =key;
             }*/

             table_hash.llenar(i%20,i);
         }


        System.out.println("Hello World!");
    }
}
