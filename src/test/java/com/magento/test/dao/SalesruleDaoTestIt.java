/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.magento.test.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.magento.test.entity.Salesrule;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesruleDaoTestIt {
  static final String inputFile = "Salesrule.json";
  static SalesruleDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private Salesrule[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSalesruleDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Salesrule[].class);
      json = null;
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @After
  public void after() {
    records = null;
  }

  @Test
  public void testSelect() {
    Salesrule testResult = dao.find(records[1].getRuleId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals name ", this.records[1].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals description ",
        this.records[1].getDescription(),
        testResult.getDescription());
    org.junit.Assert.assertTrue(
        "expect equals usesPerCustomer ",
        this.records[1].getUsesPerCustomer() == testResult.getUsesPerCustomer());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", this.records[1].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertEquals(
        "expect equals conditionsSerialized ",
        this.records[1].getConditionsSerialized(),
        testResult.getConditionsSerialized());
    org.junit.Assert.assertEquals(
        "expect equals actionsSerialized ",
        this.records[1].getActionsSerialized(),
        testResult.getActionsSerialized());
    org.junit.Assert.assertTrue(
        "expect equals stopRulesProcessing ",
        this.records[1].getStopRulesProcessing() == testResult.getStopRulesProcessing());
    org.junit.Assert.assertTrue(
        "expect equals isAdvanced ", this.records[1].getIsAdvanced() == testResult.getIsAdvanced());
    org.junit.Assert.assertEquals(
        "expect equals productIds ", this.records[1].getProductIds(), testResult.getProductIds());
    org.junit.Assert.assertTrue(
        "expect equals sortOrder ", this.records[1].getSortOrder() == testResult.getSortOrder());
    org.junit.Assert.assertEquals(
        "expect equals simpleAction ",
        this.records[1].getSimpleAction(),
        testResult.getSimpleAction());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        this.records[1].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals discountQty ",
        this.records[1].getDiscountQty(),
        testResult.getDiscountQty());
    org.junit.Assert.assertTrue(
        "expect equals discountStep ",
        this.records[1].getDiscountStep() == testResult.getDiscountStep());
    org.junit.Assert.assertTrue(
        "expect equals applyToShipping ",
        this.records[1].getApplyToShipping() == testResult.getApplyToShipping());
    org.junit.Assert.assertTrue(
        "expect equals timesUsed ", this.records[1].getTimesUsed() == testResult.getTimesUsed());
    org.junit.Assert.assertTrue(
        "expect equals isRss ", this.records[1].getIsRss() == testResult.getIsRss());
    org.junit.Assert.assertTrue(
        "expect equals couponType ", this.records[1].getCouponType() == testResult.getCouponType());
    org.junit.Assert.assertTrue(
        "expect equals useAutoGeneration ",
        this.records[1].getUseAutoGeneration() == testResult.getUseAutoGeneration());
    org.junit.Assert.assertTrue(
        "expect equals usesPerCoupon ",
        this.records[1].getUsesPerCoupon() == testResult.getUsesPerCoupon());
    org.junit.Assert.assertTrue(
        "expect equals simpleFreeShipping ",
        this.records[1].getSimpleFreeShipping() == testResult.getSimpleFreeShipping());
  }
}
