package LLDDecoratorDP;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 6.0;
    }
}
