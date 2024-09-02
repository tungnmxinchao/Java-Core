public class Animal {
    public String name;
    protected int age;
    private String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    // Phương thức public
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
    }

    // Phương thức protected
    protected void makeSound() {
        System.out.println("Animal is making a sound.");
    }

    // Phương thức private
    private void secret() {
        System.out.println("This is a secret method.");
    }

    // Phương thức public truy cập thành viên private
    public String getType() {
        return type;
    }
}
