package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Sample {
    @RequestMapping("/check")
    double check() {
        return 3.14159367;
    }
    @RequestMapping("/api/list-branch")
    Iterable m2() {
        return br.findAll();
    }
    @Autowired BranchRepository br;
}

@Service
interface BranchRepository extends CrudRepository<Branch, Integer> {
    
}

@Table("branch")
class Branch {
    @Id public int number;
    String name;
    double area;
}


