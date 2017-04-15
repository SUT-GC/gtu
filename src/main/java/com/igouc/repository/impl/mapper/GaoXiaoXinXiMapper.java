package com.igouc.repository.impl.mapper;

import com.igouc.repository.impl.mapper.provider.GaoXiaoXinXiProvider;
import com.igouc.repository.po.GaoXiaoXinXiPo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface GaoXiaoXinXiMapper {
    @Results(id = "gaoXiaoXinXi", value = {
            @Result(property = "daXueMing", column = "daxueming", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "daxueUrl", column = "url", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    @SelectProvider(type = GaoXiaoXinXiProvider.class, method = "getGaoXiaoXinXiByName")
    GaoXiaoXinXiPo getGaoXiaoXinXiByName(@Param("arg0") String gaoXiaoName);
}
