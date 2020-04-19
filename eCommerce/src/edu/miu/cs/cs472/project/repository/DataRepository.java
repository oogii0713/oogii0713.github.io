package edu.miu.cs.cs472.project.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.miu.cs.cs472.project.model.BillingDetails;
import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Item;
import edu.miu.cs.cs472.project.model.Order;
import edu.miu.cs.cs472.project.model.Product;
import edu.miu.cs.cs472.project.model.ShoppingCard;

public class DataRepository{
	List<Category> categoryList;
	List<Product> productList;
	ShoppingCard shoppingCard;
	List<Order> orderList;
	
	/*Added by: Namuun; April 14, 2020*/
	List<Product> featuredProducts;
	List<Product> topSellingProducts;
	List<Product> hotOfferProducts;
	
	public DataRepository() {
		initData();
	}
	public void initData() {
		categoryList = new ArrayList<>();
		productList = new ArrayList<>();
		shoppingCard = new ShoppingCard();
		orderList = new ArrayList<>();
		
		/*Added by: Namuun; April 14, 2020; START*/
		featuredProducts = new ArrayList<>();
		topSellingProducts = new ArrayList<>();
		hotOfferProducts = new ArrayList<>();
		/*Added by: Namuun; April 14, 2020; END*/
		
		System.out.println("initializing data");
		Category c1 = new Category(1,"Headphones");
		Category c2 = new Category(2,"Laptops");
		Category c3 = new Category(3,"Smartphones");
		Category c4 = new Category(4,"Cameras");
		Category c5 = new Category(5,"TV & Audio");
		Category c6 = new Category(6,"Watches");
		/*c5 and c6 added by Namuun*/
		categoryList.addAll(Arrays.asList(c1,c2,c3,c4,c5,c6));
				
		/* Description for products by categegory added by Otgonbayar*/
		String c1Desc = "Superior sound enjoy clear sound and supreme comfort with the OneOdio Studio monitor headphones Large 50 millimeter speaker unit drivers combined with neodymium magnets powerful bass clear vocal and crisp high tones form perfect hi-fi sound";
		String c2Desc = "10th Gen Intel Core i5-1035G4 Processor at 1.1GHz, up to 3.7GHz Max Turbo Frequency with 6MB Intel Smart Cache. Give you the power to surf, stream, and do so much more. Edit photos and videos faster than ever, and move between programs and Windows quickly.";
		String c3Desc = "OS: OxygenOS based on Android 10, Processor: Qualcomm Snapdragon 855 Plus (Octa-core, 7nm, up to 2.96 GHz) , with Qualcomm AI Engine , Rear camera - Main Sensor: Sony IMX586 Megapixels: 48, Telephoto Lens Megapixels: 12, Ultra Wide Angle Lens Megapixels: 16, Front Camera: Megapixels: 16, Display: Size: 6.55 inch Resolution: 2400 x 1080 Pixels 402 PPI Aspect Ratio: 20:9 Type: AMOLED. ";
		String c4Desc = "Kit Includes: Canon PowerShot SX420 IS Digital Camera + NB-11LH Lithium-Ion Battery Pack + CB-2LF Battery Charger + Lens Cap + WS-DC12 Wrist Strap + Limited 1-Year Warranty (All these in Canon box). + 64GB High-Speed SDXC Class 10 Memory Card + Card Reader + Memory Card Wallet + Screen Protector + Vidpro Digital Camera Cleaning Kit";
		String c5Desc = " Fire TV experience built-in - Fire TV Edition brings together live-over-the air TV, and your favorite streaming content on the home screen. Connect any HD antenna (sold separately) to watch live over-the-air TV, or stream movies and shows from Disney+, Netflix, Prime Video, Hulu, HBO and more. Dolby Vision HDR - Enhanced 4K HDR picture with an expanded range of contrast and superior brightness";
		String c6Desc = "If you live an active lifestyle and want to refine your training or you are a newbie and want to get active,or if you want an accurate waterproof tracker that adds a ton of smart watch features and has great battery (7-10 days),yamay 020 is right one to help you stay motivated and stay healthy";
		/* end of Description*/
		
		Product p1 = new Product(1,"ONTEC E Headset",c1Desc,175,"uploads/pro1.png",10,c1);
		Product p2 = new Product(2,"Solo Headset",c1Desc,235,"uploads/pro2.png",10,c1);
		Product p3 = new Product(3,"Ultra Whitte Wireless",c1Desc,350,"uploads/pro3.png",10,c1);
		Product p4 = new Product(4,"Wireless Mondo",c1Desc,266,"uploads/pro33.png",10,c1);
		
		Product p5 = new Product(5,"Tablet Red 8500U 2TB",c2Desc,100,"uploads/pro4.png",10,c2);
		Product p7 = new Product(7,"Laptop Sens 7200L",c2Desc,760,"uploads/pro8.png",10,c2);
		
		/*Added by: Namuun; April 14, 2020; START:*/
		featuredProducts.addAll(Arrays.asList(p1,p2,p3));
		
		Product p8 = new Product(8,"Ellite Pro Book 15'6 7500U",c2Desc,850.00,"uploads/pro5.png",10,c2);
		Product p9 = new Product(9,"Tablet VX3000 Extra Light",c2Desc,850.00,"uploads/pro6.png",10,c2);
		topSellingProducts.addAll(Arrays.asList(p5,p8,p9));
		
		Product p10 = new Product(10,"Tablet VX4000 8500 3TB",c2Desc,940,"uploads/pro7.png",10,c2);
		Product p11 = new Product(11,"Laptop XS3000 WiFi Smart",c2Desc,1200,"uploads/pro9.png",10,c2);
		hotOfferProducts.addAll(Arrays.asList(p10,p7,p11));
		/*Added by: Namuun; April 14, 2020; END*/
		
		/*Added by: Munkh-Erdene; April 15, 2020; START:*/
		Product p12 = new Product(12,"Smartphone Tablet Spring2000","Sample product",400,"uploads/pro10.png",10,c3);
		Product p13 = new Product(13,"Extra Thin Elitte",c3Desc,700,"uploads/pro11.png",10,c3);
		Product p14 = new Product(14,"Notebook Polo 4000",c3Desc,399,"uploads/pro12.png",10,c3);
		Product p15 = new Product(15,"Smartphone Elitte Pro",c3Desc,699,"uploads/pro13.png",10,c3);
		Product p16 = new Product(16,"Smartphone XD5000",c3Desc,799,"uploads/pro14.png",10,c3);

		Product p17 = new Product(17,"Camera Xd Pro With Waterproof Cover",c4Desc,499,"uploads/pro15.png",10,c4);
		Product p18 = new Product(18,"Camera HD200 X100",c4Desc,479,"uploads/pro16.png",10,c4);
		Product p19 = new Product(19,"Smart Camera Extra Mini2000",c4Desc,799,"uploads/pro17.png",10,c4);
		Product p20 = new Product(20,"ONTEC Camera W5000",c4Desc,400,"uploads/pro18.png",10,c4);
		Product p21 = new Product(21,"Classic Camera E5000",c4Desc,400,"uploads/pro19.png",10,c4);
		
		Product p22 = new Product(22,"TV Premium 2000",c5Desc,799,"uploads/pro20.png",10,c5);
		Product p23 = new Product(23,"Camera HD200 X100",c5Desc,799,"uploads/pro21.png",10,c5);
		Product p24 = new Product(24,"Smart Camera Extra Mini2000",c5Desc,900,"uploads/pro22.png",10,c5);
		Product p25 = new Product(25,"ONTEC Camera W5000",c5Desc,399,"uploads/pro23.png",10,c5);
		
		Product p26 = new Product(26,"Smart Watch",c6Desc,366,"uploads/pro24.png",10,c6);
		Product p27 = new Product(27,"Smart Watch Zoop",c6Desc,100,"uploads/pro25.png",10,c6);
		Product p28 = new Product(28,"Hybrid Smartwatch Waterproof",c6Desc,755,"uploads/pro26.png",10,c6);
		/*Added by: Munkh-Erdene; April 15, 2020; END:*/
		
		productList.addAll(Arrays.asList(p1,p2,p3,p4,p5,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28));
		Item i1 = new Item(p1,3);
		Item i2 = new Item(p2,2);
		shoppingCard.addItem(i1);
		shoppingCard.addItem(i2);
	
	}
	public Product getProductById(int productId) {
		return productList.stream().filter(p -> p.getId() == productId).findAny().orElse(null);
	}
	public Item getItemByProductId(int productId) {
		return shoppingCard.getItems().stream().filter(p -> p.getProduct().getId() == productId).findAny().orElse(null);
	}
	public ShoppingCard addItemToCard(Item item) {
		shoppingCard.addItem(item);
		return shoppingCard;
	}
	public List<Category> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public ShoppingCard getShoppingCard() {
		return shoppingCard;
	}
	public void setShoppingCard(ShoppingCard shoppingCard) {
		this.shoppingCard = shoppingCard;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	public List<Product> getFeaturedProducts() {
		return featuredProducts;
	}
	public void setFeaturedProducts(List<Product> featuredProducts) {
		this.featuredProducts = featuredProducts;
	}
	public List<Product> getTopSellingProducts() {
		return topSellingProducts;
	}
	public void setTopSellingProducts(List<Product> topSellingProducts) {
		this.topSellingProducts = topSellingProducts;
	}
	public List<Product> getHotOfferProducts() {
		return hotOfferProducts;
	}
	public void setHotOfferProducts(List<Product> hotOfferProducts) {
		this.hotOfferProducts = hotOfferProducts;
	}	
	
	/*Added by: Namuun; April 15, 2020; START:*/
	public Order addOrder(int orderId, double sum, BillingDetails bd) {
		Order newOrder = new Order(orderId,this.shoppingCard.getItems(),sum,bd);
		this.orderList.add(newOrder);
		return newOrder;
	}
	public Item removeIitemFromCard(int productId) {
		Item item = getItemByProductId(productId);
		this.shoppingCard.removeItem(item);		
		return item;
	}
	public void emptyShoppingCart() {
		this.shoppingCard = new ShoppingCard();
	}
	/*Added by: Namuun; April 15, 2020; END:*/
	
	/** burmaa */
	public Category getCategoryById(int id) {
		Category cat = categoryList.stream().filter(category -> category.getId() == id).findAny().orElse(null);
		return cat;
	}
	/****/
}
