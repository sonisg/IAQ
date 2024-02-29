package LLDArthmeticCalculator;

public class ArithmeticExpression implements Arithmetic{

    Arithmetic leftExpression;
    Arithmetic rightExpression;

    Operation operation;

    public ArithmeticExpression(Arithmetic leftEx, Arithmetic rightEx, Operation operation) {
        this.leftExpression = leftEx;
        this.rightExpression = rightEx;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = 0;
        switch (operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }

        System.out.println("Expression value is :" + value);
        return value;

    }
}
