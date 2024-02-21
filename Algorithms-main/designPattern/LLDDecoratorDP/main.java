package LLDDecoratorDP;

public class main {

    public static void main(String[] args) {
        coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: " + simpleCoffee.cost());

        coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of coffee with milk: " + coffeeWithMilk.cost());

        coffee coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Cost of coffee with milk and sugar: " + coffeeWithMilkAndSugar.cost());

    }
}
