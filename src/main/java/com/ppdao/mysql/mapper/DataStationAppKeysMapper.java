package com.ppdao.mysql.mapper;

import com.ppdao.mysql.model.DataStationAppKeys;

public interface DataStationAppKeysMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataStationAppKeys record);

    int insertSelective(DataStationAppKeys record);

    DataStationAppKeys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DataStationAppKeys record);

    int updateByPrimaryKey(DataStationAppKeys record);
}