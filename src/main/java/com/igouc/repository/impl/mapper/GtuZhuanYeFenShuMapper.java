package com.igouc.repository.impl.mapper;

import com.igouc.repository.impl.mapper.provider.GtuZhuanYeFenShuProvider;
import com.igouc.repository.po.GtuZhuanYeFenShuPo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface GtuZhuanYeFenShuMapper {

    @Results(id = "gtuZhuanYeFenShuPo", value = {
            @Result(property = "id", column = "id", javaType = Integer.class, jdbcType = JdbcType.INTEGER, id = true),
            @Result(property = "zhuanYeMing", column = "zhuanyeming", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "daXueMing", column = "daxueming", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "pingJunFen", column = "pingjunfen", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "zuiGaoFen", column = "zuigaofen", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "kaoShengQu", column = "kaoshengqu", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "keBie", column = "kebie", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "nianFen", column = "nianfen", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "piCi", column = "pici", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    @SelectProvider(type = GtuZhuanYeFenShuProvider.class, method = "getZhuanYenFenShuById")
    GtuZhuanYeFenShuPo getZhuanYenFenShuById(@Param("arg0") Integer id);
}
