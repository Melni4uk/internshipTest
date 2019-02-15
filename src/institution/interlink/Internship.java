package institution.interlink;

import person.Student;

import java.util.ArrayList;

public class Internship {

    public String name;
    public  String nameOfStud;
    public ArrayList<Student> internsArrayList = new ArrayList();

    public Internship(String name) {
       this.name = name;
    }

    public void setStudent(Student student) {
        this.internsArrayList.add(student);
    }

    public String getStudents() {
        for (Student i : internsArrayList) {
           nameOfStud = i.getName();
           System.out.println(nameOfStud);
        }
        return "";
    }
}