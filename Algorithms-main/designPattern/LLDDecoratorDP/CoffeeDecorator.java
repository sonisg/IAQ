package LLDDecoratorDP;

abstract class CoffeeDecorator implements coffee{

    protected coffee decoratedCoffee;

    public CoffeeDecorator(coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}
