import java.util.Scanner;

public class UcapanTerimaKasih_02 {
    public static String PenerimaUcapan() {
        Scanner input02 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = input02.nextLine();
        input02.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you " +nama+ " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
