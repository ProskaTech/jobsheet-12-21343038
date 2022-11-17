//created by 21343038 AbelLevran
package Latihan6_Encapsulation;

public class BuahUtama {
        public static void main(String[]args){
            //menggunnakan costructor untuk menginialisasi
            EncapsulationBuah Apel = new EncapsulationBuah("Apel","Rp.3000","Merah");
            //menggunakan getter ke nilai
            System.out.println("Nama buah: "+Apel.getName()+"\nHarga: "+Apel.getPrice()+"\nWarna: "+Apel.getColor());

            //update harga dan warna menggunakan setter
            Apel.setColor("Hijau");
            Apel.setPrice("Rp.10000");
            System.out.println("\nInformasi terkait Apel setelah di Update");
            //menggunakan getter untuk mendapatkan nilai
            System.out.println("Nama buah: "+Apel.getName()+"\nHarga: "+Apel.getPrice()+"\nWarna: "+Apel.getColor());


        }

}
