//created by 21343038 AbelLevran
package Latihan1_Inheritance;
public class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 8;//1kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga mmobil menjadi Rp. "+hargaDasar);
    }
}
