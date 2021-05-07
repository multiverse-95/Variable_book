package model;

import javafx.beans.property.SimpleStringProperty;

public class Template_Model {

    private SimpleStringProperty NameTemplate;
    private SimpleStringProperty SpecTemplate;
    private SimpleStringProperty CodeNameTemplate;
    private SimpleStringProperty HtmlCodeTemplate;


    public Template_Model(String NameTemplate, String SpecTemplate , String CodeNameTemplate, String HtmlCodeTemplate) {
        this.NameTemplate = new SimpleStringProperty(NameTemplate);
        this.SpecTemplate = new SimpleStringProperty(SpecTemplate);
        this.CodeNameTemplate = new SimpleStringProperty(CodeNameTemplate);
        this.HtmlCodeTemplate = new SimpleStringProperty(HtmlCodeTemplate);

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

    public String getCodeNameTemplate() {
        return CodeNameTemplate.get();
    }

    public void setCodeNameTemplate(String CodeNameTemplate) { this.CodeNameTemplate = new SimpleStringProperty(CodeNameTemplate); }

    public String getHtmlCodeTemplate() {
        return HtmlCodeTemplate.get();
    }

    public void setHtmlCodeTemplate(String HtmlCodeTemplate) { this.HtmlCodeTemplate = new SimpleStringProperty(HtmlCodeTemplate); }
}
