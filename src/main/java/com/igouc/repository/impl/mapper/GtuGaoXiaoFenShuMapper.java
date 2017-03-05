package com.igouc.repository.impl.mapper;

import com.igouc.repository.impl.mapper.provider.GtuGaoXiaoFenShuProvider;
import com.igouc.repository.impl.typehandler.StringTypeHandler;
import com.igouc.repository.po.GtuGaoxiaoFenshuPO;
import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface GtuGaoXiaoFenShuMapper {

    @Results(id = "gtuGaoXiaoFenShuResult", value = {
            @Result(property = "id", column = "id", javaType = Integer.class, jdbcType = JdbcType.INTEGER, id = true),
            @Result(property = "daXueMing", column = "daxueming", javaType = String.class, jdbcType = JdbcType.VARCHAR, typeHandler = StringTypeHandler.class),
            @Result(property = "zhaoShengQu", column = "zhaoshengqu", javaType = String.class, jdbcType = JdbcType.VARCHAR, typeHandler = StringTypeHandler.class),
            @Result(property = "keBie", column = "kebie", javaType = String.class, jdbcType = JdbcType.VARCHAR, typeHandler = StringTypeHandler.class),
            @Result(property = "nianFen", column = "nianfen", javaType = String.class, jdbcType = JdbcType.VARCHAR, typeHandler = StringTypeHandler.class),
            @Result(property = "piCi", column = "pici", javaType = String.class, jdbcType = JdbcType.VARCHAR, typeHandler = StringTypeHandler.class),
            @Result(property = "pingJunFen", column = "pingjunfen", javaType = String.class, jdbcType = JdbcType.VARCHAR, typeHandler = StringTypeHandler.class),
            @Result(property = "kongFenXian", column = "kongfenxian", javaType = String.class, jdbcType = JdbcType.VARCHAR, typeHandler = StringTypeHandler.class),
            @Result(property = "xianCha", column = "xianCha", javaType = String.class, jdbcType = JdbcType.VARCHAR, typeHandler = StringTypeHandler.class),
    })
    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuById")
    GtuGaoxiaoFenshuPO getGtuGaoXiaoFenShuById(@Param("arg0") Integer id);

}
