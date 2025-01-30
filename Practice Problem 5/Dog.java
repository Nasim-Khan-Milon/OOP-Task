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
        System.out.println(name + " is spinning in circles!");
    }

    public void run() {
        System.out.println(name + " is running fast!");
    }


    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy",  4, "Golden Retriever");

        d1.bark();
        d1.spin();
        d1.run();
    }
}
