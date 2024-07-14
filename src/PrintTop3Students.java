import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintTop3Students {
    static class Student {

        String name;

        int id;

        String subject;

        double percentage;

        public Student(String name, int id, String subject, double percentage) {
            this.name = name;
            this.id = id;
            this.subject = subject;
            this.percentage = percentage;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public String getSubject() {
            return subject;
        }

        public double getPercentage() {
            return percentage;
        }

        @Override
        public String toString() {
            return name + "-" + id + "-" + subject + "-" + percentage;
        }

    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        Optional<Student> student = studentList.stream().max((s1 , s2) -> (int) (s1.getPercentage() - s2.getPercentage()));
        System.out.println(student.get().name);

        List<Student> top3 = studentList.stream().sorted((s1 , s2)-> (int) (s2.getPercentage() - s1.getPercentage())).limit(3).collect(Collectors.toList());

        top3.forEach(System.out::println);



        Map<String, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(student1 -> student1.subject));
        collect.forEach((s1,s2) ->{
            System.out.println(s1);
            s2.forEach(System.out::println);
        });

        Map<String, List<Student>> studentsGroupedBySubject = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(studentsGroupedBySubject);

        System.out.println(studentList.stream().count());

        //checking anagrams

        String s1 = "abcd";
        String s2 = "dcba";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        System.out.println(s1.equals(s2));
    }
}
