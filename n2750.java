import java.util.Arrays;
import java.util.Scanner;

public class n2750 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] number = new int[arrSize];
        int size = number.length;

        for(int i=0; i<number.length; i++){
           number[i] = sc.nextInt();
        }
        Arrays.sort(number);

        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}
