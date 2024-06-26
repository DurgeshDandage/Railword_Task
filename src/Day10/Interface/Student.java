package Day10.Interface;

import java.io.Serializable;

public class Student implements collage, Serializable,Comparable<Student> {
    private String name;
    private int rollNo;
    private int mark;

    public Student() {
    }

    public Student(String name,int rollNo, int mark) {
        this.name = name;
        this.rollNo=rollNo;
        this.mark = mark;

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public void display() {
        System.out.println(name);

    }

    @Override
    public int showRollNo() {
        return rollNo;
    }

    @Override
    public int compareTo(Student demo) {

        if (this.mark > demo.mark) {
            return 1;

        } else if (this.mark < demo.mark) {
            return -1;
        } else {
            return 0;
        }
    }
}
