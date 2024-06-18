//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Eagle eagle = new Eagle();
        System.out.println("Орёл: " + eagle.fly()  + eagle.makeSound() + eagle.getSpeed(220));

        Hawk hawk = new Hawk();
        System.out.println("Ястреб: " + hawk.fly() + hawk.makeSound() + hawk.getSpeed(170));

    }
}