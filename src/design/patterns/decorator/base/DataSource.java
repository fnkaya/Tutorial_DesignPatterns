package design.patterns.decorator.base;

public interface DataSource {

    void writeData(String data);

    String readData();
}
