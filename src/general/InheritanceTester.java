package general;

class X
{
    char c;
    X(char c) { this.c = c; }
}

class Y extends X
{
   char c = 'a';
   Y() { super('b'); }

   class Z extends X
   {
      char c = 'c';
      Z()
      {
         super('d');
         System.out.println(Y.this.c);
         System.out.println(Z.this.c);
         System.out.println(super.c);
      }
   }
}


public class InheritanceTester {

    public static void main(String args[])
    {
        Y.Z obj = new Y( ).new Z( );
    }
}
