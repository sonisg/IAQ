package LLDArthmeticCalculator;

public class main {

    public static void main(String args[]) {

        //2*(1+7)

       /*

                         *
                       /   \
                     2      +
                           / \
                          1   7

        */


        Arithmetic two = new Number(2);

        Arithmetic one = new Number(1);
        Arithmetic seven = new Number(7);

        Arithmetic addExpression = new ArithmeticExpression(one, seven, Operation.ADD);

        Arithmetic parentExpression = new ArithmeticExpression(two, addExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());

    }
}
