package model;

import javafx.beans.property.SimpleStringProperty;

public class Template_Model {

    private SimpleStringProperty NameTemplate;
    private SimpleStringProperty SpecTemplate;


    public Template_Model(String NameTemplate, String SpecTemplate) {
        this.NameTemplate = new SimpleStringProperty(NameTemplate);
        this.SpecTemplate = new SimpleStringProperty(SpecTemplate);

    }

    public String getNameTemplate() {
        return NameTemplate.get();
    }

    public void setNameTemplate(String NameTemplate) {
        this.NameTemplate = new SimpleStringProperty(NameTemplate);
    }

    public String getSpecTemplate() {
        return SpecTemplate.get();
    }

    public void setSpecTemplate(String SpecTemplate) {
        this.SpecTemplate = new SimpleStringProperty(SpecTemplate);
    }
}
