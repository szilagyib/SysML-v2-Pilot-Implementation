/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.sysml.groups.Namespace;
import org.omg.sysml.tests.AlfInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(AlfInjectorProvider.class)
@SuppressWarnings("all")
public class AlfParsingTest {
  @Inject
  private ParseHelper<Namespace> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Namespace result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
