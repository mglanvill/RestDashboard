package dash.core.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mglanvill on 2015/03/11.
 */
@Entity
@Getter
@Setter
@Table(name = "role")
public class Role extends AbstractEntity {

    @Column(name = "role_x", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    private String descX;

    @OneToMany(mappedBy = "roleByRoleId")
    private Set<Authorities> authoritiesesById = new HashSet<Authorities>();
}
