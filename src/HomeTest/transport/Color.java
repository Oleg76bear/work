package HomeTest.transport;

public enum Color {
    BLUE("�����"),
    RED("�������"),
    GREEN("�������"),
    ORANGE("���������"),
    BLACK("������"),
    VIOLET("�����������"),
    YELLOW("������"),
    WHITE("�����"),
    GRAY("�����");


     private final String colorCar;

      Color(String colorCar) {
          this.colorCar = colorCar;

          System.out.println("��� ����������  � ������ " + this.colorCar + " ���������?");
      }

      public String getColorCar() {
          return colorCar;
      }
  }


  /*  private static final List<String> Colors;
    private final String color;

    static {
        Colors = new ArrayList<>();
        for (WheelSize wheelSize : WheelSize.colors()) {
            Colors.add(wheelSize.color);
        }
    }

    private Color(String color) {
        this.color = color;
    }
}

     */

