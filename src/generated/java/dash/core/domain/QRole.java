package dash.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QRole is a Querydsl query type for Role
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QRole extends EntityPathBase<Role> {

    private static final long serialVersionUID = -1295487347L;

    public static final QRole role = new QRole("role");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    public final SetPath<Authorities, QAuthorities> authoritiesesById = this.<Authorities, QAuthorities>createSet("authoritiesesById", Authorities.class, QAuthorities.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> createdD = _super.createdD;

    public final StringPath descX = createString("descX");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> modificatedD = _super.modificatedD;

    //inherited
    public final NumberPath<Long> userChanged = _super.userChanged;

    public QRole(String variable) {
        super(Role.class, forVariable(variable));
    }

    public QRole(Path<? extends Role> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRole(PathMetadata<?> metadata) {
        super(Role.class, metadata);
    }

}

