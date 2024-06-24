import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println ("\n Задание №1 (поиск цвета):");

        List<String> listColor = new ArrayList<>();
        listColor.add("red");
        listColor.add("orange");
        listColor.add("yellow");
        listColor.add("green");
        listColor.add("cyan");
        listColor.add("blue");
        listColor.add("violet");
        listColor.add("black");

        String color1 = "green";
        String color2 = "white";

        System.out.println("Is there a color " + color1 + "? - " + haveColor(listColor, color1));
        System.out.println("Is there a color " + color2 + "? - " + haveColor(listColor, color2));

        System.out.println ("\n Задание №2 (изменение списка):");

        LinkedList<Integer> listNum = new LinkedList<>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);

        System.out.println(listNum);
        changeList(listNum);
        System.out.println(listNum);

    }

    public static boolean haveColor (List<String> listStr, String color) {
        boolean have = false;
        if (listStr.contains(color)) have = true;
        return have;
    }

    public static void changeList (LinkedList<Integer> listInt) {
        Integer item = listInt.pollLast();
        listInt.addLast(listInt.pollFirst());
        listInt.addFirst(item);
    }
}