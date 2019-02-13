package institution;

import institution.interlink.Internship;
import person.Student;

import java.util.ArrayList;

public class University {

    private String name;
    private ArrayList<Student> studentArrayList = new ArrayList();
    private Internship internship;

    public void setInternship(Internship internship) {
        this.internship = internship;
    }

    public double getArifmeticMean() {
        int count = 0;

        for (Student i : studentArrayList) {
            count += i.getKnowledge().getLevel();
        }

        double arifmeticMean = count / studentArrayList.size();
        return arifmeticMean;
    }

    public University(String name) {
       this.name = name;
    }

    public void setStudent(Student student) {
        double avg = getArifmeticMean();
        if (student.getKnowledge().getLevel() >= avg) {
            internship.setStudent(student);
        }
    }

    public void addStudent(Student student) {
        studentArrayList.add(student);
    }
}