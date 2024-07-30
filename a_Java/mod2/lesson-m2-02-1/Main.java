//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        System.out.println("Гитара: " + guitar.getType() + " - " + guitar.getTune());
        Piano piano = new Piano();
        System.out.println("Пианино: " + piano.getType() + " - " + piano.getTune());

    }
}