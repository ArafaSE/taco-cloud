package tacos.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tacos.dto.TacoOrder;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    // Need to fetch all orders delivered to special ZIP code
    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    // List all orders delivered to a given zip code within a given date range
    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);

    // Using Custom Query to fins orders delivered in city
//    @Query("order o where o.deliveryCity='Seattle'")
//    List<TacoOrder> readOrdersDeliveredInSeattle();
}
