package com.iorange.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础类DO
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/5/2
 */
@Getter
@Setter
@ToString(exclude = {"createdAt", "createdBy", "updatedAt", "updatedBy"})
public class BaseDO implements Serializable {
    
    private static final long serialVersionUID = -1507588816269190341L;
    
    /** 主键ID **/
    private Long id;

    /** 创建时间 **/
    private Date createdAt;

    /** 创建人 **/
    private String createdBy;

    /** 更新时间 **/
    private Date updatedAt;

    /** 更新人 **/
    private String updatedBy;
}
