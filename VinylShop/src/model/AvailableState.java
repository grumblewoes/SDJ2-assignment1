package model;

public class AvailableState implements LendingState
{
  @Override public void click(Vinyl vinyl)
  {
    //either to borrow or to reserve
    if (!vinyl.getBorrowedBy().equals(""))
      vinyl.setState(new BorrowedState());
    else if (!vinyl.getReservedBy().equals(""))
      vinyl.setState(new ReservedState());
  }
}
