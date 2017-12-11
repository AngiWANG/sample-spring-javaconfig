package angi.wang.sample.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ App2Config.class, App3Config.class })
public class App1Config {
	@Bean(initMethod = "init", destroyMethod = "destory")
	public ISaveVideoInfoDao saveVideoInfoDao() {
		return new SaveVideoInfoDao();
	}

	// 引用方法注入
	@Bean
	public IVideoService videoService1() {
		IVideoService videoService = new VideoService(saveVideoInfoDao());
		return videoService;
	}
}
