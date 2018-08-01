package com.bookstore.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sector.class)
public abstract class Sector_ {

	public static volatile SingularAttribute<Sector, Instant> date;
	public static volatile SingularAttribute<Sector, String> name;
	public static volatile SingularAttribute<Sector, Long> id;
	public static volatile SingularAttribute<Sector, String> content;
	public static volatile SingularAttribute<Sector, Zonal> zonal;

}

