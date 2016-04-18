import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ConverterTest {

    @Test
    public void whenNumberEnteredReturnsString(){
        //arrange

        //act

        //assert
        assertThat(Converter.toText(0), equalTo("zero "));
        assertThat(Converter.toText(5), equalTo("five "));
        assertThat(Converter.toText(7), equalTo("seven "));
        assertThat(Converter.toText(11), equalTo("eleven "));
        assertThat(Converter.toText(25), equalTo("twenty five "));
        assertThat(Converter.toText(50), equalTo("fifty "));
        assertThat(Converter.toText(73), equalTo("seventy three "));
        assertThat(Converter.toText(100), equalTo("one hundred "));
        assertThat(Converter.toText(325), equalTo("three hundred twenty five "));
        //assertThat(Converter.toText(3011), equalTo("three thousand eleven "));
        assertThat(Converter.toText(325325), equalTo("three hundred twenty five thousand three hundred twenty five "));


    }

}
