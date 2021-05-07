package sample;

import data.Variable_data;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import model.Template_Model;
import model.Variable_Model;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField name_var_t;

    @FXML
    private Button search_var_b;

    @FXML
    private TableView<Variable_Model> var_table;

    @FXML
    private TableColumn<Variable_Model, String> name_var_c;

    @FXML
    private TableColumn<Variable_Model, String> value_var_c;

    @FXML
    private Button download_template_b;

    @FXML
    private TableView<Template_Model> template_table;

    @FXML
    private TableColumn<Template_Model, String> name_template_c;

    @FXML
    private TableColumn<Template_Model, String> spec_template_c;

    @FXML
    private TextField template_var_t;

    @FXML
    private Button search_template_b;

    @FXML
    private TextField name_var_extr_t;

    @FXML
    private TextField html_var_extra_t;

    @FXML
    private TextField excel_var_extra_t;

    @FXML
    private TextArea if_html_extra;

    @FXML
    private TextArea if_excel_extra;

    @FXML
    void initialize() {
        Variable_data variable_data =new Variable_data();

        ArrayList<Variable_Model> variable_Arr = variable_data.get_data_var();
        ObservableList<Variable_Model> variable_Model = FXCollections.observableArrayList(variable_Arr);

        //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
        name_var_c.setCellValueFactory(new PropertyValueFactory<>("NameVar"));
        name_var_c.setCellFactory(TextFieldTableCell.<Variable_Model>forTableColumn());
        value_var_c.setCellValueFactory(new PropertyValueFactory<>("ValueVar"));
        value_var_c.setCellFactory(TextFieldTableCell.<Variable_Model>forTableColumn());

        //add your data to the table here.
        var_table.setItems(variable_Model);

    }

}
