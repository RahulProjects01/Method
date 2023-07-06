// //user input
// //addition
// //subtraction
// //multipluction
// //modular
// //division

import java.util.Scanner;

class A {
    void add(int a, int b) {
        System.out.println("addition:" + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("subtraction" + (a - b));
    }

    void multi(int a, int b) {
        System.out.println("multiplication:" + (a * b));
    }

    void modular(int a, int b) {
        System.out.println("modular:" + (a % b));
    }

    void divi(int a, int b) {
        System.out.println("dividation:" + (a / b));
    }
}

public class File_6 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            A k = new A();
            k.add(a, b);
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            A k = new A();
            k.sub(a, b);
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            A k = new A();
            k.multi(a, b);

        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            A k = new A();
            k.modular(a, b);
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();
            A k = new A();
            k.divi(a, b);
        }

    }
}
