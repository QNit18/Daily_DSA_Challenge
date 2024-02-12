import java.util.Arrays;
import java.util.Comparator;

public class LT_SortInJava {

    static class Student implements Comparable{
        int age;
        String name;

        public Student(String name, int age) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Object other) {
            Student otherStudent = (Student) other;
            if ( this.age == otherStudent.age) {
                return 0;
            } else if (this.age > otherStudent.age) {
                return 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {

        // #1. Sort an Integer array
        int[] arr = {3,2,4,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // #2. Sort an String arr
        String[] stringArray = {"1", "0000", "2222"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        // #3. Sort a Student array with interface Comparable
        Student[] students = {new Student("AAAA", 20), new Student("BBB", 222)};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        // #4. Sort : Comparator
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.name.equals(o2.name)){
                    return 0;
                }
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
