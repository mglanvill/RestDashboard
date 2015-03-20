package dash.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAuthorities is a Querydsl query type for Authorities
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAuthorities extends EntityPathBase<Authorities> {

    private static final long serialVersionUID = 2100260138L;

    public static final QAuthorities authorities = new QAuthorities("authorities");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdD = _super.createdD;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> modificatedD = _super.modificatedD;

    //inherited
    public final NumberPath<Long> userChanged = _super.userChanged;

    public QAuthorities(String variable) {
        super(Authorities.class, forVariable(variable));
    }

    public QAuthorities(Path<? extends Authorities> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthorities(PathMetadata<?> metadata) {
        super(Authorities.class, metadata);
    }

}

