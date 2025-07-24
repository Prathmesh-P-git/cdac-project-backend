package milk_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import milk_api.entity.DeliveryLog;
import milk_api.repository.DeliveryLogRepository;

@Service
public class DeliveryLogService {

    private final DeliveryLogRepository deliveryLogRepository;

    public DeliveryLogService(DeliveryLogRepository deliveryLogRepository) {
        this.deliveryLogRepository = deliveryLogRepository;
    }

    public List<DeliveryLog> getAllDeliveries() {
        return deliveryLogRepository.findAll();
    }

    public Optional<DeliveryLog> getDeliveryById(String id) {
        return deliveryLogRepository.findById(id);
    }

    public DeliveryLog saveDelivery(DeliveryLog deliveryLog) {
        return deliveryLogRepository.save(deliveryLog);
    }

    public void deleteDelivery(String id) {
        deliveryLogRepository.deleteById(id);
    }

//    public List<DeliveryLog> getDeliveriesByCustomer(Long customerId) {
//        return deliveryLogRepository.findByCustomer_Id( );
//    }
}
