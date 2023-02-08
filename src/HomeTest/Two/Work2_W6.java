//Задача 6: 
//Необходимо найти самое длинное слово в строке.

package HomeTest.Two;

import java.util.Arrays;
import java.util.Comparator;

public class Work2_W6 {

    public static void main(String[] args){
        String word = "Постпреды ЕС сегодня одобрили потолки цен на нефтепродукты перед окончательным утверждением Советом ЕС Ранее агентство Reuters, ссылаясь на дипломатов, писало, что лимит установят на уровне 100 долларов за баррель на нефтепродукты, торгующиеся с премией, и 45 долларов – со скидкой. Глава Еврокомиссии Урсула фон дер Ляйен, в свою очередь, отмечала, что ЕС вводит ценовой потолок на продукцию РФ вместе с Большой семеркой";
        String str1 = word;
        String[] chAr = str1.split(" ");
        String ch1 = chAr[0];
        for (int i = 1; i < chAr.length; i++) {
            if (ch1.length() < chAr[i].length())
                ch1 = chAr[i];
        }

        System.out.println(ch1);
        System.out.println(ch1.length());
    }
}
