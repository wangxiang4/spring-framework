package org.springframework.debug1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Spring Bean 生命周期完整流程？
public class Main {

	public static void main(String[] args) {

		// 启动一个ioc增强容器
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		// 获取Bean/懒加载Bean首次创建
		context.getBean(UserService.class);
		// ioc容器关闭
		context.close();

	}

}
