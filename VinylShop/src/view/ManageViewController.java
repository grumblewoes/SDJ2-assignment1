package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import viewmodel.ManageVinylViewModel;

public class ManageViewController
{
  @FXML private Label reserveLabel;
  @FXML private Label borrowLabel;

  private ManageVinylViewModel manageVinylViewModel;
  private ViewHandler viewHandler;
  private Region root;


  public void init(ViewHandler viewHandler, ManageVinylViewModel manageVinylViewModel, Region root){
    this.root = root;
    this.viewHandler = viewHandler;
    this.manageVinylViewModel = manageVinylViewModel;
    reserveLabel.textProperty().bindBidirectional(manageViewModel.requestProperty());
    borrowLabel.textProperty().bindBidirectional(manageViewModel.requestProperty());

  }

  public Region getRoot(){
    return root;
  }

  @FXML private void clickReserve(){
    manageVinylViewModel.reserve();
  }

  @FXML private void clickBorrow(){
    manageVinylViewModel.borrow();
  }

  @FXML private void onShow(){
    viewHandler.openView("Manage");
  }
}