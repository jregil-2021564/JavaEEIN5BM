package com.oscarcumatz.dominio;

import com.oscarcumatz.dominio.DetalleFactura.TipoGasto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-08-12T16:18:15", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(DetalleFactura.class)
public class DetalleFactura_ { 

    public static volatile SingularAttribute<DetalleFactura, TipoGasto> tipoGasto;
    public static volatile SingularAttribute<DetalleFactura, Integer> codigoFactura;
    public static volatile SingularAttribute<DetalleFactura, Integer> codigoGasto;
    public static volatile SingularAttribute<DetalleFactura, Integer> codigoDetalle;
    public static volatile SingularAttribute<DetalleFactura, Integer> cantidad;

}