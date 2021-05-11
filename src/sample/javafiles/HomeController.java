package sample.javafiles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HomeController implements Initializable{
    @FXML private TextField textToDo;
    @FXML private DatePicker date;
    @FXML private Button btnAdd;
    @FXML private TableView<Tasks> tableView;
    @FXML private TableColumn<Tasks, String> taskId;
    @FXML private TableColumn<Tasks, String> task;
    @FXML private TableColumn<Tasks, String> taskDate;
    @FXML private Button btnRemove;
    private int currentId = -1;

    List<Tasks>  mylist = new ArrayList<Tasks>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        task.setCellValueFactory(new PropertyValueFactory<Tasks, String>("task"));

    }

    public void addNewTask(ActionEvent actionEvent) {
        mylist.add(new Tasks(textToDo.getText()));
        tableView.getItems().setAll(init());
    }
    
    public void removeTask(ActionEvent actionEvent) {

        mylist.clear();
        tableView.getItems().setAll(init());
    }

    public List<Tasks> init() {
        List<Tasks> tasks = mylist;
        return tasks;
    }
}

