
//Задача 5:
//Необходимо посчитать колличество слов в строке в которых буква
//"с" встречается 3 и более раз.

package HomeTest.Two;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work2_W5 {
    public static void main(String[] args) {

        String text = "Человечество тонет в водовороте масштcccабных кризисов, сссс но вместо того, чтобы объединиться и сообща выбираться из него, многие страны, наоборот, видят друг в друге врагов. Как можно изменить эту самоубийственную стратегию поведения, вместе с учеными, психологами и буддистами разбиралась корреспондент отдела «Общество» Plus-one.ru Маргарита Федорова.";
        String[] wordArray = text.split("[\\s,.:«»!?]+");
        Pattern pattern = Pattern.compile("/с{3,}/g"); // что не так в регулярке
        for (String word : wordArray) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println(word);
                int count = 0;
                while (matcher.find())
                    count++;
                if (count > 1) {
                    System.out.println(count); // не то?
                }
            }
        }
    }
}