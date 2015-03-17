package dash.core.config;

import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import java.util.Properties;

/**
 * Created by mglanvill on 2015/03/11.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackageClasses = DataConfiguration.class)
@EnableJpaRepositories(basePackages = "dash.repositories")
@PropertySource(value = { "classpath:database.properties" })
public class DataConfiguration {

    @Autowired
    private Environment env;

    @Bean
    public BoneCPDataSource dataSource() {
        BoneCPDataSource dataSource = new BoneCPDataSource();
        dataSource.setDriverClass(env.getRequiredProperty("database.driverClassName"));
        dataSource.setJdbcUrl(env.getRequiredProperty("database.url"));
        dataSource.setUser(env.getRequiredProperty("database.username"));
        dataSource.setPassword(env.getRequiredProperty("database.password"));

        dataSource.setAcquireIncrement(Integer.parseInt(env.getRequiredProperty("bone.acquireIncrement")));
        dataSource.setCloseConnectionWatch(Boolean.parseBoolean(env.getRequiredProperty("bone.closeConnectionWatch")));
        dataSource.setMaxConnectionsPerPartition(Integer.parseInt(env.getRequiredProperty("bone.maxConnectionsPerPartition")));
        dataSource.setMinConnectionsPerPartition(Integer.parseInt(env.getRequiredProperty("bone.minConnectionsPerPartition")));
        dataSource.setPartitionCount(Integer.parseInt(env.getRequiredProperty("bone.partitionCount")));
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.valueOf(env.getRequiredProperty("jpa.dialect")));

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource());
        factory.setJpaVendorAdapter(adapter);
        factory.setPackagesToScan("dash.core.domain");

        Properties properties = new Properties();
        properties.put("hibernate.archive.autodetection", env.getRequiredProperty("hibernate.archive.autodetection"));
        properties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
        properties.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.use_sql_comments", env.getRequiredProperty("hibernate.use_sql_comments"));
        factory.setJpaProperties(properties);

        factory.afterPropertiesSet();
        return factory;
    }

    @Bean
    public HibernateExceptionTranslator hibernateExceptionTranslator() {
        return new HibernateExceptionTranslator();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        EntityManagerFactory managerFactory = entityManagerFactory().getObject();
        return new JpaTransactionManager(managerFactory);
    }
}
