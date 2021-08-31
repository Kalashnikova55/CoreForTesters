package JavaCoreLesson1;

public class Dog extends Animal {

    public static boolean hasTail = true;

    public String breed;
    protected String color;
    private String name;

    public void run() {
    }

    @Override
    public void speak() {
        System.out.println("Barks");
    }

    @Override
    public boolean equals(Object object) {
        Dog anotherDog = (Dog) object;
        return this.breed.equals(anotherDog.breed);
    }

    @Override
    public int hashCode() {
        return this.breed.hashCode() + this.age * 35;
    }

    @Override
    public String toString() {
        return "Dog " + this.breed;
    }

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Dog(int age) {
        this.age = age;
    }


//        dog1.toString();
//        dog1.hashCode();
//        dog1.equals();
//        dog1.getClass();


}

