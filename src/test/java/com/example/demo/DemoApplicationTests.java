package com.example.demo;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


  /*@Parameters({"testType"})*/
  @Test
  public void contextLoads() {
    String str = "Junit is working fine";
    Assert.assertEquals("Junit is working fine", str);
  }

  @Test
  public void testGao() {
    String str = "Junit is working fine";
    Assert.assertEquals("Junit is working fine", str);
  }

}
