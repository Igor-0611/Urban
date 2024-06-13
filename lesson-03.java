public class Main {
    public static void main(String[] args) {
        int num = 0;

        while((num += 3) < 50){
            System.out.println(num);
        }

        int sum = 0;

        for(num = 1; num <= 100; ++num){
            sum = sum + num;
        }
        System.out.println("\n" + sum);
    }
}