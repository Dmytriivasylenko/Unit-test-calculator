package org.example.app.service.suit;

import org.example.app.service.AdditionalServiceTest;
import org.example.app.service.DivisionServiceTest;
import org.example.app.service.MultiplicationTest;
import org.example.app.service.SubtractionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        DivisionServiceTest.class,
        MultiplicationTest.class,
        SubtractionTest.class,
        AdditionalServiceTest.class
})
public class ServicesTest {
}
