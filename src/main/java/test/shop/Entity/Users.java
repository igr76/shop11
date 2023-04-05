package test.shop.Entity;

import com.example.springSecurity.sequrity.DTO.Role;
import lombok.*;

import javax.persistence.*;

/**
 * Сущность пользователей
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class Users {
    /**
     * id пользователя
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Integer id;
    /**
     * Имя пользователя
     */
    @Column(name = "user_name")
    String userName;


    /**
     * почта пользователя
     */
    @Column(name = "email")
    String email;

    /**
     * пароль пользователя
     */
    @Column(name = "password")
    String password;
    /**
     * пароль пользователя
     */
    @Column(name = "balance")
    Integer balance;
    /**
     * статус пользователя
     */
    @Column(name = "roles")
    @Enumerated(EnumType.STRING)
    Role role;
    /** Продавец товара
     * @param organization  */
    @Column(name = "organization")
    String organization;
    /**
     * фото пользователя
     */
//    @Column(name = "image")
//    String image;

}
