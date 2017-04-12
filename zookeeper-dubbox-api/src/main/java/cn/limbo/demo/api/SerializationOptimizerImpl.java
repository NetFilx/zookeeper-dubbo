package cn.limbo.demo.api;

import cn.limbo.demo.domain.User;
import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by limbo on 2017/4/12.
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {
	public Collection<Class> getSerializableClasses() {
		List<Class> classes = new LinkedList<Class>();
		classes.add(User.class);
		return classes;
	}
}
