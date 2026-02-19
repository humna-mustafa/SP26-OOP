class Practice{
public int publicAge;
private String name;
private int privateAge;
private int marks;

public void setName(String n){
name=n;}

public String getName(){
return name;}

public void setPrivateAge(int a){
if(a>0)
privateAge=a;
else 
System.out.println("Invalid age!\n");}

public int getPrivateAge(){
return privateAge;}

public void setMarks(int m){
if(m>=0 && m<=100)
marks=m;
else
System.out.println("Invalid marks!\n");}

public int getMarks(){
return marks;}

// Arithmetic function:add two numbers
public int add(int a,int b){
    return a+b;}
}