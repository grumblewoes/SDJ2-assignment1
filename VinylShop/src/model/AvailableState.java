package model;

public class AvailableState implements LendingState
{
  @Override public void click(String nextState, Vinyl vinyl)
  {
    //either to borrow or to reserve
    if (nextState.equals("borrow"))
      vinyl.setState(new BorrowedState());
    else if (nextState.equals("reserve"))
      vinyl.setState(new ReservedState());
  }
}
