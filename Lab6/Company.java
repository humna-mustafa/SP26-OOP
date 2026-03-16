class Company {
    String companyName;
    CinemaBranch[] branches;

Company(String name,int count) {
        companyName=name;
        branches=new CinemaBranch[count];
    }
 
void addBranch(int index,CinemaBranch b) {
        branches[index]=b;
    }

void showCompany() {
        System.out.println("Company:"+companyName);
        for(int i=0;i<branches.length;i++) {
            if(branches[i]!=null) {
                branches[i].showBranch();
        }
      }
    }
}
