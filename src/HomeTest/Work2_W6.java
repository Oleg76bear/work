//Задача 6: 
//Необходимо найти самое длинное слово в строке.

package HomeTest;

import java.util.Arrays;
import java.util.Comparator;

public class Work2_W6 {

    public static void main(String[] args){
        String word = "Постпреды ЕС сегодня одобрили потолки цен на нефтепродукты перед окончательным утверждением Советом ЕС Ранее агентство Reuters, ссылаясь на дипломатов, писало, что лимит установят на уровне 100 долларов за баррель на нефтепродукты, торгующиеся с премией, и 45 долларов – со скидкой. Глава Еврокомиссии Урсула фон дер Ляйен, в свою очередь, отмечала, что ЕС вводит ценовой потолок на продукцию РФ вместе с Большой семеркой";
        String longest = Arrays.stream(word.split("[\\s,.:«»!?]"))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);
    }
}