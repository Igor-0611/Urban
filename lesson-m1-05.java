import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1;
        double n2;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        //boolean check = false;
        //while (check == false) {
            System.out.print("Первое число: ");
            n1 = scanner.nextDouble();
        //    check = calculator.isNumeric("n1");
        //    if (check == false) {
        //        System.out.print("Введите число");
        //    }
        //}

        System.out.print("Второе число : ");
        n2 = scanner.nextDouble();

        calculator.a = n1;
        calculator.b = n2;

        System.out.print("Действие (+, -, *, /): ");
        char act = scanner.next().charAt(0);
        switch(act) {
            case '+':
                calculator.plus();
                System.out.print("\nРезультат: " + n1 + act + n2 + " = " + calculator.result + "\n");
                break;
            case '-':
                calculator.minus();
                System.out.print("\nРезультат: " + n1 + act + n2 + " = " + calculator.result + "\n");
                break;
            case '*':
                calculator.multi();
                break;
            case '/':
                calculator.divid();
                break;
            default:
                System.out.printf("Ошибка ввода Действие\n");
        }
    }
}
