
public class Hawk extends Bird {

    public Hawk (int flySpeed) { super(flySpeed); }

    @Override
    public String fly() {
        return ("взмахи с последующим скольжением, ");
    }

    @Override
    public String makeSound() {
        return ("издаёт звуки похожие на звук флейты, ");
    }

    public String getSpeed() { return super.getSpeed(); }

}
