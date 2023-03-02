package model;

public class ReservedWhileBorrowedState implements LendingState
{
  @Override public void click(String nextState, Vinyl vinyl)
  {
    vinyl.setState(new ReservedState());
  }
}
