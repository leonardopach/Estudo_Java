package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;
	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");

		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> {
			contador--;
			labelNumero.setText(Integer.toString(contador));
		});

		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			labelNumero.setText(Integer.toString(contador));
		});

		HBox boxBotes = new HBox();
		boxBotes.setAlignment(Pos.CENTER);
		boxBotes.setSpacing(10);
		boxBotes.getChildren().add(botaoIncremento);
		boxBotes.getChildren().add(botaoDecremento);

		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotes);

		String caminoDoCss = getClass().getResource("/basico/contador.css")
				.toExternalForm();
		
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminoDoCss);
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}

	public static void main(String[ ] args) {
		launch(args);
	}

}
