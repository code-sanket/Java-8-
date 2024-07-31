import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeBasedQuestions {
    static class Employee
    {
        int id;

        String name;

        int age;

        String gender;

        String department;

        int yearOfJoining;

        double salary;

        public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
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
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //calculate male and female employee;

        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.counting())));

        //print all dept

        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //average age of male and female employee

        Map<String, Double> map =  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.averagingInt(Employee::getAge)));
        System.out.println(map);

        //get details of highest paid employee
        System.out.println(employeeList.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get());

        //emp joins after 2016

        employeeList.stream().filter(e-> e.getYearOfJoining() > 2016).map(Employee::getName).forEach(System.out::println);

        //number of emp in each dept

        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String, Long>> entries = collect.entrySet();
        for (Map.Entry entry : entries){
            System.out.println(entry.getKey() + " ... " + entry.getValue());
        }

        // find Details of youngest male and from product development department

        Employee employee = employeeList.stream().filter(e1 -> e1.getGender() == "Male" && e1.getDepartment() == "Product Development").min((e1, e2) -> e1.age - e2.getAge()).get();
        System.out.println(employee);

        // oldest employee
        System.out.println(employeeList.stream().min((e1,e2)-> e1.getYearOfJoining() - e2.getYearOfJoining()).get());

        //name of all emp in each dept

        Map<String, List<Employee>> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entries1 = collect1.entrySet();
        for (Map.Entry<String , List<Employee>> entry : entries1){
            System.out.println(entry.getKey());
            List<Employee> employees = entry.getValue();
            for(Employee employee1 : employees){
                System.out.println(employee1);
            }
        }


    }
}
