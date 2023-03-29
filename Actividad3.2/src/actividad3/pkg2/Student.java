/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3.pkg2;

import java.util.ArrayList;

/**
 *
 * @author kel2m
 */
public class Student {
    private String name;
    private int cod;
    private double avg;

    public Student(String name, int cod, double avg) {
        this.name = name;
        this.cod = cod;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    
    public void printingData(ArrayList<Student> list){
        double avgGlobal=0;
        for(int i=0; i < list.size();i++){
            System.out.println("Nombre del estudiante:"+list.get(i));
            avgGlobal += list.get(i).avg;
        }
        System.out.println("Promedio global:"+avgGlobal/list.size());
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", cod=").append(cod);
        sb.append(", avg=").append(avg);
        sb.append('}');
        return sb.toString();
    }

   

   

   
    
}
