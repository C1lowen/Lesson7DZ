import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Level1Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива : ");
        int size = sc.nextInt();

        int[] arr = new int [size];

        addElementsToMassive(arr);
        System.out.println(Arrays.toString(arr));

        int maxElement = findMaxElement(arr);
        System.out.println("Максимальный елемент: " + maxElement);
    }

    public static void addElementsToMassive(int[] arr){
        Random rd = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static int findMaxElement(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
