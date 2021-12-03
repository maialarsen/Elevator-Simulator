package com.company;

public class Elevator {
    private ElevatorState elevatorState;
    private Mediator mediator;

    private ElevatorState isOpen;
    private ElevatorState isClosed;

    public Elevator() {
        mediator = new FloorMediator();
        isOpen = new IsOpen(this, mediator);
        isClosed = new IsClosed(this, mediator);

        elevatorState = isOpen;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public void press1() {
        elevatorState.press1();
    }

    public void press2() {
        elevatorState.press2();
    }

    public void press3() {
        elevatorState.press3();
    }

    public ElevatorState getIsOpen() {
        return isOpen;
    }

    public ElevatorState getIsClosed() {
        return isClosed;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }
}
