package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;

public class ProductlistController implements Initializable{ // ȭ���� �������� �ʱⰪ �������̽�
	

    @FXML
    private Button btnactivation;
    
    @FXML
    void activation(ActionEvent event) {
    	
    	btnactivation.setText(product.getActivation()); // ���õ� ��ǰ�� ���°� ��ư �ؽ�Ʈ�� ǥ��
    	int pa = product.getP_activation();				// ���� ��ǰ�� ���¸� ��������
    	int ch = pa+1;									// ���º��� [ 1->2, 2->3, 3->1 ]
    	if(ch > 3) ch = 1;								// ch�� 3���� Ŀ���� 1�� �ٲ۴�.
    	if(ch == 1) { // ����� ���°� 1�̸� �ŷ����� ������Ʈ ó��
    		ProductDao.getProductDao().activationupdate(1, product.getP_no()); // ������Ʈ db ó��
    		producttableload(); // ���̺� ���ΰ�ħ
    		btnactivation.setText("�ŷ�����"); // ��ư �ؽ�Ʈ ����
    	}
    	if(ch == 2) {
    		ProductDao.getProductDao().activationupdate(2, product.getP_no());
    		producttableload();
    		btnactivation.setText("�ŷ���");
    		}
    	if(ch == 3) {
    		ProductDao.getProductDao().activationupdate(3, product.getP_no());
    		producttableload();
    		btnactivation.setText("�ǸſϷ�");
    		}
    }
    
    public void producttableload() {
    	ObservableList<Product> products = ProductDao.getProductDao().productlist();
		
		// 2. ��ǰ����� ���̺�信 �־��ֱ�
		productlist.setItems(products);
		// xpdlqmfdp ���� �ϳ��� �����ͼ� ����Ʈ�� �ʵ�� ����
		TableColumn tc = productlist.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_name"));
		
		tc= productlist.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_category"));
		
		tc= productlist.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_price"));
		
		tc= productlist.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("activation"));
		
		tc= productlist.getColumns().get(4);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_date"));
		
		// ���̺��� Ŭ�������� ������ ��������
			// 1. ���̺�信 Ŭ�� �̺�Ʈ 
//		productlist.setOnMouseClicked( e -> { ����});
		productlist.setOnMouseClicked( e -> { 
			// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������
			if(e.getButton().equals(MouseButton.PRIMARY)) {
				// 3. ���̺� �信�� Ŭ���� ���� ������ [ ��ü ]
				product = productlist.getSelectionModel().getSelectedItem();
				// 4. ���õ� �̹������ �������� 
				Image image = new Image(product.getP_img());
				pimg.setImage(image);
				// 5. �׿�
				lblpname.setText(product.getP_name());
				lblpcontents.setText(product.getP_contents());
				lblpprice.setText(String.format("%,d", product.getP_price()));
				String writer = MemberDao.getMemberDao().midcheck(product.getM_no());
				lblmid.setText(writer);
				
				if(MainpageController.getinstance().getloginid().equals(writer)) {
					btndelete.setVisible(true);
					btnupdate.setVisible(true);
					btnactivation.setVisible(true);
				}else {
					btndelete.setVisible(false);
					btnupdate.setVisible(false);
					btnactivation.setVisible(false);
				}
				// ��ư �ؽ�Ʈ
				btnactivation.setText(product.getActivation());
			}
			
		});
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		btndelete.setVisible(false);
		btnupdate.setVisible(false);
		btnactivation.setVisible(false);
		producttableload();
		// 1. db���� ��ǰ ��� ��������
		
	}
	
	public static Product product;
    @FXML
    private Button btndelete;

    @FXML
    private Button btnregister;
    	
    @FXML
    private Button btnupdate;

    @FXML
    private Label lblmid;

    @FXML
    private Label lblpcontents;

    @FXML
    private Label lblpname;

    @FXML
    private Label lblpprice;

    @FXML
    private ImageView pimg;

    @FXML
    private TableView<Product> productlist;

    @FXML
    void delete(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("��ǰ�� �����Ͻðڽ��ϱ�?");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get() == ButtonType.OK) {
    		ProductDao.getProductDao().delete(product.getP_no());
    		Alert alert2 = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("�����Ǿ����ϴ�"); alert.showAndWait();
    		MainpageController.getinstance().loadpage("productlist");
    	}
    }

    @FXML
    void register(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productregister");
    }

    @FXML
    void update(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productupdate");
    }

}
