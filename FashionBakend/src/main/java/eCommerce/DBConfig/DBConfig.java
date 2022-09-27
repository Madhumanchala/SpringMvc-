package eCommerce.DBConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import eCommerce.model.Category;

@Configuration
@EnableTransactionManagement
@ComponentScan("eCommerce")
public class DBConfig {

	@Bean(name = "dataSource")
	public DataSource getH2DataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springmvc");
		dataSource.setUsername("admin");
		dataSource.setPassword("comunus@123");

		System.out.println("------- Datasource object created ------");
		return dataSource;
	}

	@Bean(name = "sessionFactory")

	public SessionFactory getSessionFactory() {
		Properties hibernateprop = new Properties();
		hibernateprop.put("hibernate.hdm2ddl.auto", "update");
		hibernateprop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

		LocalSessionFactoryBuilder localFactory = new LocalSessionFactoryBuilder(getH2DataSource());

		localFactory.addProperties(hibernateprop);

		localFactory.addAnnotatedClass(Category.class);

		System.out.println("----session created object creted -----");

		return localFactory.buildSessionFactory();

	}

	@Bean(name = "txManager")

	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		System.out.println("-------Transaction Manger object created -------");
		return new HibernateTransactionManager(sessionFactory);
	}

}
