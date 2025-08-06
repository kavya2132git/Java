import java.util.*;
import java.lang.*;

class Dancer{
Jacket Dance(){
Jacket j=new Jacket("blue", 32);
return j;
}
public static void main(String[] args){
Dancer d1=new Dancer();
Jacket j=d1.Dance();

System.out.println("Dancer receives jacket");
System.out.println("jacket color is: "+j.color);
System.out.println("jacket size: "+j.size);
}
}

class Jacket{
String color;
int size;

Jacket(String color, int Size){
this.color=color;
this.size=size;
}

}