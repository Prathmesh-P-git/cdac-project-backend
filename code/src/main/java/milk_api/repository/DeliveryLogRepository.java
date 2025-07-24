package milk_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import milk_api.entity.DeliveryLog;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DeliveryLogRepository extends JpaRepository<DeliveryLog, String> {

	//List<DeliveryLog> findByCustomer_CustId(String custId);

// List<DeliveryLog> findByDate(LocalDate date);

    //List<DeliveryLog> findByCustomer_IdAndDate(Long customerId, LocalDate date);
}
