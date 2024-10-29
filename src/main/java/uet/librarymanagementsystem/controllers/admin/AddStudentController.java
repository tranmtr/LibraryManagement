package uet.librarymanagementsystem.controllers.admin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddStudentController implements Initializable {

    @FXML
    private TextField fieldBirthdayStudent;

    @FXML
    private TextField fieldEmailStudent;

    @FXML
    private TextField fieldIDStudent;

    @FXML
    private TextField fieldNameStudent;

    @FXML
    private TextField fieldPasswordStudent;

    @FXML
    private TextField fieldPhoneStudent;

    @FXML
    private TableView<?> searchStudentTableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
