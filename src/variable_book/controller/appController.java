package variable_book.controller;

import javafx.scene.layout.HBox;
import variable_book.controller.Template_Controller;
import variable_book.data.Template_data;
import variable_book.data.Variable_data;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import variable_book.model.Template_Model;
import variable_book.model.Variable_Model;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class appController {
    // Переменные для графических элементов
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

    // Инициализация графического интерфейса
    @FXML
    void initialize() {
        Create_Variable_Table(); // Вызов функции создания таблицы переменных
        Create_Template_table(); // Вызов функции создания таблицы шаблонов
        Generate_variables(); // Вызов функции генерации переменных

    }

    // Функция заполнения таблицы переменных
    public void Create_Variable_Table(){
        // Заполнение таблицы данными о переменных
        Variable_data variable_data =new Variable_data();

        ArrayList<Variable_Model> variable_Arr = variable_data.get_data_var();
        ObservableList<Variable_Model> variable_Model = FXCollections.observableArrayList(variable_Arr);

        // Заполнение столбцов
        name_var_c.setCellValueFactory(new PropertyValueFactory<>("NameVar"));
        name_var_c.setCellFactory(TextFieldTableCell.<Variable_Model>forTableColumn());
        value_var_c.setCellValueFactory(new PropertyValueFactory<>("ValueVar"));
        value_var_c.setCellFactory(TextFieldTableCell.<Variable_Model>forTableColumn());

        // Добавление данных в таблицу
        var_table.setItems(variable_Model);

        // Поиск в таблице переменных
        search_var_b.setOnAction(event -> {
            String search_text=name_var_t.getText().toLowerCase();
            ArrayList<Variable_Model> var_arr_find= Search_Variables(variable_Arr,search_text);
            System.out.println("TEST SEARCH 111 "+ name_var_t.getText());


            var_table.setPlaceholder(new Label("Ничего не найдено!"));

            ObservableList<Variable_Model> variable_Model_find = FXCollections.observableArrayList(var_arr_find);

            // Заполнение столбцов данными по найденному запросу
            name_var_c.setCellValueFactory(new PropertyValueFactory<>("NameVar"));
            name_var_c.setCellFactory(TextFieldTableCell.<Variable_Model>forTableColumn());
            value_var_c.setCellValueFactory(new PropertyValueFactory<>("ValueVar"));
            value_var_c.setCellFactory(TextFieldTableCell.<Variable_Model>forTableColumn());

            // Добавление данных в таблицу
            var_table.setItems(variable_Model_find);
        });

        // Добавление ивента на кнопку Enter с поиском
        name_var_t.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER)  {
                    String search_text=name_var_t.getText().toLowerCase();
                    ArrayList<Variable_Model> var_arr_find= Search_Variables(variable_Arr,search_text);
                    System.out.println("TEST SEARCH 111 "+ name_var_t.getText());


                    var_table.setPlaceholder(new Label("Ничего не найдено!"));

                    ObservableList<Variable_Model> variable_Model_find = FXCollections.observableArrayList(var_arr_find);

                    // Заполнение столбцов данными по найденному запросу
                    name_var_c.setCellValueFactory(new PropertyValueFactory<>("NameVar"));
                    name_var_c.setCellFactory(TextFieldTableCell.<Variable_Model>forTableColumn());
                    value_var_c.setCellValueFactory(new PropertyValueFactory<>("ValueVar"));
                    value_var_c.setCellFactory(TextFieldTableCell.<Variable_Model>forTableColumn());

                    // Добавление данных в таблицу
                    var_table.setItems(variable_Model_find);
                }
            }
        });
    }

    // Функция заполнения таблицы шаблонов
    public void Create_Template_table(){
        // Заполнение таблицы данными о шаблонах
        Template_data template_data= new Template_data();
        ArrayList<Template_Model> template_Arr = template_data.get_data_template();
        ObservableList<Template_Model> template_model = FXCollections.observableArrayList(template_Arr);

        // Заполнение столбцов данными
        name_template_c.setCellValueFactory(new PropertyValueFactory<>("NameTemplate"));
        name_template_c.setCellFactory(TextFieldTableCell.<Template_Model>forTableColumn());
        spec_template_c.setCellValueFactory(new PropertyValueFactory<>("SpecTemplate"));
        spec_template_c.setCellFactory(TextFieldTableCell.<Template_Model>forTableColumn());

        // Добавление данных в таблицу
        template_table.setItems(template_model);

        // Создание ивента на кнопку скачивания шаблона
        download_template_b.setOnAction(event -> {Download_template();});
        // Ивент на двойной клик по элементу таблицы
        template_table.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
                    Download_template();
                }
            }
        });


        // Ивент на поиск по таблице
        search_template_b.setOnAction(event -> {
            String search_text=template_var_t.getText().toLowerCase();
            ArrayList<Template_Model> templ_arr_find= Search_Templates(template_Arr,search_text);
            System.out.println("TEST SEARCH 111 "+ template_var_t.getText());


            template_table.setPlaceholder(new Label("Ничего не найдено!"));

            ObservableList<Template_Model> template_model_find = FXCollections.observableArrayList(templ_arr_find);

            // Заполнение столбцов данными
            name_template_c.setCellValueFactory(new PropertyValueFactory<>("NameTemplate"));
            name_template_c.setCellFactory(TextFieldTableCell.<Template_Model>forTableColumn());
            spec_template_c.setCellValueFactory(new PropertyValueFactory<>("SpecTemplate"));
            spec_template_c.setCellFactory(TextFieldTableCell.<Template_Model>forTableColumn());

            // Добавление данных в таблицу
            template_table.setItems(template_model_find);
            // Ивент на загрузку шаблона
            download_template_b.setOnAction(event2 -> {Download_template();});
            // Ивент на двойной клик шаблона
            template_table.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
                        Download_template();
                    }
                }
            });
        });

        // Ивент на кнопку Enter
        template_var_t.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER)  {
                    String search_text=template_var_t.getText().toLowerCase();
                    ArrayList<Template_Model> templ_arr_find= Search_Templates(template_Arr,search_text);
                    System.out.println("TEST SEARCH 111 "+ template_var_t.getText());


                    template_table.setPlaceholder(new Label("Ничего не найдено!"));

                    ObservableList<Template_Model> template_model_find = FXCollections.observableArrayList(templ_arr_find);
                    // Заполнение столбцов
                    name_template_c.setCellValueFactory(new PropertyValueFactory<>("NameTemplate"));
                    name_template_c.setCellFactory(TextFieldTableCell.<Template_Model>forTableColumn());
                    spec_template_c.setCellValueFactory(new PropertyValueFactory<>("SpecTemplate"));
                    spec_template_c.setCellFactory(TextFieldTableCell.<Template_Model>forTableColumn());

                    // Заполнение таблицы
                    template_table.setItems(template_model_find);
                    // Ивент на загрузку шаблона
                    download_template_b.setOnAction(event2 -> {Download_template();});
                    // Ивент на двойной клик
                    template_table.setOnMousePressed(new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
                                Download_template();
                            }
                        }
                    });
                }
            }
        });
    }

    // Функция на загрузку шаблона
    public void Download_template(){
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
    }

    // Функция для поиска переменных
    public ArrayList<Variable_Model> Search_Variables(ArrayList<Variable_Model> dataVarib_arr, String search_text){

        // Поиск через регулярные выражения
        Pattern pattern = Pattern.compile(".*" + search_text.toLowerCase() + ".*");

        ArrayList<Variable_Model> dataVariabFind_modelArr = new ArrayList<Variable_Model>();
        // Идем по циклу данных, что есть в таблице, применяем паттерн. Совпадения записываем в новый список
        for (int i = 0; i < dataVarib_arr.size(); i++) {
            Matcher matcher = pattern.matcher(dataVarib_arr.get(i).getNameVar().toLowerCase());
            if (matcher.find()) {
                //System.out.println("Search Success!");
                dataVariabFind_modelArr.add((new Variable_Model(dataVarib_arr.get(i).getNameVar(),
                        dataVarib_arr.get(i).getValueVar())));
            } else {
                //System.out.println("Search Failed!");
            }
        }
        // Возвращаем список найденных переменных по запросу
        return dataVariabFind_modelArr;
    }

    // Функция для поиска шаблона
    public ArrayList<Template_Model> Search_Templates(ArrayList<Template_Model> dataTempl_arr, String search_text){

        // Поиск через регулярные выражения
        Pattern pattern = Pattern.compile(".*" + search_text.toLowerCase() + ".*");

        ArrayList<Template_Model> dataTemplFind_modelArr = new ArrayList<Template_Model>();
        // Идем по циклу данных, что есть в таблице, применяем паттерн. Совпадения записываем в новый список
        for (int i = 0; i < dataTempl_arr.size(); i++) {
            Matcher matcher = pattern.matcher(dataTempl_arr.get(i).getNameTemplate().toLowerCase());
            if (matcher.find()) {
                //System.out.println("Search Success!");
                dataTemplFind_modelArr.add((new Template_Model(dataTempl_arr.get(i).getNameTemplate(),
                        dataTempl_arr.get(i).getSpecTemplate(), dataTempl_arr.get(i).getCodeNameTemplate(), dataTempl_arr.get(i).getHtmlCodeTemplate())));
            } else {
                //System.out.println("Search Failed!");
            }
        }
        // Возвращаем список найденных шаблонов по запросу
        return dataTemplFind_modelArr;
    }

    // Функция для генерации переменных
    public void Generate_variables(){
        // Убираем горизонтальную прокрутку для двух текстовых полей
        if_html_extra.setWrapText(true);
        if_excel_extra.setWrapText(true);
        // Добавляем слушателя на текстовое поля ввода переменной
        name_var_extr_t.textProperty().addListener((observable, oldValue, newValue) -> {
            // Берем текст и если текста нет, то все остальные поля ставим пустыми
            String name_var_extr=name_var_extr_t.getText();
            if (name_var_extr.length()==0){
                name_var_extr_t.setStyle("-fx-background-color: #FFF0F0;-fx-border-color: #DBB1B1;");
                html_var_extra_t.setText("");
                excel_var_extra_t.setText("");
                if_html_extra.setText("");
                if_excel_extra.setText("");
            } else
                {
                    // Иначе заполняем поля
                    name_var_extr_t.setStyle("");
                    html_var_extra_t.setText("${form."+name_var_extr+"!''}");
                    excel_var_extra_t.setText("${form."+name_var_extr+"}");
                    if_html_extra.setText("Пример с наличием контента:\n <#if form."+name_var_extr+"?has_content>Какое-то значение</#if>");
                    if_excel_extra.setText("${form."+name_var_extr+" == 'Какое то значение или переменная' ? 'Значение'+form."+name_var_extr+" : ''}");
                }
        });
    }

}
