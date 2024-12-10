package com.example.config;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.ibatis.SqlMapClientFactoryBean;

@Configuration
public class IBatisConfig {
    @Bean
    public SqlMapClient sqlMapClient() throws Exception {
        SqlMapClientFactoryBean factoryBean = new SqlMapClientFactoryBean();
        factoryBean.setConfigLocation(new org.springframework.core.io.ClassPathResource("SqlMapConfig.xml"));
        factoryBean.afterPropertiesSet();
        return factoryBean.getObject();
    }

    @Bean
    public org.springframework.orm.ibatis.SqlMapClientTemplate sqlMapClientTemplate(SqlMapClient sqlMapClient) {
        return new org.springframework.orm.ibatis.SqlMapClientTemplate(sqlMapClient);
    }
}