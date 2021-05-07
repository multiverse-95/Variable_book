package sample;

import controller.Template_Controller;
import data.Template_data;
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

        Template_data template_data= new Template_data();
        ArrayList<Template_Model> template_Arr = template_data.get_data_template();
        ObservableList<Template_Model> template_model = FXCollections.observableArrayList(template_Arr);

        //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
        name_template_c.setCellValueFactory(new PropertyValueFactory<>("NameTemplate"));
        name_template_c.setCellFactory(TextFieldTableCell.<Template_Model>forTableColumn());
        spec_template_c.setCellValueFactory(new PropertyValueFactory<>("SpecTemplate"));
        spec_template_c.setCellFactory(TextFieldTableCell.<Template_Model>forTableColumn());

        //add your data to the table here.
        template_table.setItems(template_model);



        download_template_b.setOnAction(event -> {
            if (template_table.getSelectionModel().getSelectedItem() == null){
                Alert alert =new Alert(Alert.AlertType.WARNING , "Test");
                alert.setTitle("Шаблон не выбран");
                alert.setHeaderText("Необходимо выбрать шаблон!");
                alert.setContentText("Выберите шаблон из списка и попробуйте снова.");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK){

                    }

                });
                System.out.println("NOT_SELECTED CHABLON!");
            } else {
                Template_Model template_model_t = template_table.getSelectionModel().getSelectedItem();
                String name_template=template_model_t.getCodeNameTemplate();
                String html_code_template=template_model_t.getHtmlCodeTemplate();
                Template_Controller template_controller =new Template_Controller();
                template_controller.Download_template(name_template, html_code_template);
            }

        });

        Generate_variables();

    }

    public void Generate_variables(){
        if_html_extra.setWrapText(true);
        if_excel_extra.setWrapText(true);
        name_var_extr_t.textProperty().addListener((observable, oldValue, newValue) -> {
            String name_var_extr=name_var_extr_t.getText();
            if (name_var_extr.length()==0){
                name_var_extr_t.setStyle("-fx-background-color: #FFF0F0;-fx-border-color: #DBB1B1;");
                html_var_extra_t.setText("");
                excel_var_extra_t.setText("");
                if_html_extra.setText("");
                if_excel_extra.setText("");
            } else
                {
                    name_var_extr_t.setStyle("");
                    html_var_extra_t.setText("${form."+name_var_extr+"!''}");
                    excel_var_extra_t.setText("${form."+name_var_extr+"}");
                    if_html_extra.setText("Пример с наличием контента:\n <#if form."+name_var_extr+"?has_content>Какое-то значение</#if>");
                    if_excel_extra.setText("${form."+name_var_extr+" == 'Какое то значение или переменная' ? 'Значение'+form."+name_var_extr+" : ''}");
                }
        });
    }

}
