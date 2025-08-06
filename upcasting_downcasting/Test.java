public class Test{
public static void main(String[] args){
//upcasting
Person pd=new Doctor();
Person pp=new Patient();

//downcasting
Doctor d=(Doctor)pd;
Patient p=(Patient)pp;

d.spec="cardiologist";
p.disease="cardivascular disease";
pd.details();
pp.details();

pd.setName("Varun");
pp.setName("kavya");

System.out.println(pd.getName());
System.out.println(pp.getName());

}
}