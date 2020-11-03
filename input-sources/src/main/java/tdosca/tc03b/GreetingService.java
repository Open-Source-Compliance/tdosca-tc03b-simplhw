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
  String inc = "---";
  public String greet(String garg) {
    System.out.println(inc+"tdosca.tc03b.GreetingService(" + garg + "): 'hello'.");
    System.out.println(inc+"license(GreetingService,M.I.T)");
    envservice.info();
    System.out.println(inc+"tdosca.tc03b.GreetingService(...): 'bye bye'");
    return "back1";
  }
  public String greet() {
    System.out.println(inc+"tdosca.tc03b.GreetingService(): 'hello'.");
    System.out.println(inc+": license(GreetingService,M.I.T)");
    envservice.info();
    System.out.println(inc+"tdoscb.tc03a.GreetingService(...): 'bye bye'");
    return "back0";
  }
}
