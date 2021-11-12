package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

import dao.BoardDao;
import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import domain.ProductDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class HomeController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	lbltotalmember.setText(MemberDao.getMemberDao().membercount()+"");
	lbltotalmember.setAlignment(Pos.CENTER);
	
	lbltotalboard.setText(BoardDao.getboardDao().boardcount()+"");
	lbltotalboard.setAlignment(Pos.CENTER);
	
	lbltotalproduct.setText(ProductDao.getProductDao().productcount()+"");
	lbltotalproduct.setAlignment(Pos.CENTER);
	
	// �� ��Ʈ
	// [ �迭 ]
	
	// �迭 ����
//	XYChart.Series series = new XYChart.Series<>();
//	// �迭 �̸�
//	series.setName("�׽�Ʈ");
//	// �迭�� �� ���� �� �ֱ�
//	series.getData().add( new XYChart.Data<>("1",30));
//	series.getData().add( new XYChart.Data<>("2",40));
//	series.getData().add( new XYChart.Data<>("3",50));
//	series.getData().add( new XYChart.Data<>("4",50));
//	// ��Ʈ�� �迭 �߰�
//	lc.getData().add(series);
	
//		// ��ǰ ��� ��¥ = ������ / ��ǰ�� ���� ��
//	XYChart.Series series = new XYChart.Series<>();
//	
//	series.setName("��ϼ�");
//	// ���õ�����
//	ObservableList<Product> products = ProductDao.getProductDao().productlist();
//	// ��¥�� ����
//	ArrayList<ProductDate> dates = new ArrayList<>();
//	for( Product product : products) {
//		String date = product.getP_date().split(" ")[0];
//		Boolean datecheck = true;
//		for(int i = 0; i<dates.size(); i++) {
//			if(dates.get(i).getDate().equals(dates)) {
//				dates.get(i).setCount(dates.get(i).getCount()+1);
//				datecheck = false; break;
//			}
//		}
//		dates.add( new ProductDate(date, 1));
//	}
//
//	for(ProductDate date : dates) {
//		XYChart.Data data = new XYChart.Data<>(date.getDate()+"", date.getCount());
//		series.getData().add(data);
//	}
//	lc.getData().add(series);
	XYChart.Series series = new XYChart.Series<>(); 
	series.setName("��ǰ��");
	
	ArrayList<ProductDate> productDates = ProductDao.getProductDao().productDatelist();
	for(ProductDate productDate : ProductDao.getProductDao().productDatelist()) {
		// 3. �迭 �� �ֱ�
		// �� ����
		XYChart.Data data = new XYChart.Data<>(productDate.getDate(), productDate.getCount());
			// 2. ���� ��� ���� [ //data. setnode(�����̳�); ]
				AnchorPane anchorPane = new AnchorPane();// 1. �����̳� �����
				Label label = new Label(productDate.getCount()+""); // ���̺� ����
				label.setPadding(new Insets(5)); // * setpaddiong (new insets(��ġ) ) : ���� ����
				
				anchorPane.getChildren().add(label); // �����̳� ���̺� �ֱ�
				
				data.setNode(anchorPane); // ���� �����̳� �ֱ�
				
				series.getData().add(data);
	}
	
	lc.getYAxis().setAutoRanging(false); // y�� �ڵ����� ����
	lc.getData().add(series);
	
	// ���̺� ���� ����
	if(productDates.get(productDates.size()-1).getCount()
			> productDates.get(productDates.size()-2).getCount() ) {
		lbldeincrease.setVisible(false);;
	}else {
		lblincrease.setVisible(false);
	}
	
	// ���� ��Ʈ
	
	XYChart.Series series2 = new XYChart.Series<>(); // �迭 ����
	series2.setName("����"); // �迭�̸�
	// �迭�� �� �ֱ�
	 HashMap<String, Integer> hashMap = ProductDao.getProductDao().productcategorylist();
	 String maxcategorykey = " ";
	 int max = 0;
	for(String key : hashMap.keySet()) {
		if(hashMap.get(key) > max ) {
			max = hashMap.get(key);
			maxcategorykey = key;
		}
		XYChart.Data data = new XYChart.Data<>(key, hashMap.get(key));
		series2.getData().add(data);
	}
	bc.getData().add(series2);
	lblcategory.setText(maxcategorykey);
	
	// ���� ��Ʈ
	ObservableList<Product> products = ProductDao.getProductDao().productlist();
	
	ObservableList<PieChart.Data> observableList = FXCollections.observableArrayList();
	for(Product product : products) {
		observableList.add(new PieChart.Data(product.getActivation(), 1));
	}

	pc.setData(observableList);
	
	}
	
	@FXML
	private PieChart pc;
	
	@FXML
	private BarChart bc;
	
	@FXML
	private Label lblcategory;
	
	@FXML
	private Label lbltotalmember;
	
	@FXML
	private Label lbltotalboard;
	
	@FXML
	private Label lbltotalproduct;
	
	@FXML
	private LineChart lc;
	
	@FXML
	private Label lblincrease;
	
	@FXML
	private Label lbldeincrease;
	
	
	
	
	
}
