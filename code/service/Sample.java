package service;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Sample {
    @RequestMapping("/check")
    double check() {
        return 3.14159367;
    }
}

interface BranchRepository extends CrudRepository<Branch, Integer> {
    
}

@Table("branch")
class Branch {
    @Id int number;
    String name;
    double area;
}


