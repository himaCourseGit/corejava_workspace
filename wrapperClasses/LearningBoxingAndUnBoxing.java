package wrapperClasses;

public class LearningBoxingAndUnBoxing {
	public static void main(String[] args) {
		byte byteData=125;
		Byte byteObject=new Byte(byteData);//BOXING
		byte bytePreDefinedData=byteObject.byteValue();//UNBOXING
		System.out.println(bytePreDefinedData);
		System.out.println(byteObject);
		
		Long longObject = new Long(234324324234223l);
		long longPreDefinedData=longObject.longValue();
		System.out.println(longPreDefinedData);
		System.out.println(longObject);
		
	}

}
