package spencer.learn.springbootreactproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spencer.learn.springbootreactproject.model.User;
import spencer.learn.springbootreactproject.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("api/")
public class UserController {

    // removed autowiring of field
    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }
}
