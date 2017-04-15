package com.igouc.repository.impl.mapper;

import com.igouc.repository.impl.mapper.provider.GtuGaoXiaoFenShuProvider;
import com.igouc.repository.impl.typehandler.StringTypeHandler;
import com.igouc.repository.po.GtuGaoxiaoFenshuPO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

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

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuByLastIdAndLimit")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByLastIdAndLimit(@Param("arg0") Long lastId, @Param("arg1") Integer limit);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuByDaXueMing")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByDaXueMing(@Param("arg0") String daXueMing);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuLikeDaXueMing")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuLikeDaXueMing(@Param("arg0") String daXueMing);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuByZhaoShengQu")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByZhaoShengQu(@Param("arg0") String zhaoShengQu);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuByKeBie")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByKeBie(@Param("arg0") String keBie);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuByNianFen")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByNianFen(@Param("arg0") String nianFen);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuByPiCi")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByPiCi(@Param("arg0") String piCi);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuByPingJunFen")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByPingJunFen(@Param("arg0") String pingJunFen);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuByKongFenXian")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByKongFenXian(@Param("arg0") String kongFenXian);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGtuGaoXiaoFenShuByXianCha")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByXianCha(@Param("arg0") String xianCha);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "getGaoXiaoInfo")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> getGaoXiaoInfo(@Param("arg0") String cityName, @Param("arg1") String kebie, @Param("arg2") String nianfen);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "selectByScore")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> selectByScore(@Param("arg0") String zhaoShengQu, @Param("arg1") String kongFenXian, @Param("arg2") String nianFen);

    @SelectProvider(type = GtuGaoXiaoFenShuProvider.class, method = "selectCityScore")
    @ResultMap("gtuGaoXiaoFenShuResult")
    List<GtuGaoxiaoFenshuPO> selectCityScore(String zhaoShengQu, String keBie, String nianFen);
}
