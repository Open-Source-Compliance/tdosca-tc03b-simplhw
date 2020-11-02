# Compliance Traps of TDOSCA-TC03B-SIMPLHW

The test case input (= open source software)

* constantly claims to be licensed under the MIT license, but the class file ``envService.java`` and ``envServiceTest.java`` are divergently licensed under the BSD-2-Clause
* is licensing the file envService.java under a 'wrong', but well known and often used SPDX identifier BSD-2CL
* integrates the BSD-2-Clause license text into the file header
* delivers its default license text in a file named COPYING although this is normally only be done by GNU software
* the file COPYING contains the text of the MIT license but does not declare to be the MIT license
* uses the names "Karsten Reincke", "kreincke", "K.Reincke" but due to the fact, that only the MIT-Licence and the BSD-2CL-License may be integrated into the OSCF file, none of the respective copyright lines may appear.
* the tar/zip file created by the command ``gradle build`` contains the MIT license file, but not the BSD-License file
* contains the gradle wrapper script, created by 'gradle wrapper' and the gradle-wrapper.jar  both licensed under the Apache-v2 license (= LICENSE.gradle) => A tool which automatically generates the sufficient compliance artifacts must/should create
  - the artifacts for the repository (= including the gradle artifacts)
  - the artifacts for the tdosca-tc03b.jar file (= excluding the gradle artifacts)
* does not contain the gradle-NOTICE-file due to the fact, that the repository [https://github.com/gradle/gradle](https://github.com/gradle/gradle) itself does not contain such a file named NOTICE
