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
    	// ��ȿ���˻� ����[�����ؾ���]
    	
    	String pname = txtpname.getText(); // ��ǰ��
    	String pcontents = txtpcontents.getText(); // ��ǰ����
    	int pprice = Integer.parseInt(txtpprice.getText()); // ������ ����ȯ
    	String pcategory = "";
    	if(opt_1.isSelected()) { pcategory = "�Ƿ�"; }
    	if(opt_2.isSelected()) { pcategory = "�Ź�"; }
    	if(opt_3.isSelected()) { pcategory = "����"; }
    	if(opt_4.isSelected()) { pcategory = "acc"; }
    	
    	// �α��ε� id�� ȸ����ȣ �˻� db
    	int m_no = MemberDao.getMemberDao().mnocheck(MainpageController.getinstance().getloginid());
    			
    	// ��üȭ [ �����ʱⰪ = 1 ]
    	Product product = new Product(pname, pimage, pcontents, pcategory, pprice, 1, m_no);
    	
    	// db
    	boolean result = ProductDao.getProductDao().register(product);
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(result) {
    		alert.setHeaderText("��ǰ ��� ����");
    		alert.showAndWait();
    		MainpageController.getinstance().loadpage("productlist"); // ������ ��ȯ
    	}
    }
	private String pimage;
	private Stage stage;
	
    @FXML
    void imgadd(ActionEvent event) {
    	
    	// 1. ���� ���� Ŭ����
    	FileChooser fileChooser = new FileChooser(); // ���� ���ý� ��� ����
    	// 2. ���� �������� ����  getExtensionFilters : ������ ���� ����
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("�׸����� : Image File", "*png", "*jpg", "*gif"));
    	// 3. ���������� ���ϼ���Ŭ���� �ֱ�
    	File file = fileChooser.showOpenDialog(stage);
    	
    	lblimgpath.setText("���� ��� : " + file.getPath());
    	pimage = file.toURI().toString(); // ������ ���� ���
    	
    	Image image = new Image(pimage);
    	pimg.setImage(image);
    }

    

}
