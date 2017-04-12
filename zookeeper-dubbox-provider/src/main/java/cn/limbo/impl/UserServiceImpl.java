package cn.limbo.impl;

import cn.limbo.demo.api.UserService;
import cn.limbo.demo.domain.User;

/**
 * Created by limbo on 2017/4/12.
 */
public class UserServiceImpl implements UserService {
	public User getUser(Long id) {
		return new User(id,"username "+id);
	}
}
