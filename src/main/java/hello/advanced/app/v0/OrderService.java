package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepositoryV0 orderRepository;

    public void orderId(String itemId) {
        orderRepository.save(itemId);
    }

}
