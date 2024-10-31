public class Main {
    public static void main(String[] args) {
        //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.
        Duck duck = new Duck("Duffy Duck", 14, 20.0);
        duck.walk();
        duck.move();

        Dog dog = new Dog("Guffy", 45, 80.4);
        dog.walk();
        dog.move();
    }
}
