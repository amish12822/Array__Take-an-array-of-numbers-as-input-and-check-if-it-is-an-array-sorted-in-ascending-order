import java.util.Scanner;

/**
 * take
 */
public class take {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");int n = sc.nextInt();

        int num[] = new int[n];

        // input
        System.out.println("Enter array value: ");
        for (int i=0; i<n; i++){
            num[i] = sc.nextInt();   
        }

        // output
        int b = 0;
        for (int i=0; i<n-1; i++){
            if ( num[i]>num[i+1] ){
                b = 1;    
            }
        }

        if ( b == 1 ){
            System.out.println("The array is not sorted in ascending order");
        } else {
            System.out.println("The array is sorted in ascending order");
        }
        
    }
}