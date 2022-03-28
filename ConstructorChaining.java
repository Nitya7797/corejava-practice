class ConstructorChaining
{
    ConstructorChaining()
    {
        System.out.println("Parent class default constructor");
    }
    ConstructorChaining(int a)
    {
        System.out.println("Parent class one-argument constructor");
    }
    static class A {
        A()
        {
            System.out.println("Child class default constructor");
        }
        A(int c)
        {
            System.out.println("Child class one-argument constructor");
        }
    }
    public static void main(String[] args)
    {
        ConstructorChaining m=new ConstructorChaining();
        A a=new A();
        ConstructorChaining m1=new ConstructorChaining(10);
        A a1=new A(12);
    }


}
