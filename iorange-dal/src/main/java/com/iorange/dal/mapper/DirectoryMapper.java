package com.iorange.dal.mapper;

import com.iorange.dal.model.DirectoryDO;
import org.springframework.stereotype.Repository;

/**
 * 目录 数据操作
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/5/2
 */
@Repository
public interface DirectoryMapper {
    
    int insert(DirectoryDO directoryDO);
}
