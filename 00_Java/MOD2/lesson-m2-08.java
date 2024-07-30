import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println ("Задание №1:");

        HashSet<String> set1 = new HashSet<>();
        set1.add ("красный");
        set1.add ("оранжевый");
        set1.add ("жёлтый");
        set1.add ("зелёный");
        set1.add ("голубой");
        set1.add ("синий");
        set1.add ("фиолетовый");

        HashSet<String> set2 = new HashSet<>();
        set2.add ("красный");
        set2.add ("оранжевый");
        set2.add ("чёрный");
        set2.add ("зелёный");
        set2.add ("голубой");
        set2.add ("белый");
        set2.add ("фиолетовый");

        HashSet<String> setResult = new HashSet<>();
        String[] arr1 = set1.toArray(new String[set1.size()]);
        String[] arr2 = set2.toArray(new String[set2.size()]);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    setResult.add (arr1[i]);
                    break;
                }
            }
        }
        System.out.println (set1);
        System.out.println (set2);
        System.out.println (setResult);

        System.out.println ("Задание №2:");

        int num[] = {18, 7, 11, 26, 16, 4, 17, 21, 3, 56};

        HashSet<Integer> numEven = new HashSet<>();
        HashSet<Integer> numOdd = new HashSet<>();

        for (int k = 0; k < num.length; k++) {
            if (num[k]>15 && num[k]%2==0) {
                numEven.add (num[k]);
            } else {
                numOdd.add(num[k]/2);
            }

        }
        System.out.println (numEven);
        System.out.println (numOdd);
    }
}