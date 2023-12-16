package com.boot.sailing.v1.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuDao {
    List<Map<String, Object>> doList();

    int doInsert(@Param("strCoffee") String strCoffee,
                 @Param("strKind") String strKind,
                 @Param("strPrice") String strPrice);

    int doDelete(String strNo);

    Map<String, Object> doListOne(String strNo);

    // Update
    int doUpdate(@Param("strNo") String strNo,
                 @Param("strCoffee") String strCoffee,
                 @Param("strKind") String strKind,
                 @Param("strPrice") String strPrice);

    // 조회하기
    List<Map<String, Object>> doSearch(
            @Param("strStartDate") String strStartDate,
            @Param("strEndDate") String strEndDate,
            @Param("strCoffee") String strCoffee,
            @Param("strKind") String strKind);
}
