package dash.repositories;

import dash.core.domain.GroupMembers;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by mglanvill on 2015/03/11.
 */
@RestResource(path = "groupmembers")
public interface GroupMembersRepository extends PagingAndSortingRepository<GroupMembers, Long>, QueryDslPredicateExecutor<GroupMembers> {

}
