package org.bahadirmemis.oop.collections;

/**
 * @author bahadirmemis
 */
public class Student implements Comparable<Student> {

  private Integer studentNo;
  private String name;

  public Student(Integer studentNo, String name) {
    this.studentNo = studentNo;
    this.name = name;
  }

  public Integer getStudentNo() {
    return studentNo;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Student{" +
           "studentNo=" + studentNo +
           ", name='" + name + '\'' +
           '}';
  }

  @Override
  public int compareTo(Student anotherStudent) {
    return this.name.compareTo(anotherStudent.getName());
  }
}
