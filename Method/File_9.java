
// ===============================================================================================================================================================
// //                                                                 return and no argument
// ===============================================================================================================================================================

// //addition
// //subtraction
// //multipluction
// //modular
// //division

class A {
    int add() {
        int a = 6, b = 7;
        int c = a + b;
        return c;
    }

    int sub() {
        int a = 9, b = 5;
        int c = a - b;
        return c;
    }

    int multi() {
        int a = 6, b = 7;
        int c = a * b;
        return c;
    }

    int modular() {
        int a = 67, b = 8;
        int c = a % b;
        return c;
    }

    int divi() {
        int a = 60, b = 6;
        int c = a / b;
        return c;
    }
}

public class File_9 {
    public static void main(String[] args) {
        A k = new A();

        System.out.println(k.add());
        System.out.println(k.sub());
        System.out.println(k.multi());
        System.out.println(k.modular());
        System.out.println(k.divi());

    }
}