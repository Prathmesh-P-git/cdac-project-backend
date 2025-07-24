package milk_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import milk_api.entity.MilkUser;

import java.util.Optional;

@Repository
public interface MilkUserRepository extends JpaRepository<MilkUser, Long> {
    Optional<MilkUser> findByUsername(String username);
}