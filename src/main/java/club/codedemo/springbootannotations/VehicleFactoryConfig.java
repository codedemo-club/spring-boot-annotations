package club.codedemo.springbootannotations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xingyannian
 * @Description
 * @Date Created in 07/08/2020
 * @Modified by
 */
@Configuration
@EnableAutoConfiguration
public class VehicleFactoryConfig {
}
