/*
just for practice
 */
package exercise;

/**
 *
 * @author Titu
 */
public class JobSeeker {
    String name;
    String girlFriendName;
    
    public void getJob(){
        System.out.println(name + " has got the job.");
    }
    public void getGirlfriend(){
        System.out.println("After getting the job," + name + " married his girlfriend " + girlFriendName + ".");
    }
}

class JobHolder{
    public static void main(String [] args) {
        JobSeeker jobSeeker1 = new JobSeeker();
        jobSeeker1.name = "Prazzal";
        jobSeeker1.girlFriendName = "Katrina Kaif";
        
        jobSeeker1.getJob();
        jobSeeker1.getGirlfriend();
        
        JobSeeker jobSeeker2 = new JobSeeker();
        jobSeeker2.name = "Mithu";
        jobSeeker2.girlFriendName = "Priyanka Chopra";
        
        jobSeeker2.getJob();
        jobSeeker2.getGirlfriend();
    }
}
