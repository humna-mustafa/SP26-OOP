class Seat {
    int seatId;
    int row;
    String seatType;
    double price;
    boolean booked;

Seat(int id, int r, String type, double p) {
       seatId=id;
       row=r;
       seatType=type;
       price=p;
       booked=false;
    }

void bookSeat() {
      booked=true;
   }

void showSeat() {
      System.out.println("Seat:"+seatId+" Row:"+row+" Type:"+seatType+" Price:"+price+" Booked:"+booked);
    }
}