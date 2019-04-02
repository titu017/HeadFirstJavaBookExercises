/*
* chapter 2
* page no 42
 */
package headfirstrandom;

/**
 *
 * @author Soykot
 */
public class DVDPlayer {
    boolean canRecord = false;
    
    void recordDVD(){
        System.out.println("DVD recording");
    }
    void playDVD(){
        System.out.println("DVD playing");
    }
    
}
class DVDPlayerTestDrive{
    public static void main(String [] args){
        DVDPlayer playerOne = new DVDPlayer();
        playerOne.canRecord = true;
        playerOne.playDVD();
        
        if(playerOne.canRecord == true){
            playerOne.recordDVD();
        }
    }
}
