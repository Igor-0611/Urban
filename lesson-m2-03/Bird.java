
public class Bird implements Swimmable, Flyable {

    String rank;
    String group;
    String sort;
    String name;

    public Bird (String rank, String group, String sort, String name) {
        this.rank = rank;
        this.group = group;
        this.sort = sort;
        this.name = name;
    }

    public String getInfo() {return (sort + " " + name + ":");}

    @Override
    public void swim() {
        if (group.equals("водоплавающие")) {
            System.out.println("Данный отряд птиц способен плавать по рождению.");
        }
        else {System.out.println("Данный отряд птиц не способен плавать.");}
    }

    @Override
    public void fly() {
        if (sort.equals("пингвин") || sort.equals("страус")) {
            System.out.println("Данный вид птиц не способен летать.");
        }
        else {System.out.println("Данный вид птиц способен летать после тренировки.");}
    }
}
