package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
                if(salary < 0){
            System.out.println("wrong input!");
        }
        if(salary <= 10000 && salary > 0)
            System.out.println(salary/100.0f * 15);
        if(salary > 10000 && salary <= 20000)
            System.out.println(salary / 100.0f * 18);
        if(salary > 20000)
            System.out.println(salary / 100.0f * 20);
    }
}
