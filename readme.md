#### spring boot demo

缓存处理

@EnableCaching 开启缓存 默认使用ConcurrentMapCacheManager


> * 使用redis 只需要引入redis的依赖既可
> * StringRedisTemplate 默认序列化方式为: JdkSerializationRedisSerializer
> * 所以需要缓存的bean需要implements Serializable接口

> * 使用json请使用Jackson2JsonRedisSerializer进行序列化
> * 配置继承CachingConfigurerSupport自己创建RedisCacheManager


* 在同一个类中调用注解cache的方法无效
* 因为spring @Cache的aop 代理实现引起
* 目前解决方案是使用AopContext.currentProxy()获取当前代理类
* 但需要设置aop参数@EnableAspectJAutoProxy(exposeProxy=true)
* 感觉不是太好, 找到更好的解决方案后再更新