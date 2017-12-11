package wang.angi.test.spring.javaconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import angi.wang.sample.spring.javaconfig.App1Config;
import angi.wang.sample.spring.javaconfig.VideoService;

@RunWith(SpringJUnit4ClassRunner.class)
//bean容器配置
@ContextConfiguration(classes = { App1Config.class })
//@ContextConfiguration(locations = {"app-context.xml"})
public class SampleTest {

	@Autowired
	@Qualifier("videoService1")
	private VideoService videoService11;

	@Autowired
	@Qualifier("videoService2")
	private VideoService videoService22;

	@Test
	public void testAbc1() {
		videoService11.sayHello("Angi");
		videoService22.sayHello("Wang");
		Assert.assertNotEquals(videoService11, videoService22);
	}

}
