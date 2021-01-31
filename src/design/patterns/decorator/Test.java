package design.patterns.decorator;

import design.patterns.decorator.base.DataSource;
import design.patterns.decorator.base.FileDataSource;
import design.patterns.decorator.decorator.DataSourceDecorator;

public class Test {

    public static void main(String[] args) {

        String salaryRecords = "Name,Salary\nJohn Smith, 10000\nSteve Jobs, 90000";

        DataSourceDecorator encoded = new CompressionDecorator(
                                        new EncryptionDecorator(
                                            new FileDataSource("out/OutputDemo.txt")));

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("# Input ----------");
        System.out.println(salaryRecords);
        System.out.println("# Encoded --------");
        System.out.println(plain.readData());
        System.out.println("# Decoded --------");
        System.out.println(encoded.readData());
    }
}
