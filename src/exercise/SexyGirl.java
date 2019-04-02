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
public class SexyGirl {
    String name;
    int chestSize;
    
    public static void main(String [] args){
        SexyGirl girl1 = new SexyGirl();
        girl1.name = "Rina";
        girl1.chestSize = 36;
        
        SexyGirl [] sexyGirl = new SexyGirl[5];
        sexyGirl [0] = new SexyGirl();
        sexyGirl [1] = new SexyGirl();
        sexyGirl [2] = new SexyGirl();
        sexyGirl [3] = new SexyGirl();
        sexyGirl [4] = girl1;
        
        sexyGirl [0].name = "Mina";
        sexyGirl [0].chestSize = 34;
        
        sexyGirl [1].name = "Tina";
        sexyGirl [1].chestSize = 32;
        
        sexyGirl [2].name = "Shina";
        sexyGirl [2].chestSize = 36;
        
        sexyGirl [3].name = "Elina";
        sexyGirl [3].chestSize = 33;
        
        int x = 0;
        while(x<sexyGirl.length){
            sexyGirl[x].showTits();
            sexyGirl[x].getFucked();
            x = x + 1;
        }
    }
    public void showTits(){
        System.out.println(name + " is showing tits."+ name + "'s size is: "+ chestSize);
    }
    public void getFucked(){
        System.out.println(name +" is now getting fucked pretty hard.");
    }    
}
