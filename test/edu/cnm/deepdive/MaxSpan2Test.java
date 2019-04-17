package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class MaxSpan2Test {

  static final Pattern DELIMITER = Pattern.compile("\\s*,\\s*");

  @ParameterizedTest
  @CsvFileSource(resources = "test.csv")
  void maxSpan(String joinedInput, int expected) {
    int[] input = DELIMITER.splitAsStream(joinedInput)
        .filter(s -> s!=null && !s.isEmpty())
        .mapToInt(s -> Integer.parseInt(s))
        .toArray();
    int actual = MaxSpan2.maxSpan(input);
    assertEquals(expected, actual);

  }
}