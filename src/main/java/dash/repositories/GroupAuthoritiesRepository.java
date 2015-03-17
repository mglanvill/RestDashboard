package dash.repositories;

import dash.core.domain.GroupAuthorities;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by mglanvill on 2015/03/11.
 */
@RestResource(path = "groupauthoritieses")
public interface GroupAuthoritiesRepository extends PagingAndSortingRepository<GroupAuthorities, Long>, QueryDslPredicateExecutor<GroupAuthorities> {

}
