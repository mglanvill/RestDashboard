package dash.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QGroup is a Querydsl query type for Group
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGroup extends EntityPathBase<Group> {

    private static final long serialVersionUID = -1515467960L;

    public static final QGroup group = new QGroup("group1");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdD = _super.createdD;

    public final SetPath<GroupAuthorities, QGroupAuthorities> groupAuthoritiesesById = this.<GroupAuthorities, QGroupAuthorities>createSet("groupAuthoritiesesById", GroupAuthorities.class, QGroupAuthorities.class, PathInits.DIRECT2);

    public final SetPath<GroupMembers, QGroupMembers> groupMembersesById = this.<GroupMembers, QGroupMembers>createSet("groupMembersesById", GroupMembers.class, QGroupMembers.class, PathInits.DIRECT2);

    public final StringPath groupnameX = createString("groupnameX");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> modificatedD = _super.modificatedD;

    //inherited
    public final NumberPath<Long> userChanged = _super.userChanged;

    public QGroup(String variable) {
        super(Group.class, forVariable(variable));
    }

    public QGroup(Path<? extends Group> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGroup(PathMetadata<?> metadata) {
        super(Group.class, metadata);
    }

}

