/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3.pkg4;

/**
 *
 * @author kel2m
 */
public class Operation {
    private int number;

    public Operation(int number) {
        this.number = number;
    }

    public Operation() {
        this.number=0;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String isPar(){
        //Operador ternario, es abreviación if else
         String result= this.number %2 == 0 ? "Es par" : "No es par";
         return result;
    }
    public long isFactorial(){
        long factorial = 1;
        if (this.number <= 10){
            for(int i=this.number; i>0; i--){
                factorial *=i;        
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
                counter++;
                this.number /= 10;
            }            
        }
        return counter;
    }
}
