package nextstep.subway.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Pool {
    private final int queueCapacity = 100;
    private final int coreSize = 2;
    private final int maxSize = 4;
    private final String threadNamePrefix = "subway-async-";
    public int getQueueCapacity() {
        return queueCapacity;
    }

    public int getCoreSize() {
        return coreSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getThreadNamePrefix() {
        return threadNamePrefix;
    }
}
