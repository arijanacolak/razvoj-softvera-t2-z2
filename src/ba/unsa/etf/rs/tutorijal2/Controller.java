package ba.unsa.etf.rs.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;

public class Controller {
    public Label tekst2;
    public TextField unos_polje;

   public int sumaCifara(int n) {
       int suma_cif = 0, temp;
       while(n > 0) {
           temp = n % 10;
           suma_cif = suma_cif + temp;
           n = n / 10;
       }
       return suma_cif;
       }
    public void funkcija(ActionEvent actionEvent) {
        String s = new String();
        s = unos_polje.getText();
        String newLine = System.getProperty("line.separator");
        int n = Integer.parseInt(s);
        String m = new String();
        for(int i = 1; i < n; i++) {
            if(i % sumaCifara(i) == 0) {
                m = m + String.format("%d, ", i);
            }
        }
        tekst2.setText("Brojevi koji su djeljivi sa sumom svojih cifara su: " + newLine + m );
    }
}


