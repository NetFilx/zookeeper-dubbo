package cn.limbo.process;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by limbo on 2017/4/12.
 */
public class DemoProvider {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
		context.start();
		System.out.println("服务已经启动！");
		//模拟服务一直在提供
		System.in.read();
	}

}
