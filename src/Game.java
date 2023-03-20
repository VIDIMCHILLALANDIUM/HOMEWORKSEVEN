import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int computer = (int) Math.random() * 3;
        System.out.println("Введите число 0, 1 или 2. 0 - ножницы, 1 - камень, 2 - бумага");
        int numb = input.nextInt();
        System.out.println(computer);

        if (numb == 0 && computer == 2 || numb == 1 && computer == 0 || numb == 2 && computer== 1) {
            System.out.println("Вы выиграли!");
        } else if (numb == 0 && computer == 1 || numb == 1 && computer == 2 || numb == 2 && computer == 0){
            System.out.println("Вы проиграли!");
        } else {
            System.out.println("Ничья!");
        }
    }
}
