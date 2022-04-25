package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class Controller {
    public TextField area1;
    public TextField area2;
    public TextField area3;

    public TextField name1;
    public TextField name2;
    public TextField name3;

    public void onAction(ActionEvent actionEvent) {
        double area1d, area2d, area3d;
        double biggestArea = 0;
        String biggestAreaName = "|No data provided|";

        area1d = Double.parseDouble(area1.getText());
        area2d = Double.parseDouble(area2.getText());
        area3d = Double.parseDouble(area3.getText());

        if (area1d > area2d) {
            if (area1d > area3d) {
                biggestArea = area1d;
                biggestAreaName = name1.getText();
            } else {
                biggestArea = area3d;
                biggestAreaName = name3.getText();
            }
        } else if (area2d > area1d) {
            if (area2d > area3d) {
                biggestArea = area2d;
                biggestAreaName = name2.getText();
            } else {
                biggestArea = area3d;
                biggestAreaName = name3.getText();
            }
        } else if (area3d > area1d) {
            if (area3d > area2d) {
                biggestArea = area3d;
                biggestAreaName = name3.getText();
            } else {
                biggestArea = area2d;
                biggestAreaName = name2.getText();
            }
        } else {
            biggestArea = area1d;
            biggestAreaName = name1.getText();
        }

        Alert alert = new Alert(Alert.AlertType.NONE, "Biggest area is " + biggestArea + " of " + biggestAreaName + " country", ButtonType.FINISH);
        alert.showAndWait();
    }
}
