//������ 9:
//����������� ��������� ������� �������� �������� �� ������ ����� �����, � ���� �� ��
//���������� ������ ������� ������� ������� �����.

package HomeTest;

public class Work2_W9 {
    public static void main(String[] args) {
        String str = "��������� �� ������� �������� ������� ��� �� ������������� ����� ������������� ������������ ������� �� ����� ��������� Reuters, �������� �� ����������, ������, ��� ����� ��������� �� ������ 100 �������� �� ������� �� �������������, ����������� � �������, � 45 �������� � �� �������. ����� ������������ ������ ��� ��� �����, � ���� �������, ��������, ��� �� ������ ������� ������� �� ��������� �� ������ � ������� ��������";
        String a = "��";
        int index = str.indexOf(a); // ���������� ������ ������� ������� ������� ����� � ������
        if (index == -1) {
            System.out.println("����� " + a + " �� �������.");
        } else {
            System.out.println("����� " + a + " ������� � ������� " + index);
        }
    }
}