import java.util.*;
import java.lang.*;

class Cow{
Milk eat(Jaggery j){
Milk m=new Milk(50);
return m;
}

public static void main(String[] args){
Cow c=new Cow();
Jaggery j=new Jaggery(10);
Milk m=c.eat(j);

System.out.println("Cow is giving "+m.liters+" liters of milk by eating "+j.kg+" kg of jaggery");

}
}

class Milk{
int liters;

Milk(int liters){
this.liters=liters;
}
}

class Jaggery{
int kg;

Jaggery(int kg){
this.kg=kg;
}
}