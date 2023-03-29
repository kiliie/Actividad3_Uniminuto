
package actividad3.pkg4;

import java.util.Scanner;

public class Actividad34 {

    /**
     * 4.Crear una clase que tenga como atributo un número entero ingresado
     * por el usuario y haga las siguientes operaciones: verificar si el número 
     * es par(mod %), obtener el factorial del número (5=1*2*3*4*5)
     * y decir cuántos dígitos tiene el número (958 = 3). 
     * Los resultados se deben mostrar en el método principal.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int number = read.nextInt();
        Operation operation = new Operation(number);
        operation.setNumber(number);
        System.out.println(""+operation.isPar());
        System.out.println("Factorial:"+operation.isFactorial());
        System.out.println("Cantidad de digitos:"+operation.countDigit());
        //System.out.println(""+operation.getNumber());
    }
    
}
