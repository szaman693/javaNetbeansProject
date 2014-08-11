/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dorobeknaukowyfx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class DorobekNaukowyFx extends Application {

    ObservableList<Person> personList = FXCollections.observableArrayList();

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public DorobekNaukowyFx() {

        for (int i = 0; i < 10; i++) {
            Person p = new Person();
            p.setFirstName("Janek" + i);
            p.setLastName("Janek" + i);
            p.setCity("Rzeszow" + i);
            p.setStreet("Mogilska" + i);
            personList.add(p);
        }

    }

    @Override
    public void start(Stage stage) throws Exception {
        
        System.err.println("FXML resource: " + DorobekNaukowyFx.class.getResource("FXMLDocument.fxml"));
        FXMLLoader loader = new FXMLLoader(DorobekNaukowyFx.class.getResource("/dorobeknaukowyfx/FXMLDocument.fxml"));
        
        AnchorPane  anchorPane = (AnchorPane)loader.load();

        FXMLDocumentController controller = loader.getController();
        Scene scene = new Scene(anchorPane);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
    }

}
