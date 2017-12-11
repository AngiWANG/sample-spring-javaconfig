package angi.wang.sample.spring.javaconfig;

public class VideoService implements IVideoService {
	private ISaveVideoInfoDao saveVideoInfoDao;

	public VideoService(ISaveVideoInfoDao saveVideoInfoDao) {
		this.saveVideoInfoDao = saveVideoInfoDao;
	}

	public void sayHello(String name) {
		System.out.println(saveVideoInfoDao.hello(name));
	}

}
