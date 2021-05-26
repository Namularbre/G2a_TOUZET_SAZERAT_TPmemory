package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;

public class Controller {
    //(Nous sommes obliger de faire ça sous IntelliJ)
    @FXML
    public static Button BtnRetour = new Button();
    @FXML
    public static Rectangle Rectangle00 = new Rectangle();
    @FXML
    public static Rectangle Rectangle01 = new Rectangle();
    @FXML
    public static Rectangle Rectangle02 = new Rectangle(); //Il est à 2,1 ! (x,y)
    @FXML
    public static Rectangle Rectangle03 = new Rectangle();
    @FXML
    public static Rectangle Rectangle04 = new Rectangle();
    @FXML
    public static Rectangle Rectangle05 = new Rectangle();
    @FXML
    public static Rectangle Rectangle06 = new Rectangle();
    @FXML
    public static Rectangle Rectangle07 = new Rectangle();
    @FXML
    public static Rectangle Rectangle08 = new Rectangle();
    @FXML
    public static Rectangle Rectangle09 = new Rectangle();
    @FXML
    public static Rectangle Rectangle10 = new Rectangle();
    @FXML
    public static Rectangle Rectangle11 = new Rectangle();
    @FXML
    public static BorderPane jeu = new BorderPane();
    //Fin de l'instant InteliJ

    public void retourMenu(){
        Main.changerScene();
    }

    public void retournerCarte(){

    }

}
