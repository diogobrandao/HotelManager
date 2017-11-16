package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        Guest guest = new Guest("Diogo");

        System.out.println(hotel);
        System.out.println(guest);

        guest.setHotel(hotel);

        System.out.println(hotel);
        System.out.println(guest);

        guest.guestChecksIn();

        System.out.println(hotel);
        System.out.println(guest);

        guest.guestChecksOut();

        System.out.println(hotel);
        System.out.println(guest);







    }

}
