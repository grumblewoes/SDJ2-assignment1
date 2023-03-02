package model;

public class BorrowedState implements LendingState
{
  @Override public void click(Vinyl vinyl)
  {
    if (vinyl.getBorrowedBy().equals(""))
      vinyl.setState(new AvailableState());
    else if (!vinyl.getReservedBy().equals(""))
      vinyl.setState(new ReservedWhileBorrowedState());

  }
}
