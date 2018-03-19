package org.academiadecodigo.bootcamp;

import java.util.Arrays;

public class Hotel {



    private Room[] room;

    public Hotel() {
        this.room = new Room[4];
        for(int num = 0; num < 4; num++) {
            room[num] = new Room(num+1);

        }

    }

    public int checkAvailability () {
        for(int num = 0; num < 4; num++){
            if(room[num].getEmpty()){


                return num;
            }

        }
        return -1;
    }

    public int checkIn() {

        int available = checkAvailability();

        if(available < 0) {
            System.out.println("Theres no rooms!");
            return -1;
        }

        room[available].occupy();
        System.out.println("you got room number: " + room[available].getRoomnumber());
        return available;
    }

    public int checkOut(int roomNumber) {  //vamos devolver o roomNumber
        room[roomNumber].emptyRoom();
        return -1;

    }


    @Override
    public String toString() {
        return "Hotel{" +
                "room=" + Arrays.toString(room) +
                '}';
    }
}









