/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3.pkg3;

import java.util.ArrayList;

/**
 *
 * @author kel2m
 */
public class AddittionAvg {
    
    private ArrayList<Double> list = new ArrayList<>();

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }  
    
    public double addittion(){
        double addi=0;
        for (int i=0;i<list.size();i++){
            addi = addi+list.get(i);
        }
        return addi;
    }
    public double avg(){
        double av=0;
        for (int i=0;i<list.size();i++){
            av = av+list.get(i);
        }
        return av/list.size();
    }
    
    
    
}
