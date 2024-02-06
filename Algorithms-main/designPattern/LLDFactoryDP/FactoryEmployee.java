package LLDFactoryDP;

public class FactoryEmployee{

    public static Employee getEmployee(String s){
        if(s.equalsIgnoreCase("Android")){
            return new AndroidDeveloper();
        } else if(s.equalsIgnoreCase("Web")){
            return new WebDeveloper();
        } else{
            return null;
        }
    }
}
