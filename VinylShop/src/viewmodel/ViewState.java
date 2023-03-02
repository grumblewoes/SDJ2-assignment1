package viewmodel;

import model.Vinyl;

public class ViewState
{
 private Vinyl vinyl;

  public ViewState() {
    this.vinyl = null;
  }
  public Vinyl getVinyl() {
    return vinyl;
  }
  public void setVinyl(Vinyl vinyl) {
    this.vinyl = vinyl;
  }


}
