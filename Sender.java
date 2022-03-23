package Messenger;

public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("Shindi", "Tugas Kelompok PBO", "Hi Sam! Nanti akan diadakan kerja kelompok ya pada pukul 15.00 WIB");
        std.sendMessage("Tarisa", "Perkenalan", "Halo saya Tarisa, salam kenal yaa^^");

        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("Tidak Diketahui", "Rahasia", "Bisakah kita bertemu?");
        mail.sendMessage("Eden", "Hadiah Untukmu", "Ini aku punya hadiah untuk mu tolong kirim alamtmu ya...");
        mail.disconnect();
        mail.sendMessage("Dani", "Kirim Tugas", "Permisi Bu, Berikut lampiran dari laporan hasil praktikum PBO saya : @LAMPIRAN ");
    }
}