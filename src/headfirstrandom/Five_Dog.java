/*
chapter-3
page-62
 */
package headfirstrandom;

/**
 *
 * @author Soykot
 */
public class Five_Dog {
    String name;
    public static void main(String [] args){
        Five_Dog dog1 = new Five_Dog();
        dog1.name = "Bart";
        dog1.bark();
        
        
        Five_Dog[] myDogs = new Five_Dog[3];
        
        myDogs[0] = new Five_Dog();
        myDogs[1] = new Five_Dog();
        myDogs[2] = dog1;
        
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        System.out.println("last dog's name is: " + myDogs[2].name);
        
        int x = 0;
        while(x<myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }
    public void bark(){
        System.out.println(name + " says Ruff!");
    }
    public void eat(){
        
    }
    public void chaseCat(){
        
    }
}
