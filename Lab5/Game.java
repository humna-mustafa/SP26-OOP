public class Game
{

 Player p[];
 Deck d ;


Game(String n[])
{
 p = new Player[n.length];

for(int i=0;i<n.length;i++)
{
 p[i] = new Player( n[i] );
}

 d = new Deck();
 d.shuffle();

 playNow();
}


 public void playNow( )
{

 for(int r=1;r<=p.length;r++)
{
 System.out.println("Round "+r+":");

 for(int i=0;i<p.length;i++)
{
 p[i].set( d.drawCard() );
 System.out.println( p[i].name+" drew "+ p[i].cd );
}

 int mx=-1;

 for(int i=0;i<p.length;i++)
{
 if(p[i].cd.getValue()>mx)
{
  mx=p[i].cd.getValue();
}
}

 System.out.print("Round Winner: ");

 for(int i=0;i<p.length;i++)
{
 if(p[i].cd.getValue()==mx)
{
 p[i].score++;
 System.out.print( p[i].name+" " );
}
}

 System.out.println();
 System.out.println();

}
}


 public String toString( )
{
 String s="";

 for(int i=0;i<p.length;i++)
{
 s+=p[i].name+" Score = "+p[i].score+"\n";
}

 int mx=-1;
 String win="";

 for(int i=0;i<p.length;i++)
{
 if(p[i].score>mx)
{
 mx=p[i].score;
 win=p[i].name;
}
}

 s+="Final Winner: "+win;

 return s;
}

}