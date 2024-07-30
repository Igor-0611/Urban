import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("D://JavaFiles/lesson-m2-06.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите данные для записи или закройте файл вводом '0'");

        try (FileWriter writer = new FileWriter(file, true)) {

            boolean check = true;
            String string = scanner.nextLine();

            if (string.equals("0")) {
                writer.close();
                check = false;
            } else writer.write(string);

            while (check) {
                System.out.println("Вводите что-нибудь ещё или закройте файл вводом '0'");
                string = scanner.nextLine();
                if (string.equals("0")) {
                    writer.close();
                    check = false;
                } else writer.write(' ' + string);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Файл закрыт.");
    }
}