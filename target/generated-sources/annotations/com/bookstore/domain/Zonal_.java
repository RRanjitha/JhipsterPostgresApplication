package com.bookstore.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Zonal.class)
public abstract class Zonal_ {

	public static volatile SingularAttribute<Zonal, Instant> date;
	public static volatile SingularAttribute<Zonal, String> name;
	public static volatile SingularAttribute<Zonal, Long> id;
	public static volatile SetAttribute<Zonal, Sector> zonalSectors;

}

