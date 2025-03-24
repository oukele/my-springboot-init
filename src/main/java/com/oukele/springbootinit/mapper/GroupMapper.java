package com.oukele.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oukele.springbootinit.entity.Group;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author oukele
 * @since 2025-03-24
 */
@Mapper
public interface GroupMapper extends BaseMapper<Group> {

}

