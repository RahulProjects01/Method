// //user input
// //addition
// //subtraction
// //multipluction
// //modular
// //division

import java.util.*;

class A {
    int add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int c = a + b;
        return c;
    }

    int sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int c = a - b;
        return c;
    }

    int multi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int c = a * b;
        return c;
    }

    int modular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int c = a % b;
        return c;
    }

    int divi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int c = a / b;
        return c;
    }
}

public class File_10 {
    public static void main(String[] args) {
        A k = new A();
        System.out.println("addition:" + k.add());
        System.out.println("subtraction:" + k.sub());
        System.out.println("multipluction:" + k.multi());
        System.out.println("modular:" + k.modular());
        System.out.println("dividation:" + k.divi());
    }
}
