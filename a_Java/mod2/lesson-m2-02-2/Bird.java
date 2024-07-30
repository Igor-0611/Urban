
public abstract class Bird {

    int flySpeed = 0;

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public abstract String fly();
    public abstract String makeSound();

    public String getSpeed () {
        return "скорость в полёте до " + flySpeed + " км/ч.";
    }

}
