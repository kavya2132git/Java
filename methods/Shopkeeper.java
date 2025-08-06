import java.util.*;
import java.lang.*;

class Shopkeeper{
Product sell(Money money){
Product p = new Product("Teddy bear");
return p;
}

public static void main(String[] args){
Shopkeeper s=new Shopkeeper();
Money m=new Money(100);

Product p=s.sell(m);

System.out.println("shopkeeper sells "+p.product+" for "+m.money+" rupees");
}
}

class Product{
String product;

Product(String product){
this.product=product;
}
}

class Money{
int money;

Money(int money){
this.money=money;
}

}