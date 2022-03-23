package data;

public class LaptopApp {
    public static void main(String[] args) {
        Laptop uts = new Laptop("ROG Zephyrus Duo 15 SE", "ASUS", "AMD Ryzen™ 9 5980HX", 3, "Windows 10 Home", 1000, "SSD", 50);
        
        System.out.println("Nama                       : "+uts.setNama());
        System.out.println("Brand                      : "+uts.setMerk());
        System.out.println("Nama Processor             : "+uts.setProsesor());
        System.out.println("Jumlah Core pada Processor : "+uts.setCore() +"GHz");
        System.out.println("Sistem Operasi             : "+uts.setSistem());
        System.out.println("Ukuran RAM dalam GB        : "+uts.setRAM()+ " GB");
        System.out.println("Jenis Storage              : "+uts.setStorage());
        System.out.println("Stok                       : "+uts.setStok() +" pcs");
    }
}
