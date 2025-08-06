public class Person{
private String name;
private int age;
private char gender;

public void setName(String name){
this.name=name;
System.out.println("my name is: "+this.name);
}
public String getName(){
return name;
}

public void setAge(int age){
this.age=age;
}
public int getAge(){
return age;
}

public void setGender(char gender){
this.gender=gender;
}
public char getGender(){
return gender;
}

public void details(){
System.out.println("i am superclass:");
}
}