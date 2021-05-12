package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    public Button btnMain;
    int clickCounter = 0;


    public void OnAction(ActionEvent actionEvent) {
        System.out.println("Klawisz kliknięty po raz "+ ++clickCounter);
    }
}
