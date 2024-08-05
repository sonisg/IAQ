package coreconceptsprtc;

public class GenericClassExample<T> {
    T ojb;

    public GenericClassExample(T ojb) {
        this.ojb = ojb;
    }

    public T getObject(){
        return this.ojb;
    }

    public static void main(String args[]){
        GenericClassExample<Integer> test = new GenericClassExample<>(15);
        System.out.println(test.getObject());

        GenericClassExample<String> ttest = new GenericClassExample<>("Hello");
        System.out.println(ttest.getObject());
    }
}
