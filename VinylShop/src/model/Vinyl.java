package model;

public class Vinyl
{
  private String title, artist, status, reservedBy, borrowedBy;
  private int year;
  private boolean pendingRemoval;

  private LendingState state;

  public Vinyl(String title, String artist, int year) {
    this.title = title;
    this.artist = artist;
    this.year = year;

    status = "available";
    reservedBy = null;
    borrowedBy = null;
    pendingRemoval = false;
    state = new AvailableState();
  }

  public void setState(LendingState state) {
    this.state = state;
  }

  public void click()
  {
    state.click(this);
  }

  public String getTitle() { return title; }

  public String getArtist() { return artist; }

  public int getYear() { return year; }

  public String getStatus() { return status; }

  public void setStatus(String status) { this.status = status; }

  public boolean isPendingRemoval() { return pendingRemoval; }

  public void setPendingRemoval(boolean remove) { this.pendingRemoval = remove; }

  public String getReservedBy() { return reservedBy; }

  public Vinyl setReservedBy(String who) {
    if (pendingRemoval)
      throw new IllegalStateException("You cannot reserve a vinyl that is pending removal.");
    //if it is already reserved
    else if (!reservedBy.equals(null))
      throw new IllegalStateException("You cannot reserve a vinyl that is already reserved by somebody else.");
    reservedBy = who;
    return this;
  }

  public Vinyl setBorrowedBy(String who) {
    //if it is reserved and the person trying to borrow is not the one who reserved it
    if (!reservedBy.equals(null) && !reservedBy.equals(who))
      throw new IllegalStateException("The person who reserved the vinyl must be the one to borrow it.");
    borrowedBy = who;
    return this;
  }

  public String getBorrowedBy() { return borrowedBy; }
}
