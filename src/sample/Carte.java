package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Carte {
    private Rectangle formeDeLaCarte;
    private Color couleurDeLaCarte;

    public Carte(Color couleurDeLaCarte){
        this.formeDeLaCarte = new Rectangle(50,100);
        this.couleurDeLaCarte = couleurDeLaCarte;
    }

    public Rectangle getFormeDeLaCarte() {
        return formeDeLaCarte;
    }

    public Color getCouleurDeLaCarte() {
        return couleurDeLaCarte;
    }

    public void setCouleurDeLaCarte(Color couleurDeLaCarte) {
        this.couleurDeLaCarte = couleurDeLaCarte;
    }
}
