import java.util.*;
public class Department{
  private String name;
  private List<Student> students=new ArrayList<>();
  private List<Teacher> teachers=new ArrayList<>();

  public String getName(){
   return this.name;
  }
  public List<Student> getStudents(){
   return this.students;
  }
  public List<Teacher> getTeachers(){
   return this.teachers;
  }

  public void setName(String name){
    this.name=name;
  }
  
}