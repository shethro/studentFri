
package student_spr_22_fri;

 
public class Student {
    private int studentId;
    private String studentName;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
        public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
}
