package club.codedemo.springbootannotations.service;

import club.codedemo.springbootannotations.VehicleFactoryConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xingyannian
 * @Description 测试@Configuration和@EnableAutoConfiguration
 * 思路：当VehicleFactoryConfig中注释掉@Configuration，无法注入，系统报错TestService required a bean of type 'club.codedemo.springbootannotations.VehicleFactoryConfig' that could not be found.
 * @Date Created in 07/08/2020
 * @Modified by
 */
@Service
public class TestService {
    @Autowired
    private VehicleFactoryConfig vehicleFactoryConfig;
}
