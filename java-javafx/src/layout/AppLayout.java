package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// VBox temp = new VBox();
		// temp.getChildren().add(new Quadrado());
		// temp.getChildren().add(new Quadrado());
		// temp.getChildren().add(new Quadrado());
		// temp.getChildren().add(new Quadrado());
		//
		// Scene principal = new Scene(temp, 600, 600);
		//
		// primaryStage.setScene(principal);

		Parent raiz = null;

//		raiz = new TesteBorderPane();
//		raiz = new TesteAnchorPane();
		raiz = new TesteFlowPane();

		Scene principal = new Scene(raiz, 800, 600);

		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}

	public static void main(String[ ] args) {
		launch(args);
	}

}
