import java.util.*;
public class Maxsubarray{
    public static void maxsubarray(int numbers[]){
        int currentSum = 0;
        int MaxSum = Integer.MIN_VALUE;


        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currentSum = 0;
                for(int k = start; k<= end; k++){
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if(MaxSum < currentSum) {
                    MaxSum = currentSum;
                }
               

            }
            
        } 
        System.out.println("max sum = " + MaxSum);
    }
    
    public static void main(String [] args){
        int numbers[] = {1, -2, 6, -1, 3};
        maxsubarray(numbers);

    }
}