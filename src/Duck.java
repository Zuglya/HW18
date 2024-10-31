public class Duck extends Animals{
    public Duck() {
    }

    public Duck(String name, Integer age, Double weight) {
        super(name, age, weight);
    }

    public void move() {
        System.out.println("Утка по кличке " + super.getName() + " летит в облаках");
    }
}
