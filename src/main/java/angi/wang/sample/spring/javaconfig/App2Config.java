package angi.wang.sample.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App2Config {

	// 方法参数注入
	@Bean
	public IVideoService videoService2(ISaveVideoInfoDao saveVideoInfoDao) {
		IVideoService videoService = new VideoService(saveVideoInfoDao);
		return videoService;
	}
}
