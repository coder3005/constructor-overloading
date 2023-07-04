/* Constructor Overloading */
class A 
{
    int a; double b; String c;
    private A() /*we have to save the file with 'A.java' because its a private otherwise it will give error*/
  {
    a=100.50; b=43.25; c="gupta";
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
