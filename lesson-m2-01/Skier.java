
public class Skier extends Sportsman {

    public Skier (String name, String team, int age, int score) {
        super(name, team, age, score);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getTeam() {
        return super.getTeam();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getScore() {
        return super.getScore();
    }

    public String placeRace() {
        return (super.rank() + "место в предыдущем забеге - " + getScore() + "\n");
    }
}