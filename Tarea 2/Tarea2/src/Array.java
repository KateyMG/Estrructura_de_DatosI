
public  class Array {
    Main dato = new Main();
    private  int [] stack;
    private  int tamaño;
    private  final int Tamaño_inicial = dato.Tamaño();

    public Array(){
        stack = new int[Tamaño_inicial];
        //System.out.println("El tamaño del arreglo es: "+Tamaño_inicial);
        tamaño=0;
    }
    public  int pop(){

        tamaño = Tamaño_inicial;
        if (tamaño==0)
        {
            throw new ArrayIndexOutOfBoundsException();

        }
        int nuevo = stack[Tamaño_inicial-1];
        stack[Tamaño_inicial-1]=0;
        tamaño--;
        for(int i=0; i<stack.length-1;i++){
            System.out.println(stack[i]);
        }


        return nuevo;
    }
    public void clear(){
        for(int i =0; i <stack.length; i++){
            stack[i]=0;
        }
        tamaño =0;
        for(int i=0; i<stack.length;i++){
            System.out.println(stack[i]);

        }
        System.out.println("El arreglo no tiene valores");

    }


    public  void push(int value){//pone un valor arriba
    if(tamaño==stack.length){
        Mas();

    }
    stack[tamaño]= value;
    tamaño++;

        for(int i=0; i<stack.length;i++){
            System.out.println(stack[i]);
        }
    }

    private void Mas(){
        int nuevo = 2*stack.length;

        int [] newStack = new int[nuevo];

        for (int i=0; i<stack.length;i++)
        {
            newStack[i]=stack[i];
        }
        stack= newStack;
    }
}

