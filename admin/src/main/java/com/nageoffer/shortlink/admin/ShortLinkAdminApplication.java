package com.nageoffer.shortlink.admin;

/**
 * @projectName: shortlink
 * @package: com.nageoffer.shortlink.admin
 * @className: ShortLinkAdminApplication
 * @author: Feng Jingting
 * @description: TODO
 * @date: 2024/7/18 15:31
 * @version: 1.0
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.nageoffer.shortlink.admin.dao.mapper")
public class ShortLinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdminApplication.class,args);
    }
}
