package angi.wang.sample.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App3Config {
	
	private ISaveVideoInfoDao saveVideoInfoDao;
	
	// 构造参数注入
	public App3Config(ISaveVideoInfoDao saveVideoInfoDao){
		this.saveVideoInfoDao = saveVideoInfoDao;
	}

	@Bean
	public IVideoService videoService3() {
		IVideoService videoService = new VideoService(saveVideoInfoDao);
		return videoService;
	}
}
