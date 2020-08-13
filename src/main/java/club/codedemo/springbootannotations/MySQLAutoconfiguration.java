package club.codedemo.springbootannotations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Configuration;

/**
 * @author xingyannian
 * @Description 测试@ConditionalOnClass和@ConditionalOnMissingClass
 * 所有验证基于人为删除target中编译后的DataSource.class
 * 验证@ConditionalOnClass，当DataSource.class存在，会执行该类构造函数，人为删除target中编译后的DataSource.class，构造函数不执行
 * 验证@ConditionalOnMissingClass，当DataSource.class丢失，会执行构造函数，不丢失不执行构造函数
 * @Date Created in 13/08/2020
 * @Modified by
 */
@Configuration
//@ConditionalOnClass(DataSource.class)
@ConditionalOnMissingClass("club.codedemo.springbootannotations.DataSource")
public class MySQLAutoconfiguration {
    public MySQLAutoconfiguration() {
        System.out.println("DataSource.class丢失");
    }
}
