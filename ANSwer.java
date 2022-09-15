import java.util.Comparator;

import java.util.Date;
public class Employee implements Comparable<Employee>{
    private int ;
    private String name;
    private int salary;
    private int age;
    private  String emp_id
    

    public static final Comparator<Employee> AgeComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.age - o2.age;  // This will work because age is positive integer
        }
      
    };
  
    public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary - o2.salary; // salary is also positive integer
        }
      
    };
  
    public static final Comparator<Employee> NameComparator = new Comparator<Employee>(){

        
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
      
    };
  
    public static final Comparator<Employee> DOJComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.emp_id.compareTo(o2.emp_id);
        }
      
    };

    public Employee(int id, String name, int salary, int age, emp_id) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.emp_id = emp_id;
    }

    @Override
    public String toString() {_ + '}';

    }


