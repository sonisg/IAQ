package coreconceptsprtc;

import java.util.ArrayList;
import java.util.List;

public class Emp {

    public Integer empId;

    public String empName;

    public String des;


    public Emp(Integer empId, String empName, String des) {
        this.empId = empId;
        this.empName = empName;
        this.des = des;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    public static List<Emp> getEmplyeeList() {
        List<Emp> employeeList = new ArrayList<Emp>();

        employeeList.add(new Emp(111, "Jennifer","HR"));
        employeeList.add(new Emp(112, "Rohit", "Sales And Marketing"));
        employeeList.add(new Emp(116, "Shubman", "Infrastructure"));

        return employeeList;
    }

    }
