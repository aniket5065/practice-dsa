import java.util.*;

public class Pairsinarray {

    public static int pairs(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            int curr= numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");

            }
            System.out.println();
        }
        return 0;
    }


    public static void main(String [] args){
        int numbers[] ={2, 4, 6, 8, 10};
        pairs(numbers);
    }
    
}