package LLDSingletonDP;

public class Jalebi {

    private static Jalebi j = new Jalebi();

    public static Jalebi getJalebi(){
        return j;
    }
}
