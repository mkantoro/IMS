package pl.mkantorosinski.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mkantorosinski.ims.entity.Item;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
