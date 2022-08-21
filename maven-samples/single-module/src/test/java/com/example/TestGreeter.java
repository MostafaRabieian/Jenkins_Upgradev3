package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.GreaterThan;
import org.mockito.internal.matchers.LessThan;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

    @Test
<<<<<<< HEAD
  public void greetShouldIncludeGreetingMessage() {
<<<<<<< HEAD
    String someone = "World, Thanks you making me Happy MSTF";
=======
=======
  public void greetShouldIncludeGreetingMessege() {
>>>>>>> 53cf3a95e88072c8e4921fe0d09bf86b398a79e4
    String someone = "World, Thanks you making me Happy... MSTF rabieian";
>>>>>>> 8ff49a5fd6efed21ba7ae0af5644ffeec8a140f2

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
