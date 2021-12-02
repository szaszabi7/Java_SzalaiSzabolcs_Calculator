package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

import java.text.DecimalFormat;

public class Controller {
    DecimalFormat df = new DecimalFormat("#.##");
    @FXML
    private Spinner<Double> spinnerSzam1;
    @FXML
    private Spinner<Double> spinnerSzam2;
    @FXML
    private Label labelEredmeny;

    public void btnPlusz() {
        if (spinnerSzam1.getValue() == null || spinnerSzam2.getValue() == null) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            double szam1 = spinnerSzam1.getValue();
            double szam2 = spinnerSzam2.getValue();
            double eredmeny = szam1 + szam2;

            labelEredmeny.setText(Double.toString(eredmeny));
        }
    }

    public void btnMinusz() {
        if (spinnerSzam1.getValue() == null || spinnerSzam2.getValue() == null) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            double szam1 = spinnerSzam1.getValue();
            double szam2 = spinnerSzam2.getValue();
            double eredmeny = szam1 - szam2;

            labelEredmeny.setText(Double.toString(eredmeny));
        }
    }

    public void btnSzor() {
        if (spinnerSzam1.getValue() == null || spinnerSzam2.getValue() == null) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            double szam1 = spinnerSzam1.getValue();
            double szam2 = spinnerSzam2.getValue();
            double eredmeny = szam1 * szam2;

            labelEredmeny.setText(Double.toString(eredmeny));
        }
    }

    public void btnOszt() {
        if (spinnerSzam1.getValue() == null || spinnerSzam2.getValue() == null) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            double szam1 = spinnerSzam1.getValue();
            double szam2 = spinnerSzam2.getValue();
            double eredmeny = szam1 / szam2;

            labelEredmeny.setText(df.format(eredmeny));
        }
    }

    public void btnMaradekosOszt(ActionEvent actionEvent) {
        if (spinnerSzam1.getValue() == null || spinnerSzam2.getValue() == null) {
            labelEredmeny.setText("Minden mezőt ki kell tölteni");
        } else {
            double szam1 = spinnerSzam1.getValue();
            double szam2 = spinnerSzam2.getValue();
            double eredmeny = szam1 % szam2;

            labelEredmeny.setText(df.format(eredmeny));
        }
    }
}