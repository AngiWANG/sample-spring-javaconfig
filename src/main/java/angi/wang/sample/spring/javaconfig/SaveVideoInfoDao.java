package angi.wang.sample.spring.javaconfig;

public class SaveVideoInfoDao implements ISaveVideoInfoDao {

	public String hello(String name) {
		return "hello, " + name;
	}

	public void init() {
		System.out.println("init SaveVideoInfoDao instance");
	}

	public void destory() {
		System.out.println("destory SaveVideoInfoDao instance");
	}
}
