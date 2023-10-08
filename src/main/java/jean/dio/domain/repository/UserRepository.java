package jean.dio.domain.repository;

import jean.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<jean.dio.domain.model.User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}