package LLDSingletonDP;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class main {

    public static void main (String args[]) throws Exception {
        Samosa samosa = Samosa.getSamosa();
//        System.out.println(samosa.hashCode());
//        Samosa samosa2 = Samosa.getSamosa();
//        System.out.println(samosa2.hashCode());

//        Jalebi jalebi = Jalebi.getJalebi();
//        System.out.println(jalebi.hashCode());
//
//        Jalebi jalebi1 = Jalebi.getJalebi();
//        System.out.println(jalebi1.hashCode());


        //1. Way to break
//        Constructor<Samosa> samosaConstructor = Samosa.class.getDeclaredConstructor();
//        samosaConstructor.setAccessible(true);
//        Samosa s2 = samosaConstructor.newInstance();
//        System.out.println(s2.hashCode());
        //prevent by adding exception in constructor

        //2. Serialization and deserialization
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("abx.ob"));
        op.writeObject(samosa);
        System.out.println(samosa.hashCode());
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("abx.ob"));
        Samosa s2 = (Samosa) o.readObject();
        System.out.println(s2.hashCode());
        //prevent by readResolve

    }
}
