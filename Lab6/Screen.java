class Screen {
    String screenId;
    String screenType;
    Movie movie;
    Seat[][] seats;

Screen(String id,String type,int rows,int maxCols,Movie m) {
        screenId=id;
        screenType=type;
        movie=m;
        seats=new Seat[rows][];

        int seatNo=1;
  for(int i=0;i<rows;i++) {
            int cols=maxCols-i;
            if(cols<1) cols=1;
            seats[i]=new Seat[cols];

    for(int j=0;j<cols;j++) {
         String typeSeat="Regular";
          double price=500;
            if(i>rows/2) {
                typeSeat="Premium";
                 price=800;
                }
          if(i==rows-1) {
                typeSeat="VIP";
                 price=1200;
                }
                seats[i][j]=new Seat(seatNo,i+1,typeSeat,price);
                seatNo++;
            } }
    }


    void showSeats() {
        for(int i=0;i<seats.length;i++) {
            for(int j=0;j<seats[i].length;j++) {
               System.out.print(seats[i][j].seatId + " ");
            }
            System.out.println();
        }
    }

    void showScreen() {
        System.out.println("---SCREEN DETAILS---");
        System.out.println("ID: "+screenId+" Type: "+screenType);
        movie.showMovie();
        System.out.println("Seats Layout:");
        showSeats();
        System.out.println();
    }
}