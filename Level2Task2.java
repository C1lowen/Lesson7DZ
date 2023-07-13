public class Level2Task2 {
    public static void main(String[] args) {
        int max = 0;
        int maxNumberOne = 0;
        int maxNumberTwo = 0;
        for(int i = 100; i <= 999; i++){
            for(int j = 100; j <= 999; j++){
                if(isPalindrom((i*j)) && i*j > max){
                    maxNumberOne = i;
                    maxNumberTwo = j;
                    max = maxNumberOne*maxNumberTwo;
                }
            }
        }

        System.out.println("Результат: " + maxNumberOne + "*" + maxNumberTwo+ " = " +max);
    }

    static boolean isPalindrom(int number){
        if(number % 10 == 0) return false;

        int res = 0;

        while(number > res){
            res *= 10;
            res += number % 10;
            number /= 10;
        }

        return number == res || number == (res/10);
    }
}
