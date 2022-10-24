package grades;

import rpg.Monster;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer>grades;
    public Student(){};
    // Custom Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

}
