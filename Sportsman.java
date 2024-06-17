public class Sportsman {

    private String name;
    private String team;
    private int age;
    private int score;

    public Sportsman (String name, String team, int age, int score) {
        this.name = name;
        this.team = team;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public int getAge() {
        return age;
    }
    public int getScore() {
        return score;
    }

    public String rank() {
        return ("рейтинг: ");
    }

}
