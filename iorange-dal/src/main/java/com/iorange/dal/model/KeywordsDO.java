package com.iorange.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 关键词 DO
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/5/3
 */
@Getter
@Setter
@ToString(callSuper = true)
public class KeywordsDO extends BaseDO {
    
    private static final long serialVersionUID = 8230005524181043409L;
    
    /** 关键词**/
    private String keywords;

    /** 目录ID **/
    private Long directoryId;

    /** 搜索次数 **/ 
    private Long searchNum;
}
