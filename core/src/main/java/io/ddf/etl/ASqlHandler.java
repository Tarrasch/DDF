/**
 *
 */
package io.ddf.etl;


import io.ddf.DDF;
import io.ddf.misc.ADDFFunctionalGroupHandler;

/**
 */
public abstract class ASqlHandler extends ADDFFunctionalGroupHandler implements IHandleSql {

  public ASqlHandler(DDF theDDF) {
    super(theDDF);
  }
}
