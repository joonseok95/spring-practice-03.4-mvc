package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void stringToInteger() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void integerToString() {
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);
        System.out.println("result = " + result);
        Assertions.assertThat(result).isEqualTo("10");

    }

    @Test
    void ipPortToString() {
        IpPortToStringConverter converter = new IpPortToStringConverter();
        String result = converter.convert(new IpPort("125.0.0.1", 8080));
        Assertions.assertThat(result).isEqualTo("125.0.0.1:8080");
    }

    @Test
    void stringToIpPort() {
        StringToIpPortConverter converter = new StringToIpPortConverter();
        IpPort result = converter.convert("125.0.0.1:8080");
        IpPort ipPort = new IpPort("125.0.0.1", 8080);

        System.out.println("result = " + result);
        System.out.println("ipPort = " + ipPort);
        Assertions.assertThat(result).isEqualTo(ipPort);
    }
}