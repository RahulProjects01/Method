// user input
// //area of triangle
// //area of rectangle
// //area of square

import java.util.*;

class A {
    int triangle(int base, int height) {
        int area = base * height / 2;
        return area;
    }

    int rectangle(int length, int width) {
        int area = length * width;
        return area;
    }

    int square(int side) {
        int area = side * side;
        return area;
    }

}

public class File_16 {
    public static void main(String[] args) {
        A k = new A();

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of base:");
            int base = sc.nextInt();
            System.out.println("enter the value of height:");
            int height = sc.nextInt();
            System.out.println("area of the triangle:" + k.triangle(base, height));
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of length:");
            int length = sc.nextInt();
            System.out.println("enter the value of width:");
            int width = sc.nextInt();
            System.out.println("area of the rectangle:" + k.rectangle(length, width));
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of side:");
            int side = sc.nextInt();
            System.out.println("area of the square:" + k.square(side));
        }

    }
}
