package tacos.data;

import tacos.dto.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
