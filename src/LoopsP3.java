
/**
 * Write a description of class LoopsP3 here.
 *
 * @author Ian Bryan
 * @version V1
 */
public class LoopsP3
{
    //initialize variable with 1 for starting point
    //if this is going to work, based on the math, we need to use a 'long' access modifier
    private int grainsRice = 1;
    private int grainsTotal;
    
    public static void main(String[] args){
    
        LoopsP3 lp3 = new LoopsP3();
        lp3.countGrains();
        lp3.powerOfTwo(8);
    }
    
    //calculates and prints number of grains earned eady day
    //starting with 1 grain on first 'day'.
    //then double that number each 'day' passed.
    public void countGrains(){
    
        for(int i =0;i<64;i++){
            grainsRice *= 2;
            grainsTotal += grainsRice;
            System.out.println("Day + " + i + " and you got " + grainsRice + " grain(s) of rice "+
            "for a total of " + grainsTotal + " grain(s)");
        }
    }
    
    //getting the exponential of a number 
    //in powers of two
    public void powerOfTwo(int theNumber){
    	
    }
}