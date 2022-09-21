import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework5Part2 {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        String names = "Иван Иванов\n" +
                "Светлана Петрова\n" +
                "\n" +
                "Кристина Белова\n" +
                "\n" +
                "Анна Мусина\n" +
                "\n" +
                "Анна Крутова\n" +
                "\n" +
                "Иван Юрин\n" +
                "\n" +
                "Петр Лыков\n" +
                "\n" +
                "Павел Чернов\n" +
                "\n" +
                "Петр Чернышов\n" +
                "\n" +
                "Мария Федорова\n" +
                "\n" +
                "Марина Светлова\n" +
                "\n" +
                "Марина Светлова\n" +
                "\n" +
                "Мария Савина\n" +
                "\n" +
                "Мария Рыкова\n" +
                "\n" +
                "Марина Лугова\n" +
                "\n" +
                "Анна Владимирова\n" +
                "\n" +
                "Иван Мечников\n" +
                "\n" +
                "Петр Петин\n" +
                "\n" +
                "Иван Ежов";
        for (String str : names.split("\n")) {
            list.putIfAbsent(str, 0);
            list.replace(str, list.get(str) + 1);
        }

        for (Map.Entry entry : list.entrySet()) {
            if (Integer.parseInt(entry.getValue().toString()) > 1)
                System.out.println((entry.getKey() + " " + entry.getValue()));
        }
    }
}
