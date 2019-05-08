package com.stackroute.pe5;

import java.util.*;

public class Student implements Comparable<Student>{
    int id,age;
    String name;

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
    public void display(){
        System.out.println("ID="+id+"\tName="+name+"\tAge="+age);
    }
}

class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }
}


class MainTest {
    public static void main(String[] args){
        List<Student> studentList=new ArrayList<>();
        int numberOfStudents;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Students (min--5): ");
        numberOfStudents=sc.nextInt();
        for(int i=1;i<=numberOfStudents;i++){
            System.out.println("Enter 1) Student ID\t2) Student Name\t3) Student Age:");
            Student student=new Student();
            student.id=sc.nextInt();
            student.name=sc.next();
            student.age=sc.nextInt();
            studentList.add(student);
        }
        Collections.sort(studentList);
        for(int i=0;i<studentList.size();i++)
        studentList.get(i).display();
    }
}
