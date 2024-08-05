package coreconceptsprtc;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamQuestions {
    public static void main(String args[]){
        List<Emplyee> emplyeeList = Emplyee.getEmplyeeList();

        long noOfEmployees = emplyeeList.stream().count();
        System.out.println(noOfEmployees);
        long noOfEmployees1 = emplyeeList.stream().collect(Collectors.counting());;
        System.out.println(noOfEmployees1);

        List<Emplyee> sortedAccordingToSalaryAsc = emplyeeList.stream().sorted((s1,s2) -> (int) (s1.getSalary() - s2.getSalary())).collect(Collectors.toList());
        System.out.println(sortedAccordingToSalaryAsc);

        List<Emplyee> sortedAccordingToSalaryAs = emplyeeList.stream().sorted(Comparator.comparing(Emplyee::getSalary)).collect(Collectors.toList());
        System.out.println(sortedAccordingToSalaryAs);

        List<Emplyee> sortedAccordingToSalaryDsc = emplyeeList.stream().sorted(Comparator.comparing(Emplyee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortedAccordingToSalaryDsc);

        Map<String, Long> maleFemaleEmply = emplyeeList.stream().collect(Collectors.groupingBy(Emplyee::getGender, Collectors.counting()));
        System.out.println(maleFemaleEmply);

        Map<String, Long> noOfEmplyPerDepart= emplyeeList.stream().collect(Collectors.groupingBy(Emplyee::getDepartment, Collectors.counting()));
        System.out.println(noOfEmplyPerDepart);

        List<String> dep = emplyeeList.stream().map(Emplyee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(dep);

        Map<String, Double> salary = emplyeeList.stream().collect(Collectors.groupingBy(Emplyee::getGender, Collectors.averagingDouble(Emplyee::getSalary)));
        System.out.println(salary);

        Map<String, Optional<Emplyee>> maxMFsalary = emplyeeList.stream().collect(Collectors.groupingBy(Emplyee::getGender, Collectors.maxBy((t1, t2)-> (int) (t1.getSalary() - t2.getSalary()))));
        System.out.println(maxMFsalary);

        Map<String, Optional<Emplyee>> minMFsalary = emplyeeList.stream().collect(Collectors.groupingBy(Emplyee::getGender, Collectors.minBy((t1, t2)-> (int) (t1.getSalary() - t2.getSalary()))));
        System.out.println(minMFsalary);

        Map<String, Optional<Emplyee>> highestPaidEmplPerDep = emplyeeList.stream().collect(Collectors.groupingBy(Emplyee::getDepartment, Collectors.maxBy((t1, t2)-> (int) (t1.getSalary() - t2.getSalary()))));
        System.out.println(highestPaidEmplPerDep);

        Optional<Emplyee> highestPaidEmpl = emplyeeList.stream().collect(Collectors.maxBy((t1, t2)-> (int) (t1.getSalary() - t2.getSalary())));
        System.out.println(highestPaidEmpl);

        Map<String, Double> avgEmplSalaryPerDep = emplyeeList.stream().collect(Collectors.groupingBy(Emplyee::getDepartment, Collectors.averagingDouble(Emplyee::getSalary)));
        System.out.println("Average salary of each department\n");
        for (Map.Entry<String, Double> entry : avgEmplSalaryPerDep.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        Optional<Emplyee> youngest = emplyeeList.stream().filter(e-> e.getDepartment().equals("Product Development") && e.getGender()=="Male").min(Comparator.comparing(Emplyee::getAge));
        System.out.println("youngest male employee\n");
        System.out.println(youngest);

        Optional<Emplyee> mostExp = emplyeeList.stream().min(Comparator.comparing(Emplyee::getYearOfJoining));
        System.out.println("most exp employee\n");
        System.out.println(mostExp);

        Optional<Emplyee> oldEmp = emplyeeList.stream().max(Comparator.comparing(Emplyee::getAge));
        System.out.println("most old employee\n");
        System.out.println(oldEmp);

        DoubleSummaryStatistics stats = emplyeeList.stream().collect(Collectors.summarizingDouble(Emplyee::getSalary));
        System.out.println("summary\n");
        System.out.println(stats);

        Map<String, List<String>> empNamePerDep = emplyeeList.stream()
                .collect(Collectors.groupingBy(Emplyee::getDepartment,
                        Collectors.mapping(Emplyee::getName, Collectors.toList())));

        // Print the result
        empNamePerDep.forEach((department, names) -> {
            System.out.println("Department: " + department);
            System.out.println("Employees: " + names);
        });
        System.out.println(empNamePerDep);

        Map<Boolean, List<Emplyee>> pa = emplyeeList.stream().collect(Collectors.partitioningBy(e-> e.getAge() > 30));

        Set<Map.Entry<Boolean, List<Emplyee>>> entrySet = pa.entrySet();

        for (Map.Entry<Boolean, List<Emplyee>> entry : entrySet) {
            System.out.println("----------------------------");

            if (entry.getKey()) {
                System.out.println("Employees older than 30 years :");
            }
            else {
                System.out.println("Employees younger than or equal to 30 years :");
            }

            System.out.println("----------------------------");

            List<Emplyee> list = entry.getValue();

            for (Emplyee e : list) {
                System.out.println(e.getName());
            }

            System.out.println("Age with 25");

            List<Emplyee> emplwithAge25 = emplyeeList.stream().filter(e-> e.getAge()>25).collect(Collectors.toList());
            System.out.println(emplwithAge25);

            List<String> empName = emplyeeList.stream().map(x->x.getName().substring(0,1).toUpperCase() + x.getName().substring(1)).collect(Collectors.toList());
            System.out.println(empName);

            emplyeeList.stream().map(e-> e.getName() + " " + e.getSalary()).forEach(System.out::println);

          double totalSalary = emplyeeList.stream()
                    .mapToDouble(Emplyee::getSalary) // Map each employee to their salary
                    .sum();
            System.out.println(totalSalary);


            List<String> list1 = Arrays.asList("a", "b", "c");
            List<String> list2 = Arrays.asList("a", "a", "c");

            // Count occurrences of each element from list1 in list2
            Map<String, Long> countMap = list1.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            // Print the occurrences


            countMap.forEach((key, value) -> {
                long occurrences = list2.stream().filter(element -> element.equals(key)).count();
                System.out.println(key + ": " + occurrences);
            });

            List<String> s = new ArrayList<>();
            s.add("Riya");
            s.add("piya");

            Map<String, Long> sp = s.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(sp);

            List<Integer> s1 = Arrays.asList(1,2,3,4);
            List<Integer> s2 = Arrays.asList(1,2,3,4);

            List<Integer> sum = IntStream.range(0, s1.size()).mapToObj(i-> s1.get(i)+s2.get(i)).collect(Collectors.toList());
            System.out.println(sum);

        }
    }
}
