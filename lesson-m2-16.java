import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадание №1:");

        int[] arrInt = {41, 24, 320, 47, 59, 605, 73, 83, 95, 102, 110, 507, 135, 314, 195, 812, 179, 18, 219, 20};

        int maxEven = Arrays.stream(arrInt).filter(i -> i % 2 == 0).reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("\nМаксимальное четное число в массиве = " + maxEven);
        
        //---------------------------------------------------------------------------

        System.out.println("\nЗадание №2:");

        String str = "Привет, Александр, с праздником, с Новым Годом";
        System.out.println(str);

        char[] charArr = str.toCharArray();

        for (char c : charArr) {
           if (Character.isUpperCase(c)) c=Character.toLowerCase(c);
           else if (Character.isLowerCase(c)) c=Character.toUpperCase(c);
           System.out.print(c);
        }
        System.out.println();
    }
}