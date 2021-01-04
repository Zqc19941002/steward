package top.duanhong.steward.service.sys.impl;

import lombok.extern.slf4j.Slf4j;
import top.duanhong.steward.enumeration.SequenceEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sound.midi.Sequence;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Slf4j
public class RedisSequenceService {

    @Resource
    private RedisTemplate<String, Sequence> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    public String generate(String key) {

        RedisAtomicLong counter = new RedisAtomicLong(key, redisTemplate.getConnectionFactory());
        counter.incrementAndGet();
        log.info("------------序列["+key+"]:"+counter);
        return String.valueOf(counter);

    }

    public String generateWithDate(String key) {
        String value = generate(key);
        SequenceEnum.SEQ_MAP.get(key);
        return SequenceEnum.SEQ_MAP.get(key) == null ? sdf.format(new Date())+value : SequenceEnum.SEQ_MAP.get(key)+sdf.format(new Date())+value;
    }

    public String generateWithPrefix(String key) {
        String value = generate(key);
        SequenceEnum.SEQ_MAP.get(key);
        return SequenceEnum.SEQ_MAP.get(key) == null ? value : SequenceEnum.SEQ_MAP.get(key)+value;
    }

    public String generate(String key, int increment) {
        RedisAtomicLong counter = new RedisAtomicLong(key, redisTemplate.getConnectionFactory());
        counter.getAndAdd(increment);
        log.info("------------序列["+key+"]:"+counter);
        return String.valueOf(counter);
    }

    public Object getValue(Object key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void setValue(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }


}
