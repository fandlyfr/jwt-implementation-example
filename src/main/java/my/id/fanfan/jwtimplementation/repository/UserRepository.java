package my.id.fanfan.jwtimplementation.repository;

import my.id.fanfan.jwtimplementation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
