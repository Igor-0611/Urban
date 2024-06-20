//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Human human = new Human("млекопитающие", "приматы", "человек", "Петя");
        System.out.println("\n" + human.getInfo());
        human.swim();
        human.fly();

        Bird bird = new Bird("птицы", "водоплавающие", "пингвин", "Шкипер");
        System.out.println("\n" + bird.getInfo());
        bird.swim();
        bird.fly();

        Fish fish = new Fish("рыбы", "костные", "рыба-клоун", "Немо");
        System.out.println("\n" + fish.getInfo());
        fish.swim();
    }
}