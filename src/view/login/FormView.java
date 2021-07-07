package view.login;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FormView extends GridPane {
    private Label textUser;
    private Label textPass;
    private Label alertMessage;

    private TextField user;
    private TextField pass;

    private Button login;
    private Button register;

    public FormView(){
        this.textUser = new Label("Username: ");
        this.textPass = new Label("Password: ");

        this.alertMessage = new Label("");

        this.user = new TextField();
        this.pass = new TextField();

        this.login = new Button("Login");
        this.register = new Button("Register");

        this.setHgap(2);
        this.setVgap(6);

        this.add(this.textUser, 0, 0);
        this.add(this.user, 1, 0);
        this.add(this.textPass, 0, 1);
        this.add(this.pass, 1, 1);
        this.add(this.alertMessage, 0, 2);
        this.add(this.register, 0, 3);
        this.add(this.login, 1, 3);
    }

    public Label getAlertMessage() {
        return alertMessage;
    }

    public TextField getUser() {
        return user;
    }

    public TextField getPass() {
        return pass;
    }

    public Button getLogin() {
        return login;
    }

    public Button getRegister() {
        return register;
    }
}
