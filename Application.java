package application;
import data.Laptop3;

public class Application {

    public static void main(String[] args) {
        Laptop3 uts13 = new Laptop3("ROG Zephyrus Duo 15 SE", "ASUS", "AMD Ryzen™ 9 5980HX", 3, "Windows 10 Home", 1000, "SSD", 50, "Black", "Best") ;
        System.out.println(uts13);
        Laptop3 uts23 = new Laptop3("ROG GL553VD", "ASUS", "Intel Core i5", 3, "Windows 10 Home", 1000, "DDR4", 25, "Grey", "Good") ;
        System.out.println(uts23);
        Laptop3 uts33 = new Laptop3("ROG GL552JX", "ASUS", "Intel Core i7", 3, "Windows 8", 1000, "HDD", 80, "Red", "Middle") ;
        System.out.println(uts33);
    }

}
