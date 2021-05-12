package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public Button btnMain;
    public TextField txtLicznik;
    int clickCounter = 0;


    public void OnAction(ActionEvent actionEvent) {
        System.out.println("Klawisz kliknięty po raz " + ++clickCounter);
        txtLicznik.setText("Klawisz kliknięty po raz " + ++clickCounter);
        if (clickCounter == 1) {
            btnMain.setText("I jeszcze raz");
        }
    }
}
