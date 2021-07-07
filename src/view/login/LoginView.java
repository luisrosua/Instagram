package view.login;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class LoginView extends BorderPane {

    private Label title;
    private FormView form;

    public LoginView(){
        this.title = new Label("Instagram");
        this.form = new FormView();

        HBox hb = new HBox(5);
        hb.getChildren().setAll(this.title);
        hb.setAlignment(Pos.CENTER);

        this.form.setAlignment(Pos.CENTER);

        this.setTop(hb);
        this.setCenter(this.form);
    }

    public FormView getForm() {
        return form;
    }
}
