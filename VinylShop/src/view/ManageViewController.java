package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;

public class ManageViewController
{
  @FXML private Label reserveLabel;
  @FXML private Label borrowLabel;

  private ManageViewModel manageViewModel;
  private ViewHandler viewHandler;
  private Region root;


  public void init(ViewHandler viewHandler, ManageViewModel manageViewModel, Region root){
    this.root = root;
    this.viewHandler = viewHandler;
    this.manageViewModel = manageViewModel;
    reserveLabel.textProperty().bindBidirectional(manageViewModel.requestProperty());
    borrowLabel.textProperty().bindBidirectional(manageViewModel.requestProperty());

  }

  public Region getRoot(){
    return root;
  }

  @FXML private void clickReserve(){
    manageViewModel.reserve();
  }

  @FXML private void clickBorrow(){
    manageViewModel.borrow();
  }

  @FXML private void onShow(){
    viewHandler.openView("Manage");
  }
}
