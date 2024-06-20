import java.util.Scanner;

public class Car {

    String carBrand;
    int speed;
    int weight;

    public void getInfo() {
        System.out.printf("\n" + carBrand + ", скорость " + speed + " км/ч, вес " + weight + " кг. \n");
    }

    public void getMark() {

        System.out.printf(" Оцените работу двигателя от 0 до 5 - ");
        int markEngine = new Scanner(System.in).nextInt();
        Engine engine = new Engine();


        System.out.printf(" Оцените работу двигателя от 0 до 5 - ");
        int formBody = new Scanner(System.in).nextInt();
        Body body = new Body();

        System.out.printf("\n");

        engine.toRun(markEngine);
        body.toForm(formBody);
    }

    private static class Engine {

        public void toRun(int mark) {

            class QualEngine {
                public void actRunning() {
                    System.out.printf(" двигатель работает на " + mark + ". \n");
                }
                public void actBroken() {
                    System.out.printf(" двигатель не заводится. \n");
                }
            }

            QualEngine qualEngine = new QualEngine();
            if (mark>0) qualEngine.actRunning();
            else qualEngine.actBroken();
        }

    }

    private static class Body {

        public void toForm(int mark) {

            class QualBody {
                public void bodyForm() {
                    System.out.printf(" состояние кузова на " + mark + ". \n");
                }
                public void bodyBroken() {
                    System.out.printf(" кузов не подлежит ремонту. \n");
                }
            }

            QualBody qualBody = new QualBody();
            if (mark>0) qualBody.bodyForm();
            else qualBody.bodyBroken();
        }

    }
}
