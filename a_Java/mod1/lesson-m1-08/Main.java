import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n");
        Gamer gamer001 = new Gamer("Colt", false);
        Gamer gamer002 = new Gamer("Volt", true);
        Gamer gamer003 = new Gamer("Deril", false);
        Gamer gamer004 = new Gamer("El Primo", true);
        Gamer gamer005 = new Gamer("Grom", false);
        Gamer gamer006 = new Gamer("El Poco", true);

        Gamer[] arrGamer = {gamer001, gamer002, gamer003, gamer004, gamer005, gamer006};

        System.out.println("Кто в игре?");
        for (int i=0; i<arrGamer.length; i++) {
            if (arrGamer[i].getIsActive()) System.out.println(arrGamer[i].getNickname());
        }
        System.out.print("\n");
    }
}