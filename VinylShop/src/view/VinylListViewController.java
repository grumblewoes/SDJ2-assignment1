package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.Region;
import model.Vinyl;
import viewmodel.ListVinylViewModel;

public class VinylListViewController
{
  @FXML private Label removeLabel;
  @FXML private  Label returnLabel;
  @FXML private Label reserveLabel;
  @FXML private Label borrowLabel;

  @FXML private TableColumn<Vinyl,String> tableColumn;

  private ListVinylViewModel vinylListViewModel;
  private Region root;
  private ViewHandler viewHandler;


  public void init(ViewHandler viewHandler, ListVinylViewModel vinylListViewModel, TableColumn tableColumn ){
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
    vinylListViewModel.reserveVinyl();
  }

  @FXML private void clickReturn(){
    vinylListViewModel.returnVinyl();
  }

  @FXML private void clickBorrow(){
    vinylListViewModel.borrowVinyl();
  }

  @FXML private void clickRemove(){
    vinylListViewModel.remove();
  }

  @FXML private void onShow(){
    viewHandler.openView("Vinyl List");
  }



}
