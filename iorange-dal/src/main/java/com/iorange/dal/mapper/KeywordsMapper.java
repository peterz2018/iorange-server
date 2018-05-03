package com.iorange.dal.mapper;

import com.iorange.dal.model.KeywordsDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 关键词 数据操作
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/5/3
 */
@Repository
public interface KeywordsMapper {
    
    int insertBatch(@Param("list") List<KeywordsDO> list);
}
