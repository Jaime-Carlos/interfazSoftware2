/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.ingesoft2.entrega3corte;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author james
 */
public class MainWindowController implements Initializable {

    /**
     * Initializes the controller class.
     */ 
    
    @FXML
    private void registrarAlbumOnAction(ActionEvent event) {
        System.out.println("You clicked registrar album!");
    }
    
    @FXML
    private void registrarCancionOnAction(ActionEvent event) {
        System.out.println("You clicked registrar cancion!");
    }
    
    @FXML
    private void crearCierreOnAction(ActionEvent event) {
        System.out.println("You clicked registrar cierre!");
    }
    
    @FXML
    private void reportesOnAction(ActionEvent event) {
        System.out.println("You clicked reportes!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
}
