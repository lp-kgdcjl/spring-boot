package com.lps.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/*
 * 所有的dao层都应该继承这个接口
 * 但是Spring-boot启动类，@MapperScan不能扫描到这个类，所以单独的放在一起一个包中
 */
public interface TkMapper<T> extends Mapper<T>,MySqlMapper<T> {

}
