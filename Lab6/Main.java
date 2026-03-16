public class Main {
    public static void main(String[] args) {
        Company c=new Company("CityCinema",2);

CinemaBranch b1=new CinemaBranch("EmporiumCinema","Lahore","JoharTown",2);
CinemaBranch b2=new CinemaBranch("CentaurusCinema","Islamabad","BlueArea",1);

Movie m1=new Movie("Avengers","Action",180,"6PM");
Movie m2=new Movie("Avatar","SciFi",170,"9PM");

    Screen s1=new Screen("S1","2D",5,6,m1);
    Screen s2=new Screen("S2","IMAX",6,6,m2);

       b1.addScreen(0,s1);
        b1.addScreen(1,s2);

        Screen s3=new Screen("S3","3D",5,5,m1);
        b2.addScreen(0,s3);

        c.addBranch(0,b1);
        c.addBranch(1,b2);

       c.showCompany();
    }
}