// user input
// //area of triangle
// //area of rectangle
// //area of square

import java.util.*;

class A {
    int triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("the value of base is:");
        int base = sc.nextInt();
        System.out.println("enter the value of height:");
        int height = sc.nextInt();
        int area = base * height / 2;
        return area;
    }

    int rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("the value of length is:");
        int length = sc.nextInt();
        System.out.println("enter the value of width:");
        int width = sc.nextInt();
        int area = length * width;
        return area;
    }

    int square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("the value of side is:");
        int side = sc.nextInt();
        int area = side * side;
        return area;
    }
}

public class File_12 {
    public static void main(String[] args) {
        A k = new A();
        System.out.println("area of triangle:" + k.triangle());
        System.out.println("area of rectangle:" + k.rectangle());
        System.out.println("area of square:" + k.square());
    }
}
