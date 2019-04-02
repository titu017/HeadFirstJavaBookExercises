/*
 exercise
 */
package exercise;

/**
 *
 * @author Soykot
 */
public class Movie {
    String title;
    String leadRole;
    
    public static void main(String [] args){
        Movie[] movie = new Movie[10];
        
        movie[0] = new Movie();
        movie[1] = new Movie();
        movie[2] = new Movie();
        movie[3] = new Movie();
        movie[4] = new Movie();
        movie[5] = new Movie();
        movie[6] = new Movie();
        movie[7] = new Movie();
        movie[8] = new Movie();
        movie[9] = new Movie();
        
        movie[0].title = "Mission Impossible";
        movie[0].leadRole = "Tom Cruise";
        
        movie[1].title = "DDLJ";
        movie[1].leadRole = "Shah Rukh Khan";
        
        movie[2].title = "Pirates of the Carrabean";
        movie[2].leadRole = "Jhonny Dep";
        
        movie[3].title = "Die Another Day";
        movie[3].leadRole = "Pierce Brosnan";
        
        movie[4].title = "Rush Hour";
        movie[4].leadRole = "Jacky Chan";
        
        movie[5].title = "Fast and Furious";
        movie[5].leadRole = "Van Dame";
        
        movie[6].title = "Transporter";
        movie[6].leadRole = "Jason Statham";
        
        movie[7].title = "Duplicate";
        movie[7].leadRole = "Shah Rukh Khan";
        
        movie[8].title = "Ready";
        movie[8].leadRole = "Salman Khan";
        
        movie[9].title = "3 Idiots";
        movie[9].leadRole = "Aamir Khan";
        
        int x = 0;
        
        while(x<movie.length){
            movie[x].getMovieName();
            movie[x].getMovieRole();
            x++;
        }
    }
    public void getMovieName(){
        System.out.println("Movie Name: " + title);
    }
    public void getMovieRole(){
        System.out.println("Lead Role is: " + leadRole);
    }
    
}
