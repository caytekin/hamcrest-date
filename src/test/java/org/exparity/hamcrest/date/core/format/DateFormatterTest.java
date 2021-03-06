package org.exparity.hamcrest.date.core.format;

import static org.hamcrest.MatcherAssert.assertThat;

import org.exparity.hamcrest.date.testutils.Dates;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

/**
 * Unit test for the {@link DateFormatter} class
 *
 * @author Stewart Bissett
 */
public class DateFormatterTest {

    @Test
    public void canDescribe() {
        String description = new DateFormatter().describe(Dates.AUG_04_2015_1159_AS_DATE);
        assertThat(description, Matchers.equalTo("Tue, 04 Aug 2015 11:59:00.000 AM"));
    }

    @Test
    public void canDescribeDate() {
        String description = new DateFormatter().describeDate(Dates.AUG_04_2015_1159_AS_DATE);
        assertThat(description, Matchers.equalTo("Tue, 04 Aug 2015"));
    }

}
