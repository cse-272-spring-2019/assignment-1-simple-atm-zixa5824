package RunAtmPack;

import java.util.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 *
 * @author Mahmoud
 */
public class RunAtm implements RunInterface {
    
   Scanner scan = new Scanner(System.in);
   private double money;
   private String historyArray[] = new String[5];
   
    private static int i = 0;
    private static int x = 0;
   
    public RunAtm() 
    {
        for(int j = 0 ; j < 5 ; j++)    historyArray[j] = null;
        money = 0.0;
    }
   
    public void getCreditCard( Stage window , Scene scene1 , Button btn , String creditCard)
    {
     
        if("123".equals(creditCard))
        {
            btn.setOnAction(e -> window.setScene(scene1));
            window.setScene(scene1);
            window.show();
            window.setResizable(false);

        }
        else 
        {
            AlertBox.display("ERROR", "INVALID CREDIT CARD NUMBER");
        }
   
    }
    
    public void checker(TextField numText)
    {
        if(numText.getText().length() > 5) {numText.setText("");AlertBox.display("Error HUGEValue", "You can't enter number of digits more than 5\ndigits. Please reEnter the Value");}
    }
    
    public void deposit(Stage window, Scene dwScene, Scene optionsScene, Button depositBtn, Button eBtn, Label dwLabel, Button btnEnter ,TextField numText)
    {
        
        
        dwLabel.setText("Please Enter the amount of money to be deposited : ");
        numText.setText("");

        window.setScene(dwScene);
        window.show();
        


        
        eBtn.setOnAction(e -> 
        {
            window.close();
            window.setScene(optionsScene);     
            window.show();
        });
        
        btnEnter.setOnAction(e -> 
        {
            if("".equals(numText.getText()))    AlertBox.display("ErrorValue", "There is no Value Entered\nPlease reEnter the value");
            else
            {
                int add = Integer.parseInt(numText.getText());
                if(add > 50000) {numText.setText("");AlertBox.display("Error HugeValue", "You can't deposit more than 50000!\nPlease reEnter the value");}
                else 
                {
                    money += add;
                if(i == 5)  i = 0;
                if(i < 5)
                {
                String addS = Double.toString(add);
                historyArray[i] = (i + 1) + "- " + "You have deposited >> $" + addS;
                i++;
                }
                }
            }
        });
    }
    
    public void withdraw(Stage window, Scene dwScene, Scene optionsScene, Button withdrawBtn, Button eBtn, Label dwLabel, Button btnEnter, TextField numText)
    {
        
        dwLabel.setText("Please Enter the amount of money to be withdrawn : ");
        numText.setText("");
        
        window.setScene(dwScene);
        window.show();
        
        eBtn.setOnAction(e -> {
        window.close();
        window.setScene(optionsScene);
        window.show();
        });
        
        btnEnter.setOnAction(e -> 
        {
            if("".equals(numText.getText()))    AlertBox.display("ErrorValue", "There is no Value Entered\nPlease reEnter the value");
            else
            {
                int subtract = Integer.parseInt(numText.getText());
                if(subtract > money) AlertBox.display("ErrorValue", "INSUFFICENT Money stored to withdraw!\nPlease reEnter the value");
                else 
                {
                    money -= subtract;
                if(i == 5)  i = 0;
                if(i < 5)
                {
                    String subtractS = Double.toString(subtract);
                    historyArray[i] = (i + 1) + "- " + "You have withdrawn >> $" + subtractS;
                    i++;
                }
                }
            }
        });
    }
    public void balanceInquiry(Label balanceLabel)
    {
        balanceLabel.setText("Your current Balance is >> " +"$"+ money);
    }
    public void next(Label nextLabel, Button nextBtn)
    {
       if(x >3) {AlertBox.display("HistoryError", "Limited History.\nThere is no NEXT history.Please Press PREVIOUS");}
       else if(historyArray[x+1] == null) {
           if(x == 0)   nextLabel.setText(historyArray[x]);
           else AlertBox.display("HistoryError", "You didn't do any Transctions for the \nNEXT HISTORY. Please Complete a Transction first");
       }
       else 
       {
            if(x < 4)
            {
                x++;
                nextLabel.setText(historyArray[x]);
            } 
        }
    }
    public void prev(Label prevLabel , Button prevBtn)
    {
        if(x <= 0)  {AlertBox.display("HistoryError", "Limited History.\nThere is no PREVIOUS HISTORY");}
        else 
        {
            --x;
            prevLabel.setText(historyArray[x]);
            
        }
    }

   
    
}
