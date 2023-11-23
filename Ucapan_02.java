import java.util.Scanner;

public class Ucapan_02 {
    public static String PenerimaUcapan() {
        Scanner input02 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = input02.nextLine();
        input02.close();
        return namaOrang;
    }
    public static void main (String[] args){
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama +"\nMay the force with you.");
    }
}
