//created by 21343038 AbelLevran
package Latihan2_PolymorphismStatic;

import static Latihan2_PolymorphismStatic.CompileTime.keliling;

public class polymorphismStatic {
    public static void main(String[] args){
        //memanggil metode perimeter dengan satu argumen
        System.out.println("Sisi Persegi adalah : 4\nKeliling Persegi adalah : " + CompileTime.keliling(4) +"\n");

        //memanggil metode parimeter dengan dua argumen
        System.out.println("Sisi Persegi Panjang adalah : 10, 13\nKeliling Persegi Panjang adalah : "+ CompileTime.keliling(10,13));

    }
}
