//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int speedEagle = 220;
        int speedHawk = 170;

        Eagle eagle = new Eagle(speedEagle);
        System.out.println("Орёл: " + eagle.fly()  + eagle.makeSound() + eagle.getSpeed());

        Hawk hawk = new Hawk(speedHawk);
        System.out.println("Ястреб: " + hawk.fly() + hawk.makeSound() + hawk.getSpeed());

    }
}