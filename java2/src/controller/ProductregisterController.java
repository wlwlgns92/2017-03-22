package controller;

import java.io.File;

import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ProductregisterController {


    @FXML
    private Button btncancel;

    @FXML
    private Button btnpimgadd;

    @FXML
    private Button btnregister;

    @FXML
    private ToggleGroup category;

    @FXML
    private Label lblimgpath;

    @FXML
    private RadioButton opt_1;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    private ImageView pimg;

    @FXML
    private TextArea txtpcontents;

    @FXML
    private TextArea txtpname;

    @FXML
    private TextArea txtpprice;
    
    public static ProductregisterController instance;
    
    public ProductregisterController() {
    	instance = this;
    }
    
 
    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productlist");
    }

    @FXML
    void register(ActionEvent event) {
    	// 유효성검사 생략[원래해야함]
    	
    	String pname = txtpname.getText(); // 제품명
    	String pcontents = txtpcontents.getText(); // 제품설명
    	int pprice = Integer.parseInt(txtpprice.getText()); // 정수형 형변환
    	String pcategory = "";
    	if(opt_1.isSelected()) { pcategory = "의류"; }
    	if(opt_2.isSelected()) { pcategory = "신발"; }
    	if(opt_3.isSelected()) { pcategory = "가방"; }
    	if(opt_4.isSelected()) { pcategory = "acc"; }
    	
    	// 로그인된 id의 회원번호 검색 db
    	int m_no = MemberDao.getMemberDao().mnocheck(MainpageController.getinstance().getloginid());
    			
    	// 객체화 [ 상태초기값 = 1 ]
    	Product product = new Product(pname, pimage, pcontents, pcategory, pprice, 1, m_no);
    	
    	// db
    	boolean result = ProductDao.getProductDao().register(product);
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(result) {
    		alert.setHeaderText("제품 등록 성공");
    		alert.showAndWait();
    		MainpageController.getinstance().loadpage("productlist"); // 페이지 전환
    	}
    }
	private String pimage;
	private Stage stage;
	
    @FXML
    void imgadd(ActionEvent event) {
    	
    	// 1. 파일 선택 클래스
    	FileChooser fileChooser = new FileChooser(); // 파일 선택시 경로 저장
    	// 2. 파일 스테이지 설정  getExtensionFilters : 선택할 파일 필터
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("그림파일 : Image File", "*png", "*jpg", "*gif"));
    	// 3. 스테이지에 파일선택클래스 넣기
    	File file = fileChooser.showOpenDialog(stage);
    	
    	lblimgpath.setText("파일 경로 : " + file.getPath());
    	pimage = file.toURI().toString(); // 파일의 실제 경로
    	
    	Image image = new Image(pimage);
    	pimg.setImage(image);
    }

    

}
