public class Player
{
 String name;
 int score;
 Card cd;

 Player(String n)
{
name=n;
score=0;
}

 public void set( Card x ){
 cd=x;
 }

public String toString( ){
 return name+" "+score+" "+cd ;
  }
 }