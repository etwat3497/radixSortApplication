
/*
 * By Ethan Watt, Will Pringle, and Joshua Marquardt
 * On November 22, 2016
 * To demonstrate radix sort
 */
package radixsortapplication;

import java.util.Arrays;


public class RadixSortApplication {
    
    /**
    * pre: String array
    * post: void
    * Main method to retrieve the number array and output it in sorted order
    */
    public static void main(String[] args) {

        //Declare number array
        //int[] numberArray = new int[0];
        int[] numberArray = {20,10,5,400};

        //Run method that uses radix sort to put numbers in sorted order
        radixSort(numberArray);
        
        //Print each element of the array in sorted order
        for(int i=0; i<numberArray.length; i++){
            //System.out.println(numberArray[i]+" ");
        }
        
    }
    
    
    /**
    * pre: number array
    * post: void
    * Method to run the sort array for the number of significant digits
    */
    public static void radixSort(int numArray[]){
        int counter = 0;
        //Find maximum value to know how many significant digits there are
        int maxNumber = maxNum(numArray);
        /*
          Will run for loop as long as max number divided by digits is greater than 0
          Digits is multiplied by 10 for each consecutive loop to represent an increase in significant digits
          If 500 was the max number then when digit is equal to 1000 the for loop would stop - it would run 3 times
        */
        for(int digit = 1; maxNumber/digit>0; digit*=10){
            //Run sort method for the number of significant digits in the array
            sort(numArray,counter);
            counter++;
        }
        
    }
    
    
    /**
    * pre: number array
    * post: void
    * Method to sort the numbers in the increasing order for each significant digit
    */
    public static void sort(int numArray[], int index){
        //ADD CODE HERE TO SORT THE NUMBERS IN ASCENDING ORDER
        //WILL NEED A TEMPORARY ARRAY AND DETERMINE HOW MANY TIMES THE DIGIT OCCURS AS ALL ELEMENTS MAY NOT HAVE THAT SPECIFICED SIG FIG AS THE NUMBERS GROW IE 2 VS 200
        String temp = Arrays.toString(numArray);
        String[] tempArray = temp.substring(1,temp.length()-1).split(", ");
        System.out.println(tempArray[2]);
        
        for(int j=0; j<numArray.length;j++){
           
        }
        
    }
    
    
    /**
    * pre: number array
    * post: max number
    * Method to return the max number in the array
    */
    public static int maxNum(int numArray[]){
        int max = numArray[0];
        //Run for the size of the array minus the first, already assigned element at index 0
        for(int i=1; i<numArray.length;i++){
            //If the element at index i of the number array is greater than the current max value
            if(numArray[i]>max){
                //Set that element as the new max value
                max = numArray[i];
            }
        }
        return max;
    }  
}
