import java.util.Scanner;

public class days_of_the_week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число дня недели ");
        int day = input.nextInt();

        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
        }
    }
}
