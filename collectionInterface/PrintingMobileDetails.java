package collectionInterface;

import java.util.ArrayList;

public class PrintingMobileDetails {
public static void main(String[] args) {
	Mobile samsung= new Mobile("Red",120,"280px","LED");
	Mobile redmi=new Mobile("Blue",320,"380px","LEd");
	Mobile realme=new Mobile("gray",420,"420px","LED");
	Mobile oneplus=new Mobile("white",400,"400px","LED");
	ArrayList alObject=new ArrayList();
	alObject.add(samsung);              
	alObject.add(redmi);
	alObject.add(realme);
	alObject.add(oneplus);
	for(Object o:alObject) {
		if(o.equals(samsung)) {
			Mobile m=(Mobile) o;
		System.out.println("the color of samsung mobile:"+m.mobileColor);
	}
		
	if(o.equals(redmi)) {
		Mobile m=(Mobile) o;
		System.out.println("the Ramsize of oneplus mobile:"+m.mobileRamSize);
	}
	if(o.equals(realme)) {
		Mobile m=(Mobile) o;
		System.out.println("the cameraPixel of realme mobile:"+m.mobileCameraPixel);
		
	}
	if(o.equals(oneplus)) {
		Mobile m =(Mobile) o;
		System.out.println("the Display of oneplus mobile is:"+m.mobileDisplaytype);
	}
	}

}
}
class Mobile{
	public String mobileColor;
	public int mobileRamSize;
	public String  mobileCameraPixel;
	public String mobileDisplaytype;
	public Mobile(String mobileColor, int mobileRamSize, String mobileCameraPixel, String mobileDisplaytype) {
		this.mobileColor = mobileColor;
		this.mobileRamSize = mobileRamSize;
		this.mobileCameraPixel = mobileCameraPixel;
		this.mobileDisplaytype = mobileDisplaytype;
	}
	
}
