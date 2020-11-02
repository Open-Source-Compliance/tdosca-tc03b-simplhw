/*
 * Copyright (C) 2020 Karsten Reincke, Deutsche Telekom AG
 *
 * tdosca-tc03b.GreetingService is licensed under the terms of the MIT license.
 * For details see the file COPYING in the top directory.
 */
package tdosca.tc03b;

import tdosca.all.EnvService;

public class GreetingService {
  EnvService envservice = new EnvService();
  public String greet(String garg) {
    System.out.println("...tdosca.tc03b.GreetingService(" + garg + ") says 'hello'.");
    System.out.println("license:MIT");
    envservice.info();
    System.out.println("...tdosca.tc03b.GreetingService(...) says 'bye bye'");
    return "back1";
  }
  public String greet() {
    System.out.println("tdosca.tc03b.GreetingService() says 'hello'.");
    System.out.println("license:MIT");
    envservice.info();
    System.out.println("...tdosca.tc03b.GreetingService(...) says 'bye bye'");
    return "back0";
  }
}
