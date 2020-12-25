package design.patterns.builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Test {

    public static void main(String[] args) {

        Product product = new Product.ProductBuilder()
                .id(1L)
                .name("Meizu 16Xs")
                .description("Android Akıllı Telefon")
                .date(LocalDate.of(1994, Month.JULY, 9))
                .price(BigDecimal.valueOf(1000L))
                .build();

        System.out.println(product);
    }
}
