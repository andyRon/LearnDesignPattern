
// ImageStore的使用举例
public class ImageProcessingJob {  
	private static final String BUCKET_NAME = "ai_images_bucket";  //...省略其他无关代码...    

	public void process() {    
		Image image = ...;	//处理图片，并封装为Image对象    
		ImageStore imageStore = new PrivateImageStore(...);    
		imagestore.upload(image, BUCKET_NAME);  
	}
}