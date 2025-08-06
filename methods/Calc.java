import java.util.*;
import java.lang.*;

class Calc{
int a;
int b;

void add(int a, double b){
System.out.println("addition of a and b is: "+(a+b));
}

public static void main(String[] args){
Calc c=new Calc();
c.add(10,20.67);

c.add(20,10.34);
c.add(29,9.0);

}
}