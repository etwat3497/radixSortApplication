/*
 * By Ethan Watt, Will Pringle, and Joshua Marquardt
 * On November 22, 2016
 * To demonstrate radix sort
 */
package radixsortapplication;


public class RadixSortApplication {

    
    public static int maxNum(int numArray[]){
        int max = numArray[0];
        for(int i=1; i<numArray.length;i++){
            if(numArray[i]>max){
                max = numArray[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    }
    
}
