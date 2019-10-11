package week9;

import java.time.LocalDate;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Order implements Serializable {

    private String orderNumber;
    private LocalDate orderDate;
    private String status;

}
