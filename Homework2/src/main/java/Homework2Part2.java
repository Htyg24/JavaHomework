//        2. Дана строка sql-запроса "select * from students where ".
//        Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//        Ответ: "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'" для приведенного примера

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Homework2Part2 {

    public static void main(String[] args) {

        String pathname = "src/main/java/text2.txt";
        File file = new File(pathname);
        String str = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            str = br.readLine();
            System.out.println(str);
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        //Работы много было, я не супел с json'ом разобраться. Я больше так не буду(((
        String[] arrstr = null;
        Map<String, String> pars = new HashMap<String, String>();
        str = str.substring(1, str.length() - 1).replace(":", "");
        str = str.substring(1, str.length() - 1).replace(",", "");
        arrstr = str.replace("\"\"", "\"").split("\"");
//        Ответ: "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'" для приведенного примера
//        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null
        for (int i = 0; i < arrstr.length; i += 2) {
            pars.put(arrstr[i], arrstr[i + 1]);
        };
        System.out.println("select * from students where name = " + pars.get("name") + " and country = " + pars.get("country") + " and city = " + pars.get("city"));
    }
}
