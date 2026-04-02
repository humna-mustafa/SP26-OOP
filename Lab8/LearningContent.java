public abstract class LearningContent {
  private String title;
  private String contentId;
  protected int durationMinutes;
  private final String platform="EduLearn Platform";

public LearningContent(String title,String contentId,int durationMinutes){
	this.title=title;
	this.contentId=contentId;
	this.durationMinutes=durationMinutes; }

public String getTitle(){
	return this.title; }

public String getContentId(){
	return this.contentId; }

public int getDurationMinutes(){
	return this.durationMinutes; }

public String getPlatform(){
	return this.platform; }

public void setTitle(String title){
	this.title=title; }

public void setDurationMinutes(int durationMinutes){
	this.durationMinutes=durationMinutes; }

public abstract void startLearning();
public abstract int calculateProgress();

public void displayInfo(){
	System.out.println("Content Title: "+this.title);
	System.out.println("Content ID: "+this.contentId);
	System.out.println("Duration: "+this.durationMinutes+" minutes");
	System.out.println("Platform: "+this.platform); }

public void markAsComplete(){
	System.out.println(this.title+" has been marked as complete!"); }

public final void showPlatformInfo(){
	System.out.println("Welcome to "+this.platform);
	System.out.println("Your trusted learning partner!"); }
}
