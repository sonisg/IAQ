package coreconceptsprtc;

public class Employee implements Comparable<Employee>{

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.age, o.age);
    }

    public static class JavaPassByValue {
        public static void main (String args[]){
            int a = 2;
            change(a);
            System.out.println(a);
        }

        private static void change(int a) {
            a=12;
        }
    }
}
