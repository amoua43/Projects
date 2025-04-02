import javax.swing.event.SwingPropertyChangeSupport;

public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }
    int numSeconds; 

    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
    public void showDecaseconds(int numSeconds){
        double result =((double) numSeconds/10);
        System.out.println("In Decasec " + result);
    }
   


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
    public void showJiffies(int numSeconds){
        double result =((double) numSeconds * 100);
        System.out.println("In Millisec " + result); 
    }



    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here
    public void showNewYorkMinutes(int numSeconds){
        double result =((double) numSeconds * 20);
        System.out.println("In NewYorkMin " + result); 
    }


    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here
    public void showNanoCenturies(int numSeconds){
        double result =((double) numSeconds * 3.156);
        System.out.println("In NanoCen " + result);
    }


     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here
    public void showScaramuccis(int numSeconds){
        double result =((double) numSeconds *  950400);
        System.out.println("In Scaramu " + result);
    }




    
}//end class