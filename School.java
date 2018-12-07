import java.util.*;
public class School{
  private static School school=null;
  private List<Department> departments=new ArrayList<>();
  private School() {}
	public static School getSchool() {
    if(school==null){
      school=new School();
    }
		return school;
	}
  public List<Department> getDepartments(){
    return this.departments;
  }
}
