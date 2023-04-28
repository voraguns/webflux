package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        BranchRepository br = context.getBean(BranchRepository.class);
        Iterable result = br.findAll();
        for(Object o : result) {
            Branch b = (Branch)o;
            System.out.println(b.name);
        }
        SpringApplication.exit(context);
    }
}

@SpringBootApplication
class Setup {  
    @Bean DriverManagerDataSource connect() {
        return new DriverManagerDataSource(source);
    }
    String source = "jdbc:mysql://127.0.0.1/db27?user=user27&password=p27";
}
