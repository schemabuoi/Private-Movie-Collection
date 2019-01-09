/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privatemoviecollection.gui.controller;

import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import privatemoviecollection.gui.model.CategoriesModel;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class NewCategoryViewController implements Initializable {

    private CategoriesModel model;
    @FXML
    private TextField txtName;
    
    public NewCategoryViewController()
    {
        model = CategoriesModel.createInstance();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickSave(ActionEvent event) 
    {
        model.createCategory(txtName.getText());
        Stage stage = (Stage)((Node)((EventObject) event).getSource()).getScene().getWindow();
        stage.close();
    }
    
}
