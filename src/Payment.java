import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите цену товара ");
        double price = input.nextDouble();

        System.out.println("Введите оценку товара ");
        int evaluation = input.nextInt();

        if (evaluation > 90) {
            price = price * ((price * 3) / 100);
        } else  {
            price = price * (price / 100);
        }
        System.out.println("Цена товара: " + price);
    }
}
