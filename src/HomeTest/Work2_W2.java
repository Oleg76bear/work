// ������ 2:
//������ � ������� Box(x,y,z)
//���������� �������� � ����� ����������� ���������� ������ ���� ������� � ��� �������.
//1) ��� (��� ������� �����).
//2) ������� �������.
//3) ������� (���� ������ ������ � ������).
package HomeTest;

public class Work2_W2 {

    static class Box extends Throwable {
        double width;
        double height;
        double depth;

        public Box(double w, double h) {
            width = w;
            height = h;
        }

        public Box(double w, double h, double d) {
            this.width = w;
            this.height = h;
            this.depth = d;
        }

        // �����������, ������������, ����� �� ���� �� �������� �� ������
        public Box() {
            width = -1; // �������� -1 ������������ ��� ��������
            height = -1; // ���������������������
            depth = -1; // ���������������
        }

        // �����������, ������������ ��� �������� ����
        Box(double len) {
            width = height = depth = len;
        }

        public void print() {
            System.out.println(width + " " + height + " " + depth);
        }
    }


    public void main(String[] args) throws Box {
        Box envelope = new Box(12, 4);
        Box zerobox = new Box();
        Box mybox = new Box(12, 34, 43);
        Box mycube = new Box(7);

      //  if (this.depth == 0) {
            System.out.println("envelope" + envelope);
        }
    }



