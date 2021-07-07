package view.register;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class FormView extends GridPane {

    private Label textUser;
    private Label textPass;
    private Label textCountry;

    private Label alertMessage;

    private TextField username;
    private TextField pass;
    private ListView<String> country;

    private Button back;
    private Button next;

    public FormView(){
        this.textUser = new Label("Username: ");
        this.textPass = new Label("Password: ");
        this.textCountry = new Label("Country: ");

        this.alertMessage = new Label("");

        this.username = new TextField();
        this.pass = new TextField();
        this.country = new ListView<String>();

        this.back = new Button("Back");
        this.next = new Button("Next");

        this.setHgap(2);
        this.setVgap(6);

        this.add(this.textUser, 0, 0);
        this.add(this.username, 1, 0);
        this.add(this.textPass, 0, 1);
        this.add(this.pass, 1, 1);
        this.add(this.textCountry, 0, 2);
        this.add(this.country, 1, 2);
        this.add(this.alertMessage, 0, 3);
        this.add(this.back, 0, 4);
        this.add(this.next, 1, 4);
    }
}
