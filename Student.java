public class Student{
  private String name;
  private int age;
  private Department dept;

  public String getName(){
   return this.name;
  }
  public int getAge(){
   return this.age;
  }
  public Department getDept(){
   return this.dept;
  } 

  public void setName(String name){
    this.name=name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public void setDept(Department dept){
    this.dept=dept;
  }
}