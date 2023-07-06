// user input
// //addition
// //subtraction
// //multipluction
// //modular
// //division

import java.util.*;

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

public class File_14 {
    public static void main(String[] args) {
        A k = new A();

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            System.out.println("addition:" + k.add(a, b));
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            System.out.println("subtraction:" + k.sub(a, b));
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();

            System.out.println("multiplaction:" + k.multi(a, b));
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            System.out.println("modular:" + k.modular(a, b));
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            System.out.println("dividation:" + k.divi(a, b));
        }
    }
}
