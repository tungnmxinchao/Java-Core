public class Dog extends Animal{
    public Dog(String name, int age, String type) {
        super(name, age, type);
    }

    // Phương thức của class con
    public void displayDogInfo() {
        // Truy cập thuộc tính public và protected của class cha
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Age: " + age);

        // Truy cập gián tiếp thuộc tính private của class cha thông qua phương thức public
        System.out.println("Dog's Type: " + getType());

        // Gọi phương thức public của class cha
        displayInfo();

        // Gọi phương thức protected của class cha
        makeSound();

        // Không thể gọi trực tiếp phương thức private của class cha
        // secret(); // Lỗi biên dịch nếu dòng này không bị chú thích
    }

}
