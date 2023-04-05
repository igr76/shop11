package test.shop.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;
/**
 * Сущность скидок
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "discount")
public class Discount {
    @Id
    @Column(name = "categories", nullable = false)
    /** Категория  скидки       */
    Categories categories;
    /** Размер скидки       */
    @Column(name = "volume")
    Integer volume;
    /**Дата завершения скидки       */
    @Column(name = "created_ds")
    LocalDateTime createdDs;
}
