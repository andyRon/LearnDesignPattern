
// 上传下载流程改变：私有云不需要支持access token
public class PrivateImageStore implements ImageStore  {  
	
	public String upload(Image image, String bucketName) {    
		createBucketIfNotExisting(bucketName);    
		//...上传图片到私有云...    
		//...返回图片的url...  
	}  

	public Image download(String url) {    
		//...从私有云下载图片...  
	}  

	private void createBucketIfNotExisting(String bucketName) {    
		// ...创建bucket...    
		// ...失败会抛出异常..  
	}
}
