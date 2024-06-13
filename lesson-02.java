
public class Main {
    public static void main(String[] args) {
        int x = 136;
        int y = 24;

        String result = x%2==y%2 ? "\nУдачное совпадение \n" : "";

        System.out.printf(result);

        int  day = 17;

        if ((day > 31 || day < 1) == true) {
            result = "Некорректная дата \n";
        } else {
            if (day > 20) {
                result = "Третья декада месяца \n";
            } else {
                result = day > 10 ? "Вторая декада месяца \n" : "Первая декада месяца \n";
            }
        }

        System.out.printf(result);
    }
}