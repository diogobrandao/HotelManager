package org.academiadecodigo.bootcamp;

public class Guest {

    private String name;
    private Hotel hotel;
    private int roomNumber = -1;

    public Guest(String name) {
        this.name = name;
    }




    public void guestChecksIn(Hotel hotel) {
        if(roomNumber != -1){
            System.out.println("You're already checked in");
            return;
        }
        roomNumber = hotel.checkIn(); // its private but since its inside of the class it can be acessed
        this.hotel = hotel;

    }

    public void guestChecksOut(Hotel hotel){
        if(roomNumber == -1) {
            System.out.println("You cant check out because you never checked in");
            return;

        }
        roomNumber = hotel.checkOut(roomNumber);
        this.hotel = hotel;


    }



    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", hotel=" + hotel +
                ", roomNumber=" + roomNumber +
                '}';
    }
}

