package org.academiadecodigo.bootcamp;

public class Guest {

    private String name;
    private Hotel hotel;
    private int roomNumber = -1;

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;

    }

    public void guestChecksIn() {
        roomNumber = hotel.checkIn(); // private mas dentro da class podemos aceder


    }

    public void guestChecksOut(){
        roomNumber = hotel.checkOut(roomNumber);


    }

    public void setHotel(Hotel hotel){
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

