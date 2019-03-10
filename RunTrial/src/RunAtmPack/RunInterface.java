/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunAtmPack;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Mahmoud
 */
public interface RunInterface {
    
    public void getCreditCard( Stage window , Scene scene1 , Button btn , String creditCard);
    public void checker(TextField numText);
    public void deposit(Stage window, Scene dwScene, Scene optionsScene, Button depositBtn, Button eBtn, Label dwLabel, Button btnEnter, TextField numText);
    public void withdraw(Stage window, Scene dwScene, Scene optionsScene, Button withdrawBtn, Button btnBack, Label dwLabel, Button btnEnter, TextField numText);
    public void balanceInquiry(Label balanceLabel);
    public void next(Label nextLabel, Button nextBtn);
    public void prev(Label prevLabel , Button prevBtn);
}
