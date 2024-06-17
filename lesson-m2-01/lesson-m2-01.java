//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Footballer footballer = new Footballer("Петров Иван", "Динамо", 19, 4);
        HockeyPlayer hockeyplayer = new HockeyPlayer("Иванов Пётр", "Спартак", 21, 3);
        Skier skier = new Skier("Сидоров Илья", "ЦСКА", 23, 5);

        System.out.println("футболист: " + footballer.getName() + "\nклуб: " + footballer.getTeam()
                + "\nвозраст: " + footballer.getAge() + "\n" + footballer.scoreGoal());

        System.out.println("хокеист: " + hockeyplayer.getName() + "\nклуб: " + hockeyplayer.getTeam()
                + "\nвозраст: " + hockeyplayer.getAge() + "\n" + hockeyplayer.scorePass());

        System.out.println("лыжник: " + skier.getName() + "\nклуб: " + skier.getTeam()
                + "\nвозраст: " + skier.getAge() + "\n" + skier.placeRace());

    }
}