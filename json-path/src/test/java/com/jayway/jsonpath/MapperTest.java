package com.jayway.jsonpath;

import org.junit.Test;

import java.util.Date;

import static com.jayway.jsonpath.JsonPath.parse;
import static org.assertj.core.api.Assertions.assertThat;

public class MapperTest extends BaseTest {


    @Test
    public void an_Integer_can_be_converted_to_a_Long() {
        assertThat(parse("{\"val\": 1}").read("val", Long.class)).isEqualTo(1L);
    }

    @Test
    public void an_String_can_be_converted_to_a_Long() {
        assertThat(parse("{\"val\": 1}").read("val", Long.class)).isEqualTo(1L);
    }

    @Test
    public void an_Integer_can_be_converted_to_a_String() {
        assertThat(parse("{\"val\": 1}").read("val", String.class)).isEqualTo("1");
    }

    @Test
    public void an_Integer_can_be_converted_to_a_Double() {
        assertThat(parse("{\"val\": 1}").read("val", Double.class)).isEqualTo(1D);
    }

    @Test
    public void a_BigDecimal_can_be_converted_to_a_Long() {
        assertThat(parse("{\"val\": 1.5}").read("val", Long.class)).isEqualTo(1L);
    }

    @Test
    public void a_Long_can_be_converted_to_a_Date() {
        Date now = new Date();
        assertThat(parse("{\"val\": "+now.getTime()+"}").read("val", Date.class)).isEqualTo(now);
    }

}
