import java.util.Scanner;

public class Level1Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        int length = sc.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int width = sc.nextInt();

        printFigure(length, width);
    }

    public static void printFigure(int length, int width){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                if(i == 0 || i == length -1){
                    System.out.print("* ");
                } else if(j == 0 || j == width - 1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
