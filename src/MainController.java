import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML private Button b_source;
    @FXML private Button b_destination;
    @FXML private Button b_convert;
    @FXML private Label l_source;
    @FXML private Label l_destination;
    @FXML private Label l_done;

    private ObservableList<praktik.Company> oldCompanies = FXCollections.observableArrayList();
    private ObservableList<praktik.model.Company> newCompanies = FXCollections.observableArrayList();
    private File destination;

    public void action_load(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("File to convert");
        Stage stage = new Stage();
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            if(!oldCompanies.isEmpty())
                oldCompanies.clear();
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                while(fis.available() > 0) {
                    oldCompanies.add((praktik.Company) ois.readObject());
                }
                if(oldCompanies.size() > 0) {
                    l_source.setText(file.getName());
                    b_destination.setDisable(false);
                }
                ois.close();
                fis.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void action_destination(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("New path");
        Stage stage = new Stage();
        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            destination = file;
            l_destination.setText(destination.getName());
            b_convert.setDisable(false);
        }
    }

    public void action_convert(ActionEvent actionEvent) {
        oldCompanies.stream().forEach((praktik.Company company) -> {
            newCompanies.add(convertCompany(company));
        });
        FileOutputStream fos = null;
        try {
            destination.createNewFile();
            fos = new FileOutputStream(destination);
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            newCompanies.stream().forEach((praktik.model.Company company) -> {
                try {
                    oos.writeObject(company);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            oos.close();
            fos.close();

            l_done.setText("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public praktik.model.Company convertCompany(praktik.Company company) {
        return new praktik.model.Company(company.getCompanyName(), company.getActivities(), company.getPhone(), company.getMail(), company.getWebsite(), null, null, null, null, null, company.getState(), null, null, null, null, null);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        b_destination.setDisable(true);
        b_convert.setDisable(true);
    }
}
