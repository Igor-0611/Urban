public class Main {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] arr2 = {1, 2, 3, 5, 4, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean equals = true;

        if (arr1.length != arr2.length) equals = false;
        else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equals = false;
                    break;
                }
            }
        }

        System.out.println("Эквивалентность массивов: " + equals);
    }
}