package coreconceptsprtc;

public class StaticClass {

    public static class Static{
        public void staticMethod() {
            System.out.println("This is a static nested class method");
        }
    }

    public static class a extends Static{
        public void staticMethod() {

        }
    }


    public static void main(String[] args){
            Static s = new a();
            s.staticMethod();

    }
}
