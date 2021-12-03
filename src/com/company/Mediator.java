package com.company;

public interface Mediator {
    void goUp(int floorNumber);
    void goDown(int floorNumber);
    void stay();
    void checkFloor(int floorNumber);
    boolean getIfEventOccurred();
}
