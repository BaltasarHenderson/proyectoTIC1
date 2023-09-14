package um.edu.uy.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import um.edu.uy.Main;

public class JavaFXApplication extends Application  {

    private Parent root;

    @Override
    public void init() throws Exception {

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*StackPane root=new StackPane();

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(Main.getContext()::getBean);
        //Parent root = fxmlLoader.load(ClientController.class.getResourceAsStream("AddClient.fxml"));
        Stage stage = new Stage();

        Button btn1=new Button("Agregar cliente");
        root.getChildren().add(btn1);
        //Scene scene=new Scene(root);
        stage.setScene(new Scene(root));


        stage.show();
*/
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(Main.getContext()::getBean);
        root = fxmlLoader.load(Principal.class.getResourceAsStream("Principal.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();




    }

    @Override
    public void stop() {
        Main.getContext().close();
    }

}
