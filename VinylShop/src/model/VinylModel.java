package model;

import utility.observer.javaobserver.UnnamedPropertyChangeSubject;

public interface VinylModel extends UnnamedPropertyChangeSubject
{
  Vinyl getVinylByTitle(String title);
  void addVinyl(Vinyl v);
  void borrowVinyl(String title, String person);
  void reserveVinyl(String title, String person);
  void returnVinyl(String title);
  ArrayList<Vinyl> getAllVinyls();

}
