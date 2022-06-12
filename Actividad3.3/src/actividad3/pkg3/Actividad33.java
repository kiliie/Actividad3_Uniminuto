/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kel2m
 */
public class Actividad33 {

    /**
     * 3.Encontrar suma y promedio de un conjunto de números donde 
     * no se conoce la cantidad de datos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        double number = 0;    
        short end;
        ArrayList<Double> list = new ArrayList<>();
        do{
            System.out.println("Introduzca un número:"); 
            number= read.nextDouble();
            list.add(number);
            System.out.println("Si desea salir presione '0' cero sino presione otro numero");
            end = read.nextShort();
        }while(end !=0);
        AddittionAvg addittionAvg = new AddittionAvg();
        addittionAvg.setList(list);
        System.out.println("Sumatoria:"+addittionAvg.addittion());
        System.out.println("Promedio:"+addittionAvg.avg());
    }
    
}
