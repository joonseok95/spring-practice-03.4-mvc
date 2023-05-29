package hello.typeconverter.formatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MyNumberFormatterTest {

    MyNumberFormatter formatter = new MyNumberFormatter();


    @Test
    void parse() throws ParseException {
        Number result = formatter.parse("10,000", Locale.KOREA);
        Assertions.assertThat(result).isEqualTo(10000L);
    }

    @Test
    void print() {
        String result = formatter.print(10000L, Locale.KOREA);
        Assertions.assertThat(result).isEqualTo("10,000");
    }
}