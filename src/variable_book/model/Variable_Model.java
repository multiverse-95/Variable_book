package variable_book.model;

import javafx.beans.property.SimpleStringProperty;
// Модель для Переменных
public class Variable_Model {

    private SimpleStringProperty NameVar;
    private SimpleStringProperty ValueVar;


    public Variable_Model(String NameVar, String ValueVar) {
        this.NameVar = new SimpleStringProperty(NameVar);
        this.ValueVar = new SimpleStringProperty(ValueVar);

    }

    public String getNameVar() {
        return NameVar.get();
    }

    public void setNameVar(String NameVar) {
        this.NameVar = new SimpleStringProperty(NameVar);
    }

    public String getValueVar() {
        return ValueVar.get();
    }

    public void setValueVar(String ValueVar) {
        this.ValueVar = new SimpleStringProperty(ValueVar);
    }
}