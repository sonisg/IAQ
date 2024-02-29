package LLDArthmeticCalculator;

public class Number implements Arithmetic{
    int value;

    public Number(int value){
        this.value = value;
    }

    public int evaluate(){
        System.out.println("Number value is :" + value);
        return value;
    }
}
