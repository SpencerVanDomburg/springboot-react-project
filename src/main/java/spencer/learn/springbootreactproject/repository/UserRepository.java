package spencer.learn.springbootreactproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spencer.learn.springbootreactproject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
