package com.oukele.springbootinit.service.impl;

import com.oukele.springbootinit.entity.Group;
import com.oukele.springbootinit.mapper.GroupMapper;
import com.oukele.springbootinit.service.GroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author oukele
 * @since 2025-03-24
 */
@Service
public class GroupServiceImp extends ServiceImpl<GroupMapper, Group> implements GroupService {

}
