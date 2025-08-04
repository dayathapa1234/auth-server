package com.nuvesta.auth_server;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

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
    beanDefinition.setTargetType(AuthServerApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(AuthServerApplication.class);
    beanDefinition.setInstanceSupplier(AuthServerApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'filterChain'.
   */
  private static BeanInstanceSupplier<SecurityFilterChain> getFilterChainInstanceSupplier() {
    return BeanInstanceSupplier.<SecurityFilterChain>forFactoryMethod(AuthServerApplication$$SpringCGLIB$$0.class, "filterChain", HttpSecurity.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("authServerApplication", AuthServerApplication.class).filterChain(args.get(0)));
  }

  /**
   * Get the bean definition for 'filterChain'.
   */
  public static BeanDefinition getFilterChainBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SecurityFilterChain.class);
    beanDefinition.setFactoryBeanName("authServerApplication");
    beanDefinition.setInstanceSupplier(getFilterChainInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'userDetailsService'.
   */
  private static BeanInstanceSupplier<UserDetailsService> getUserDetailsServiceInstanceSupplier() {
    return BeanInstanceSupplier.<UserDetailsService>forFactoryMethod(AuthServerApplication$$SpringCGLIB$$0.class, "userDetailsService")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("authServerApplication", AuthServerApplication.class).userDetailsService());
  }

  /**
   * Get the bean definition for 'userDetailsService'.
   */
  public static BeanDefinition getUserDetailsServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UserDetailsService.class);
    beanDefinition.setFactoryBeanName("authServerApplication");
    beanDefinition.setInstanceSupplier(getUserDetailsServiceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'passwordEncoder'.
   */
  private static BeanInstanceSupplier<PasswordEncoder> getPasswordEncoderInstanceSupplier() {
    return BeanInstanceSupplier.<PasswordEncoder>forFactoryMethod(AuthServerApplication$$SpringCGLIB$$0.class, "passwordEncoder")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("authServerApplication", AuthServerApplication.class).passwordEncoder());
  }

  /**
   * Get the bean definition for 'passwordEncoder'.
   */
  public static BeanDefinition getPasswordEncoderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PasswordEncoder.class);
    beanDefinition.setFactoryBeanName("authServerApplication");
    beanDefinition.setInstanceSupplier(getPasswordEncoderInstanceSupplier());
    return beanDefinition;
  }
}
