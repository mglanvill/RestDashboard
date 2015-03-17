package dash.repositories;

import dash.core.domain.User;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by mglanvill on 2015/03/11.
 */
@RestResource(path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>, QueryDslPredicateExecutor<User> {

    //@RestResource(path = "findbyusername", rel = "findbyusername")
    //User findByUsername(@Param("username_x") String usernameX);

    //@RestResource(path = "findbyusernamein", rel = "findbyusernamein")
    //User findByUsernameIn(@Param("username_x") Collection<String> usernames);

}
