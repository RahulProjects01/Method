//==========================================================================================================================================================
// //                                       no return and argument      
// ============================================================================================================================================================
// //addition
// //subtraction
// //multipluction
// //modular
// //division

class A {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    void multi(int a, int b) {
        System.out.println(a * b);
    }

    void modular(int a, int b) {
        System.out.println(a % b);
    }

    void divi(int a, int b) {
        System.out.println(a / b);
    }
}

public class File_5 {
    public static void main(String[] args) {
        A k = new A();
        k.add(5, 6);
        k.sub(8, 6);
        k.multi(7, 8);
        k.modular(6, 4);
        k.divi(50, 10);

    }
}