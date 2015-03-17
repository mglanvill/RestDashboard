package dash.repositories;

import dash.core.domain.Role;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by mglanvill on 2015/03/11.
 */
@RestResource(path = "roles")
public interface RoleRepository extends PagingAndSortingRepository<Role, Long>, QueryDslPredicateExecutor<Role> {

}
