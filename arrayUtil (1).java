public class arrayUtil {
	int[] intArray;
	
	// Constructor
    public arrayUtil(int[] intArray) {
    	this.intArray = intArray;
    }
    // Accessor
    public int[] getArray() {
    	return intArray;
    }
    
    // Mutator
    public void resetArray(int[] newIntArray) {
    	this.intArray = newIntArray;
    }

    // Min value method, no arguments
    public static void minValue(int[] intArray) {
    	int array;
        for (int i = 0; i<intArray.length; i++) {
        	for (int j = i+1; j < intArray.length; j++) {
        		if(intArray[i] > intArray[j]) {
        			array = intArray[i];
        			intArray[i] = intArray[j];
        			intArray[j] = array;
                              }
                          }
                     }
    System.out.println("Smallest: " + intArray[0]);
    }
    
    // Max value method, no arguments
    public static void maxValue(int[] intArray) {
    	int array;
    	for (int i = 0; i<intArray.length; i++) {
        	for (int j = i+1; j < intArray.length; j++) {
        		if(intArray[i] > intArray[j]) {
        			array = intArray[i];
        			intArray[i] = intArray[j];
        			intArray[j] = array;
                              }
                          }
                     }
    	System.out.println("Largest: " + intArray[intArray.length - 1]);
    }
    public static void countUniqueIntegers(int[] intArray) {
        for (int i = 0; i<intArray.length; i++) {
        	boolean isUnique = false;
        	for (int j=0; j<i; j++) {
        		if (intArray[i] == intArray[j]) {
        			isUnique = true;
        			break;
        		}
        	}
        	if (!isUnique) {
        		int unique = intArray[i];
        		System.out.println("Unique:" + unique);
        	}
        }
    }
    
    public static void main(String[] args) {
    	int[] intArray = { 3, -3, -1, 0, -1, 4, 0, 3, 4, 0 };
    	minValue(intArray);
    	maxValue(intArray);
    	countUniqueIntegers(intArray);
    			
    }
}