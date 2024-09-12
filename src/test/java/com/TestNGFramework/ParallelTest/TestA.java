package com.TestNGFramework.ParallelTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestA {
  @Test
  public void f()
  {WebDriver driver=new EdgeDriver();
  driver.get("https://www.facebook.com");
  System.out.println("Title: "+driver.getTitle());
  }
}
