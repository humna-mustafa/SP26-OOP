public class Demo {

public static void main(String args[]){

 Book b = new Book("ISLAMIC BOOK","Amna",100);
 TextBook t = new TextBook("math","ali",200,"math",9);
 ScienceTextBook s = new ScienceTextBook("bio","hamza",150,"science",10,"biology",true);

 b.displayInfo();
 t.displayInfo();
 s.displayInfo();

 b.openBook();
 t.showSubject();
 s.showSubject();

 System.out.println(b.calculateReadingLoad());
 System.out.println(t.calculateReadingLoad());
 System.out.println(s.calculateReadingLoad());
}
}