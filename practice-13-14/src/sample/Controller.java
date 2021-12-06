package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    private int[][] field = {{2,2,2,2},{2,2,2,2},{2,2,2,2},{2,2,2,2}};
    private int stat = 1;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button13;

    @FXML
    private Button button14;

    @FXML
    private Button button21;

    @FXML
    private Button button22;

    @FXML
    private Button button23;

    @FXML
    private Button button24;

    @FXML
    private Button button31;

    @FXML
    private Button button32;

    @FXML
    private Button button33;

    @FXML
    private Button button34;

    @FXML
    private Button button41;

    @FXML
    private Button button42;

    @FXML
    private Button button43;

    @FXML
    private Button button44;

    @FXML
    private Label status;

    @FXML
    private Label wpannel;

    @FXML
    void initialize() {

        button11.setOnAction(event -> {
            if (field[0][0] != 1 && field[0][0] != 0) {
                if (stat == 1) {
                    field[0][0] = 1;
                    stat = 0;
                    button11.setText("X");
                    status.setText("0");
                }
                else if (stat == 0) {
                    field[0][0] = 0;
                    stat = 1;
                    button11.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button12.setOnAction(actionEvent -> {
            if (field[0][1] != 1 && field[0][1] != 0) {
                if (stat == 1) {
                    field[0][1] = 1;
                    stat = 0;
                    button12.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[0][1] = 0;
                    stat = 1;
                    button12.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button13.setOnAction(actionEvent -> {
            if (field[0][2] != 1 && field[0][2] != 0) {
                if (stat == 1) {
                    field[0][2] = 1;
                    stat = 0;
                    button13.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[0][2] = 0;
                    stat = 1;
                    button13.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button14.setOnAction(actionEvent -> {
            if (field[0][3] != 1 && field[0][3] != 0) {
                if (stat == 1) {
                    field[0][3] = 1;
                    stat = 0;
                    button14.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[0][3] = 0;
                    stat = 1;
                    button14.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button21.setOnAction(actionEvent -> {
            if (field[1][0] != 1 && field[1][0] != 0) {
                if (stat == 1) {
                    field[1][0] = 1;
                    stat = 0;
                    button21.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[1][0] = 0;
                    stat = 1;
                    button21.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button22.setOnAction(actionEvent -> {
            if (field[1][1] != 1 && field[1][1] != 0) {
                if (stat == 1) {
                    field[1][1] = 1;
                    stat = 0;
                    button22.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[1][1] = 0;
                    stat = 1;
                    button22.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button23.setOnAction(actionEvent -> {
            if (field[1][2] != 1 && field[1][2] != 0) {
                if (stat == 1) {
                    field[1][2] = 1;
                    stat = 0;
                    button23.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[1][2] = 0;
                    stat = 1;
                    button23.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button24.setOnAction(actionEvent -> {
            if (field[1][3] != 1 && field[1][3] != 0) {
                if (stat == 1) {
                    field[1][3] = 1;
                    stat = 0;
                    button24.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[1][3] = 0;
                    stat = 1;
                    button24.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button31.setOnAction(actionEvent -> {
            if (field[2][0] != 1 && field[2][0] != 0) {
                if (stat == 1) {
                    field[2][0] = 1;
                    stat = 0;
                    button31.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[2][0] = 0;
                    stat = 1;
                    button31.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button32.setOnAction(actionEvent -> {
            if (field[2][1] != 1 && field[2][1] != 0) {
                if (stat == 1) {
                    field[2][1] = 1;
                    stat = 0;
                    button32.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[2][1] = 0;
                    stat = 1;
                    button32.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button33.setOnAction(actionEvent -> {
            if (field[2][2] != 1 && field[2][2] != 0) {
                if (stat == 1) {
                    field[2][2] = 1;
                    stat = 0;
                    button33.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[2][2] = 0;
                    stat = 1;
                    button33.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button34.setOnAction(actionEvent -> {
            if (field[2][3] != 1 && field[2][3] != 0) {
                if (stat == 1) {
                    field[2][3] = 1;
                    stat = 0;
                    button34.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[2][3] = 0;
                    stat = 1;
                    button34.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button41.setOnAction(actionEvent -> {
            if (field[3][0] != 1 && field[3][0] != 0) {
                if (stat == 1) {
                    field[3][0] = 1;
                    stat = 0;
                    button41.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[3][0] = 0;
                    stat = 1;
                    button41.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button42.setOnAction(actionEvent -> {
            if (field[3][1] != 1 && field[3][1] != 0) {
                if (stat == 1) {
                    field[3][1] = 1;
                    stat = 0;
                    button42.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[3][1] = 0;
                    stat = 1;
                    button42.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button43.setOnAction(actionEvent -> {
            if (field[3][2] != 1 && field[3][2] != 0) {
                if (stat == 1) {
                    field[3][2] = 1;
                    stat = 0;
                    button43.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[3][2] = 0;
                    stat = 1;
                    button43.setText("0");
                    status.setText("X");
                }
                check();
            }
        });

        button44.setOnAction(actionEvent -> {
            if (field[3][3] != 1 && field[3][3] != 0) {
                if (stat == 1) {
                    field[3][3] = 1;
                    stat = 0;
                    button44.setText("X");
                    status.setText("0");
                } else if (stat == 0) {
                    field[3][3] = 0;
                    stat = 1;
                    button44.setText("0");
                    status.setText("X");
                }
                check();
            }
        });


    }
    public void check() {

        int ctn = 0;
        for (int l = 0; l < 2; l++)
            for (int i = 0; i < 4; i++) {
                ctn = 0;
                for (int j = 0; j < 4; j++) {
                    if (field[i][j] == l)
                        ctn++;
                    else ctn = 0;
                    if (ctn == 4) {
                        wpannel.setText(l == 1 ? "Победитель - Х" : "Победитель - 0");
                        stat = 2;
                    }
                }
            }

        ctn = 0;
        for (int l = 0; l < 2; l++)
            for (int i = 0; i < 4; i++) {
                ctn = 0;
                for (int j = 0; j < 4; j++) {
                    if (field[j][i] == l)
                        ctn++;
                    else ctn = 0;
                    if (ctn == 4) {
                        wpannel.setText(l == 1 ? "Победитель - Х" : "Победитель - 0");
                        stat = 2;
                    }
                }
            }

        ctn = 0;
        for (int l = 0; l < 2; l++) {
            ctn = 0;
            for (int i = 0; i < 4; i++)
                if (field[i][i] == l)
                    ctn++;
            if (ctn == 4) {
                wpannel.setText(l == 1 ? "Победитель - Х" : "Победитель - 0");
                stat = 2;
            }
        }

        ctn = 0;
        for (int l = 0; l < 2; l++) {
            ctn = 0;
            for (int i = 0; i < 4; i++)
                if (field[i][3-i] == l)
                    ctn++;
            if (ctn == 4) {
                wpannel.setText(l == 1 ? "Победитель - Х" : "Победитель - 0");
                stat = 2;
            }
        }

        ctn = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (field[i][j] != 2)
                    ctn++;
        if (ctn == 16) {
            wpannel.setText("Ничья!");
            stat = 2;
        }

    }

}