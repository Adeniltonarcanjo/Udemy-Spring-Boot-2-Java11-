package github.adeniltonarcanjo.course.repositories;

import github.adeniltonarcanjo.course.entities.Category;
import github.adeniltonarcanjo.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
