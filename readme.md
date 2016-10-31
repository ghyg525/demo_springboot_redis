#### spring boot demo

缓存处理

@EnableCaching 开启缓存 默认使用ConcurrentMapCacheManager


使用redis 只需要引入redis的依赖既可
StringRedisTemplate 默认序列化方式为: JdkSerializationRedisSerializer
所以需要缓存的bean需要implements Serializable接口

使用json请使用Jackson2JsonRedisSerializer进行序列化
配置继承CachingConfigurerSupport自己创建RedisCacheManager