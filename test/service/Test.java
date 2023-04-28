package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Test {
    ApplicationContext context;
    
    public void test1() {
        context = SpringApplication.run(Setup.class);
        BranchRepository br = context.getBean(BranchRepository.class);
        Iterable result = br.findAll();
        for (Object o : result) {
            Branch b = (Branch)o;
            System.out.println(b.name + " " + b.area);
        }
        assert true;
        SpringApplication.exit(context);
    } 
    public void test2() {
        context = SpringApplication.run(Setup.class);
        var repository = context.getBean(BranchRepository.class);
        var before = repository.count();
        
        var branch = new Branch();
        branch.name = "Test 1";
        branch.area = 99.99;
        repository.save(branch);
        
        long after = repository.count();
        assert after == before + 1;
        
        SpringApplication.exit(context);
    } 
    
}