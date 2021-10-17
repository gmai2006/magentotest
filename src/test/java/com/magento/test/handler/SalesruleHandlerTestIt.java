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
package com.magento.test.handler;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.CDL;
import org.json.JSONArray;
import com.google.gson.Gson;
import com.magento.test.entity.Salesrule;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultSalesruleDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesruleHandlerTestIt {
  static final String inputFile = "Salesrule.json";
  static SalesruleHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private Salesrule[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SalesruleHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, Salesrule[].class);
    assertEquals("match count", count, records.length);
    Salesrule testResult = jpa.find(Salesrule.class, records[0].getRuleId());
    assertEquals("expect equals name ", this.records[0].getName(), testResult.getName());
    assertEquals(
        "expect equals description ",
        this.records[0].getDescription(),
        testResult.getDescription());
    org.junit.Assert.assertEquals(
        "expect equals usesPerCustomer ",
        this.records[0].getUsesPerCustomer(),
        testResult.getUsesPerCustomer());
    org.junit.Assert.assertEquals(
        "expect equals isActive ", this.records[0].getIsActive(), testResult.getIsActive());
    assertEquals(
        "expect equals conditionsSerialized ",
        this.records[0].getConditionsSerialized(),
        testResult.getConditionsSerialized());
    assertEquals(
        "expect equals actionsSerialized ",
        this.records[0].getActionsSerialized(),
        testResult.getActionsSerialized());
    org.junit.Assert.assertEquals(
        "expect equals stopRulesProcessing ",
        this.records[0].getStopRulesProcessing(),
        testResult.getStopRulesProcessing());
    org.junit.Assert.assertEquals(
        "expect equals isAdvanced ", this.records[0].getIsAdvanced(), testResult.getIsAdvanced());
    assertEquals(
        "expect equals productIds ", this.records[0].getProductIds(), testResult.getProductIds());
    org.junit.Assert.assertEquals(
        "expect equals sortOrder ", this.records[0].getSortOrder(), testResult.getSortOrder());
    assertEquals(
        "expect equals simpleAction ",
        this.records[0].getSimpleAction(),
        testResult.getSimpleAction());
    assertEquals(
        "expect equals discountAmount ",
        this.records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    assertEquals(
        "expect equals discountQty ",
        this.records[0].getDiscountQty(),
        testResult.getDiscountQty());
    org.junit.Assert.assertEquals(
        "expect equals discountStep ",
        this.records[0].getDiscountStep(),
        testResult.getDiscountStep());
    org.junit.Assert.assertEquals(
        "expect equals applyToShipping ",
        this.records[0].getApplyToShipping(),
        testResult.getApplyToShipping());
    org.junit.Assert.assertEquals(
        "expect equals timesUsed ", this.records[0].getTimesUsed(), testResult.getTimesUsed());
    org.junit.Assert.assertEquals(
        "expect equals isRss ", this.records[0].getIsRss(), testResult.getIsRss());
    org.junit.Assert.assertEquals(
        "expect equals couponType ", this.records[0].getCouponType(), testResult.getCouponType());
    org.junit.Assert.assertEquals(
        "expect equals useAutoGeneration ",
        this.records[0].getUseAutoGeneration(),
        testResult.getUseAutoGeneration());
    org.junit.Assert.assertEquals(
        "expect equals usesPerCoupon ",
        this.records[0].getUsesPerCoupon(),
        testResult.getUsesPerCoupon());
    org.junit.Assert.assertEquals(
        "expect equals simpleFreeShipping ",
        this.records[0].getSimpleFreeShipping(),
        testResult.getSimpleFreeShipping());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }

  /**
   * Construct a delimiter file from a json file.
   *
   * @param inputFile the json file.
   * @param charset default charset.
   * @return
   */
  private File createRecordInputStreamFromJsonFile(String inputFile, Charset charset) {
    try {
      final File tempFile = File.createTempFile(inputFile, ".txt");
      tempFile.deleteOnExit();
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      JSONArray docs = new JSONArray(json);
      String csv = CDL.toString(docs);
      org.apache.commons.io.FileUtils.writeStringToFile(tempFile, csv, Charset.defaultCharset());
      return tempFile;
    } catch (IOException ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
