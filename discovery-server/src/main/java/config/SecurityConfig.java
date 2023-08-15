package config;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;


//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().authenticated()
//                )
//                .httpBasic(withDefaults());
//        return http.build();
//    }

//    @Bean
//    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//        http.csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().authenticated())
//                .httpBasic(withDefaults());
//        return http.build();
//    }
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("websparrow").password("{noop}web1234").roles("USER");
//    }

//    @Bean
//    public UserDetailsService userDetailsServiceBean() throws Exception {
//
//        // add users in List
//        List<UserDetails> users = new ArrayList<UserDetails>();
//
//        users.add(User.withDefaultPasswordEncoder()
//                .username("websparrow")
//                .password("web123").roles("USER").build());
//
//        return new InMemoryUserDetailsManager(users);
//    }
//@Bean
//public UserDetailsService users() {
//    // The builder will ensure the passwords are encoded before saving in memory
//    User.UserBuilder users = User.withDefaultPasswordEncoder();
//    UserDetails user = users
//            .username("user")
//            .password("{noop}password")
//            .roles("USER")
//            .build();
//    UserDetails admin = users
//            .username("admin")
//            .password("{noop}password")
//            .roles("USER", "ADMIN")
//            .build();
//    return new InMemoryUserDetailsManager(user, admin);
//}

//    @Bean
//    public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("user")
//                .password(bCryptPasswordEncoder.encode("userPass"))
//                .roles("USER")
//                .build());
//        manager.createUser(User.withUsername("admin")
//                .password(bCryptPasswordEncoder.encode("adminPass"))
//                .roles("USER", "ADMIN")
//                .build());
//        return manager;
//    }
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}