package dash.core.domain;

import dash.core.util.EmailAddress;
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
@Table(name = "user")
public class User extends AbstractEntity {

    @Column(name = "username_x", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    private String usernameX;

    @Column(name = "password_x", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    private String passwordX;

    @Column(name = "firstname_x", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    private String firstnameX;

    @Column(name = "lastname_x", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    private String lastnameX;

    @Column(unique = true)
    private EmailAddress emailX;

    @Column(name = "enabled_b", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    private Boolean enabledB;

    @Column(name = "salt_x", nullable = false, insertable = true, updatable = true, length = 25, precision = 0)
    private String saltX;

    @OneToMany(mappedBy = "userByUserId")
    private Set<Authorities> authoritiesesById = new HashSet<Authorities>();

    @OneToMany(mappedBy = "userByUserId")
    private Set<GroupMembers> groupMembersById  = new HashSet<GroupMembers>();

}
