package coreconceptsprtc;

import java.util.ArrayList;
import java.util.List;

class Emplyee
{
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Emplyee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static List<Emplyee> getEmplyeeList(){
        List<Emplyee> employeeList = new ArrayList<Emplyee>();

        employeeList.add(new Emplyee(111, "jennifer", 22, "Female", "HR", 2017, 55000.0));
        employeeList.add(new Emplyee(112, "rohit", 35, "Male", "Sales And Marketing", 2019, 23500.0));
        employeeList.add(new Emplyee(113, "Shubman", 29, "Male", "Infrastructure", 2019, 28000.0));
        employeeList.add(new Emplyee(114, "Rinku", 28, "Male", "Product Development", 2020, 62500.0));
        employeeList.add(new Emplyee(115, "Aaditi", 41, "Female", "HR", 2022, 29700.0));
        employeeList.add(new Emplyee(116, "Mahendra", 43, "Male", "Security And Transport", 2023, 20500.0));
        employeeList.add(new Emplyee(117, "Nitish", 35, "Male", "Account And Finance", 2019, 37000.0));
        employeeList.add(new Emplyee(118, "Aditya", 31, "Male", "Product Development", 2019, 34500.0));
        employeeList.add(new Emplyee(119, "Monika", 24, "Female", "Sales And Marketing", 2021, 21500.0));
        employeeList.add(new Emplyee(120, "Aman", 38, "Male", "Security And Transport", 2021, 31000.5));
        employeeList.add(new Emplyee(121, "Sangeeta", 27, "Female", "Infrastructure", 2021, 35000.0));
        employeeList.add(new Emplyee(122, "Joshi", 25, "Male", "Product Development", 2020, 29000.0));
        employeeList.add(new Emplyee(123, "Jeddy", 27, "Female", "Account And Finance", 2020, 29000.0));
        employeeList.add(new Emplyee(124, "Niden", 24, "Male", "Sales And Marketing", 2020, 30200.5));
        employeeList.add(new Emplyee(125, "Saig", 23, "Male", "Infrastructure", 2019, 42700.0));
        employeeList.add(new Emplyee(126, "Saey", 26, "Female", "Product Development", 2018, 38900.0));
        employeeList.add(new Emplyee(127, "Shreyas", 25, "Male", "Product Development", 2018, 35700.0));

        return employeeList;
    }
}