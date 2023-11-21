import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int attemps = 0;
        System.out.println("Угадайте число от 1 до 100");
        int guess = r.nextInt(100)+ 1;
        while (true) {
            System.out.println("Введите число");
            int input = sc.nextInt();
            attemps++;
            if (input > guess) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше,брат");
            } else if (input < guess) {
                System.out.println("Я сам в шоке,но, загаданное число больше,брат");
            } else if (input==guess) {
                System.out.println("Молодец - правильно");
                System.out.println("Колличество попыток:" + attemps);
                break;
            }
        }
        System.out.println("Игра окончена");
    }
}
