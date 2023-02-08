//Задача 7:
//Необходимо узнать есть ли в строке слова которые начинаются
//и заканчиваются на букву "а".

package HomeTest.Two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work2_W7 {

    public static void main(String[] args) {
        String text = "Начинается новая программа с того, что на сцену выйдет мальчик и станет в планшете выбирать себе игру. Среди уже знакомых и не раз сыгранных ему попадется игра «Ритмы атамана». Он решает открыть ее… Что из этого выйдет, зритель узнает из циркового шоу.";
        String[] wordArray = text.split("[\\s,.:«»!?]+");
        Pattern pattern = Pattern.compile("^[а].*[а]$");
        for (String word : wordArray) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println(word);
            }
        }
    }
}
