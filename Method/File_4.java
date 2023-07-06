
// --------------------------------------------------------------------------------------------------
// //user input
// //area of triangle
// //area of rectangle
// //area of square

import java.util.*;

class A {
    void triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base value:");
        int base = sc.nextInt();
        System.out.println("enter the height value:");
        int height = sc.nextInt();
        int area;
        area = base * height / 2;
        System.out.println("area of the triangle:" + area);
    }

    void square() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the side value:");
        int side = sc.nextInt();
        int area;
        area = side * side;
        System.out.println("area of the square:" + area);
    }

    void rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length value:");
        int length = sc.nextInt();
        System.out.println("enter the width value:");
        int width = sc.nextInt();
        int area;
        area = length * width;
        System.out.println("area of the triangle:" + area);
    }
}

public class File_4 {
    public static void main(String[] args) {
        A k = new A();
        k.triangle();
        k.rectangle();
        k.square();
    }

}
