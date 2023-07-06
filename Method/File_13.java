
// ==========================================================================================================================================================================
//                                                                           return and argument
// ==========================================================================================================================================================================
// //addition
// //subtraction
// //multipluction
// //modular
// //division

class A {
    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    int sub(int a, int b) {
        int c = a - b;
        return c;
    }

    int multi(int a, int b) {
        int c = a * b;
        return c;
    }

    int modular(int a, int b) {
        int c = a % b;
        return c;
    }

    int divi(int a, int b) {
        int c = a / b;
        return c;
    }

}

public class File_13 {
    public static void main(String[] args) {
        A k = new A();
        System.out.println("addition:" + k.add(4, 5));
        System.out.println("subtraction:" + k.sub(4, 5));
        System.out.println("multiplaction:" + k.multi(4, 5));
        System.out.println("modular:" + k.modular(4, 5));
        System.out.println("dividation:" + k.divi(40, 5));

    }
}
