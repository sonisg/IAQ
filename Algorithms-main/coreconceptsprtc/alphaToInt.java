package coreconceptsprtc;

public class alphaToInt {
    public static void main(String args[]){
        String s= "a6fsvhbsjg717w282";
        int[] re = s.chars().filter(Character::isDigit).map(Character::getNumericValue).distinct().toArray();
        for(int e: re){
            System.out.println(e);
        }

    }
}
