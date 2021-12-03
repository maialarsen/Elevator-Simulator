package com.company;

public class IsClosed implements ElevatorState{

    private Elevator elevator;
    private Mediator mediator;

    public IsClosed(Elevator elevator, Mediator mediator) {
        this.elevator = elevator;
        this.mediator = mediator;
    }

    @Override
    public void press1() {
        System.out.println("1 pressed");
        mediator.checkFloor(1);
        if (mediator.getIfEventOccurred()) {
            System.out.println("*ding* The elevator arrives at Floor 1");
            System.out.println("Doors are open");
            elevator.setElevatorState(elevator.getIsOpen());
        }
    }

    @Override
    public void press2() {
        System.out.println("2 pressed");
        mediator.checkFloor(2);
        if (mediator.getIfEventOccurred()) {
            System.out.println("*ding* The elevator arrives at Floor 2");
            System.out.println("Doors are open");
            elevator.setElevatorState(elevator.getIsOpen());
        }
    }

    @Override
    public void press3() {
        System.out.println("3 pressed");
        mediator.checkFloor(3);
        if (mediator.getIfEventOccurred()) {
            System.out.println("*ding* The elevator arrives at Floor 3");
            System.out.println("Doors are open");
            elevator.setElevatorState(elevator.getIsOpen());
        }
    }
}
