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
@TableName("d_topic")
public class Topic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 题目ID
     */
    private Long id;

    /**
     * 题目名称
     */
    private String title;

    /**
     * 标签集合
     */
    private String tagList;

    /**
     * 选项ID集合
     */
    private String optionIdList;

    /**
     * 题目类型，
1：单选，2：多选
     */
    private String type;

    /**
     * 题目解析
     */
    private String analysis;

    /**
     * 答案ID集合
     */
    private String answerIdList;

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
