package io.github.han10001.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Redis connection settings for <a href="https://github.com/redisson/redisson/tree/master/redisson-spring-boot-starter">redisson-spring-boot-starter</a>.
 */
@Data
@ConfigurationProperties(prefix = "redis.sdk.config", ignoreInvalidFields = true)
public class RedisClientConfigProperties {

    /** host:ip */
    private String host;
    /** Redis server port. */
    private int port;
    /** Redis authentication password. */
    private String password;
    /** Maximum connection pool size; defaults to 64. */
    private int poolSize = 64;
    /** Minimum number of idle connections; defaults to 10. */
    private int minIdleSize = 10;
    /** Maximum idle time in milliseconds before an idle connection is closed; defaults to 10000. */
    private int idleTimeout = 10000;
    /** Connection timeout in milliseconds; defaults to 10000. */
    private int connectTimeout = 10000;
    /** Number of connection retry attempts; defaults to 3. */
    private int retryAttempts = 3;
    /** Interval between connection retries in milliseconds; defaults to 1000. */
    private int retryInterval = 1000;
    /** Connection ping interval in milliseconds; defaults to 0 to disable periodic checks. */
    private int pingInterval = 0;
    /** Whether to enable TCP keepalive; defaults to true. */
    private boolean keepAlive = true;

}
