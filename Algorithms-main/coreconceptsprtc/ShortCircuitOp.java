package coreconceptsprtc;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShortCircuitOp {

    public static void main(String args[]) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Shivam_1", 54),
                new Employee("Soniya", 24),
                new Employee("Shivam", 34),
                new Employee("Shiv", 14),
                new Employee("Raja", 36),
                new Employee("", 1)
        );
        employeeList.stream().limit(1).forEach(e-> System.out.println(e.getName()));

        Employee e = employeeList.stream().filter(em->em.getName().contains("Shivam")).findFirst().get();
        System.out.println(e.getName());

        boolean b = employeeList.stream().allMatch(emm-> emm.getName().contains("Soniya"));
        System.out.println(b);

        boolean bb = employeeList.stream().anyMatch(emm-> emm.getName().contains("Soniya"));
        System.out.println(bb);

        boolean bbb = employeeList.stream().noneMatch(emm-> emm.getName().contains("Soniya"));
        System.out.println(bbb);

        List<Integer> ages = employeeList.stream().map(a->a.getAge()).sorted().collect(Collectors.toList());
        Integer min = ages.stream().mapToInt(x->x).summaryStatistics().getMin();
        System.out.println(min);

        Integer max = ages.stream().mapToInt(x->x).summaryStatistics().getMax();
        System.out.println(max);

        IntSummaryStatistics summaryStatistics = ages.stream().mapToInt(x->x).summaryStatistics();
        Double avg = summaryStatistics.getAverage();
        System.out.println(avg);

        List<Integer> youngs = ages.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(youngs);

        List<String> names = employeeList.stream().map(a-> a.getName()).sorted().collect(Collectors.toList());
        String n = names.stream().map(np -> np.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(n);

        String op = Optional.ofNullable(e.getName()).orElse("Anonymous");
        System.out.println(op);

    }
}
