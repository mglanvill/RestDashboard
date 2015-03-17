package dash.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1295394334L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    public final SetPath<Authorities, QAuthorities> authoritiesesById = this.<Authorities, QAuthorities>createSet("authoritiesesById", Authorities.class, QAuthorities.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> createdD = _super.createdD;

    public final dash.core.util.QEmailAddress emailX;

    public final BooleanPath enabledB = createBoolean("enabledB");

    public final StringPath firstnameX = createString("firstnameX");

    public final SetPath<GroupMembers, QGroupMembers> groupMembersById = this.<GroupMembers, QGroupMembers>createSet("groupMembersById", GroupMembers.class, QGroupMembers.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath lastnameX = createString("lastnameX");

    //inherited
    public final DateTimePath<java.util.Date> modificatedD = _super.modificatedD;

    public final StringPath passwordX = createString("passwordX");

    public final StringPath saltX = createString("saltX");

    //inherited
    public final NumberPath<Long> userChanged = _super.userChanged;

    public final StringPath usernameX = createString("usernameX");

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUser(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUser(PathMetadata<?> metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.emailX = inits.isInitialized("emailX") ? new dash.core.util.QEmailAddress(forProperty("emailX")) : null;
    }

}

