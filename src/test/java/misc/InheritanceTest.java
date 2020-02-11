package misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceTest {

    static class X
    {
        char character;

        X(char character) {
            this.character = character;
        }
    }

    static class Y extends X
    {
        char character = 'A';

        Y() {
            super('B');
        }

        public char getSuper(){ return super.character; }

        class Z extends X
        {
            char character = 'C';

            Z() {
                super('D');
            }

            public char getA(){
                return Y.this.character;
            }
            public char getB(){
                return Y.this.getSuper();
            }
            public char getC(){
                return Y.Z.this.character;
            }
            public char getD(){
                return super.character;
            }
        }
    }

    @Test
    public void run(){
        Y.Z z = new Y().new Z();

        // so, this way we kind of have two instances of X
        // look how to get B and D values for X's character field

        assertEquals('A', z.getA());
        assertEquals('B', z.getB());
        assertEquals('C', z.getC());
        assertEquals('D', z.getD());

    }


}
