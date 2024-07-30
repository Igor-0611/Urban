import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадание №1:");

        List<String> flourProd = Arrays.asList("хлеб","булка","пирог","бублик","кекс","баранка","слойка",
                                               "блин","пирожок","багета","пряник","безе","вафля","бисквит");

        char let = 'б';
        long Count = flourProd.stream()
                .filter(s -> s.charAt(0) == let)
                .count();
        System.out.println("Количество названий на букву '" + let + "' - " + Count);
//----------------------------------------------------------------------
        System.out.println("\nЗадание №2:");

        List<Person> person = new ArrayList<>();
        person.add(new Person("Анна", 18));
        person.add(new Person("Татьяна",31));
        person.add(new Person("Николай", 25));
        person.add(new Person("Пётр",38));
        person.add(new Person("Сергей", 21));
        person.add(new Person("Светлана", 40));
        person.add(new Person("Елена", 28));
        person.add(new Person("Ирина", 48));
        person.add(new Person("Антон", 27));
        person.add(new Person("Яна", 32));

        int limitAge = 30;

        System.out.println("Персоны старше " + limitAge + ":");

        for (int i=0; i<person.size(); i++) {
            if (person.get(i).age > limitAge) System.out.println(person.get(i));
        }
    }
}