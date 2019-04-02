/*
* chapter 2
* page no 42
 */

package headfirstrandom;

public class TapeDeck {

boolean canRecord = false;

void playTape(){
    System.out.println("Tape Playing");
}

void recordTape(){
    System.out.println("Tape Recording");
}

}

class TapeDeckTestDrive{
    public static void main(String [] args){
        TapeDeck tape = new TapeDeck();
        tape.canRecord = true;
        
        tape.playTape();
        tape.recordTape();
    }
}

