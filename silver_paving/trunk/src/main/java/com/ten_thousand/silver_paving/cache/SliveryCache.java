package com.ten_thousand.silver_paving.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class SliveryCache implements IsliveryCache{

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public void saveHash(String key, Map<String, Object> value) {
        redisTemplate.boundHashOps(key)
        .putAll(value);
    }

    @Override
    public Map<Object, Object> queryHashByKey(String key) {
        Map<Object, Object> map = redisTemplate.boundHashOps(key).entries();
        return map;
    }

    @Override
    public void saveList(String key, String productionId) {
        redisTemplate.boundListOps(key)
                .leftPush(productionId);
    }

    @Override
    public List<String> getAllprocessIdByKey(String key, int startIndex, int endIndex) {
        List<String> list = redisTemplate.boundListOps(key)
                .range(startIndex, endIndex);
        return list;
    }
}
