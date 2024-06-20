
public class Fish implements Swimmable {

    String rank;
    String group;
    String sort;
    String name;

    public Fish (String rank, String group, String sort, String name) {
        this.rank = rank;
        this.group = group;
        this.sort = sort;
        this.name = name;
    }

    public String getInfo() {return (sort + " " + name + ":");}

    @Override
    public void swim() {System.out.println("Данный класс способен плавать по рождению.");}
}
