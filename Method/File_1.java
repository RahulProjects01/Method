// //addition
// //subtraction
// //multipluction
// //modular
// //division


class A
{
void add()
{
    int a=3,b=5,c;
    c=a+b;
    System.out.println(c);
}
void sub()
{
    int a=5,b=4,c;
    c=a-b;
    System.out.println(c);
}
void multi()
{
    int a=4,b=5,c;
    c=a*b;
    System.out.println(c);
}
void modular()
{
    int a=65,b=4,c;
    c=a%b;
    System.out.println(c);
}
void divi()
{
    int a=70,b=5,c;
    c=a/b;
    System.out.println(c);
}
}
public class File_1
{
    public static void main(String[] args)
    {
      A k=new A();
      k.add();
      k.sub();
      k.multi();
      k.modular();
      k.divi();
    }
}
