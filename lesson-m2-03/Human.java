
public class Human implements Swimmable, Flyable {

    String rank;
    String group;
    String sort;
    String name;

    public Human (String rank, String group, String sort, String name) {
        this.rank = rank;
        this.group = group;
        this.sort = sort;
        this.name = name;
    }

    public String getInfo() {return (sort + " " + name + ":");}

    @Override
    public void swim() {System.out.println("Способен плавать после обучения.");}

    @Override
    public void fly() {System.out.println("Способен летать с применением технических средств.");}
}
