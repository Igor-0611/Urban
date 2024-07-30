import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n");
        int[] arrayA = {3, 87, 12, 98, 2, 4, 66};
        System.out.println(Arrays.toString(arrayA));

        for (int i = arrayA.length-1; i >= 0; i--) {
            System.out.print(arrayA[i] + "; ");
        }
        System.out.print("\n");
        //----------------------------------------------------------
        System.out.print("\n");
        Double[] arrayB = {3.25, 87.17, 12.34, 98.62, 2.75, 4.83, 66.18};
        System.out.println(Arrays.toString(arrayB));

        Arrays.sort(arrayB);
        Double tmp = 0.00;
        for (int i = 0, j = arrayB.length - 1; i < j; i++, j--) {
            tmp = arrayB[i];
            arrayB[i] = arrayB[j];
            arrayB[j] = tmp;
        }
        System.out.println(Arrays.toString(arrayB));
        //-----------------------------------------------------------
        System.out.print("\n");
        int[] arrayC = {6, 117, 44, 5, 32, 81, 9};
        System.out.println(Arrays.toString(arrayC));

        System.out.print("чётные числа: ");
        for (int i = 0; i < arrayC.length; i++) {
            if (arrayC[i]%2 == 0) System.out.print(arrayC[i] + "; ");
        }
        System.out.print("\n");
    }
}