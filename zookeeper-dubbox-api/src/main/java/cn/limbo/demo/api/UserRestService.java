package cn.limbo.demo.api;

import cn.limbo.demo.domain.User;

import javax.validation.constraints.Min;

/**
 * Created by limbo on 2017/4/12.
 */
public interface UserRestService {

	User getUser(@Min(value = 1L,message = "User ID must be greater than 1") Long id);

}
