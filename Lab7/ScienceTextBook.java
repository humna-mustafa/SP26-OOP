public class ScienceTextBook   extends TextBook {

private String branch;
private boolean labRequired;

public ScienceTextBook(String title,String author,int pages,
String subject,int gradeLevel , String branch , boolean labRequired){

 super(title,author,pages,subject,gradeLevel);

 this.branch = branch;
 this.labRequired = labRequired;
}

public String getBranch(){
return branch;}

public void setBranch(String branch){
this.branch=branch;}

public boolean getLabRequired(){
 return labRequired; }

public void setLabRequired(boolean labRequired){
 this.labRequired = labRequired; }

public void displayInfo(){
 super.displayInfo();
 System.out.println("branch : "+branch);
 System.out.println("lab required : "+labRequired);
 System.out.println("\n");
}

public void showSubject(){
 super.showSubject(); 
 System.out.println(branch);
}

public int calculateReadingLoad(){
 return super.calculateReadingLoad()+20;
}

public String toString(){
 return super.toString()+"-"+branch;
}
}