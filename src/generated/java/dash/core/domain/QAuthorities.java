package dash.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAuthorities is a Querydsl query type for Authorities
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAuthorities extends EntityPathBase<Authorities> {

    private static final long serialVersionUID = 2100260138L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAuthorities authorities = new QAuthorities("authorities");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdD = _super.createdD;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> modificatedD = _super.modificatedD;

    public final QRole roleByRoleId;

    public final QUser userByUserId;

    //inherited
    public final NumberPath<Long> userChanged = _super.userChanged;

    public QAuthorities(String variable) {
        this(Authorities.class, forVariable(variable), INITS);
    }

    public QAuthorities(Path<? extends Authorities> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAuthorities(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAuthorities(PathMetadata<?> metadata, PathInits inits) {
        this(Authorities.class, metadata, inits);
    }

    public QAuthorities(Class<? extends Authorities> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.roleByRoleId = inits.isInitialized("roleByRoleId") ? new QRole(forProperty("roleByRoleId")) : null;
        this.userByUserId = inits.isInitialized("userByUserId") ? new QUser(forProperty("userByUserId"), inits.get("userByUserId")) : null;
    }

}

