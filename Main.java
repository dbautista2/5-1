import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane gridPane = new GridPane();

        // Load images
        Image image1 = new Image("file:image1.jpg");
        Image image2 = new Image("file:image2.jpg");
        Image image3 = new Image("file:image3.jpg");
        Image image4 = new Image("file:image4.jpg");

        // Create ImageViews and add them to the GridPane
        gridPane.add(new ImageView(image1), 0, 0);
        gridPane.add(new ImageView(image2), 1, 0);
        gridPane.add(new ImageView(image3), 0, 1);
        gridPane.add(new ImageView(image4), 1, 1);

        // Create a Scene with the GridPane as the root node
        Scene scene = new Scene(gridPane, 600, 600);
        primaryStage.setTitle("Display Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}