/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.usage;

import org.omg.sysml.usage.SysMLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SysMLStandaloneSetup extends SysMLStandaloneSetupGenerated {
  public static void doSetup() {
    new SysMLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
