public class VideoLesson extends LearningContent {

private String instructorName;
private int watchedMinutes;
private boolean hasSubtitles;

public VideoLesson(String title,String contentId,int durationMinutes,String instructorName,boolean hasSubtitles){
	super(title,contentId,durationMinutes);
	this.instructorName=instructorName;
	this.watchedMinutes=0;
	this.hasSubtitles=hasSubtitles; }

public String getInstructorName(){
	return this.instructorName; }

public void setInstructorName(String instructorName){
	this.instructorName=instructorName; }

public int getWatchedMinutes(){
	return this.watchedMinutes; }

public void setWatchedMinutes(int watchedMinutes){
	this.watchedMinutes=watchedMinutes; }

public boolean getHasSubtitles(){
	return this.hasSubtitles; }

public void setHasSubtitles(boolean hasSubtitles){
	this.hasSubtitles=hasSubtitles; }

@Override
public void startLearning(){
	System.out.println("Playing video lesson: "+getTitle());
	System.out.println("Instructor: "+this.instructorName);
	if(this.hasSubtitles){
		System.out.println("Subtitles are available!"); } }

@Override
public int calculateProgress(){
	if(getDurationMinutes()==0){
		return 0; }
	int progress=(this.watchedMinutes*100)/getDurationMinutes();
	return Math.min(progress,100); }

@Override
public String toString(){
	return "VideoLesson [Title="+getTitle()+", ID="+getContentId()+", Duration="+getDurationMinutes()+" mins"+", Instructor="+this.instructorName+", Watched="+this.watchedMinutes+" mins"+", Subtitles="+this.hasSubtitles+", Progress="+calculateProgress()+"%]"; }
}
