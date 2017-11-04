/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author austinthiele
 */
public class Course {
private String courseName;
private ArrayList<String> students = new ArrayList<>();
private int numberOfStudents;

public Course(String courseName) {
    this.courseName = courseName;
}

public void addStudent(String student) {
    students.add(student);
}
public String[] getStudents() {
   String[] stringOfStudents = new String[students.size()];
		return students.toArray(stringOfStudents);
}

public int getNumberOfStudents() {
    return students.size();
}
public String getCourseName() {
    return courseName;
}
public void dropStudent(String student) {
    
}
}
