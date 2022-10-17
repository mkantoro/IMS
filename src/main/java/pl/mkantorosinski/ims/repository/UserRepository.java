package pl.mkantorosinski.ims.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import pl.mkantorosinski.ims.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {


}
