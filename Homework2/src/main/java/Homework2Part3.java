//        3**** Дана json строка (можно сохранить в файл и читать из файла)
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Homework2Part3 {

    public static void main(String[] args) throws FileNotFoundException {

        String pathname = "src/main/java/text.txt";
        File file = new File(pathname);
        String str = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            str = br.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        //Работы много было, я не супел с json'ом разобраться. Я больше так не буду(((
        String[] arrstr = null;
        Map<String, String> parse = new HashMap<String, String>();
        str = str.substring(1, str.length() - 1).replace(":", "");
        str = str.substring(1, str.length() - 1).replace(",", "");
        arrstr = str.replace("\"\"","\"" ).split("\"");
        for (int i = 0; i < arrstr.length; i += 2){
            parse.put(arrstr[i], arrstr[i + 1]);
        }
        System.out.println(String.format("Студент " + parse.get("фамилия") + " получил " + parse.get("оценка") + " по предмету " + parse.get("предмет") + "."));
    }
}
