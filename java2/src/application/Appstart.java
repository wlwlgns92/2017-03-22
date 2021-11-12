package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Appstart extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		
		//폰트 로드
	
	Font.loadFont(getClass().getResourceAsStream("강한육군 Bold.ttf"), 14);	
		
	Parent parent = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
	Scene scene = new Scene(parent);
	
	//외부 스타일시트 적용
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	
	stage.setScene(scene);
		stage.setResizable(false); // 스테이지 크기 고정
		stage.setTitle("ㅋㅋㅋ"); // 스테이지 이름
		// 스테이지 아이콘
			// 1. 이미지 불러오기
			Image image = new Image("file:D:\\조지훈\\java2\\src\\fxml\\아이콘.png");
			stage.getIcons().add(image);
			// 2. 
	stage.show();
	
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
}
