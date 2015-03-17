package dash.repositories;

import dash.core.domain.Authorities;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by mglanvill on 2015/03/11.
 */
@RestResource(path = "authorities")
public interface AuthoritiesRepository extends PagingAndSortingRepository<Authorities, Long>, QueryDslPredicateExecutor<Authorities> {

}
