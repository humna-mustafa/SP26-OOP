public class TextBook extends Book {

private String subject;
private int gradeLevel;

public TextBook(String title,String author,int pages, String subject,int gradeLevel){
super(title,author,pages);

 this.subject = subject;
 this.gradeLevel = gradeLevel;
}

public String getSubject(){
 return subject;
 }
public void setSubject(String subject){
 this.subject = subject; 
}

public int getGradeLevel(){ 
return gradeLevel;
 }
public void setGradeLevel(int gradeLevel){
 this.gradeLevel = gradeLevel; 
}

public void displayInfo(){
 super.displayInfo();
 System.out.println("subject : "+subject);
 System.out.println("grade : "+gradeLevel);
 System.out.println("\n");
}

public void showSubject(){
 System.out.println(subject);
}

public int calculateReadingLoad(){
 return super.calculateReadingLoad() + 10;
}

public String toString(){
 return super.toString()+"-"+subject;
}
}