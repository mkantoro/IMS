package pl.mkantorosinski.ims.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import pl.mkantorosinski.ims.entity.Role;

public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {
}
