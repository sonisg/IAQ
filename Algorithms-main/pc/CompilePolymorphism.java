package pc;


//Function Overloading
/** Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations **/
/** Different number of arguments **/

class Helper {

    static int a = 8;

    // Method 1
    // Multiplication of 2 numbers
    int Multiply(int a, int b)
    {

        // Return product
        try {
            a = 5;
            return a * b;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    double Multiply(int a, int b)
//    {
//
//        // Return product
//        try {
//            a = 5;
//            return a * b;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    // Method 2
    // // Multiplication of 3 numbers
    double Multiply(int a, int b, int c)
    {

        // Return product
        return a * b * c ;
    }
}

public class CompilePolymorphism extends RuntimeException{

    public static void main(String args[]){
        Helper h = new Helper();
        System.out.println(h.Multiply(2, 4));
        System.out.println(h.Multiply(2, 7, 3));
        System.out.println(Helper.a);
    }
}
