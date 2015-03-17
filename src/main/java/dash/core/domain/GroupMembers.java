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
@Table(name = "group_members")
public class GroupMembers extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User userByUserId;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    private Group groupByGroupId;

}
