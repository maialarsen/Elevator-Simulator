package com.company;

public class FloorMediator implements Mediator{
    private int currentFloor;
    private boolean eventOccurred;

    public FloorMediator() {
        currentFloor = 1;
        eventOccurred = true;
    }

    @Override
    public void goUp(int floorNumber) {
        System.out.println("Going up...");
        currentFloor = floorNumber;
        eventOccurred = true;
    }

    @Override
    public void goDown(int floorNumber) {
        System.out.println("Going down...");
        currentFloor = floorNumber;
        eventOccurred = true;
    }

    @Override
    public void stay() {
        System.out.println("Nothing happens");
        eventOccurred = false;
    }

    @Override
    public void checkFloor(int floorNumber) {
        if (currentFloor == floorNumber)
            stay();
        else if (currentFloor < floorNumber)
            goUp(floorNumber);
        else
            goDown(floorNumber);
    }
    
    public boolean getIfEventOccurred() {
        return eventOccurred;
    }
}
