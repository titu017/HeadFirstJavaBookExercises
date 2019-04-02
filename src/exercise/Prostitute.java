/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author Soykot
 */
public class Prostitute {
    String name;
    
    public static void main(String [] args){
        Prostitute p1 = new Prostitute();
        p1.name = "Naila";
        
        Prostitute [] pros = new Prostitute[5];
        
        pros[0] = new Prostitute();
        pros[1] = new Prostitute();
        pros[2] = new Prostitute();
        pros[3] = new Prostitute();
        pros[4] = p1;
        
        pros[0].name = "Sheela";
        pros[1].name = "Meela";
        pros[2].name = "Sunny";
        pros[3].name = "Alexis";
        
//        int x = 0;
        
        for(int x = 0; x<pros.length; x++){
            pros[x].getFucked();
        }
        
        
    }
    
    public void getFucked(){
        System.out.println(name + " is a prostitute. She is getting pounded so hard.");
    }
    
}
