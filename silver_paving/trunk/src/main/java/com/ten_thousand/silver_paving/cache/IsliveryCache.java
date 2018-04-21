package com.ten_thousand.silver_paving.cache;

import java.util.List;
import java.util.Map;

public interface IsliveryCache {
    void saveHash(String key, Map<String,Object> value);

    Map<Object,Object> queryHashByKey(String key);

    void saveList(String key,String productionId);

    List<String> getAllprocessIdByKey(String key,int startIndex,int endIndex);

}
