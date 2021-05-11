package variable_book.controller;

import variable_book.data.Template_data;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Template_Controller {

    // Функция для загрузки шаблона в файл
    public void Download_template(String name_templ, String html_code_template) {
        Template_data template_data =new Template_data();
        String text_test=html_code_template;
        //System.out.println(text_test);
        FileChooser fileChooser = new FileChooser();

        // Устанавливаем фильтр для файлов
        fileChooser.setInitialFileName(name_templ);
        FileChooser.ExtensionFilter extFilterExcel = new FileChooser.ExtensionFilter("Html file (*.html)", "*.html");
        fileChooser.getExtensionFilters().add(extFilterExcel);

        // Вызываем окно с загрузкой файла
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/variable_book/view/app.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        appController appController = loader.getController();
        Stage stage = new Stage();
        File file = fileChooser.showSaveDialog(stage);
        // Если файл не пустой, то сохраняем файл
        if (fileChooser.getSelectedExtensionFilter()!=null) {
            if (fileChooser.getSelectedExtensionFilter().getExtensions().toString().equals("[*.html]")) {
                System.out.println("SELECTED HTML");
                if (file != null) {
                    SaveFileHtml(text_test, file);
                }
            }
        }
    }
    // Функция для записи файла
    private void SaveFileHtml(String content, File file){
        try {
            FileWriter fileWriter = null;

            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(appController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
