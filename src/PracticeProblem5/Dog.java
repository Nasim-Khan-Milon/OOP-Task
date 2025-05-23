public class Dog {
    String name;
    int age;
    String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public void spin() {
        System.out.println(name + " is spinning.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Labrador");
        myDog.bark();
        myDog.spin();
        myDog.run();
    }
}
