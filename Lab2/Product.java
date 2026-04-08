public class Product{

private int id;
private String name;
private int quantity;
private double price;
static int counter;

public Product(){
System.out.println("inside constructuor fucntion.");
}

public void SetId(int newid){
this.id=newid;
}
public int GetId(){
return id;}

public  void SetName(String newname){
this.name=newname;}

public String GetName(){
return name;}

public void SetQuantity(int newquantity){
this.quantity=quantity;}

public double GetQuantity(){
return quantity;}

public void SetPrice( double newPrice){
this.price=newPrice;
}

public double GetPrice(){
return price;}




}