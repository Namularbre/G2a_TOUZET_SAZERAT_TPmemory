package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<MouseEvent> {
    final static Carte[] cartes = {new Carte(Color.RED),new Carte(Color.RED), new Carte(Color.GREEN),
            new Carte(Color.GREEN),new Carte(Color.YELLOW),new Carte(Color.YELLOW),
            new Carte(Color.BLUE), new Carte(Color.BLUE), new Carte(Color.LIME), new Carte(Color.LIME),
            new Carte(Color.CYAN),new Carte(Color.CYAN)};

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane menu = new BorderPane();
        BorderPane jeu = new BorderPane();
        Scene sceneMenu = new Scene(menu,700,500);
        Scene sceneJeu = new Scene(jeu,700,500);

        primaryStage.setTitle("Menu");

        primaryStage.setScene(sceneMenu);
        primaryStage.show();

        /*code custom*/
        HBox conteneurHorizontalDesCartes = new HBox();
        VBox ligneHautesDesCartes = new VBox();
        VBox ligneMillieuDesCartes = new VBox();
        VBox ligneBasseDesCartes = new VBox();
        conteneurHorizontalDesCartes.getChildren().addAll(ligneHautesDesCartes,ligneMillieuDesCartes,ligneBasseDesCartes);
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
        /*jeu*/
        Button BtnRetour = new Button("Retour");
        jeu.setTop(BtnRetour);
        BtnRetour.setMinWidth(100);
        BtnRetour.setAlignment(Pos.CENTER_RIGHT);
        jeu.setCenter(conteneurHorizontalDesCartes);
        ligneHautesDesCartes.getChildren().addAll(cartes[0].getFormeDeLaCarte(),cartes[1].getFormeDeLaCarte(),cartes[2].getFormeDeLaCarte());
        /*Ajouter 3 cartes par Vbox*/

        BtnRetour.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                primaryStage.setTitle("menu");
                primaryStage.setScene(sceneMenu);
                primaryStage.hide();
                primaryStage.show();

            }
        });
        /*fin jeu*/
    }

    @Override
    public void handle(MouseEvent event) {

    }





    public static void main(String[] args) {
        launch(args);
    }
}
