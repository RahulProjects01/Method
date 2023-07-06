// //user input
// //area of triangle
// //area of rectangle
// //area of square

import java.util.*;

class A {
    void triangle(int base, int height) {
        int area = base * height / 2;
        System.out.println("area of triangle:" + area);
    }

    void rectangle(int length, int width) {
        int area = length * width;
        System.out.println("area of rectangle:" + area);
    }

    void square(int side) {
        int area = side * side;
        System.out.println("area of square:" + area);
    }
}

public class File_8 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of base:");
            int base = sc.nextInt();
            System.out.println("enter the value of height:");
            int height = sc.nextInt();
            A k = new A();
            k.triangle(base, height);
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of length:");
            int length = sc.nextInt();
            System.out.println("enter the value of width:");
            int width = sc.nextInt();
            A k = new A();
            k.rectangle(length, width);
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of side:");
            int side = sc.nextInt();
            A k = new A();
            k.square(side);
        }

    }
}