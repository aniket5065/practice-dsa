public class inverted{
    public static void inverted(int n){
    int counter = 1;
    for(int i=1; i<=5; i++){
        
        for(int j=1; j<=i;  j++ ){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    inverted(5);
}
}

