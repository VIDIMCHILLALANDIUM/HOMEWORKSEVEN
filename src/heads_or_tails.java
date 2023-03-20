import java.util.Scanner;

public class heads_or_tails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число 0 или 1. 0 - орёл, 1 - решка.");
        int numb = input.nextInt();

        int random = (int) (Math.random() * 2);
        System.out.println(random);

        if (numb == random) {
            System.out.println("Вы угадали!");
        } else {
            System.out.println("Вы не угадали. Следующий раз повезет!");
        }
    }
}
