package org.bahadirmemis.oop.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author bahadirmemis
 */
public class CollectionApp {

  public static void main(String[] args) {

    Student bahadir = new Student(1, "bahadir");
    Student ahmet = new Student(2, "ahmet");
    Student ziya = new Student(0, "ziya");


    Set<Student> students = new TreeSet<>();
    students.add(bahadir);
    students.add(ahmet);
    students.add(ziya);

    System.out.println(students);
  }
}
