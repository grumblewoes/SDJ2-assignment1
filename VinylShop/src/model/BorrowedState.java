package model;

public class BorrowedState implements LendingState
{
  @Override public void click(String nextState, Vinyl vinyl)
  {
    if (nextState.equals("available"))
      vinyl.setState(new AvailableState());
    else if (nextState.equals("reserve"))
      vinyl.setState(new ReservedWhileBorrowedState());

  }
}
