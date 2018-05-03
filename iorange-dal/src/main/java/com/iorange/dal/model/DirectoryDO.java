package com.iorange.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 目录 DO
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/5/2
 */
@Getter
@Setter
@ToString(callSuper = true)
public class DirectoryDO extends BaseDO {
    
    private static final long serialVersionUID = -1896950075023805034L;

    /** 名称 **/
    private String dirName;

    /** 级别 **/
    private String dirLevel;

    /** 父ID **/
    private Long parentId;

    /** 状态 **/
    private String status;

    /** 路径 **/
    private String url;

    /** 类型 **/
    private String dirType;

    /** 备注 **/
    private String remark;
}
