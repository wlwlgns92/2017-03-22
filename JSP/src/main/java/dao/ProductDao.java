package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductDao extends DB{

	public ProductDao() {
		super();
	}
	
	public static ProductDao productDao = new ProductDao();
	public static ProductDao getProductDao() { return productDao; }
	
	// 1. 제품 등록 메소드
	public boolean productwrite(Product product) {
		String sql = "insert into product(p_name, p_price, p_category, p_manufacturer, p_active, p_size, p_stock, p_img, p_contents ) values(?,?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, product.getP_name());
			ps.setInt(2, product.getP_price()); 
			ps.setString(3, product.getP_category()); 
			ps.setString(4, product.getP_manufacturer());
			ps.setInt(5, product.getP_active());
			ps.setString(6, product.getP_size());
			ps.setInt(7, product.getP_stock());
			ps.setString(8, product.getP_img());
			ps.setString(9, product.getP_contents());
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {} return false;
	}
	// 2. 제품 모든 출력 메소드
	public ArrayList<Product> getproductlist(String key, String keyword) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		String sql = null;
		if(key != null && keyword != null) {
			sql = "select * from product where "+key+" = '"+keyword+"'";
		}else {
			sql = "select * from product";
		}
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Product product = new Product(rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getInt(7),
						rs.getString(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(11));
				products.add(product);
			}
			return products;
		} catch (Exception e) {System.out.println(e);} return null;
	}
	// 3. 제품 조건 출력 [ 검색/카테고리 ]  
	
	// 4. 제품상태 수정
	public boolean activeupdate(int p_num) {
		try {
		String sql = "select p_active from product where p_num ="+p_num;
		ps = con.prepareStatement(sql); rs = ps.executeQuery();
			if(rs.next()) {
				int p_active = rs.getInt(1) + 1;
				if( p_active == 4) { p_active = 1; } 
				sql = "update product set p_active = "+p_active+" where p_num ="+p_num;
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				return true;
			}
		} catch (Exception e) {} return false;
	}
	
	// 5. 제품 삭제
	public boolean delete(int p_num) {
		String sql = "delete from product where p_num = "+p_num;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate(); return true;
		} catch (Exception e) {} return false;
	}
	// 제품 수정
	public boolean productupdate(Product product) {
		
			
		String sql = "select * from product where p_num = "+product.getP_num();
		try {
		ps = con.prepareStatement(sql); rs = ps.executeQuery();
		 if(rs.next()) {
			 sql = "update product set p_name = ?, p_price = ?, p_category = ?, p_manufacturer = ?, p_size = ?, p_stock = ?, p_img = ?, p_contents = ? where p_num = "+product.getP_num();
			 	ps.setString(1, product.getP_name());
				ps.setInt(2, product.getP_price()); 
				ps.setString(3, product.getP_category()); 
				ps.setString(4, product.getP_manufacturer());
				ps.setString(5, product.getP_size());
				ps.setInt(6, product.getP_stock());
				ps.setString(7, product.getP_img());
				ps.setString(8, product.getP_contents());
				ps.executeUpdate(); return true;
		 }	
		} catch (Exception e) {System.out.println(e);} return false;
	}
}
