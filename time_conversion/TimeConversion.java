public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
    public void showDecaseconds(int numSeconds) {
        double result = ((double) numSeconds / 10);
        System.out.println("\n-------------------------------");
        System.out.println("1 decasecond(das) = 10 seconds(s)");
        System.out.println("Decaseconds: " + result);
        System.out.println("-------------------------------");
    }


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
    public void showJiffies(int numSeconds) {
        double result = ((double) numSeconds / 0.01);
        System.out.println("-------------------------------");
        System.out.println("1 jiffy = 1/100th of a second");
        System.out.println("Jiffies: " + result);
        System.out.println("-------------------------------");
    }


    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here
    public void showNewYorkMinutes(int numSeconds) {
        double result = ((double) numSeconds * 20);
        System.out.println("-------------------------------");
        System.out.println("1 New York Minute = 1/20th of 1 second");
        System.out.println("New York Minutes: " + result);
        System.out.println("-------------------------------");
    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here
    public void showNanoCenturies(int numSeconds) {
        double result = ((double) numSeconds / 3.156);
        System.out.println("-------------------------------");
        System.out.println("1 Nanocentury = 3.156 seconds");
        System.out.println("Nanocenturies: " + result);
        System.out.println("-------------------------------");
    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here
    public void showScaramuccis(int numSeconds) {
        double result = ((double) numSeconds / 950400);
        System.out.println("-------------------------------");
        System.out.println("1 Scaramuccis = 11 days or 950,400 seconds");
        System.out.println("Scaramuccis: " + result);
        System.out.println("-------------------------------");
    }



    
}//end class