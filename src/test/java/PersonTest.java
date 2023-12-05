import models.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PersonTest {
    @Test
    void shouldCalculateCorrectSalary()
    {
        Person tomHanks = new Person("Tom", "Hanks");
        int actual = tomHanks.calculateSalary(1,1);
    int expected = 1;

    assertThat(actual).isEqualTo(expected);

    }

@Test
void shouldCalculateBonus()
        {
        Person tomcruise = new Person("Tom", "Hanks");
        int actual = tomcruise.giveBonus(2,4);
        int expected = 10;
        assertThat(actual).as("Wynagrodzenie policzone nieparidłowo").isGreaterThan(11);
        }
        }