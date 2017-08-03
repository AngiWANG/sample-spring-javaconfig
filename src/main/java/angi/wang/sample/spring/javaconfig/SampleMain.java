package angi.wang.sample.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App1Config.class);
		ctx.registerShutdownHook();
		VideoService videoService1 = ctx.getBean("videoService1", VideoService.class);
		videoService1.sayHello("abc");
		VideoService videoService2 = ctx.getBean("videoService2", VideoService.class);
		videoService2.sayHello("def");
	}
}
