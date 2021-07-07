package view.main;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class MenuPane extends HBox {

    private Label title;
    private Button home;
    private Button search;
    private Button upload;
    private Button messages;
    private Button profile;

    public MenuPane(){

        this.title = new Label("Instagram");
        this.home = new Button();
        this.search = new Button();
        this.upload = new Button();
        this.messages = new Button();
        this.profile = new Button();

        setIcons();

        this.getChildren().setAll(title, home, search, upload, messages, profile);
    }

    private void setIcons(){
        Image homeImg = new Image("C:\\Users\\luisr\\Documents\\Icons\\home.png");
        Image searchImg = new Image("C:\\Users\\luisr\\Documents\\Icons\\search.png");
        Image uploadImg = new Image("C:\\Users\\luisr\\Documents\\Icons\\upload.png");
        Image messagesImg = new Image("C:\\Users\\luisr\\Documents\\Icons\\email.png");
        Image profileImg = new Image("C:\\Users\\luisr\\Documents\\Icons\\user.png");

        this.home.setGraphic(new ImageView(homeImg));
        this.search.setGraphic(new ImageView(searchImg));
        this.upload.setGraphic(new ImageView(uploadImg));
        this.messages.setGraphic(new ImageView(messagesImg));
        this.profile.setGraphic(new ImageView(profileImg));
    }

    public Button getHome() {
        return home;
    }

    public Button getSearch() {
        return search;
    }

    public Button getUpload() {
        return upload;
    }

    public Button getMessages() {
        return messages;
    }

    public Button getProfile() {
        return profile;
    }
}
