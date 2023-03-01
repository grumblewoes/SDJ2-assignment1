package model;

public class ReservedState implements LendingState
{
  @Override public void click(String nextState, Vinyl vinyl)
  {
    vinyl.setState(new BorrowedState());
  }
}
