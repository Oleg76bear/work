package by.itacademy.task;

public class Person {
    private String fulName;
    private int age;
    private boolean sex;


public Person(String fulName, int age, boolean sex) {
    this.fulName = fulName;
    this.age = age;
    this.sex = sex;

}
public void print() {
    System.out.println(fulName + " " + age + " " + sex);
}

    public static void main(String[] args) {
        Person oleg = new Person("Oleg", 34, true) ;
        Person zina = new Person("Zina", 246, false) ;
        Person vitia = new Person("Vitia", 24, true) ;

        oleg.print();
        zina.print();
        vitia.print();

    }
}
