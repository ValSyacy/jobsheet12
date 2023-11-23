import java.util.Scanner;

public class UcapanTerimaKasih_02 {

    public static String namaPenerima; 

    public static String PenerimaUcapan() {
        if (namaPenerima == null) {
            Scanner input02 = new Scanner(System.in);
            System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
            namaPenerima = input02.nextLine();
        }
        return namaPenerima;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan() {
        UcapanTerimaKasih();
        Scanner input02 = new Scanner(System.in);
        System.out.println("Masukkan ucapan tambahan");
        String tambahan = input02.nextLine();
        System.out.println("Dear " + namaPenerima + " " + tambahan);
    }

    public static void main(String[] args) {
        UcapanTambahan();
    }
}
