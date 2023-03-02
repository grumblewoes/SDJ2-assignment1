package viewmodel;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import model.Vinyl;
import model.VinylModel;

public class ListVinylViewModel
{
  private ObservableList<VinylViewModel> list;
  private ObjectProperty<VinylViewModel> selectedVinylProperty;
  private StringProperty errorProperty;

  private VinylModel model;
  private ViewState viewState;
  private VinylViewModel vinylViewModel;

  public void ListVinylViewModel(Vinyl model, ViewState viewState) {
    this.model = model;
    this.viewState = viewState;
    this.list = new ObservableList<VinylViewModel>();
    this.selectedVinylProperty = new SimpleObjectProperty<>();
    this.errorProperty = null;
    this.vinylViewModel = null;
  }
  public void clear() {
    list.clear();
    errorProperty.set("");
    selectedVinylProperty.set(null);
  }
  public boolean remove() {

  }
  public ObservableList<VinylViewModel> getAll() {
    return list;
  }
  public void setSelected(VinylViewModel vinylVm) {
    this.selectedVinylProperty.set(vinylVm);
  }
  public StringProperty getErrorProperty() {
    return errorProperty;
  }
  private void addVinyl(Vinyl vinyl) {
    list.add(new VinylViewModel(vinyl));
  }
  private void removeVinyl (String name) {
    list.remove(name);
  }


}
