package club.codedemo.springbootannotations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

/**
 * @author xingyannian
 * @Description
 * @Date Created in 13/08/2020
 * @Modified by
 */
@org.springframework.context.annotation.Configuration
@EnableAutoConfiguration
public class Configuration {
    @Bean(name = "dataSource")
    DataSource dataSource(){
        return new DataSource();
    }

    /**
     * 名称为dataSource的bean存在，将满足条件
     */
    @Bean
    @ConditionalOnBean(name = "dataSource")
    DataSource testConditionalOnBean() {
        System.out.println("testConditionalOnBean生效");
        return new DataSource();
    }
    /**
     * 如果名称为dataSource的bean不存在，将满足条件
     */
    @Bean
    @ConditionalOnMissingBean(name = "dataSource")
    DataSource testConditionalOnMissingBean() {
        System.out.println("ConditionalOnMissingBean生效");
        return new DataSource();
    }
    /**
     * 测试@ConditionalOnProperty,application.properties中有"usemysql=mysql"
     */
    @Bean
    @ConditionalOnProperty(name = "usemysql", havingValue = "mysql")
    void testConditionalOnProperty(){
        System.out.println("ConditionalOnMissingBean生效");
    }

    /**
     * 只有resources文件目录中mysql.properties资源存在，才使用该定义
     */
    @Bean
    @ConditionalOnResource(resources = "classpath:mysql.properties")
    Properties additionalProperties() {
        System.out.println("ConditionalOnResource生效");
        return new Properties();

    }
    @Bean
    @ConditionalOnWebApplication
    void healthCheckController() {
        System.out.println("Spring Web应用程序,pom.xml中存在web依赖，如果把web依赖去掉，去掉web依赖，该方法不会执行");
    }
}
