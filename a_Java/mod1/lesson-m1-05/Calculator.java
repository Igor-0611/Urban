public class Calculator {

        double a;
        double b;
        double result;
/**
        public boolean isNumeric(String strNum) {
            try {
                double d = Double.parseDouble(strNum);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
*/
        public double plus(){
            result = a + b;
            return result;
        }

        public double minus(){
            result = a - b;
            return result;
        }

        public void multi(){
            result = a * b;
            System.out.print("Результат: " + a + "*" + b + " = " + result + "\n");
        }

        public void divid(){
            result = a / b;
            System.out.print("Результат: " + a + "/" + b + " = " + result + "\n");
        }
}
