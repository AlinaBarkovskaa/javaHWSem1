// Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();

        System.out.print("Выберите действие (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: некорректная операция");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

    }
}
