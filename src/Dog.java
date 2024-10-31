public class Dog extends Animals {
    public Dog() {
    }

    public Dog(String name, Integer age, Double weight) {
        super(name, age, weight);
    }

    public void move() {
        System.out.println("Собак по кличке " + super.getName() + " бежит по земле");
    }
}
