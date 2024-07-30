
public class Eagle extends Bird {

    public Eagle (int flySpeed) { super(flySpeed); }

    @Override
    public String fly() {
        return ("парит по спирали, ");
    }

    @Override
    public String makeSound() {
        return ("издаёт клёкот похожий на лай, ");
    }

    public String getSpeed() { return super.getSpeed(); }

}
