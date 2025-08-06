import java.lang.*;
import java.util.*;

class NonPrimitive{
Water on(){
Water w=new Water(20);
return w;
}

public static void main(String[] args){
NonPrimitive n=new NonPrimitive();
Water w=n.on();

System.out.println(w.liters+" liters of water flows out from tap"); 
}
}

class Water{
int liters;

Water(int liters){
this.liters=liters;
}
}
