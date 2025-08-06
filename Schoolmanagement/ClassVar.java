import java.util.*;
class ClassVar{
int a=10;

static void m1(int a){
System.out.println("class variable is: "+a);
}
public static void main(String[] args){
ClassVar obj=new ClassVar();
m1(obj.a);
}
}
