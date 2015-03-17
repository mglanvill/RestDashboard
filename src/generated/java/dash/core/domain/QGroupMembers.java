package dash.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QGroupMembers is a Querydsl query type for GroupMembers
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGroupMembers extends EntityPathBase<GroupMembers> {

    private static final long serialVersionUID = 363189425L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGroupMembers groupMembers = new QGroupMembers("groupMembers");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdD = _super.createdD;

    public final QGroup groupByGroupId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> modificatedD = _super.modificatedD;

    public final QUser userByUserId;

    //inherited
    public final NumberPath<Long> userChanged = _super.userChanged;

    public QGroupMembers(String variable) {
        this(GroupMembers.class, forVariable(variable), INITS);
    }

    public QGroupMembers(Path<? extends GroupMembers> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGroupMembers(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGroupMembers(PathMetadata<?> metadata, PathInits inits) {
        this(GroupMembers.class, metadata, inits);
    }

    public QGroupMembers(Class<? extends GroupMembers> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.groupByGroupId = inits.isInitialized("groupByGroupId") ? new QGroup(forProperty("groupByGroupId")) : null;
        this.userByUserId = inits.isInitialized("userByUserId") ? new QUser(forProperty("userByUserId"), inits.get("userByUserId")) : null;
    }

}

