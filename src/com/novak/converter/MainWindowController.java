package com.novak.converter;

import com.novak.converter.datamodel.Fahrenheit;
import com.novak.converter.datamodel.MainModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class MainWindowController {
    private  ObservableList<String> measures = FXCollections.observableArrayList();
    @FXML
    private  ComboBox<String> convertFromBox;
    @FXML
    private  ComboBox<String> convertToBox;
    @FXML
    private TextField resultField;
    @FXML
    private TextField valueField;
    @FXML
    ComboBox<String> measureTypeBox;

    private double conversionRate = 0;


    @FXML
    public void convert(){
        try {
            double value = Double.valueOf(valueField.getText());
            if(measureTypeBox.getValue().equals("Temperature")){
                System.out.println(String.valueOf(convertFromBox));
                if(convertToBox.getValue().equals("Fahrenheit") || convertFromBox.getValue().equals("Fahrenheit")){
                    double result = MainModel.convertToFromFahrenheit(convertFromBox.getValue(),convertToBox.getValue(),value);
                    resultField.setText(String.valueOf(result));
                } else {
                    resultField.setText(String.valueOf(value + conversionRate));
                }
            } else {
                resultField.setText(String.valueOf((value * conversionRate)));
            }
        } catch (NumberFormatException e){
            resultField.setText("0");
        }
    }

    @FXML
    public void handleMeasureTypeChange(){
        try {
            String measureType = measureTypeBox.getValue();
            measures.setAll(MainModel.getKeySet(measureType));
            convertFromBox.setItems(measures);
            convertToBox.setItems(measures);
        } catch (NullPointerException e){
            //Do nothing
        }
    }

    @FXML
    public void recalculateConversionRate(){
        try {
            String from = convertFromBox.getValue();
            String to = convertToBox.getValue();
            String measureType = measureTypeBox.getValue();
            conversionRate = MainModel.getConversionRate(from, to,measureType);
            System.out.println(conversionRate);
            convert();

        } catch (NullPointerException e){
            //Do nothing
        }
    }

    public void initialize(){
        ObservableList<String> types = FXCollections.observableArrayList("Length","Mass","Time","Temperature","Speed");
        measureTypeBox.setItems(types);
    }
}
