
package randomnumgen;

import java.util.Random;

public class RandomNumGen {

   
    public static void main(String[] args) {
        
        int number = 0;
        int i = 0; //While loop Counter
        Random randy = new Random();
        
        while (number != 32) {
            number = randy.nextInt(1000000000);
           // System.out.println(number+1);
            i++; //or i = i + 1 or i = i -1 or i--
        }
        System.out.println("it took: " +i + " rolls to get 32");
    }
    
}
