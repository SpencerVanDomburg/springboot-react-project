package spencer.learn.springbootreactproject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spencer.learn.springbootreactproject.model.User;
import spencer.learn.springbootreactproject.repository.UserRepository;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("users")
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
}
