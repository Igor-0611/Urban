
public class Main {
    public static void main(String[] args) {
        int[] arrInt = {6, 17, 24, 31, 48, 53, 62, 75, 86, 99};
        String[] arrStr = {"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};

        CheckEven checkEven = (n) -> n%2==0;
        System.out.println(sumOfEven(arrInt, checkEven));

        SeekWord seekWord = (wc, wp) -> wc>wp;
        System.out.println(seekLonger(arrStr, seekWord));

    }

    public static int sumOfEven (int[] arrInt, CheckEven check) {
        int result = 0;
        for (int element: arrInt) {
            if (check.isEqual(element)) {
                result += element;
            }
        }
        return result;
    }

    public static String seekLonger (String[] arrStr, SeekWord seek) {
        int len  = 0;
        String word = "";
        for (String element: arrStr) {
            if (seek.isLonger(element.length(), len)) {
                len = element.length();
                word = element;
            }
        }
        return word;
    }
}

interface CheckEven {
    boolean isEqual (int a);
}

interface SeekWord {
    boolean isLonger (int lc, int lp);
}