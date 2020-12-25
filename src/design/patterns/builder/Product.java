package design.patterns.builder;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {

    private Long id;
    private String name;
    private String description;
    private LocalDate date;
    private BigDecimal price;

    public Product(ProductBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.date = builder.date;
        this.price = builder.price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    public static class ProductBuilder {
        private Long id;
        private String name;
        private String description;
        private LocalDate date;
        private BigDecimal price;

        public ProductBuilder id(Long id){
            this.id = id;
            return this;
        }

        public ProductBuilder name(String name){
            this.name = name;
            return this;
        }

        public ProductBuilder description(String description){
            this.description = description;
            return this;
        }

        public ProductBuilder date(LocalDate date){
            this.date = date;
            return this;
        }

        public ProductBuilder price(BigDecimal price){
            this.price = price;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }
}
