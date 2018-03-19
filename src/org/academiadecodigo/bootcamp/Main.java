package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        Guest guest = new Guest("Diogo");
        Hotel hotel1 = new Hotel();
        Guest guest1 = new Guest("Luis");
        Guest guest2 = new Guest("Joao");

        System.out.println(hotel);
        System.out.println(guest);


        System.out.println(hotel);
        System.out.println(guest);

        guest.guestChecksIn(hotel);
        guest1.guestChecksIn(hotel);

        System.out.println(hotel);
        System.out.println(guest);

        guest.guestChecksOut();

        System.out.println(hotel);
        System.out.println(guest);

        guest2.guestChecksIn(hotel);
        System.out.println(hotel);
        System.out.println(guest);





    }

}
