// //area of triangle
// //area of rectangle
// //area of square

class A {
    int triangle() {
        int base = 6, height = 7;
        int area = base * height / 2;
        return area;
    }

    int rectangle() {
        int length = 5, width = 6;
        int area = length * width;
        return area;
    }

    int square() {
        int side = 9;
        int area = side * side;
        return area;

    }
}

public class File_11 {
    public static void main(String[] args) {
        A k = new A();
        System.out.println("area of triangle:" + k.triangle());
        System.out.println("area of rectangle:" + k.rectangle());
        System.out.println("area of square:" + k.square());
    }
}
