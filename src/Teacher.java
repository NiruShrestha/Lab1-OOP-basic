
public class Teacher {

    private int teacherId;
    private String fullName, email;
    private Double salary;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Teacher(int teacherId, String fullName, String email, Double salary) {   
        this.teacherId = teacherId;
        this.fullName = fullName;
        this.email = email;
        this.salary = salary;
    }
    public Teacher() {     //default
    }
    
  
}

