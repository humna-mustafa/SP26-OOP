public class Book {

private String title;
private String author;
private int pages;

public Book(String title , String author , int pages){
 this.title = title;
 this.author = author;
 this.pages = pages;
}

public String getTitle(){
return title;}

public void setTitle(String title){ 
this.title = title;}

public String getAuthor(){ 
return author;}

public void setAuthor(String author){ 
this.author = author;}

public int getPages(){ 
return pages;}

public void setPages(int pages){ 
this.pages = pages; }

public void displayInfo(){
 System.out.println("title : "+title);
 System.out.println("author : "+author);
 System.out.println("pages : "+pages);
 System.out.println("\n");
}

public int calculateReadingLoad(){
 return pages*2;
}

public String toString(){
 return title+"-"+author;
}

public void openBook(){
 System.out.println("book opened");
}
}