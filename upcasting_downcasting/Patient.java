public class Patient extends Person{
String disease;

@Override
public void details(){
System.out.println("my disease is: "+disease);
}
}