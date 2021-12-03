package com.company;

public class IsOpen implements ElevatorState{

    private Elevator elevator;
    private Mediator mediator;

    public IsOpen(Elevator elevator, Mediator mediator) {
        this.elevator = elevator;
        this.mediator = mediator;
    }

    @Override
    public void press1() {
        System.out.println("1 pressed");
        System.out.println("Doors are closed");
        elevator.setElevatorState(elevator.getIsClosed());
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
        System.out.println("Doors are closed");
        elevator.setElevatorState(elevator.getIsClosed());
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
        System.out.println("Doors are closed");
        elevator.setElevatorState(elevator.getIsClosed());
        mediator.checkFloor(3);
        if (mediator.getIfEventOccurred()) {
            System.out.println("*ding* The elevator arrives at Floor 3");
            System.out.println("Doors are open");
            elevator.setElevatorState(elevator.getIsOpen());
        }
    }
}
