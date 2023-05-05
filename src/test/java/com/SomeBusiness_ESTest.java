/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 16:39:48 GMT 2023
 */

package com;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.SomeBusiness;
import com.entity.IdInfoEntity;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
@RunWith(SpringJUnit4ClassRunner.class)
public class SomeBusiness_ESTest{ //extends SomeBusiness_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SomeBusiness someBusiness0 = new SomeBusiness();
      LinkedList<IdInfoEntity> linkedList0 = new LinkedList<IdInfoEntity>();
      int int0 = someBusiness0.getAging(200, "q8s1Ia56607]w`H", true, linkedList0);
      assertEquals(230, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SomeBusiness someBusiness0 = new SomeBusiness();
      LinkedList<IdInfoEntity> linkedList0 = new LinkedList<IdInfoEntity>();
      int int0 = someBusiness0.getAging(1, (String) null, true, linkedList0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SomeBusiness someBusiness0 = new SomeBusiness();
      LinkedList<IdInfoEntity> linkedList0 = new LinkedList<IdInfoEntity>();
      IdInfoEntity idInfoEntity0 = new IdInfoEntity();
      idInfoEntity0.setCrdTp("04");
      linkedList0.add(idInfoEntity0);
      int int0 = someBusiness0.getAging(9, "04", true, linkedList0);
      assertEquals(44, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SomeBusiness someBusiness0 = new SomeBusiness();
      LinkedList<IdInfoEntity> linkedList0 = new LinkedList<IdInfoEntity>();
      IdInfoEntity idInfoEntity0 = new IdInfoEntity();
      linkedList0.add(idInfoEntity0);
      int int0 = someBusiness0.getAging(47, "09", false, linkedList0);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SomeBusiness someBusiness0 = new SomeBusiness();
      try { 
        someBusiness0.getAging(93, "'sa.vVyi9k", false, (List<IdInfoEntity>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.SomeBusiness", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SomeBusiness someBusiness0 = new SomeBusiness();
      LinkedList<IdInfoEntity> linkedList0 = new LinkedList<IdInfoEntity>();
      try { 
        someBusiness0.getAging(930, "hZegdhvA(IGpC +<", true, linkedList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Age cannot bigger that two hundred.
         //
         verifyException("com.SomeBusiness", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SomeBusiness someBusiness0 = new SomeBusiness();
      LinkedList<IdInfoEntity> linkedList0 = new LinkedList<IdInfoEntity>();
      try { 
        someBusiness0.getAging((-1631), "09", false, linkedList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Age cannot less that zero.
         //
         verifyException("com.SomeBusiness", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SomeBusiness.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }
}