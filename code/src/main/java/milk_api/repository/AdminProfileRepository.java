package milk_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import milk_api.entity.AdminProfile;

@Repository
public interface AdminProfileRepository extends JpaRepository<AdminProfile, Long> {
}
