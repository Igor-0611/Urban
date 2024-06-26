import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] arr2 = {1, 7, 3, 4, 5, 6, 2, 8, 9};
        int[] arr2 = {1, 7, 3, 4, 5, 6, 2, 8, 9, 10};

        System.out.println("Эквивалентность массивов: " + testEquals(arr1, arr2));

        Generic<Integer> generic = new Generic(arr2[1]);
        arr2[1] = arr2[6];
        arr2[6] = generic.getObject();

        System.out.println("Эквивалентность массивов: " + testEquals(arr1, arr2));
    }

    public static boolean testEquals (int[] arrA, int[] arrB) {
        if (arrA.length != arrB.length) return false;
        else if (Arrays.equals(arrA, arrB)) return true;
        else return false;
    }

    public static class Generic <T> {
        private T id;
        Generic (T id) {
            this.id = id;
        }
        public T getObject() {return id;}
    }
}