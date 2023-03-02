package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class VinylModelManager implements VinylModel
{
  private ArrayList<Vinyl> vinylList;
  private PropertyChangeSupport property;


  public VinylModelManager(){
    vinylList = new ArrayList<>();
    property = new PropertyChangeSupport(this);

  }

  @Override public Vinyl getVinylByTitle(String title)
  {
    if(title == null) return null;

    for(Vinyl v : vinylList)
      if(title.equals(v.getTitle()))
        return v;
      return null;
  }

  @Override public void addVinyl(Vinyl v)
  {
    vinylList.add(v);
  }

  @Override public void borrowVinyl(String title, String person)
  {
    getVinylByTitle(title).setBorrowedBy(person).click();
  }

  @Override public void reserveVinyl(String title, String person)
  {
    getVinylByTitle(title).setReservedBy(person).click();
  }

  @Override public void returnVinyl(String title)
  {
    getVinylByTitle(title).setBorrowedBy(null).click();

  }

  @Override public ArrayList<Vinyl> getAllVinyls()
  {
    return vinylList;
  }

  @Override public void addListener(PropertyChangeListener listener)
  {
    property.addPropertyChangeListener(listener);
  }

  @Override public void removeListener(PropertyChangeListener listener)
  {
    property.removePropertyChangeListener(listener);
  }
}
