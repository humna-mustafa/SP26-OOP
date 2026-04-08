public class ProductDemo{
public static void main(String[] arg){

Product p1=new Product();
Product p2= new Product();
Product p3= new Product();

System.out.println(p1);
p1.SetId(15);
System.out.println(p1.GetId());

System.out.println(p2);
p1.SetId(13);
System.out.println(p2.GetId());

System.out.println(p3);
p1.SetId(12);
System.out.println(p3.GetId());
}
}