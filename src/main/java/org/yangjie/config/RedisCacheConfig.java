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

/**
 * Redis配置类
 * 继承 #CachingConfigurerSupport 是为了进行定制化配置
 * @author YangJie [2017年8月24日 下午5:46:50]
 */
@Configuration
@EnableCaching // 开启缓存
public class RedisCacheConfig extends CachingConfigurerSupport{
	
	@Autowired // 此对象有springboot自动创建
	private RedisConnectionFactory redisConnectionFactory;

	/**
	 * 默认序列化方式为 #JdkSerializationRedisSerializer
	 * 如要使用json需要将序列化方式改为 #GenericJackson2JsonRedisSerializer
	 */
	@Override
	public CacheManager cacheManager() {
		StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(redisConnectionFactory);
		stringRedisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		stringRedisTemplate.afterPropertiesSet();
		return new RedisCacheManager(stringRedisTemplate);
	}
	
}
