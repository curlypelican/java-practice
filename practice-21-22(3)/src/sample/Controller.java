package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;



public class Controller {
    @FXML
    public ResourceBundle resources;

    @FXML
    public URL location;

    @FXML
    public Button buttonExit;

    @FXML
    public Button file;

    @FXML
    public Button buttonNew;

    @FXML
    public Button buttonOpen;

    @FXML
    public Label output;

    @FXML
    public Button buttonSave;

    @FXML
    public AnchorPane scnd;

    @FXML
    void initialize() {
        scnd.setVisible(false);

        buttonNew.setOnAction(event -> {
            IDocument doc = new IDocument(1);
            doc.CreateNew();
            long start = System.currentTimeMillis();
            output.setText("Создан новый файл: " + doc.getType());
        });

        buttonOpen.setOnAction(event -> {
            IDocument doc = new IDocument(1);
            doc.CreateOpen();
            output.setText("Открыт: " + doc.getType());
        });

        file.setOnAction(event-> {
            if(scnd.isVisible())
                scnd.setVisible(false);
            else
                scnd.setVisible(true);
        });

        buttonExit.setOnAction(event->{
            System.exit(0);
        });

        buttonSave.setOnAction(event->{
            output.setText("Сохранение");
            System.out.println("Сохранение");
        });
    }
}