package controller;

import dao.BoardDao;
import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardwriteController {

    @FXML
    private Button btncancel;

    @FXML
    private Button btnwrite;

    @FXML
    private TextArea txtcontents;

    @FXML
    private TextField txttitle;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardlist");
    }

    @FXML
    void write(ActionEvent event) {
    	Board board = new Board(txttitle.getText(), txtcontents.getText(), MainpageController.getinstance().getloginid());
    	
    	
    	boolean result = BoardDao.getboardDao().write(board);
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(result) {
    		alert.setHeaderText("게시물 등록 성공 ");
    		alert.showAndWait();
    		MainpageController.getinstance().loadpage("boardlist");
    	}
    	else {
    		alert.setHeaderText("게시물 등록 실패");
    		alert.showAndWait();
    	}
    }
}
