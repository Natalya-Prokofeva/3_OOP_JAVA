import java.util.Collections;
import java.util.Iterator;

public class StudentGroupService {
    private StudentGroup studentsGroup;

    public StudentGroupService(StudentGroup students) {
        this.studentsGroup = students;
    }

    public boolean removeStudent(String surname, String firstname, String patronymic) {
        Iterator<Student> iteratorStudents = studentsGroup.iterator();
        while (iteratorStudents.hasNext()) {
            Student student = iteratorStudents.next();
            if (student.getSurname().equals(surname) && student.getFirstname().equals(firstname)
                    && student.getPatronymic().equals(patronymic)) {
                iteratorStudents.remove();
                return true;
            }
        }
        return false;
    }

    public void sortStudentsById(){
        Collections.sort(studentsGroup.getStudentGroup());
    }

    public void sortStudentsByName(){
        studentsGroup.getStudentGroup().sort(new StudentComparator());
    }

    public StudentGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentGroup students) {
        this.studentsGroup = students;
    }
}
