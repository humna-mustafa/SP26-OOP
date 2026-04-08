class CinemaBranch {
    String branchName;
    String city;
    String address;
    Screen[] screens;

CinemaBranch(String name,String c,String add,int count) {
        branchName=name;
        city=c;
        address=add;
        screens=new Screen[count];
      }
 void addScreen(int index,Screen s) {
        screens[index]=s;
    }

void showBranch() {
    System.out.println("Branch Name: " + branchName);
    System.out.println("Location: " + city + ", " + address);
    for(int i=0; i<screens.length; i++) {
        if(screens[i]!=null) {
            screens[i].showScreen();
        }
    }
}}