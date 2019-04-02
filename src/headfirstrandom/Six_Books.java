/*
 * chapte 3
 * page 62
 */
package headfirstrandom;

/**
 *
 * @author Soykot
 */
public class Six_Books {
    String title;
    String author;
}

class BooksTestDrive{
    public static void main(String [] args){
        Six_Books[] myBooks = new Six_Books[3];
        myBooks[0] = new Six_Books();
        myBooks[1] = new Six_Books();
        myBooks[2] = new Six_Books();
        
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        
        int x = 0;
        while(x<3){
            System.out.println(myBooks[x].title);
            System.out.println("by");
            System.out.println(myBooks[x].author);
            x++;
        }
        
        
    }
}
