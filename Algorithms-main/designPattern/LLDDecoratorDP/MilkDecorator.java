package LLDDecoratorDP;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }
}
