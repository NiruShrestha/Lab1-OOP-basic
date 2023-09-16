
import java.util.Scanner;

public class TestTeacher {

    public static void main(String[] args) {
        System.out.println("Enter teacherId,Name,email,salary");
        Scanner ob = new Scanner(System.in);
        int teacherId = ob.nextInt();
        ob.nextLine();
        String fullName = ob.nextLine();
        Double salary = ob.nextDouble();
        ob.nextLine();
        String email = ob.nextLine();
        

        Teacher t = new Teacher(teacherId, fullName, email, salary);
        t.setTeacherId(teacherId);
        t.setFullName(fullName);
        t.setEmail(email);
        t.setSalary(salary);

        System.out.println("Id = " + t.getTeacherId());
        System.out.println("Name = " + t.getFullName());
        System.out.println("Email = " + t.getEmail());
        System.out.println("Salary = " + t.getSalary());

    }
}

