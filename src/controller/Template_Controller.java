package controller;

import data.Template_data;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.Template_Model;
import sample.Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Template_Controller {

    public void Download_template(String name_templ, String html_code_template) {
        Template_data template_data =new Template_data();
        String text_test=html_code_template;
        //System.out.println(text_test);
        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        fileChooser.setInitialFileName(name_templ);
        FileChooser.ExtensionFilter extFilterExcel = new FileChooser.ExtensionFilter("Html file (*.html)", "*.html");
        fileChooser.getExtensionFilters().add(extFilterExcel);


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/sample.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Controller controller = loader.getController();
        Stage stage = new Stage();
        //Show save file dialog
        File file = fileChooser.showSaveDialog(stage);
        if (fileChooser.getSelectedExtensionFilter()!=null) {
            if (fileChooser.getSelectedExtensionFilter().getExtensions().toString().equals("[*.html]")) {
                System.out.println("SELECTED HTML");
                if (file != null) {
                    SaveFileHtml(text_test, file);
                }
            }
        }
    }

    private void SaveFileHtml(String content, File file){
        try {
            FileWriter fileWriter = null;

            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
