/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunAtmPack;

import java.util.Arrays;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 *
 * @author Mahmoud
 */
public class AtmRunGui extends Application{
    
    @Override
    public void start(Stage primaryStage) 
    {
        window = primaryStage;
        
        RunAtm run = new RunAtm();
        
        GridPane homePage = new GridPane();
        Scene scene = new Scene(homePage, 550, 400);        
        
        homePage.setVgap(10);
        homePage.setHgap(-55);
        
        //HomePage LOOK
        TextField creditText = new TextField();
        Label creditLabel = new Label("Please Enter a Valid Credit Card Number :");
        Button homeBtn = new Button("Enter");
        creditText.setMaxSize(500,400); 
        homePage.setAlignment(Pos.CENTER);
        
        homePage.add(creditLabel, 0, 0);
        homePage.add(creditText, 0, 1);
        homePage.add(homeBtn , 1, 2);
        
        
        //CODING ACTIONS FOR HOME BUTTON
        
        homeBtn.setOnAction( e -> run.getCreditCard(window , optionsScene , homeBtn , creditText.getText()) );
       
        //OPTIONS WINDOW
        
        GridPane optionsPage = new GridPane();
        optionsScene = new Scene(optionsPage ,350 , 400);
        optionsPage.setAlignment(Pos.BASELINE_LEFT);
        
        optionsPage.setVgap(20);
        optionsPage.setHgap(-150);
        
        Font f = new Font(20);
        Button depositBtn = new Button();
        Button withdrawBtn = new Button();
        Button balanceBtn = new Button();
        Button nextBtn = new Button();
        Button prevBtn = new Button();
        Button exitBtn = new Button();
        Label welcomeLabel = new Label("Please choose one of the options below :");
        Label bnpLabel = new Label();
        
        depositBtn.setText("Deposit");
        withdrawBtn.setText("Withdraw");
        balanceBtn.setText("Balance Inquiry");
        nextBtn.setText("Next");
        prevBtn.setText("Previous");
        exitBtn.setText("Exit");
        
        
        depositBtn.setFont(f);
        withdrawBtn.setFont(f);
        balanceBtn.setFont(f);
        nextBtn.setFont(f);
        prevBtn.setFont(f);
        exitBtn.setFont(f);
        bnpLabel.setFont(f);
        
//LAYOUT SETTING OPTIONS SCENE
        
        optionsPage.add(welcomeLabel, 0, 0);
        optionsPage.add(depositBtn, 0, 1);
        optionsPage.add(withdrawBtn, 0, 2);
        optionsPage.add(balanceBtn, 0, 4);
        optionsPage.add(nextBtn, 1, 3);
        optionsPage.add(prevBtn, 0, 3);
        optionsPage.add(exitBtn, 1, 5);
        optionsPage.add(bnpLabel, 0, 6);
      
        
        //BUTTONS IN DEPOSIT WITHDRAW SCENE
        
        Button enterBtn = new Button("Enter");
        
        

        //WITHDRAW DEPOSIT SCENE
        
        Pane dwPage = new Pane();
        
        //NUMBER Buttons AND label of withdraw and Deposit
        
        Label dwLabel = new Label("Please Enter the amount of money you want to deposit:");
        TextField numText = new TextField();
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnLeft = new Button("<<");
        Button btnEnter = new Button("Enter");
        Button btnBack = new Button("Back");
        Button btnClear = new Button("Clear");
        
        dwScene = new Scene(dwPage , 800 , 400);
        
        //DEPOSIT WITHDRAWL NUMBUTTONS DESIGN
        numText.setText("");
        numText.setMaxWidth(200);
        numText.setMaxHeight(50);
        numText.setEditable(false);
        numText.setLayoutX(dwScene.getWidth()/2 - numText.getMaxWidth()/2);
        numText.setLayoutY(dwScene.getHeight()/2 - 100);
        dwLabel.setLayoutX(numText.getLayoutX() - 140);
        dwLabel.setFont(f);
        Font f1 = new Font(15);
        btn0.setFont(f1);
        btn1.setFont(f1);
        btn2.setFont(f1);
        btn3.setFont(f1);
        btn4.setFont(f1);
        btn5.setFont(f1);
        btn6.setFont(f1);
        btn7.setFont(f1);
        btn8.setFont(f1);
        btn9.setFont(f1);
        btnLeft.setFont(f1);
        btnBack.setFont(f);
        btnEnter.setFont(f1);
        btnClear.setFont(f);
        btn7.setLayoutX(numText.getLayoutX());
        btn7.setLayoutY(numText.getLayoutY()+50);
        btn8.setLayoutX(btn7.getLayoutX() + 80);
        btn8.setLayoutY(btn7.getLayoutY());
        btn9.setLayoutX(btn7.getLayoutX() + 160);
        btn9.setLayoutY(btn7.getLayoutY());
        btn4.setLayoutX(numText.getLayoutX());
        btn4.setLayoutY(numText.getLayoutY()+100);
        btn5.setLayoutX(btn4.getLayoutX() + 80);
        btn5.setLayoutY(btn4.getLayoutY());
        btn6.setLayoutX(btn4.getLayoutX() + 160);
        btn6.setLayoutY(btn4.getLayoutY());
        btn1.setLayoutX(numText.getLayoutX());
        btn1.setLayoutY(numText.getLayoutY()+150);
        btn2.setLayoutX(btn1.getLayoutX() + 80);
        btn2.setLayoutY(btn1.getLayoutY());
        btn3.setLayoutX(btn1.getLayoutX() + 160);
        btn3.setLayoutY(btn1.getLayoutY());
        btnEnter.setLayoutX(numText.getLayoutX());
        btnEnter.setLayoutY(numText.getLayoutY()+200);
        btn0.setLayoutX(btn1.getLayoutX() + 80);
        btn0.setLayoutY(numText.getLayoutY() + 200);
        btnLeft.setLayoutX(btn1.getLayoutX() + 150);
        btnLeft.setLayoutY(btn0.getLayoutY());
        btnBack.setLayoutX(btn1.getLayoutX() + 200);
        btnBack.setLayoutY(btn0.getLayoutY() + 50);
        btnClear.setLayoutX(btnBack.getLayoutX() - 270);
        btnClear.setLayoutY(btn0.getLayoutY() + 50);
        
        //ADD BUTTONS TO SCREEN
        dwPage.getChildren().addAll(dwLabel, numText, btn7, btn8, btn9, btn4, btn5, btn6, btn1, btn2, btn3, btn0, btnLeft ,btnBack, btnEnter, btnClear);
        
        //CODING DEPOSIT WITHDRAWL NUMBUTTONS
        
        btn0.setOnAction(e -> 
        {
            int dwMoney = Integer.parseInt(numText.getText()+ "0");
            if(dwMoney * 1 == 0)    AlertBox.display("ErrorValue", "You can't deposit or withdraw 0\nPlease reEnter the value");
            else
            {
                if(numText.getText().length() > 4)   run.checker(numText);
                else numText.setText(numText.getText() + "0");
            }
        });
        btn1.setOnAction(e -> {numText.setText(numText.getText() + "1");run.checker(numText);});
        btn2.setOnAction(e -> {numText.setText(numText.getText() + "2");run.checker(numText);});
        btn3.setOnAction(e -> {numText.setText(numText.getText() + "3");run.checker(numText);});
        btn4.setOnAction(e -> {numText.setText(numText.getText() + "4");run.checker(numText);});
        btn5.setOnAction(e -> {numText.setText(numText.getText() + "5");run.checker(numText);});
        btn6.setOnAction(e -> {numText.setText(numText.getText() + "6");run.checker(numText);});
        btn7.setOnAction(e -> {numText.setText(numText.getText() + "7");run.checker(numText);});
        btn8.setOnAction(e -> {numText.setText(numText.getText() + "8");run.checker(numText);});
        btn9.setOnAction(e -> {numText.setText(numText.getText() + "9");run.checker(numText);});
        btnLeft.setOnAction(e -> 
        {  
            if("".equals(numText.getText()));
            else
            {
                if(numText.getText().length() > 5){run.checker(numText);}
                else{
                        int dwMoney = Integer.parseInt(numText.getText());
                        dwMoney /= 10;
                        if(dwMoney == 0) numText.setText("");
                        else
                        numText.setText(Integer.toString(dwMoney));
                    }
            }    
        });
        btnClear.setOnAction(e -> numText.setText(""));
      
        
        //CODING OPTIONS BTNS
        
        depositBtn.setOnAction( e -> run.deposit(window, dwScene, optionsScene, depositBtn, btnBack, dwLabel, btnEnter, numText) );
        withdrawBtn.setOnAction(e -> run.withdraw(window, dwScene, optionsScene, withdrawBtn, btnBack, dwLabel, btnEnter, numText));
        balanceBtn.setOnAction( e -> run.balanceInquiry(bnpLabel) );
        nextBtn.setOnAction(e -> run.next(bnpLabel, nextBtn));
        prevBtn.setOnAction(e -> run.prev(bnpLabel, prevBtn));
        exitBtn.setOnAction( e -> window.close() );
        //MAIN WINDOW SCENE
        window.setTitle("ATM Manager");
        window.setScene(scene);
        window.show();
        window.setResizable(false);
        
    }

    /**
     * @param args the command line arguments
     */
    
    Stage window;
    Scene scene, optionsScene, dwScene;
    
    public static void main(String[] args) {
        launch(args);
    }
    
   
    
}
