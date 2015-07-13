package com.itqimeng.generator;

import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

public class JavaTypeResolverImpl extends JavaTypeResolverDefaultImpl{
	
	/**
	 * 获取数据库数据类型对应的jdbc信息
	 * @param key
	 * @return
	 */
	public JdbcTypeInformation getJdbcTypeInformation(Integer key){
		JdbcTypeInformation result = typeMap.get(key);
		return result;
	}
	
}
