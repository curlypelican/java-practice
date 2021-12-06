package sample;

import java.lang.Integer;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    private int res = 0, val2 = 0, p = 0, k = 0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private TextField input;

    @FXML
    private TextField output;

    @FXML
    void initialize() {
        button1.setOnAction(event -> {
            if (k != 0) {
                k = 0;
                calculator();
            }
            k++;
            if (p == 0)
                res = Integer.parseInt(input.getText());
            else
                val2 = Integer.parseInt(input.getText());
            input.setText("");
            p = 1;

        });

        button2.setOnAction(event -> {
            if (k != 0) {
                k = 0;
                calculator();
            }
            k++;
            if (p == 0)
                res = Integer.parseInt(input.getText());
            else
                val2 = Integer.parseInt(input.getText());
            input.setText("");
            p = 2;

        });

        button3.setOnAction(event -> {
            if (k != 0) {
                k = 0;
                calculator();
            }
            k++;
            if (p == 0) res = Integer.parseInt(input.getText());
            else val2 = Integer.parseInt(input.getText());
            input.setText("");
            p = 3;

        });

        button4.setOnAction(event -> {
            if (k != 0) {
                k = 0;
                calculator();
            }
            k++;
            if (p == 0) res = Integer.parseInt(input.getText());
            else val2 = Integer.parseInt(input.getText());
            input.setText("");
            p = 4;
        });

        button5.setOnAction(event -> {
            calculator();
            output.setText(Integer.toString(res));
            p = 0;
            input.setText("");
        });
    }

    public void calculator() {
        switch(p) {
            case 1:{
                res += Integer.parseInt(input.getText());
                break;
            }
            case 2:{
                res -= Integer.parseInt(input.getText());
                break;
            }
            case 3:{
                res *= Integer.parseInt(input.getText());
                break;
            }
            case 4:{
                res /= Integer.parseInt(input.getText());
                break;
            }
        }
    }
}
