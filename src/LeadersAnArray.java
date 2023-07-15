import java.util.ArrayList;
import java.util.Scanner;

public class LeadersAnArray {
    public static void leaderArray(int[] array)
    {
        int size= array.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[j]>array[i]){
                    break;
                }
                if(array[j]==array[size-1]){
                    result.add(array[i]);

                }
            }
        }
        result.add(array[size-1]);
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        leaderArray(array);
    }
}
