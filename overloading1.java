/* Constructor Overloading */
class A 
{
    int a; double b; String c;
    private A() /*error will come because 2 constructor are there, it will confused*/
  {
    a=100.50; b=43.25; c="gupta";
  }
   default A()
    {
        a=100; b=45.32; c="abhi";
    }
    A(int x)
    {
        a=x;

    }
    A(double y, String z)
    {
        b=y; c=z;
    }
    public static void main(String[] args) {
        
    A r=new A();
    A r2=new A(10);
    A r3=new A(23.89, "abhi");
    System.out.println(r.a+" "+r.b+" "+r.c);
    System.out.println(r2.a);
    System.out.println(r3.b+" "+r3.c);
    }
    
    
}
