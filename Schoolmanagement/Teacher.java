import java.util.*;
public class Teacher extends Staff{

private String subject;

public Teacher(String name, int age, String empid){
super(name,age,empid); //invoking superclass constructor
}

public void setSubject(String subject){
this.subject=subject;
}

String teach(){
return getName()+ " teacher is teaching";
}

@Override
String details(){
return super.details()+ " subject: "+subject;
}
}