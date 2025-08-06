import java.util.*;
public class Staff{
private String name;
private int age;
private String empid;
static String schoolname;

public Staff(String name, int age, String empid){
this.name=name;
this.age=age;
this.empid=empid;
this.schoolname=schoolname;
}

public String getName(){
return name;
}

public String getEmpid(){
return empid;
}

String work(){
return this.name+ " teacher is teaching";
}


String details(){
return "name: "+this.name+ "age: "+this.age+ "empid: "+this.empid;
}

static void showSchoolname(){
System.out.println("school name is: "+schoolname);
}

static {
schoolname="GOVT School";
}
}