import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Homework5Part1 {

    public static void main(String[] Args) {

        HashMap<String, ArrayList<Integer>> Nofelet = new HashMap<>();
        Scanner read = new Scanner(System.in);
        String name;

        while (true) {
            System.out.println("");
            System.out.println("1 Add\n2 Delete\n3 Print\n4 Find");
            name = read.next();

            System.out.println(name);
            if (name.contains("1")) {

                System.out.println("Enter name");
                ArrayList<Integer> number = new ArrayList<>();
                name = read.next();
                String num;
                do {
                    System.out.println("Enter number");
                    num = read.next();
                    number.add(Integer.parseInt(num));
                }while (!num.contains("-1"));
                System.out.printf("num  " + number);
                Nofelet = AddNumber(Nofelet, name, number);

            } else if (name.contains("2")) {

                System.out.println("Enter name");
                name = read.next();
                Nofelet = DeleteContact(Nofelet, name);

            } else if (name.contains("3")) {

                PrintBook(Nofelet);

            } else if (name.contains("4")) {

                System.out.println("Enter name");
                name = read.next();
                FindNumber(Nofelet, name);
            }
        }

    }

    public static HashMap AddNumber(HashMap<String, ArrayList<Integer>> Nofelet, String name, ArrayList<Integer> number) {
        Nofelet.put(name, number);
        return Nofelet;
    }


    public static HashMap DeleteContact(HashMap<String, ArrayList<Integer>> Nofelet, String name){
        System.out.println("Enter deleted name");
        Nofelet.remove(name);
        return Nofelet;
    }


    public static void PrintBook(HashMap<String, ArrayList<Integer>> Nofelet){

        for(Map.Entry entry: Nofelet.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void FindNumber(HashMap<String, ArrayList<Integer>> Nofelet, String name){
        System.out.println(name + " " + Nofelet.get(name));
    }
}
