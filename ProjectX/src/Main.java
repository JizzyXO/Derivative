import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = scanner.nextInt();

        System.out.println("Вычислить степень: ");
        int y = scanner.nextInt();

        double derivative = y - 1;
        double s = x*y;
        System.out.println(s);
        System.out.println("X^ ");
        System.out.println(derivative);


        }
}