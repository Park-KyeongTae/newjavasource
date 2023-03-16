package shop;



public class User {
private String name;
private PayType PayType;
public User(String name, shop.PayType payType) {
	super();
	this.name = name;
	PayType = payType;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public PayType getPayType() {
	return PayType;
}
public void setPayType(PayType payType) {
	PayType = payType;
}


}
