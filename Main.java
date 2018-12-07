import java.util.*;
public class Main{
  public static void main(String args[]){
    System.out.println("Welcome!");
    Main main=new Main();
    main.school();   
  }

  public void school(){
    Main main=new Main();
   System.out.println("enter 1 to departments, 2 to teachers, 3 to students, 4 to exit");
    Scanner s=new Scanner(System.in);
    int option=s.nextInt();
    switch(option){
      //---------------department----------------------
      case 1:
      main.department();
      school();
      break;
      //---------------teachers----------------------
      case 2:
      main.teacher();
      school();
      break;
      //-------------------students---------------------
      case 3: 
     main.student();
      school();
      break;
      case 4: System.out.println("Thank you");break;
      default:System.out.println("Invalld option, program terminated");
    }
  
  }
/////////////////////////////////////////////////////////////
  public void department(){
      int t=0,d=0;
      System.out.println("enter 1 to add department, 2 to remove department, 3 to view department, 4 to main menu");
      Scanner s=new Scanner(System.in);
      School sch=School.getSchool();
      int doption=s.nextInt();
     switch(doption){
       case 1:
       System.out.println("Enter the department name to be added");
       String aname=s.next();
       Department dept=new Department();
       dept.setName(aname);
       for(int i=0;i<sch.getDepartments().size();i++){
         if(aname.equals(sch.getDepartments().get(i).getName())){
         d=1;
         }
       }
       if(d==0){
       sch.getDepartments().add(dept);
       System.out.println("Department "+dept.getName()+ " is added");
       /*for(int l=0;l<sch.getDepartments().size();l++){
       System.out.println(sch.getDepartments().get(l).getName()+" "+sch.getDepartments().get(l).getTeachers());}*/
       }
       else{
         System.out.println(aname+" department already exists");
       }
       department();
       break;
       case 2:
       t=0;
       System.out.println("Enter the department name to be removed");
       String rname=s.next();
       for(int i=0;i<sch.getDepartments().size();i++){
         if(sch.getDepartments().get(i).getName().equals(rname)){
           t=1;
           sch.getDepartments().remove(sch.getDepartments().get(i));
           System.out.println(rname+" Department removed successfully");
         }
       }
       if(t==0){
         System.out.println("No such department exists");
       }
       department();
      break;
       case 3:System.out.println("Enter department name to be viewed");
       t=0;
       String vname=s.next();
       for(int i=0;i<sch.getDepartments().size();i++){
          if(vname.equals(sch.getDepartments().get(i).getName())){
            t=1;
           System.out.println("Name: "+sch.getDepartments().get(i).getName());
           System.out.println("Teachers count: "+sch.getDepartments().get(i).getTeachers().size());
           System.out.println("Students count: "+sch.getDepartments().get(i).getStudents().size());
          } 
       }
       if(t==0){
         System.out.println("No such department exists");
       }
       department();
       break;
       case 4:System.out.println("Main menu....");break;
       default:System.out.println("invalid option");
     }
      
  }
/////////////////////////////////////////////////////////////
  public void teacher(){
       int t=0;
       System.out.println("enter 1 to add teacher, 2 to remove teacher, 3 to view teacher, 4 to main menu");
      Scanner s=new Scanner(System.in);
      School sch=School.getSchool();
      int toption=s.nextInt();
     switch(toption){
       case 1:
       t=0;
       System.out.println("Enter the teacher name to be added");
       String aname=s.next();
       System.out.println("Enter the age");
       int age=s.nextInt();
       System.out.println("Enter the department name");
       String dname=s.next();
       Teacher teacher=new Teacher();
       teacher.setName(aname);
       teacher.setAge(age);
       for(int i=0;i<sch.getDepartments().size();i++){
        if(dname.equals(sch.getDepartments().get(i).getName())){
          t=1;
          teacher.setDept(sch.getDepartments().get(i));
          sch.getDepartments().get(i).getTeachers().add(teacher);
          System.out.println("Teacher "+teacher.getName()+ " is added to "+teacher.getDept().getName()+" department");
          break;
        }
       }
       if(t==0){
         System.out.println("No such department exists; Teacher registration failed");
       }
       teacher();
       break;
       case 2:
       t=0;
       System.out.println("Enter the teacher name to be removed");
       String rname=s.next();
       for(int i=0;i<sch.getDepartments().size();i++){
         for(int j=0;j<sch.getDepartments().get(i).getTeachers().size();j++){
           if(rname.equals(sch.getDepartments().get(i).getTeachers().get(j).getName())){
             t=1;
             sch.getDepartments().get(i).getTeachers().remove(sch.getDepartments().get(i).getTeachers().get(j));
             System.out.println("Teacher removed successfully");
           }
         }
       }
       if(t==0){
         System.out.println("No such teacher exists");
       }
       teacher();
      break;
       case 3:System.out.println("Enter teacher name to be viewed");
       t=0;
       String vname=s.next();
       for(int i=0;i<sch.getDepartments().size();i++){
         for(int j=0;j<sch.getDepartments().get(i).getTeachers().size();j++){
            if(vname.equals(sch.getDepartments().get(i).getTeachers().get(j).getName())){
              t=1;
              System.out.println("Name: "+sch.getDepartments().get(i).getTeachers().get(j).getName());
              System.out.println("Age: "+sch.getDepartments().get(i).getTeachers().get(j).getAge());
              System.out.println("Department: "+sch.getDepartments().get(i).getTeachers().get(j).getDept().getName());
            }
         }
       }
       if(t==0){
         System.out.println("No such teacher exists");
       }
       teacher();
       break;
       case 4:System.out.println("Main menu....");break;
       default:System.out.println("invalid option");
     }      
  }
/////////////////////////////////////////////////////////////
   public void student(){
   int t=0;
       System.out.println("enter 1 to add student, 2 to remove student, 3 to view student, 4 to main menu");
      Scanner s=new Scanner(System.in);
      School sch=School.getSchool();
      int soption=s.nextInt();
     switch(soption){
       case 1:
       t=0;
       System.out.println("Enter the student name to be added");
       String aname=s.next();
       System.out.println("Enter the age");
       int age=s.nextInt();
       System.out.println("Enter the department name");
       String dname=s.next();
       Student student=new Student();
       student.setName(aname);
       student.setAge(age);
       for(int i=0;i<sch.getDepartments().size();i++){
        if(dname.equals(sch.getDepartments().get(i).getName())){
          t=1;
          student.setDept(sch.getDepartments().get(i));
          sch.getDepartments().get(i).getStudents().add(student);
          System.out.println("Student "+student.getName()+ " is added to "+student.getDept().getName()+" department");
        }
       }
       if(t==0){
         System.out.println("No such department exists; Student registration failed");
       }
       student();
       break;
       case 2:
       t=0;
       System.out.println("Enter the student name to be removed");
       String rname=s.next();
       for(int i=0;i<sch.getDepartments().size();i++){
         for(int j=0;j<sch.getDepartments().get(i).getStudents().size();j++){
           if(rname.equals(sch.getDepartments().get(i).getStudents().get(j).getName())){
             t=1;
             sch.getDepartments().get(i).getStudents().remove(sch.getDepartments().get(i).getStudents().get(j));
             System.out.println("Student removed successfully");
           }
         }
       }
       if(t==0){
         System.out.println("No such student exists");
       }
       student();
      break;
       case 3:System.out.println("Enter student name to be viewed");
       t=0;
       String vname=s.next();
       for(int i=0;i<sch.getDepartments().size();i++){
         for(int j=0;j<sch.getDepartments().get(i).getStudents().size();j++){
            if(vname.equals(sch.getDepartments().get(i).getStudents().get(j).getName())){
              t=1;
              System.out.println("Name: "+sch.getDepartments().get(i).getStudents().get(j).getName());
              System.out.println("Age: "+sch.getDepartments().get(i).getStudents().get(j).getAge());
              System.out.println("Department: "+sch.getDepartments().get(i).getStudents().get(j).getDept().getName());
              
            }
         }
       }
       if(t==0){
         System.out.println("No such student exists");
       }
       student();
       break;
       case 4:System.out.println("Main menu....");break;
       default:System.out.println("invalid option");
     }
     
      
  }
  
}