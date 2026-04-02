public class FlashCardSet extends LearningContent{
    private int totalCards;
    private int reviewedCards;
    private String subject;
    private boolean isShuffled;

public FlashCardSet(String title,String contentId,int durationMinutes,int totalCards,String subject){
    super(title,contentId,durationMinutes);
       this.totalCards=totalCards;
       this.reviewedCards=0;
       this.subject=subject;
       this.isShuffled=false; }

public int getTotalCards(){
	return this.totalCards; }

public void setTotalCards(int totalCards){
	this.totalCards=totalCards; }

public int getReviewedCards(){
	return this.reviewedCards; }

public void setReviewedCards(int reviewedCards){
	this.reviewedCards=reviewedCards; }

public String getSubject(){
	return this.subject; }

public void setSubject(String subject){
	this.subject=subject; }

public boolean getIsShuffled(){
	return this.isShuffled; }

public void setIsShuffled(boolean isShuffled){
	this.isShuffled=isShuffled; }

@Override
public void startLearning(){
       System.out.println("Opening flashcard set: "+getTitle());
	System.out.println("Subject: "+this.subject);
	System.out.println("Total Cards: "+this.totalCards);
	if(this.isShuffled){
	    System.out.println("Cards are shuffled!"); }
       else{
          System.out.println("Cards are in order."); } }

@Override
public int calculateProgress(){
    if(this.totalCards==0){
	return 0; }
    int progress=(this.reviewedCards*100)/this.totalCards;
	return progress; }

public void shuffleCards(){
	this.isShuffled=true;
	System.out.println("Cards have been shuffled!"); }

public void reviewCard(){
	if(this.reviewedCards<this.totalCards){
	   this.reviewedCards++;
	   System.out.println("Card reviewed! ("+this.reviewedCards+"/"+this.totalCards+")"); }
	else{
	   System.out.println("All cards have been reviewed!"); } }

@Override
public String toString(){
	return "FlashCardSet [Title="+getTitle()+", ID="+getContentId()+", Duration="+getDurationMinutes()+" mins"+", Subject="+this.subject+", Cards Reviewed="+this.reviewedCards+"/"+this.totalCards+", Shuffled="+this.isShuffled+", Progress="+calculateProgress()+"%]"; }
}
