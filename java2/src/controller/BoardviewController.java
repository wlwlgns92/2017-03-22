package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.BoardDao;
import domain.Board;
import domain.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.text.Text;

public class BoardviewController implements Initializable{
	
	// 개별
	Board board = BoardlistController.board;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		replytableload();
	// 조회수 증가
	BoardDao.getboardDao().viewupdate(board.getB_no());
	
	txttitle.setText(board.getB_title());
	txtcontents.setText(board.getB_contents());
	lblwrite.setText("작성자 : " + board.getB_write());
	lbldate.setText("작성일 : " + board.getB_date().split(" ")[0]);
	lblview.setText("조회수 : " + (board.getB_view()+1)); // +1 은 화면 출력을 위해서
	if(!MainpageController.getinstance().getloginid().equals(board.getB_write())) {
		
		// 게시물 작성자와 로그인된 아이디가 다를경우 버튼 숨기기
		btndelete.setVisible(false);
		btnupdate.setVisible(false);
		
		// 신빌더에서 하기 귀찮은 사람들은 이렇게
//		txttitle.setDisable(false);
//		txtcontents.setDisable(false);
//		txttitle.setEditable(false);
//		txtcontents.setEditable(false);
	}
		
	}
    @FXML
    private TextArea txtreply;

    @FXML
    private Button btncancel;

    @FXML
    private Button btndelete;
    	
    @FXML
    private Button btnreplywrite;

    @FXML
    private Button btnupdate;

    @FXML
    private TableView<Reply> replylist;
    
    // 테이블 값 로드 메소드
    public void replytableload() {
    	
    	ObservableList<Reply> replys = BoardDao.getboardDao().replylist(board.getB_no());
    	
    	TableColumn tc = replylist.getColumns().get(0); // 테이블내 첫번째 열
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_no"));

    	tc = replylist.getColumns().get(1); // 테이블내 두번째 열
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_write"));
    	
    	tc = replylist.getColumns().get(2); // 테이블내 세번째 열
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_contents"));
    	
    	tc = replylist.getColumns().get(3);// 테이블내 네번째 열
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_date"));
    	
    	replylist.setItems(replys);
    }

    @FXML
    private TextArea txtcontents;

    @FXML
    private TextField txttitle;

    @FXML
    private Label lbldate;

    @FXML
    private Label lblview;

    @FXML
    private Label lblwrite;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardlist");
    }

    @FXML
    void delete(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("해당 게시물을 삭제하시겠습니까?");
    	alert.setTitle("알림");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get() == ButtonType.OK) {
    		boolean result = BoardDao.getboardDao().delete(board.getB_no());
    		if(result) {
    			MainpageController.getinstance().loadpage("boardlist");
    		}
    	}
 
    }

    @FXML
    void replywrite(ActionEvent event) {
    	Reply reply = new Reply(txtreply.getText(), 
    						MainpageController.getinstance().getloginid(), board.getB_no());
    	boolean result = BoardDao.getboardDao().replywrite(reply);
    	if(result) { 
    		Alert alert = new Alert( AlertType.INFORMATION);
    		alert.setHeaderText("댓글등록");
    		alert.showAndWait();
    		
    		replytableload();
    		
    		// 댓글입력창 초기화
    		txtreply.setText("");
    	}
    }
    boolean upcheck = true; // 업데이트 버튼 스위치 변수
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(upcheck) {
    	alert.setHeaderText("내용 수정후 다시 버튼 클릭시 완료됩니다요");
    	alert.showAndWait();
    	
    	txttitle.setEditable(true);
    	txtcontents.setEditable(true);
    	upcheck = false;
    	}
    	else { 
    		BoardDao.getboardDao().update(board.getB_no(), txttitle.getText(), txtcontents.getText());
    		alert.setHeaderText("수정 완료다요");
        	alert.showAndWait();
        	upcheck = true;
        	txttitle.setEditable(false);
        	txtcontents.setEditable(false);
    	}
    }

}
