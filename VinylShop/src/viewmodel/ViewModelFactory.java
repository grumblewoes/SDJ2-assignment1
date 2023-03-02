package viewmodel;

import model.Vinyl;

public class ViewModelFactory

{
  private ViewState viewState;
  private ManageVinylViewModel manageViewModel;
  private ListVinylViewModel listViewModel;
  private Vinyl model;

  public ViewModelFactory (Vinyl model) {
    this.viewState = new ViewState();
    this.manageViewModel = new ManageVinylViewModel(model, viewState);
    this.listViewModel = new ListVinylViewModel(model,viewState);
  }
  public ManageVinylViewModel getManageVinylViewModel() {
    return manageViewModel;
  }
  public ListVinylViewModel getListVinylViewModel() {
    return listViewModel;
  }
}
