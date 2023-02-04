//Задача 8:
//Необходимо извлечь из строки и распечатать номер карты
//(XXXX-XXXX-XXXX-XXXX) если он там есть.

package HomeTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work2_W8 {

    public static void main(String[] args) {
        String card = "Начинается новая программа с того, что на сцену выйдет мальчик и станет в  планшете выбирать себе игру. Среди уже знакомых и не раз сыгранных ему попадется игра «Ритмы атамана». Он решает открыть ее… Введите номер катры: 0678-7890-3456-9076.";
        String[] numberArray = card.split("[\\s,.:«»!?]+");
        Pattern pattern1 = Pattern.compile("\\d{4}([-]|)\\d{4}([-]|)\\d{4}([-]|)\\d{4}");
        for (String number : numberArray) {
            Matcher matcher = pattern1.matcher(number);
            if (matcher.find()) {
                System.out.println(number);
            }
        }
    }
}

