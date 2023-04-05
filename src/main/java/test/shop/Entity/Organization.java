package test.shop.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
/**
 * Сущность организаций
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "organization")
public class Organization {
    /**   Наименование организации     */
    @Id
    @Column(name = "name")
    String name;
    /**   Описание организации    */
    @Column(name = "title")
    String title;
    /**   Логотип организации     */
    @Column(name = "logotipe")
    String logotipe;
    /**   Товары организации     */
    @ElementCollection
    @CollectionTable(name = "list_if_products", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "list_if_products")
    ArrayList<String>  product;
    /** Статус организации  */
    @Column(name = "status")
    boolean status;

}
