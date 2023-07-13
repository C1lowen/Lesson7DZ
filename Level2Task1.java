import java.util.Arrays;
import java.util.Scanner;

public class Level2Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Введите последовательность: ");
        String line = sc.nextLine();

        String[] str = line.split("[,]");

        if(str.length <= 2){
            System.out.println("Последовательность должна состоять минимум из 3 елеменов!");
            return;
        }

        int[] arr = new int[str.length];

        for(int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i + 1] > arr[i]){
                count++;
            }
        }


        if(count == arr.length - 1){
            String result = plus(arr) +  multiplication(arr) + degree(arr);
            if(result.equals("")){
                System.out.println("Не найдено никакого алгоритма для решения данной последовательности!");
            }else{
                System.out.println(Arrays.toString(arr)+ " => " +result);
            }
        }else {
            System.out.println("Массив не является последовательностью!");
        }

    }

    static String plus(int[] arr){
        int count = 0;
        String str = "";
        int[] getArr = new int [arr.length -1];

        for(int i = 0; i < getArr.length; i++){
            getArr[i] = arr[i + 1] - arr[i];
        }
        for(int i = 0; i < getArr.length-1; i++){
            if(getArr[i + 1] == getArr[i]){
                count++;
            }
        }
        if(count == getArr.length-1){
            str = arr[arr.length -1] + getArr[0] + "";
        }
        return str;
    }
    static String multiplication(int[] arr){
        String str = "";
        int medium = arr.length / 2;
        double resultOne = (double)arr[medium + 1] / arr[medium];
        double resultTwo = (double)arr[medium] / arr[medium - 1];

        if(resultOne % 1 == 0 && resultTwo % 1 == 0){
            str = arr[arr.length - 1] * (int)resultOne + "";
        }

        return str;
    }

    static String degree(int [] arr){
        String str = "";
        int medium = arr.length / 2;
        double resultOne;
        double resultTwo;

        for(int i = 2; i <= 3; i++){
            resultOne = Math.pow(arr[medium + 1], (double)1/i) - Math.pow(arr[medium], (double)1/i);
            resultTwo = Math.pow(arr[medium], (double)1/i) - Math.pow(arr[medium-1], (double)1/i);

            if((resultOne >= 0.9999 && resultOne <= 1.0001) && (resultTwo >= 0.9999 && resultTwo <= 1.0001)){
                double result =Math.pow(arr[arr.length-1], (double)1/i);
                if(result % 1 >= 0.9999) result += 1;
                str = (int)Math.pow((int)result+1, i) + "";
                break;
            }
        }

        return str;
    }
}
