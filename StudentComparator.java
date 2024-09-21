import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student arg0, Student arg1) {
        String fullName0 = arg0.getSurname() + arg0.getFirstname() + arg0.getPatronymic();
        String fullName1 = arg1.getSurname() + arg1.getFirstname() + arg1.getPatronymic();
        return fullName0.compareToIgnoreCase(fullName1);
    }
}
