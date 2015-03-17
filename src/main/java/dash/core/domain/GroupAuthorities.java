package dash.core.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by mglanvill on 2015/03/11.
 */
@Entity
@Getter
@Setter
@Table(name = "group_authorities")
public class GroupAuthorities extends AbstractEntity {

    @Column(name = "authority_x", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    private String authorityX;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    private Group groupByGroupId;

}
