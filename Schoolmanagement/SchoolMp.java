import java.util.*;
public class SchoolMp{
public static void main(String[] args){

Staff.showSchoolname();

Staff st=new Teacher("raj",35,"E23");
Teacher t=(Teacher)st;
t.setSubject("Computers");
System.out.println(t.teach());
System.out.println(t.details());

Staff sp=new Principal("kavya",21,"E57"); 
Principal p=(Principal)sp;
p.setExp(20);
System.out.println(p.lead());
System.out.println(p.details());

}
}