import java.util.Arrays;
import java.util.Scanner;

public class Level1Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число котрое нужно найти: ");
        int target = sc.nextInt();
        System.out.print("Введите размер масива: ");
        int size = sc.nextInt();

        int arr[] = new int [size];

        initializationMassive(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("Индекс: " + findTarget(arr, target));
    }


    public static void initializationMassive(int[] arr){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            System.out.print("arr [" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }
    public static int findTarget(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
