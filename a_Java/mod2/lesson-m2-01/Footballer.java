
public class Footballer extends Sportsman {

    public Footballer (String name, String team, int age, int score) {
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

    public String scoreGoal() {
        return (super.rank() + "забито голов - " + getScore() + "\n");
    }
}

