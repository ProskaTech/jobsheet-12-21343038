//created by 21343038 AbelLevran
package Latihan3_PolymorphismDynamic;

class Bank {
    float sukuBunga(){
        return 0;
    }
}
class BRI extends Bank {
    // overriding sukuBunga() Method
    @Override
    float sukuBunga() {
        return 5.5f;
    }
}
class BNI extends Bank{
    // overriding sukuBunga() Method
    @Override
    float sukuBunga() {
        return 10.6f;
    }
}
class Mandiri extends Bank{
    // overriding sukuBunga() Method
    @Override
    float sukuBunga() {
        return 9.4f;
    }
}
class polymorphismDynamic{
    public static void main(String[] args){
        //creating variable of bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah: "+B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah: "+B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah: "+B.sukuBunga());
    }
}
