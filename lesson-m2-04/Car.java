import java.util.Scanner;

public class Car {

    String carBrand;
    int speed;
    int weight;

    public void getInfo() {
        System.out.printf("\n" + carBrand + ", скорость " + speed + " км/ч, вес " + weight + " кг.");
    }

    public void getMark() {

        System.out.printf("\n Оцените работу двигателя от 0 до 5 - ");
        Engine engine = new Engine();
        int markEngine = new Scanner(System.in).nextInt();

        System.out.printf(" Оцените работу двигателя от 0 до 5 - ");
        Body body = new Body();
        int formBody = new Scanner(System.in).nextInt();

        System.out.printf("\n");

        engine.toRun(markEngine);
        body.toForm(formBody);
    }

    private class Engine {

        public void toRun(int mark) {

            class QualEngine {
                public void actRunning() {
                    System.out.printf(" двигатель работает на " + mark + ". \n");
                }
                public void actBroken() {
                    System.out.printf(" двигатель не заводиться. \n");
                }
            }

            QualEngine qualEngine = new QualEngine();
            if (mark>0) qualEngine.actRunning();
            else qualEngine.actBroken();
        }

    }

    private class Body {

        public void toForm(int mark) {

            class QualBody {
                public void bodyForm() {
                    System.out.printf(" состояние кузова на " + mark + ". \n");
                }
                public void bodyBroken() {
                    System.out.printf(" кузов не прдлежит ремонту. \n");
                }
            }

            QualBody qualBody = new QualBody();
            if (mark>0) qualBody.bodyForm();
            else qualBody.bodyBroken();
        }

    }
}
