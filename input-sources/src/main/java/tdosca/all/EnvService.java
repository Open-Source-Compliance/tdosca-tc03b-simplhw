/*
* EnvService.java of the project tdosca-tc03b is licensed under the terms of the BSD-2CL:
*
* Copyright (C) 2020 kreincke / Deutsche Telekom AG
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
*
* 1. Redistributions of source code must retain the above copyright notice,
* this list of conditions and the following disclaimer.
*
* 2. Redistributions in binary form must reproduce the above copyright notice,
* this list of conditions and the following disclaimer in the documentation and/
* or other materials provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
* AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
* IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
* ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
* LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
* SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
* INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
* CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
* ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
* POSSIBILITY OF SUCH DAMAGE.
*/

package tdosca.all;

import java.util.Map;


public class EnvService {
  Map<String, String> env = System.getenv();
  String pwd = null;

  public String info() {
    System.out.println("...tdosca.all.EnvService() says 'hello'.");
    System.out.println("license:BSD-2CL");
    if (env != null) {
      pwd=env.get("PWD");
    }
    if (pwd!=null) {
      System.out.println("Program is started from " + pwd);
    } else {
      System.out.println("PWD not specified in the environment");
    }
    System.out.println("...tdosca.all.EnvService(...) says 'bye bye'");
    return "back0";
  }
}
