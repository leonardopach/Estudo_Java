package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {

	private static int i = 0;

	private String[ ] cores = {
			"#FF0000", "#00FF00", "#0000FF", "#FFFF00", "#FF00FF", "#00FFFF"
	};

	public Quadrado() {
		this(100, 100);
	}

	public Quadrado(int largura, int altura) {

		setWidth(largura);
		setHeight(altura);

		setFill(Color.web(cores[i]));
		i++;

		if (i == 6) i = 0;
	}

}
