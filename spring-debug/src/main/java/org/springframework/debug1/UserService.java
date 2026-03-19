package org.springframework.debug1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserService  implements InitializingBean {

	public UserService() {
		System.out.println("1. 构造方法");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("3. afterPropertiesSet 初始化");
	}

}
