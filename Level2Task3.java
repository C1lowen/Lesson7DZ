import java.util.Arrays;
import java.util.Scanner;

public class Level2Task3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Введите размер масива: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i  = 0; i < size; i++){
            arr[i] = i+1;
        }

        System.out.println("Начальный масив: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Комбинации масива: ");
        arrayСombinations(arr, size);
    }
    static void arrayСombinations(int arr[], int size){

        if(size <= 0){
            System.out.println(Arrays.toString(arr));
        }
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){

                int res = arr[j];
                arr[j] = arr[size-1];
                arr[size-1] = res;

            }
            arrayСombinations(arr, size-1);
        }
    }
}
