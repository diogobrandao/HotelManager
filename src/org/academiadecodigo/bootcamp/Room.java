package org.academiadecodigo.bootcamp;

public class Room {


    private boolean empty;
    private int roomNumber;


    public boolean getEmpty() {
        return this.empty;
    }

    public void occupy() {
        empty = false;
    }

    public void emptyRoom() {
        empty = true;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.empty = true;
    }

    @Override
    public String toString() {
        return "Room{" +
                "empty=" + empty +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
