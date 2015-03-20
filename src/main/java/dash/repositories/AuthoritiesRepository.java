package dash.repositories;

import dash.core.domain.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by mglanvill on 2015/03/11.
 */
public interface AuthoritiesRepository extends JpaRepository<Authorities, Long>, QueryDslPredicateExecutor<Authorities> {

}
