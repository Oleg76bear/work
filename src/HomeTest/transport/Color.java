package HomeTest.transport;

public enum Color {
    BLUE("Синий"),
    RED("Красный"),
    GREEN("Зеленый"),
    ORANGE("Оранжевый"),
    BLACK("Черный"),
    VIOLET("Фиолентовый"),
    YELLOW("Желтый"),
    WHITE("Белый"),
    GRAY("Серый");


     private final String colorCar;

      Color(String colorCar) {
          this.colorCar = colorCar;

          System.out.println("Ваш автомобиль  с цветом " + this.colorCar + " правильно?");
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

