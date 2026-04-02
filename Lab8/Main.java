public class Main{

public static void main(String[] args){

System.out.println("==============================================");
System.out.println("   LEARNING CONTENT MANAGEMENT SYSTEM");
System.out.println("==============================================\n");

VideoLesson video1=new VideoLesson("Java Basics","VID001",45,"Sir Ahmed",true);
CodingExercise coding1=new CodingExercise("Array Problems","CODE001",30,"Java",10,"Medium");
FlashCardSet flashcard1=new FlashCardSet("OOP Concepts","FLASH001",20,25,"Programming");

System.out.println("--- UPCASTING ---");
LearningContent content1=new VideoLesson("Python Tutorial","VID002",60,"Miss Sara",false);
LearningContent content2=new CodingExercise("Loop Exercise","CODE002",25,"Python",8,"Easy");
LearningContent content3=new FlashCardSet("Data Structures","FLASH002",15,30,"Computer Science");
System.out.println("Upcasting done!\n");

System.out.println("--- ARRAY OF PARENT REFERENCES ---");
LearningContent[] contentList={content1,content2,content3,video1,coding1,flashcard1};
System.out.println("Array created with "+contentList.length+" items\n");

System.out.println("==============================================");
System.out.println("   BEFORE MODIFICATION");
System.out.println("==============================================\n");

for(int i=0;i<contentList.length;i++){
	System.out.println("Content "+(i+1)+":");
	System.out.println(contentList[i].toString());
	System.out.println(); }

System.out.println("--- FINAL METHOD ---");
content1.showPlatformInfo();
System.out.println();

System.out.println("--- RUNTIME POLYMORPHISM ---");
for(int i=0;i<contentList.length;i++){
	System.out.println("\nStarting content "+(i+1)+":");
	contentList[i].startLearning(); }

System.out.println();

System.out.println("==============================================");
System.out.println("   LOOP 1: UPDATING WITH INSTANCEOF");
System.out.println("==============================================\n");

for(int i=0;i<contentList.length;i++){
if(contentList[i] instanceof VideoLesson){
	VideoLesson video=(VideoLesson)contentList[i];
	video.setWatchedMinutes(30);
	System.out.println("Updated VideoLesson watched minutes to 30"); }

if(contentList[i] instanceof CodingExercise){
	CodingExercise exercise=(CodingExercise)contentList[i];
	exercise.setPassedTestCases(6);
	System.out.println("Updated CodingExercise passed test cases to 6"); }

if(contentList[i] instanceof FlashCardSet){
	FlashCardSet flashcard=(FlashCardSet)contentList[i];
	flashcard.setReviewedCards(15);
	System.out.println("Updated FlashCardSet reviewed cards to 15"); } }

System.out.println();

System.out.println("==============================================");
System.out.println("   LOOP 2: CONDITIONAL UPDATE WITH INSTANCEOF");
System.out.println("==============================================\n");

for(int i=0;i<contentList.length;i++){
if(contentList[i] instanceof VideoLesson){
	VideoLesson video=(VideoLesson)contentList[i];
	if(video.getDurationMinutes()>50){
		video.setHasSubtitles(true);
		System.out.println("VideoLesson '"+video.getTitle()+"' - Subtitles enabled"); }
	else{
		System.out.println("VideoLesson '"+video.getTitle()+"' - No change needed"); } }

if(contentList[i] instanceof CodingExercise){
	CodingExercise exercise=(CodingExercise)contentList[i];
	if(exercise.calculateProgress()>50){
		exercise.setDifficultyLevel("Hard");
		System.out.println("CodingExercise '"+exercise.getTitle()+"' - Changed to Hard"); }
	else{
		System.out.println("CodingExercise '"+exercise.getTitle()+"' - Difficulty unchanged"); } }

if(contentList[i] instanceof FlashCardSet){
	FlashCardSet flashcard=(FlashCardSet)contentList[i];
   if(flashcard.getTotalCards()>20){
	  flashcard.setIsShuffled(true);
	  System.out.println("FlashCardSet '"+flashcard.getTitle()+"' - Cards shuffled"); }
	else{
	  System.out.println("FlashCardSet '"+flashcard.getTitle()+"' - Not shuffled"); } } 
}
System.out.println();


System.out.println("--- DOWNCASTING ---");
LearningContent testContent=contentList[0];
if(testContent instanceof VideoLesson){
	VideoLesson downcastedVideo=(VideoLesson)testContent;
	System.out.println("Downcasting successful!");
	System.out.println("Instructor: "+downcastedVideo.getInstructorName()); 
}
System.out.println();


System.out.println("==============================================");
System.out.println("   AFTER MODIFICATION");
System.out.println("==============================================\n");

for(int i=0;i<contentList.length;i++){
	System.out.println("Content "+(i+1)+":");
	System.out.println(contentList[i].toString());
	System.out.println("Progress: "+contentList[i].calculateProgress()+"%");
	System.out.println(); }


System.out.println("--- CONCRETE METHODS ---");
content1.displayInfo();
System.out.println();
content1.markAsComplete();
System.out.println();

System.out.println("--- GETTER AND SETTER ---");
System.out.println("Original Instructor: "+video1.getInstructorName());
video1.setInstructorName("Dr. Khan");
System.out.println("Updated Instructor: "+video1.getInstructorName());
System.out.println();

System.out.println("==============================================");
System.out.println("   PROGRAM COMPLETED!");
System.out.println("=============================================="); 
}
}
