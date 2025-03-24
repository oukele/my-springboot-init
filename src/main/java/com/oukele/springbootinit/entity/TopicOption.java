package com.oukele.springbootinit.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * <p>
 * 
 * </p>
 *
 * @author oukele
 * @since 2025-03-24
 */
@Getter
@Setter
@ToString
@TableName("d_topic_option")
public class TopicOption implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选项ID
     */
    private Long id;

    /**
     * 选项描述
     */
    private String desc;

    /**
     * 标签集合
     */
    private String tagList;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private LocalDateTime updateUser;

    /**
     * 逻辑删除，0：正常，1：删除
     */
    private Boolean isDelete;
}
