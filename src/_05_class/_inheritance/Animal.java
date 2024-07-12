package _05_class._inheritance;

// - 부모 클래스: Animal
// - 자식 클래스: Dog
public class Animal {
    private String species;
    private String name;
    private int age;

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setSpecies(String species) {
        this.species = species;
        System.out.println(species);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void makeSound() {
        System.out.println("동물은 소리를 낸다");
    }
}
