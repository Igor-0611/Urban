
public class Main {

    public static void main(String[] args) {

        int[] arrayI = {17, 46, 373, 734, 927, 1138, 1739, 2032};
        int lengthI = arrayI.length;

        String[] arrayS = {"Alex", "Alex7", "What", "Wh2at", "Pepe", "P4epe", "String", "Str9ing"};
        int lengthS = arrayS.length;

        System.out.println("Проверка числа на чётность:");
        for (int i = 0; i < lengthI; i++) {
            try {
                getEven(arrayI[i]);
                System.out.println(arrayI[i] + " - найдено чётное число;");
            } catch (Exception e) {}
        }

        System.out.println("\nПроверка строки на отсутствие чисел:");
        for (int i = 0; i < lengthS; i++) {
            try {
                for (int j = 0; j < arrayS[i].length(); j++) chekNum(arrayS[i].charAt(j));
                System.out.println(arrayS[i] + " - в строке нет чисел;");
            } catch (Exception e) {}
        }
    }

    public static int getEven(int num) throws Exception {
        if (num % 2 > 0) throw new Exception();
        return num;
    }

    public static char chekNum(char cr) throws Exception {
        if (Character.isDigit(cr)) throw new Exception();
        return cr;
    }
}