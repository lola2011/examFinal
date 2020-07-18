package kg.examfinal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="counter")
@AllArgsConstructor
@NoArgsConstructor
public class Count {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="count")
   private Integer count;
    @Column(name="dateTime")
    private LocalDateTime dateTime;
    public Count(Integer count, LocalDateTime localDateTime){
        this.count=count;
        this.dateTime=dateTime;
    }
}
