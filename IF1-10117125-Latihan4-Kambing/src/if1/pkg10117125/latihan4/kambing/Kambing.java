/*
 * 
 * @author
 * NAMA : Zulfi Ihzam R
 * KELAS : PBO1
 * NIM : 10117125
 */
package if1.pkg10117125.latihan4.kambing;


public class Kambing {

    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;

        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }

}
