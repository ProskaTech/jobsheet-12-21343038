//created by 21343038 AbelLevran
package Latihan5_AbstractionInterface;

interface AktivitasPagi {
    abstract void lari();

    abstract  void berenang();
}
class AktivitasPagiAnak implements AktivitasPagi{
    @Override
    public void lari() {
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }

    @Override
    public void berenang() {
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}
class AktvitasUtama{
    public static void main(String[]args){
        AktivitasPagiAnak a1 = new AktivitasPagiAnak();
        a1.lari();
        a1.berenang();
    }
}
