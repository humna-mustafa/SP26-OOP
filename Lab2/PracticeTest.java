public class PracticeTest{
public static void main(String[] args){
Practice s1=new Practice();
s1.publicAge=15;
System.out.println("Public Age: "+s1.publicAge+"\n");
s1.publicAge=-10;
System.out.println("Public Age after invalid update: "+s1.publicAge+"\n");

s1.setName("Humna");
s1.setPrivateAge(15);
s1.setMarks(95);
System.out.println("Name: "+s1.getName()+"\n");
System.out.println("Private Age: "+s1.getPrivateAge()+"\n");
System.out.println("Marks: "+s1.getMarks()+"\n");

s1.setPrivateAge(-5);
s1.setMarks(150);
System.out.println("Private Age after invalid update: "+s1.getPrivateAge()+"\n");
System.out.println("Marks after invalid update: "+s1.getMarks()+"\n");

// Using arithmetic function
int sum=s1.add(10,20);
System.out.println("Sum of 10 and 20: "+sum+"\n");
}
}
