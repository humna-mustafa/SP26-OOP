public class CodingExercise extends LearningContent{
     private String programmingLanguage;
     private int totalTestCases;
     private int passedTestCases;
     private String difficultyLevel;

public CodingExercise(String title,String contentId,int durationMinutes,String programmingLanguage,int totalTestCases,String difficultyLevel){
	super(title,contentId,durationMinutes);
	this.programmingLanguage=programmingLanguage;
	this.totalTestCases=totalTestCases;
	this.passedTestCases=0;
	this.difficultyLevel=difficultyLevel; }

public String getProgrammingLanguage(){
	return this.programmingLanguage; }

public void setProgrammingLanguage(String programmingLanguage){
	this.programmingLanguage=programmingLanguage; }

public int getTotalTestCases(){
	return this.totalTestCases; }

public void setTotalTestCases(int totalTestCases){
	this.totalTestCases=totalTestCases; }

public int getPassedTestCases(){
	return this.passedTestCases; }

public void setPassedTestCases(int passedTestCases){
	this.passedTestCases=passedTestCases; }

public String getDifficultyLevel(){
	return this.difficultyLevel; }

public void setDifficultyLevel(String difficultyLevel){
	this.difficultyLevel=difficultyLevel; }

@Override
public void startLearning(){
	System.out.println("Starting coding exercise: "+getTitle());
	System.out.println("Programming Language: "+this.programmingLanguage);
	System.out.println("Difficulty: "+this.difficultyLevel);
	System.out.println("Total Test Cases: "+this.totalTestCases); }

@Override
public int calculateProgress(){
	if(this.totalTestCases==0){
	     return 0; }
	int progress=(this.passedTestCases*100)/this.totalTestCases;
	return progress; }

public void runTests(int passed){
	this.passedTestCases=passed;
	System.out.println("Test Cases Passed: "+this.passedTestCases+"/"+this.totalTestCases); }

@Override
public String toString(){
	return "CodingExercise [Title="+getTitle()+", ID="+getContentId()+", Duration="+getDurationMinutes()+" mins"+", Language="+this.programmingLanguage+", Difficulty="+this.difficultyLevel+", Tests Passed="+this.passedTestCases+"/"+this.totalTestCases+", Progress="+calculateProgress()+"%]"; }
}
