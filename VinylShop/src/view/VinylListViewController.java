package view;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.Vinyl;
import viewmodel.ListVinylViewModel;

public class VinylListViewController
{

  @FXML private TableView<Vinyl> vinylTable;
  @FXML private TableColumn<Vinyl,String> titleColumn;

  @FXML private TableColumn<Vinyl,String> artistColumn;

  @FXML private TableColumn<Vinyl,String> yearColumn;

  @FXML private TableColumn<Vinyl,String> statusColumn;




  private ListVinylViewModel vinylListViewModel;
  private Region root;
  private ViewHandler viewHandler;

  @FXML private Label removeLabel;
  @FXML private Label borrowLabel;
  @FXML private Label reserveLabel;
  @FXML private Label returnLabel;


  public void init(ViewHandler viewHandler, ListVinylViewModel vinylListViewModel,Region root ){
    this.root = root;
    this.viewHandler = viewHandler;
    this.vinylListViewModel = vinylListViewModel;
    removeLabel.textProperty().bindBidirectional(vinylListViewModel.requestProperty());
    borrowLabel.textProperty().bindBidirectional(vinylListViewModel.requestProperty());
    reserveLabel.textProperty().bindBidirectional(vinylListViewModel.requestProperty());
    returnLabel.textProperty().bindBidirectional(vinylListViewModel.requestProperty());


  }

  public Region getRoot(){
    return root;
  }

  @FXML private void clickReserve(){
    viewHandler.openView("Reserve");
  }

  @FXML private void clickReturn(){
    vinylListViewModel.
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
