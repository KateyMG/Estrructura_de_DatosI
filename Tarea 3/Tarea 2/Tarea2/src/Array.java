
public  class Array {
    Main dato = new Main();
    private  int [] stack;
    int tamaño =-1;
    public  int Tamaño_inicial =-1;
    //Tamaño_inicial = dato.Tamaño();
    int top =-1;

    public Array(){
        Tamaño_inicial = dato.Tamaño();
        stack = new int[Tamaño_inicial];
        //System.out.println("El tamaño del arreglo es: "+Tamaño_inicial);
        tamaño=0;
    }
    public  int pop(){
        Tamaño_inicial = dato.Tamaño();

        tamaño = Tamaño_inicial;
        if (tamaño==0)
        {
            throw new ArrayIndexOutOfBoundsException();

        }
        int nuevo = stack[Tamaño_inicial-1];
        stack[Tamaño_inicial-1]=0;
        tamaño--;
        /*for(int i=0; i<stack.length-1;i++){
            System.out.println(stack[i]);
        }*/
        print();


        return nuevo;
    }
    public void clear(){
        Tamaño_inicial = dato.Tamaño();
        for(int i =0; i <stack.length; i++){
            stack[i]=0;
        }
        tamaño =0;
        for(int i=0; i<stack.length;i++){
            System.out.println(stack[i]);

        }
        System.out.println("El arreglo no tiene valores");

    }


    public  int push(int value){//pone un valor arriba
    if(tamaño==stack.length){
        Mas();

    }
    stack[tamaño]= value;
    tamaño++;

    return value;
    }

    public void Mas(){
        int nuevo = 2*stack.length;

        int [] newStack = new int[nuevo];

        for (int i=0; i<stack.length;i++)
        {
            newStack[i]=stack[i];
        }
        stack= newStack;
    }

    public void print(){
        if(tamaño>=0){
            for(int i=0; i<stack.length;i++){
                System.out.println(stack[i]);
            }

        }

    }


}

