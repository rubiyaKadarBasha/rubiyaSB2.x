package scb.nextgen.dashboard.securitymultifactor.aop.logging.config;

import org.springframework.context.annotation.*;


import org.springframework.core.env.Environment;


import scb.nextgen.dashboard.securitymultifactor.aop.logging.LoggingAspect;


/**
 * The Class LoggingAspectConfiguration.
 *
 * @author RUBIYA
 */
@Configuration
@EnableAspectJAutoProxy
public class LoggingAspectConfiguration {
    
    /**
     * Logging aspect.
     *
     * @param env the env
     * @return the logging aspect
     */
    @Bean
    @Profile("dev")
    public LoggingAspect loggingAspect(Environment env) {
        return new LoggingAspect(env);
    }
}
