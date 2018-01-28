package hitungsalam;

import java.util.Scanner;

/**
 *
 * @author YusufHA
 */
public class HitungSalam {

    double orang;
    int salam;

    void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah orang = ");
        orang = scan.nextInt();
    }

    double Hitung(double org) {
        return (orang * (orang - 1)) / 2;
    }

    public static void main(String[] args) {
        HitungSalam hs = new HitungSalam();
        hs.Input();
        System.out.println("Jumlah jabat tangan "+hs.Hitung(0));
    }
}
