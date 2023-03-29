/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad3.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kel2m
 */
public class Actividad32 {

    /**
     * 2.El departamento escolar de la facultad de ingeniería necesita 
     * obtener un reporte global de los promedios de sus alumnos y que muestre 
     * el promedio de cada uno. Se debe crear una clase Alumno usando todos los 
     * atributos y métodos que se consideren necesarios. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);        
        short end=0;
        String name="";
        int cod=0;
        double avg=0;
        Student student;
        ArrayList<Student> list = new ArrayList<>();
        do{
            System.out.println("Introduzca el nombre del estudiante:"); 
            name = read.next();
            System.out.println("Introduzca el código del estudiante:"); 
            cod = read.nextInt();
            System.out.println("Introduzca el promedio del estudiante:"); 
            avg = read.nextDouble();
            student = new Student(name,cod,avg);
            list.add(student);
            System.out.println("Si desea salir presione '0' cero sino presione otra número");
            end = read.nextShort();
        }while(end !=0);
        student.printingData(list);
    }
    
}
