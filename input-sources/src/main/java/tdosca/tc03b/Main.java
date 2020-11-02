/*
 * Copyright (C) 2020 Karsten Reincke, Deutsche Telekom AG
 *
 * tdosca-tc03b.main is licensed under the terms of the MIT license.
 * For details see the file COPYING in the top directory.
 */

package tdosca.tc03b;

public class Main {
  public static void main(String[] args) {
    GreetingService service = new GreetingService();
    System.out.println("tdosca.tc03b.Main says 'hello'.");
    System.out.println("license:MIT");
    if ((args == null) || (args.length == 0)){
      service.greet();
    }
    else {
      service.greet(args[0]);
    }
    System.out.println("tdosca.tc03b.Main says 'bye bye'");
  }
}
