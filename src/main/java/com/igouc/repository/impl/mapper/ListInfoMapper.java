package com.igouc.repository.impl.mapper;

import com.igouc.repository.impl.mapper.provider.ListInfoProvider;
import com.igouc.repository.po.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ListInfoMapper {

    @Results(id = "city", value = {
            @Result(property = "cityName", column = "zhaoshengqu", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    @SelectProvider(type = ListInfoProvider.class, method = "getAllCitys")
    List<CityPo> getAllCitys();

    @Results(id = "year", value ={
            @Result(property = "year", column = "nianfen", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    @SelectProvider(type = ListInfoProvider.class, method = "getAllYears")
    List<YearPo> getAllYeaars();

    @Results(id = "kebie", value ={
            @Result(property = "keBie", column = "kebie", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    @SelectProvider(type = ListInfoProvider.class, method = "getAllKeBies")
    List<KeBiePo> getAllKeBies();

    @Results(id = "major", value ={
            @Result(property = "Major", column = "zhuanyeming", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    @SelectProvider(type = ListInfoProvider.class, method = "getAllMajors")
    List<MajorPo> getAllMajors();

    @Results(id = "university", value ={
            @Result(property = "universityName", column = "daxueming", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    @SelectProvider(type = ListInfoProvider.class, method = "getAllUniversitys")
    List<UniversityPo> getAllUniversitys();

}
