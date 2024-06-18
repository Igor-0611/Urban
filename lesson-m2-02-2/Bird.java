
public abstract class Bird {

    int flySpeed = 0;

    public String getSpeed (int flySpeed) {
        this.flySpeed = flySpeed;
        return "скорость в полёте до " + flySpeed + " км/ч.";
    }

    public abstract String fly();
    public abstract String makeSound();

}
