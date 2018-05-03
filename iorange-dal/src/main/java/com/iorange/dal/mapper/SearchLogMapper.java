package com.iorange.dal.mapper;

import com.iorange.dal.model.SearchLogDO;
import org.springframework.stereotype.Repository;

/**
 * 搜索日志 数据操作
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/5/2
 */
@Repository
public interface SearchLogMapper {
    
    int insert(SearchLogDO searchLogDO);
}
