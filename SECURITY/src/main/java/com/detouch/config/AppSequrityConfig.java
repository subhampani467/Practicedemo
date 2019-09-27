
  package com.detouch.config;
  
  import java.util.ArrayList; import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import
  org.springframework.security.config.annotation.web.configuration.
  EnableWebSecurity; import
  org.springframework.security.config.annotation.web.configuration.
  WebSecurityConfigurerAdapter; import
  org.springframework.security.core.userdetails.User; import
  org.springframework.security.core.userdetails.UserDetails; import
  org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import
  org.springframework.security.provisioning.InMemoryUserDetailsManager;
  
  @Configuration
  
  @EnableWebSecurity 
  public class AppSequrityConfig extends WebSecurityConfigurerAdapter {
	  
	  @Autowired
	  private UserDetailsService userDetailsService;
	  
	  @Bean
	  public AuthenticationProvider authProvider() {
		  DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		  provider.setUserDetailsService(userDetailsService());
		  provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		  return provider;
	  }
	  
	  
	  
	  //PAGE SECURITY
  /*@Bean
  
  @Override 
  protected UserDetailsService userDetailsService() {
  
  List<UserDetails> user=new ArrayList<UserDetails>();
  
  user.add(User.withDefaultPasswordEncoder().username("subham").password("1234").roles("USER").build());
  
  return new InMemoryUserDetailsManager(user);
  
  }*/
  
  }
 