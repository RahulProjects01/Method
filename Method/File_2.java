// //user input
// //addition
// //subtraction
// //multipluction
// //modular
// //division

import java.util.*;

class A {
    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        int c;
        c = a + b;
        System.out.println("c:" + c);
    }

    void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        int c;
        c = a - b;
        System.out.println("c:" + c);
    }

    void multi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        int c;
        c = a * b;
        System.out.println("c:" + c);
    }

    void modular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        int c;
        c = a % b;
        System.out.println("c:" + c);
    }

    void divi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        int c;
        c = a / b;
        System.out.println("c:" + c);
    }
}

public class File_2 {
    public static void main(String[] args) {
        A k = new A();
        k.add();
        k.sub();
        k.multi();
        k.modular();
        k.divi();
    }
}