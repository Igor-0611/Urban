import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(21, "red");
        colors.put(23, "orange");
        colors.put(14, "yellow");
        colors.put(17, "green");
        colors.put(19, "cyan");
        colors.put(15, "blue");
        colors.put(24, "violet");

        System.out.println(colors);

        setKeys(colors);

        newMap(colors);
    }

    public static void setKeys (HashMap<Integer,String> thisMap) {
        System.out.println(thisMap.keySet());
    }

    public static void newMap (HashMap<Integer,String> thisMap) {

        TreeMap<Integer, String> colorTree = new TreeMap<>();

        for (Map.Entry color : thisMap.entrySet()) {
            String str = color.getValue().toString();
            if (str.length() > 3) {
                colorTree.put ((Integer) color.getKey(), str);
            }
        }

        System.out.println(colorTree);
    }
}