package com.igouc.repository.impl.mapper;

import com.igouc.repository.impl.mapper.provider.ZhuanYeXinXiProvider;
import com.igouc.repository.po.ZhuanYeXinXiPo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ZhuanYeXinXiMapper {

    @Results(id = "zhuanYeXinXi", value = {
            @Result(property = "zhuanYeMing", column = "zhuanyeming", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "zhuanYeUrl", column = "url", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    @SelectProvider(type = ZhuanYeXinXiProvider.class, method = "getZhuanYeXinXiByName")
    ZhuanYeXinXiPo getZhuanYeXinXiByName(@Param("arg0") String zhuanYeMing);
}
