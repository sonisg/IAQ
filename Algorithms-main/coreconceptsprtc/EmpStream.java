package coreconceptsprtc;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpStream {

    public static void main(String args[]){
        List<Emp> emplyeeList = Emp.getEmplyeeList();

        System.out.println(emplyeeList);

        List<Integer> empId = emplyeeList.stream().filter(emp -> emp.getEmpId()%2==0).map(Emp::getEmpId).collect(Collectors.toList());
        System.out.println(empId);

        List<Emp> emplyeeAsc = emplyeeList.stream().sorted(Comparator.comparing(Emp::getEmpId)).collect(Collectors.toList());
        emplyeeAsc.forEach(System.out::println);

        List<Emp> emplyeeDsc = emplyeeList.stream().sorted(Comparator.comparing(Emp::getEmpId).reversed()).collect(Collectors.toList());
        System.out.println(emplyeeDsc);
    }
}
