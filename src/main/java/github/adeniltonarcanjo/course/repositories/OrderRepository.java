package github.adeniltonarcanjo.course.repositories;

import github.adeniltonarcanjo.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
