package shcool;
public  class PhoneHome {
        private int number;
        private String model;
        private int weight;

        String name = "Роман";

        public void receiveCall() {
            System.out.println("Звонит " + name);
             }
        public void receiveCall(String name, int number) {
            System.out.println("Звонит " + name + " " + number);
               }
        public void getNumber() {
            System.out.println(number);
            }
        public void sendMessage(int number1, int number2) {
            System.out.println( number1 + "\t" + number2);
            }

        public String getModel() {
            return model;
            }

        public String getName() {
            return name;
            }

        public void setNumber(int number) {
            this.number = number;
            }

        public void setModel(String model) {
            this.model = model;
            }

        public void setName(String name) {
            this.name = name;
             }

        public PhoneHome(int number, String model, int weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
            }

        public PhoneHome(int number, String model) {
            this.number = number;
            this.model = model;
            }
        public PhoneHome() {}

    public static void main(String [ ] args) {

        PhoneHome ph1 = new PhoneHome(6657834, "Самсунг", 198);
        PhoneHome ph2 = new PhoneHome(2745636, "Ксиаоми", 148);
        PhoneHome ph3 = new PhoneHome(4574636, "Айфон", 210);

        PhoneHome ph = new PhoneHome();
        System.out.println(ph1.number + " " + ph1.model + " " + ph1.weight);
        System.out.println(ph2.number + " " + ph2.model + " " + ph2.weight);
        System.out.println(ph3.number + " " + ph3.model + " " + ph3.weight);

        ph1.receiveCall();
        ph1.getNumber();
        ph2.receiveCall();
        ph2.getNumber();
        ph3.receiveCall();
        ph3.getNumber();
        ph.receiveCall(ph1.name, ph2.number);
        ph.sendMessage(ph1.number, ph2.number);
        System.out.println("Роман, перезвони!");
    }
}