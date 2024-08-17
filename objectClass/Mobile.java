package objectClass;

public class Mobile {
public String brandName;
public int readOnlyMemoryStorage;
public String color;
public String cameraPixel;
public double price;
public String batteryCapacity;
public String displayType;
public long imeiNumber;
public Mobile(String brandName,int readOnlyMemoryStorage,String color,String cameraPixel,double price,String batteryCapacity,String displayType,long imeiNumber) {
this.brandName=brandName;
this.readOnlyMemoryStorage=readOnlyMemoryStorage;
this.color=color;
this.price=price;
this.batteryCapacity=batteryCapacity;
this.displayType=displayType;
this.imeiNumber=imeiNumber;
}
@Override
public String toString() {
	return "BrandName :" +brandName;
}
@Override
public int hashCode() {
	return (int) imeiNumber;
}
public boolean equals(Object o) {
	Mobile downCastedoppo=(Mobile) o;
	return this.price==downCastedoppo.price;	
}
public static void main(String[] args) {
	Mobile vivo=new Mobile("vivo",64,"black","2mp",9999.9,"10000mah","samoled",32145698701l);
	Mobile oppo=new Mobile("oppo",128,"blue","6mp",5999.9,"6000mah","samoled",987654321009l);
	System.out.println(vivo.toString());
	System.out.println(oppo.toString());
	System.out.println(oppo);
	if(vivo.equals(oppo)) {
		System.out.println("both price are equal");
	}
	else {
		System.out.println("both price are not equal");
	}
	System.out.println(vivo.hashCode());
	System.out.println(oppo.hashCode());
}
}

