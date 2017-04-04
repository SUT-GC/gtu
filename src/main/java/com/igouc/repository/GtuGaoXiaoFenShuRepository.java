package com.igouc.repository;

import com.igouc.repository.po.GtuGaoxiaoFenshuPO;

import java.util.List;

public interface GtuGaoXiaoFenShuRepository {
    GtuGaoxiaoFenshuPO getGtuGaoXiaoFenShuById(Integer id);
    List<GtuGaoxiaoFenshuPO> getGtuGaoXiaoFenShuByLastIdAndLimit(Integer lastId, Integer limit);
}
