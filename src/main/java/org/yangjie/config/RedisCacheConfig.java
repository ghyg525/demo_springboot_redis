package org.yangjie.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

@Configuration
@EnableCaching // 开启缓存
public class RedisCacheConfig extends CachingConfigurerSupport{
	
	@Autowired
	private RedisConnectionFactory redisConnectionFactory;

	@Override
	public CacheManager cacheManager() {
		StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(redisConnectionFactory);
		stringRedisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		stringRedisTemplate.afterPropertiesSet();
		return new RedisCacheManager(stringRedisTemplate);
	}
	
 
}
