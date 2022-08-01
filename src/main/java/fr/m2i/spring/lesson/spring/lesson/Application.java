package fr.m2i.spring.lesson.spring.lesson;

import fr.m2i.spring.lesson.spring.lesson.config.DatasourceConfig;
import fr.m2i.spring.lesson.spring.lesson.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;



// Equivalent de
// @SpringBootConfiguration
// @EnableAutoConfiguration
//@ComponentScan(basePackages = {"fr.m2i.spring.lesson", "fr.m2i.data"}) si les nom des paquages different

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
            
            ApplicationContext ctx= SpringApplication.run(Application.class, args);
          //  DatasourceConfig ds =ctx.getBean(DatasourceConfig.class);
          //  ds.setup();
         // ConfigurationBean cb =ctx.getBean(ConfigurationBean.class);
         // System.out.println(cb.getApplicationName());
   /*      ConfigProperties cp =ctx.getBean(ConfigProperties.class);
          // System.out.println(cp.getHostname());
            System.out.println(cp);
         */   
           
        
        AccountService accountService = ctx.getBean(AccountService.class);
        accountService.findOldestClient().ifPresent(System.out::println);
	}

}
