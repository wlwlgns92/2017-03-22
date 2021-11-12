module java2_server {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;

	
	opens application to javafx.graphics, javafx.fxml;
}
