package dash.core.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mglanvill on 2015/03/11.
 */
@MappedSuperclass
@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, insertable = true, updatable = false, length = 19, precision = 0)
    public Long id;

    @Column(name = "created_d", nullable = false, insertable = true, updatable = false, length = 15, precision = 0)
    @Temporal(value = TemporalType.TIMESTAMP)
    public Date createdD;

    @Column(name = "modificated_d", nullable = false, insertable = false, updatable = true, length = 15, precision = 0)
    @Temporal(value = TemporalType.TIMESTAMP)
    public Date modificatedD;

    @Column(name = "user_changed_id", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Long userChanged;

}
