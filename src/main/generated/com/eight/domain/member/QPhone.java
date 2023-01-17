package com.eight.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPhone is a Querydsl query type for Phone
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPhone extends EntityPathBase<Phone> {

    private static final long serialVersionUID = 1199503320L;

    public static final QPhone phone = new QPhone("phone");

    public final StringPath ci = createString("ci");

    public final NumberPath<Long> no = createNumber("no", Long.class);

    public final StringPath phoneNo = createString("phoneNo");

    public QPhone(String variable) {
        super(Phone.class, forVariable(variable));
    }

    public QPhone(Path<? extends Phone> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhone(PathMetadata metadata) {
        super(Phone.class, metadata);
    }

}

