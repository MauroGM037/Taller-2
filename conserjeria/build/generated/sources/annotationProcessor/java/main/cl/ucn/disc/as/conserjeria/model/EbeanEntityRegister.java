package cl.ucn.disc.as.conserjeria.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import io.ebean.typequery.Generated;

import io.ebean.config.ModuleInfo;
import io.ebean.config.EntityClassRegister;

@Generated("io.ebean.querybean.generator")
@ModuleInfo(entities={"cl.ucn.disc.as.conserjeria.model.Contrato","cl.ucn.disc.as.conserjeria.model.Departamento","cl.ucn.disc.as.conserjeria.model.Edificio","cl.ucn.disc.as.conserjeria.model.Pago","cl.ucn.disc.as.conserjeria.model.Persona"})
public class EbeanEntityRegister implements EntityClassRegister {

  /**
   * Register AttributeConverter etc
   */
  private List<Class<?>> otherClasses() {
    return Collections.emptyList();
  }

  /**
   * Entities with no @DbName
   */
  private List<Class<?>> defaultEntityClasses() {
    List<Class<?>> entities = new ArrayList<>();
    entities.add(cl.ucn.disc.as.conserjeria.model.Contrato.class);
    entities.add(cl.ucn.disc.as.conserjeria.model.Departamento.class);
    entities.add(cl.ucn.disc.as.conserjeria.model.Edificio.class);
    entities.add(cl.ucn.disc.as.conserjeria.model.Pago.class);
    entities.add(cl.ucn.disc.as.conserjeria.model.Persona.class);
    return entities;
  }

  private List<Class<?>> classesFor(String dbName) {
    return new ArrayList<>();
  }

  @Override
  public List<Class<?>> classesFor(String dbName, boolean defaultServer) {
    List<Class<?>> classes = classesFor(dbName);
    if (defaultServer) {
      classes.addAll(defaultEntityClasses());
    }
    return classes;
  }

}
