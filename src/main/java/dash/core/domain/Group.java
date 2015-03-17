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
@Table(name = "group")
public class Group extends AbstractEntity {

    @Column(name = "groupname_x", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    private String groupnameX;

    @OneToMany(mappedBy = "groupByGroupId")
    private Set<GroupAuthorities> groupAuthoritiesesById = new HashSet<GroupAuthorities>();

    @OneToMany(mappedBy = "groupByGroupId")
    private Set<GroupMembers> groupMembersesById = new HashSet<GroupMembers>();

}