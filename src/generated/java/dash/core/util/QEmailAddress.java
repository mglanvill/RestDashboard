package dash.core.util;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QEmailAddress is a Querydsl query type for EmailAddress
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QEmailAddress extends BeanPath<EmailAddress> {

    private static final long serialVersionUID = 613908625L;

    public static final QEmailAddress emailAddress = new QEmailAddress("emailAddress");

    public final StringPath value = createString("value");

    public QEmailAddress(String variable) {
        super(EmailAddress.class, forVariable(variable));
    }

    public QEmailAddress(Path<? extends EmailAddress> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmailAddress(PathMetadata<?> metadata) {
        super(EmailAddress.class, metadata);
    }

}

