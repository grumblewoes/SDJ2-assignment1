package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.Region;

public class VinylListViewController
{
  @FXML private Label removeLabel;
  @FXML private  Label returnLabel;
  @FXML private Label reserveLabel;
  @FXML private Label borrowLabel;

  @FXML private TableColumn<,>

  private VinylListViewModel vinylListViewModel;
  private Region root;
  private ViewHandler viewHandler;


  public void init(ViewHandler viewHandler, VinylListViewModel vinylListViewModel, TableColumn tableColumn ){
    this.root = root;
    this.viewHandler = viewHandler;
    this.vinylListViewModel = vinylListViewModel;
    this.tableColumn = tableColumn;
    removeLabel.textProperty().bindBidirectional(vinylListViewModel.requestProperty());
    borrowLabel.textProperty().bindBidirectional(vinylListViewModel.requestProperty());
    reserveLabel.textProperty().bindBidirectional(vinylListViewModel.requestProperty());
    returnLabel.textProperty().bindBidirectional(vinylListViewModel.requestProperty());
  }

  public Region getRoot(){
    return root;
  }

  @FXML private void clickReserve(){
    vinylListViewModel.reserve();
  }

  @FXML private void clickReturn(){
    vinylListViewModel.reserve();
  }

  @FXML private void clickBorrow(){
    vinylListViewModel.borrow();
  }

  @FXML private void clickRemove(){
    vinylListViewModel.remove();
  }

  @FXML private void onShow(){
    viewHandler.openView("Vinyl List");
  }



}
