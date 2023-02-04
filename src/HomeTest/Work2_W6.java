//������ 6: 
//���������� ����� ����� ������� ����� � ������.

package HomeTest;

import java.util.Arrays;
import java.util.Comparator;

public class Work2_W6 {

    public static void main(String[] args){
        String word = "��������� �� ������� �������� ������� ��� �� ������������� ����� ������������� ������������ ������� �� ����� ��������� Reuters, �������� �� ����������, ������, ��� ����� ��������� �� ������ 100 �������� �� ������� �� �������������, ����������� � �������, � 45 �������� � �� �������. ����� ������������ ������ ��� ��� �����, � ���� �������, ��������, ��� �� ������ ������� ������� �� ��������� �� ������ � ������� ��������";
        String longest = Arrays.stream(word.split("[\\s,.:��!?]"))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);
    }
}