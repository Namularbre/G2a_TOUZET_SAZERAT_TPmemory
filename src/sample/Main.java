package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static sample.Controller.jeu;

public class Main extends Application implements EventHandler<MouseEvent> {
    final static Carte[] cartes = {new Carte(Color.RED),new Carte(Color.RED), new Carte(Color.GREEN),
            new Carte(Color.GREEN),new Carte(Color.YELLOW),new Carte(Color.YELLOW),
            new Carte(Color.BLUE), new Carte(Color.BLUE), new Carte(Color.LIME), new Carte(Color.LIME),
            new Carte(Color.CYAN),new Carte(Color.CYAN)};

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane menu = new BorderPane();
        Scene sceneMenu = new Scene(menu,700,500);
        Scene sceneJeu = new Scene(jeu,700,500);

        primaryStage.setTitle("Menu");

        primaryStage.setScene(sceneMenu);
        primaryStage.show();

        /*code custom*/
        for(int index = 0; index < cartes.length ; index++){
            cartes[index].getFormeDeLaCarte().setStroke(cartes[index].getCouleurDeLaCarte());
        }
        /*menu*/
        Button Btnjouer = new Button("Jouer");
        Label Lblaccueil = new Label("Bienvenue !");

        menu.setCenter(Btnjouer);
        menu.setTop(Lblaccueil);
        Btnjouer.setMinWidth(100);
        Btnjouer.setMinHeight(20);
        Lblaccueil.setPadding(new Insets(5,0,5,menu.getWidth()/2 + Lblaccueil.getWidth() - 50));

        Btnjouer.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                primaryStage.setTitle("Jeu de memory");
                primaryStage.setScene(sceneJeu);
                primaryStage.hide();
                primaryStage.show();
            }
        });
        /*fin menu*/
    }

    @Override
    public void handle(MouseEvent event) {

    }





    public static void main(String[] args) {
        launch(args);
    }
}
