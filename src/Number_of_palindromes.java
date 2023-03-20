import java.util.Scanner;

public class Number_of_palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите трехзнаное целое число ");
        int numb = input.nextInt();
        int firstDigit = numb / 100;
        int thirdDigit = numb % 10;
        String definition = (firstDigit == thirdDigit) ? "палиндром" : "не палиндром";
        System.out.println(definition);
    }
}
