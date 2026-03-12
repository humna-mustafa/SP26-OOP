import java.util.Random;

public class Deck 
{
 Card c[];
 private String su []={"Spades","Clubs","Hearts","Diamonds"} ;
 private String ra []={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
 private int va [] ={14,2,3,4,5,6,7,8,9,10,11,12,13};


 Deck()
{
 c = new Card[52];
 int i2=0;

for(int i=0;i<su.length;i++)
{
 for(int j=0;j<ra.length;j++)
 {
 c[i2] = new Card(  su[i] , ra[j] , va[j] );
 i2++;
 }
}
}

 public void shuffle( )
{
 Random r = new Random();

 for(int t=0;t<1000;t++)
{
 int a = r.nextInt(52);
  int b = r.nextInt(52);

 Card x = c[a];
c[a]=c[b];
   c[b]=x;
}

}

public Card drawCard( )
{
 for(int i=0;i<52;i++)
{
 if(c[i]!=null)
{
 Card temp = c[i];
 c[i]=null;
return temp;
}
}
return null;
}

}
