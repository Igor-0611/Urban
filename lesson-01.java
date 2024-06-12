public class Main {
    public static void main(String[] args) {

        int x = 24;
        double y = 57.41;
        char s = 119;
        double result = (double)x + y + (double)s;
        System.out.printf("Result: " + result + "; \n");

        int a = 5;
        int b = 12;
        boolean check = a != b;
        System.out.printf("Result: " + check + "; \n");
        
        int d = 6;
        d += 6;
        d -= 2;
        d /= 5;
        d *= 7;
        System.out.printf("Result: " + d + "; \n");

        System.out.printf("Finish \n");
    }
}
