//created by 21343038 AbelLevran
package Latihan1_Inheritance;

public class JavaInheritance {
    public static void main(String[]args){
        //membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();

        //membuat objek kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();

        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();

        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
