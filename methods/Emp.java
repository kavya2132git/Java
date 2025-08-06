import java.lang.*;
import java.util.*;

class Emp{
String name;
int id;
int sal;

void salary(int sal){
System.out.println("emp salary is: "+sal);
}

public static void main(String[] args){
Emp e1=new Emp();
e1.name="dinga";
e1.id=57;
e1.salary(35000);

System.out.println(e1.name+" "+e1.id);
}
}