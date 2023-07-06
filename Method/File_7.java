// //area of triangle
// //area of rectangle
// //area of square

class A {
    void triangle(int base, int height) {
        int area = base * height / 2;
        System.out.println("area of triangle is:" + area);
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

public class File_7 {
    public static void main(String[] args) {
        A k = new A();
        k.triangle(15, 4);
        k.rectangle(5, 9);
        k.square(5);
    }
}
