package com.oukele.springbootinit.service.impl;

import com.oukele.springbootinit.entity.Topic;
import com.oukele.springbootinit.mapper.TopicMapper;
import com.oukele.springbootinit.service.TopicService;
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
public class TopicServiceImp extends ServiceImpl<TopicMapper, Topic> implements TopicService {

}
