package nextstep.subway.config;

import java.util.concurrent.Executor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncThreadConfig {
    private final Pool pool;

    public AsyncThreadConfig(Pool pool) {
        this.pool = pool;
    }

    @Bean
    public Executor asyncThreadTaskExecutor() {
        ThreadPoolTaskExecutor exexcutor = new ThreadPoolTaskExecutor();
        /* 기본 Thread 사이즈 */
        exexcutor.setCorePoolSize(pool.getCoreSize());
        /* 최대 Thread 사이즈 */
        exexcutor.setMaxPoolSize(pool.getMaxSize());
        /* MaxThread가 동작하는 경우 대기하는 Queue 사이즈 */
        exexcutor.setQueueCapacity(pool.getQueueCapacity());
        exexcutor.setThreadNamePrefix(pool.getThreadNamePrefix());
        return exexcutor;
    }
}
