package com.iorange.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 搜索日志 DO
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/5/2
 */
@Getter
@Setter
@ToString(callSuper = true)
public class SearchLogDO extends BaseDO {
    
    private static final long serialVersionUID = -3867113889715592141L;
    
    /** 搜索内容 **/
    private String searchVal;
}
