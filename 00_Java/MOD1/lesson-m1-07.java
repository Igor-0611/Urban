
public class Main {
    public static void main(String[] args) {
        System.out.printf("\n");
        String[] stringArray = {"ab", "cd", "ef"};

        String word = stringArray[0]+stringArray[1]+stringArray[2];
        char[] charArray = new char[word.length()];
        word.getChars(0, word.length(), charArray, 0);

        for (int i = 0; i < charArray.length; i++) {
            System.out.print("'" + charArray[i] + "' ");
        }
        System.out.printf("\n");
        //-------------------------------------------------------
        System.out.printf("\n");
        String stroke = "12345";
        char[] charArr = {stroke.charAt(0), stroke.charAt(stroke.length()-1)};
        System.out.println(charArr);
        System.out.println(stroke.charAt(0) + "" + stroke.charAt(stroke.length()-1));
        //-------------------------------------------------------
        System.out.printf("\n");
        String str = "1203405";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                System.out.print("Позиция первого '0' - " + i);
                break;
            }
        }
        System.out.printf("\n");
    }
}