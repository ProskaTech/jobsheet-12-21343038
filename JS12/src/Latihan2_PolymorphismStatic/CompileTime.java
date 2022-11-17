//created by 21343038 AbelLevran
package Latihan2_PolymorphismStatic;

class CompileTime {
    //method keliling dengann single argumen
    static int keliling(int a){
        return 4 * a;
    }
    //method keliling dengan dua argumen (method overloading)
    static int keliling(int l, int b){
        return 2 * (l + b);
    }
}
