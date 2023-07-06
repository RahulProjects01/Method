// //area of triangle
// //area of rectangle
// //area of square

class A {
    void tringle() {
        int base = 3, height = 5, area;
        area = (base * height) / 2;
        System.out.println("area of tringle:" + area);
    }

    void rectangle() {
        int length = 5, width = 4, area;
        area = length * width;
        System.out.println("area of rectangle:" + area);
    }

    void square() {
        int side = 4, area;
        area = side * side;
        System.out.println("area of squre:" + area);
    }

}

public class File_3 {
    public static void main(String[] args) {
        A k = new A();
        k.tringle();
        k.rectangle();
        k.square();
    }

}