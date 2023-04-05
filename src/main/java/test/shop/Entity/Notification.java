package test.shop.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
/**
 * Сущность уведомлений
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "notification")
public class Notification {
    /**
     * id уведомления
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Integer id;
    /**Заголовок уведомления      */
    @Column(name = "title")
    String title;
    /**Дата создания уведомления      */
    @Column(name = "created_at")
    LocalDateTime createdN;

    /**Текст уведомления       */
    @Column(name = "text")
    String text;
}
