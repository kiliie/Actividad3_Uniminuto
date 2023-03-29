
package actividad3.pkg4;

public class Operation {
    
    private int number;
    
    //método constructor->dar valores iniciales a los atributos
    public Operation(int number) {
        this.number = number;
    }

    public Operation() {
        this.number=0;
    }
    //método get, permite recuperar el valor de un atributo privado
    public int getNumber() {
        return this.number;
    }
    //método set permite establecer un valor al atributo
    public void setNumber(int number) {
        this.number = number;
    }
    
    public String isPar(){
        //Operador ternario, es abreviación if else
         String result= (this.number % 2 == 0) ? "Es par" : "No es par";
        /* if (this.number % 2 == 0){
             result="es par";
         }else{
             result="es impar";
         }*/
         return result;
    }
    public long isFactorial(){
        long factorial = 1;
        if (this.number <= 10){
            for(int i=this.number; i>0; i--){
                factorial *=i;  //factorial = factorial * i;      
            }
        }else{
            factorial=0;
        }
        return factorial;
    }
    public short countDigit(){
        short counter=0;
        while(this.number > 0){
            if (this.number % 10 > 0){
                counter++; // counter= counter+1;
                this.number /= 10;//this.number= this.number/10
                System.out.println(""+this.number);
            }            
        }
        return counter;
    }
}
