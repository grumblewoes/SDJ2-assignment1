package view;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import viewmodel.ManageVinylViewModel;

public class ManageViewController
{
 @FXML private Label reserveLabel;
 @FXML private Label borrowLabel;

 @FXML private Label nameField;

  private ManageVinylViewModel manageVinylViewModel;
  private ViewHandler viewHandler;
  private Region root;


  public void init(ViewHandler viewHandler, ManageVinylViewModel manageVinylViewModel, Region root){
    this.root = root;
    this.viewHandler = viewHandler;
    this.manageVinylViewModel = manageVinylViewModel;
    reserveLabel.textProperty().bindBidirectional(manageVinylViewModel.requestProperty());
    borrowLabel.textProperty().bindBidirectional(manageVinylViewModel.requestProperty());
    nameField.textProperty().bindBidirectional(manageVinylViewModel.requestProperty());
//reset needs to be called
    // init too
  }

  public Region getRoot(){
    return root;
  }

  @FXML private void clickReserve(Event event){
      if (event.getSource()==nameField){
          manageVinylViewModel.reserve();
      }
      System.out.println("Same client can't reserved two times in a row");

  }

  @FXML private void clickBorrow(Event event){
      if(event.getSource()==nameField){
          manageVinylViewModel.borrow();
      }
      System.out.println("Same client can't borrowed two times in a row");
  }

  @FXML private void goBack(){
    viewHandler.openView("Vinyl List");
  }

  public void reset() {
    manageVinylViewModel.reset();
  }
}
