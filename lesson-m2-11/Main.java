import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    enum Letters {
        A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
    }

    public static void main(String[] args) {

        System.out.println("\nЗадание №1:");

        String alphabet = "";

        for (char c = 'A'; c <= 'Z'; c++) alphabet += c;
        char[] charArr = alphabet.toCharArray();

        System.out.println("Enter the desired letter from the list:");
        System.out.println(charArr);
        Scanner scanner = new Scanner(System.in);
        String let = scanner.nextLine();
        Letters scan = Letters.valueOf(let.toUpperCase());
        System.out.println("Letters '" + scan + "' has a position " + scan.ordinal());

        //-----------------------------------------------------------------------

        System.out.println("\nЗадание №2:");

        List<Person> person = new ArrayList<>();
        person.add(new Person("Анна", 18, Person.Gender.FEMALE));
        person.add(new Person("Татьяна",31, Person.Gender.FEMALE));
        person.add(new Person("Николай", 25, Person.Gender.MALE));
        person.add(new Person("Пётр",38, Person.Gender.MALE));
        person.add(new Person("Сергей", 21, Person.Gender.MALE));
        person.add(new Person("Светлана", 40, Person.Gender.FEMALE));
        person.add(new Person("Елена", 28, Person.Gender.FEMALE));
        person.add(new Person("Ирина", 48, Person.Gender.FEMALE));
        person.add(new Person("Антон", 27, Person.Gender.MALE));
        person.add(new Person("Яна", 32, Person.Gender.FEMALE));
        person.add(new Person("Василий",19, Person.Gender.MALE));

        System.out.println("\n Список мужчин:");
        Person.Gender inMale = Person.Gender.MALE;
        for (int i=0; i<person.size(); i++) {
            if (person.get(i).gender.equals(inMale)) {
                System.out.println(person.get(i));
            }
        }

        System.out.println("\n Список женщин:");
        Person.Gender inFamale = Person.Gender.FEMALE;
        for (int i=0; i<person.size(); i++) {
            if (person.get(i).gender.equals(inFamale)) {
                System.out.println(person.get(i));
            }
        }
    }
}
