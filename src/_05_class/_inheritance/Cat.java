package _05_class._inheritance;

public class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("야옹~");
    }

    public Cat(String species, String name, int age) {
        setSpecies(species);
        setName(name);
        setAge(age);
    }
    
    void catFetch() {
        System.out.println("그루밍 중");
    }
}
