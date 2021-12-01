package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

import java.awt.*;
import java.text.DecimalFormat;

public class Controller {
    DecimalFormat df = new DecimalFormat("#.##");
    @FXML
    private Spinner<Integer> textFieldSzam1;
    @FXML
    private Spinner<Integer> textFieldSzam2;
    @FXML
    private Label labelEredmeny;

    public void btnPlusz() {
        if (textFieldSzam1.getText().isEmpty() || textFieldSzam2.getText().isEmpty()) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            Double szam1 = Double.parseDouble(textFieldSzam1.getText());
            Double szam2 = Double.parseDouble(textFieldSzam2.getText());
            Double eredmeny = szam1 + szam2;

            labelEredmeny.setText(Double.toString(eredmeny));
        }
    }

    public void btnMinusz() {
        if (textFieldSzam1.getText().isEmpty() || textFieldSzam2.getText().isEmpty()) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            Double szam1 = Double.parseDouble(textFieldSzam1.getText());
            Double szam2 = Double.parseDouble(textFieldSzam2.getText());
            Double eredmeny = szam1 - szam2;

            labelEredmeny.setText(Double.toString(eredmeny));
        }
    }

    public void btnSzor() {
        if (textFieldSzam1.getText().isEmpty() || textFieldSzam2.getText().isEmpty()) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            Double szam1 = Double.parseDouble(textFieldSzam1.getText());
            Double szam2 = Double.parseDouble(textFieldSzam2.getText());
            Double eredmeny = szam1 * szam2;

            labelEredmeny.setText(Double.toString(eredmeny));
        }
    }

    public void btnMaradekosOszt() {
        if (textFieldSzam1.getText().isEmpty() || textFieldSzam2.getText().isEmpty()) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            Double szam1 = Double.parseDouble(textFieldSzam1.getText());
            Double szam2 = Double.parseDouble(textFieldSzam2.getText());
            Double eredmeny = szam1 / szam2;


            labelEredmeny.setText(df.format(eredmeny));
        }
    }

    public void btnOszt() {
        if (textFieldSzam1.getText().isEmpty() || textFieldSzam2.getText().isEmpty()) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            Double szam1 = Double.parseDouble(textFieldSzam1.getText());
            Double szam2 = Double.parseDouble(textFieldSzam2.getText());
            Double eredmeny = szam1 % szam2;

            labelEredmeny.setText(Double.toString(eredmeny));
        }
    }
}