package dash.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QGroupAuthorities is a Querydsl query type for GroupAuthorities
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGroupAuthorities extends EntityPathBase<GroupAuthorities> {

    private static final long serialVersionUID = 1208390329L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGroupAuthorities groupAuthorities = new QGroupAuthorities("groupAuthorities");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    public final StringPath authorityX = createString("authorityX");

    //inherited
    public final DateTimePath<java.util.Date> createdD = _super.createdD;

    public final QGroup groupByGroupId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> modificatedD = _super.modificatedD;

    //inherited
    public final NumberPath<Long> userChanged = _super.userChanged;

    public QGroupAuthorities(String variable) {
        this(GroupAuthorities.class, forVariable(variable), INITS);
    }

    public QGroupAuthorities(Path<? extends GroupAuthorities> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGroupAuthorities(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGroupAuthorities(PathMetadata<?> metadata, PathInits inits) {
        this(GroupAuthorities.class, metadata, inits);
    }

    public QGroupAuthorities(Class<? extends GroupAuthorities> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.groupByGroupId = inits.isInitialized("groupByGroupId") ? new QGroup(forProperty("groupByGroupId")) : null;
    }

}

