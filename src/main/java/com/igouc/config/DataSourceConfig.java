package com.igouc.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = "classpath:hikari.properties")
public class DataSourceConfig {

    @Value("${database.driverClassName}")
    private String driverClassName;
    @Value("${database.url}")
    private String url;
    @Value("${database.username}")
    private String username;
    @Value("${database.password}")
    private String password;
    @Value("${pool.minPoolSize}")
    private int minPoolSize;
    @Value("${pool.maxPoolSize}")
    private int maxPoolSize;
    @Value("${connection.timeout}")
    private int connTimeout;
    @Value("${connection.maxLifeTime}")
    private int connMaxLifeTime;

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setPoolName("hikariDataSourcePool");
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);
        hikariConfig.setMaxLifetime(connMaxLifeTime);
        hikariConfig.setConnectionTimeout(connTimeout);
        hikariConfig.setMinimumIdle(minPoolSize);
        hikariConfig.setMaximumPoolSize(maxPoolSize);
        hikariConfig.setConnectionInitSql("SELECT 1");
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setFailFast(true);
        return sessionFactory.getObject();
    }

}
