package com.nuvesta.auth_server;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AuthServerApplication}.
 */
@Generated
public class AuthServerApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'authServerApplication'.
   */
  public static BeanDefinition getAuthServerApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthServerApplication.class);
    beanDefinition.setInstanceSupplier(AuthServerApplication::new);
    return beanDefinition;
  }
}
