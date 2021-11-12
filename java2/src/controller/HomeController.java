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
	
	// 선 차트
	// [ 계열 ]
	
	// 계열 생성
//	XYChart.Series series = new XYChart.Series<>();
//	// 계열 이름
//	series.setName("테스트");
//	// 계열에 값 설정 및 넣기
//	series.getData().add( new XYChart.Data<>("1",30));
//	series.getData().add( new XYChart.Data<>("2",40));
//	series.getData().add( new XYChart.Data<>("3",50));
//	series.getData().add( new XYChart.Data<>("4",50));
//	// 차트에 계열 추가
//	lc.getData().add(series);
	
//		// 제품 등록 날짜 = 가로축 / 제품수 세로 축
//	XYChart.Series series = new XYChart.Series<>();
//	
//	series.setName("등록수");
//	// 뺴올데이터
//	ObservableList<Product> products = ProductDao.getProductDao().productlist();
//	// 날짜로 구분
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
	series.setName("제품수");
	
	ArrayList<ProductDate> productDates = ProductDao.getProductDao().productDatelist();
	for(ProductDate productDate : ProductDao.getProductDao().productDatelist()) {
		// 3. 계열 값 넣기
		// 값 설정
		XYChart.Data data = new XYChart.Data<>(productDate.getDate(), productDate.getCount());
			// 2. 값에 노드 설정 [ //data. setnode(컨테이너); ]
				AnchorPane anchorPane = new AnchorPane();// 1. 컨테이너 만들기
				Label label = new Label(productDate.getCount()+""); // 레이블 생성
				label.setPadding(new Insets(5)); // * setpaddiong (new insets(수치) ) : 안쪽 여백
				
				anchorPane.getChildren().add(label); // 컨테이너 레이블 넣기
				
				data.setNode(anchorPane); // 값에 컨테이너 넣기
				
				series.getData().add(data);
	}
	
	lc.getYAxis().setAutoRanging(false); // y축 자동설정 끄기
	lc.getData().add(series);
	
	// 레이블 증감 설정
	if(productDates.get(productDates.size()-1).getCount()
			> productDates.get(productDates.size()-2).getCount() ) {
		lbldeincrease.setVisible(false);;
	}else {
		lblincrease.setVisible(false);
	}
	
	// 막대 차트
	
	XYChart.Series series2 = new XYChart.Series<>(); // 계열 생성
	series2.setName("상의"); // 계열이름
	// 계열에 값 넣기
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
	
	// 원형 차트
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
