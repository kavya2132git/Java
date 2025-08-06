import java.util.*;
public class Principal extends Staff{

private int yoexp;

public Principal(String name, int age, String empid){
super(name,age,empid); //invoking superclass constructor
}

public void setExp(int exp){
this.yoexp=exp;
}

String lead(){
return getName()+ " is leading school with "+yoexp+" years of experience";
}

@Override
String details(){
return super.details()+ " yearsof experience: "+yoexp;
}
}