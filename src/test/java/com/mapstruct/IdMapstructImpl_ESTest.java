/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:33:00 GMT 2023
 */

package com.mapstruct;

import org.junit.Test;
import static org.junit.Assert.*;
import com.entity.IdInfoDTO;
import com.entity.IdInfoEntity;
import com.mapstruct.IdMapstructImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IdMapstructImpl_ESTest extends IdMapstructImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IdMapstructImpl idMapstructImpl0 = new IdMapstructImpl();
      IdInfoDTO idInfoDTO0 = idMapstructImpl0.toIdInfoDTO((IdInfoEntity) null);
      assertNull(idInfoDTO0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IdMapstructImpl idMapstructImpl0 = new IdMapstructImpl();
      IdInfoEntity idInfoEntity0 = new IdInfoEntity();
      IdInfoDTO idInfoDTO0 = idMapstructImpl0.toIdInfoDTO(idInfoEntity0);
      assertNull(idInfoDTO0.getCrdTp());
  }
}
