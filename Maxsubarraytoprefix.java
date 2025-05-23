import java.util.*;

public class Maxsubarraytoprefix{

    public static void prefix(int numbers[]){
    
        int currentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                System.out.println(currentSum);
                if(MaxSum < currentSum) {
                    MaxSum = currentSum;
                }
               

            }
            
        } 
        System.out.println("max sum = " + MaxSum);
    }
        
        
    

    public static void main(String []args){
        int numbers[] = {1, -2, 6, -1, 3};
        prefix(numbers);

    }
}