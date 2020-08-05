import java.util.Scanner;



 class Refactoring {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap so cua ban: ");
         int number = sc.nextInt();
         System.out.println(fizzBuzz(number));
     }

     public static String fizzBuzz(int num) {
        boolean isFizz = num % 3 == 0;
        boolean isBuzz = num % 5 == 0;
        if (isBuzz && isFizz) return num + " is FizzBuzz";
        if (isBuzz) return num + " is Buzz";
        if (isFizz) return num + " is Fizz";
        else return ""+ num;
    }
}

