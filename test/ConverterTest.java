import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ConverterTest {

    @Test
    public void when0EnteredReturnsString(){
        //arrange

        //act

        //assert
        assertThat(Converter.toText(0), equalTo("zero "));
    }

    @Test
    public void when5EnteredReturnsString(){

        assertThat(Converter.toText(5), equalTo("five "));
    }

    @Test
    public void when7EnteredReturnsString(){

        assertThat(Converter.toText(7), equalTo("seven "));
    }

    @Test
    public void when11EnteredReturnsString(){

        assertThat(Converter.toText(11), equalTo("eleven "));
    }

    @Test
    public void when25EnteredReturnsString(){

        assertThat(Converter.toText(25), equalTo("twenty five "));
    }

    @Test
    public void when50EnteredReturnsString(){

        assertThat(Converter.toText(50), equalTo("fifty "));
    }

    @Test
    public void when73EnteredReturnsString(){

        assertThat(Converter.toText(73), equalTo("seventy three "));
    }

    @Test
    public void when100EnteredReturnsString(){

        assertThat(Converter.toText(100), equalTo("one hundred "));
    }

    @Test
    public void when325EnteredReturnsString(){

        assertThat(Converter.toText(325), equalTo("three hundred twenty five "));
    }

    @Test
    public void when3011EnteredReturnsString(){

        assertThat(Converter.toText(3011), equalTo("three thousand eleven "));
    }

    @Test
    public void when325325EnteredReturnString(){

        assertThat(Converter.toText(325325), equalTo("three hundred twenty five thousand three hundred twenty five "));
    }

    @Test
    public void when1230000EnteredReturnString(){
        assertThat(Converter.toText(1230000), equalTo("one million two hundred thirty thousand "));
    }

    @Test
    public void when325123780EnteredReturnString(){
        assertThat(Converter.toText(325123780), equalTo("three hundred twenty five million one hundred twenty three thousand seven hundred eighty "));
    }
}
