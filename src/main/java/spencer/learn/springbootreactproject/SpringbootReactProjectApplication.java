package spencer.learn.springbootreactproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spencer.learn.springbootreactproject.model.User;
import spencer.learn.springbootreactproject.repository.UserRepository;

@SpringBootApplication
public class SpringbootReactProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactProjectApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Ramesh","Fadatare","ramesh@gmail.com"));
		this.userRepository.save(new User("Tom","Cruise","tom@gmail.com"));
		this.userRepository.save(new User("Tony","Stark","tony@gmail.com"));
		this.userRepository.save(new User("Walter","White","heisenberg@gmail.com"));
	}
}
