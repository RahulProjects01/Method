// //area of triangle
// //area of rectangle
// //area of square

class A
{
 int triangle(int base,int height)
 {
    int area=base*height/2;
    return area;
 }
 int rectangle(int length,int width)
 {
    int area=length*width;
    return area;
 }
 int square(int side)
 {
    int area=side*side;
    return area;
 }
 
}

public class File_15
{
    public static void main(String[] args)
    {
        A k=new A();   
     System.out.println("area of the triangle:"+k.triangle(7,8));
     System.out.println("area of the rectangle:"+k.rectangle(8,9));
     System.out.println("area of the square:"+k.square(8));
    }
}
