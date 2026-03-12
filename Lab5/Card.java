public class Card
{

 private final String SUIT ;
 private final String RANK;
 int value;

   Card(String s,String r,int v)
{
 SUIT=s;
   RANK=r;
value=v;
}

 public String getSUIT( )
{
 return SUIT;
}

  public String getRANK(){
return RANK;
}

public int getValue( ){
 return value;
}

public String toString( ){
return String.format("%s of %s" ,RANK ,SUIT);
}

}
