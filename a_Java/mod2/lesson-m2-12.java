
public class Main {
    public static void main(String[] args) {

        System.out.println(simPrint("Hello, World!", (str) -> str));
        System.out.println(uppPrint("Hello, World!", (str) -> str));
        System.out.println(lowPrint("Hello, World!", (str) -> str));
        System.out.println(simConcat("Hello,", "World!", (str1, str2) -> str1));
        System.out.println(ordConcat("Hello,", "World!", (str1, str2) -> str1));
        System.out.println(gapConcat("Hello,", "World!", (str1, str2) -> str1));
    }

    public static String simPrint (String str, Printable<String> printable) {
        return printable.print(str);
    }

    public static String uppPrint (String str, Printable<String> printable) {
        str = str.toUpperCase();
        return printable.print(str);
    }

    public static String lowPrint (String str, Printable<String> printable) {
        str = str.toLowerCase();
        return printable.print(str);
    }

    public static String simConcat (String str1, String str2, Concationble<String, String> concationble) {
        str1 = str1 + str2;
        return concationble.concat(str1, str2);
    }

    public static String ordConcat (String str1, String str2, Concationble<String, String> concationble) {
        str1 = str2 + str1;
        return concationble.concat(str1, str2);
    }

    public static String gapConcat (String str1, String str2, Concationble<String, String> concationble) {
        String[] strings = {str1, str2};
        str1 = String.join(" ", strings);
        return concationble.concat(str1, str2);
    }
}

@FunctionalInterface
interface Printable<S> {
    String print (S s);
}

@FunctionalInterface
interface Concationble<S1,S2> {
    String concat (S1 s1, S2 s2);
}