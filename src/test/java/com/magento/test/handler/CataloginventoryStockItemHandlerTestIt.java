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
import com.magento.test.entity.CataloginventoryStockItem;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultCataloginventoryStockItemDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import com.magento.test.entity.CataloginventoryStockItemId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CataloginventoryStockItemHandlerTestIt {
  static final String inputFile = "CataloginventoryStockItem.json";
  static CataloginventoryStockItemHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CataloginventoryStockItem[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new CataloginventoryStockItemHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, CataloginventoryStockItem[].class);
    assertEquals("match count", count, records.length);
    final CataloginventoryStockItemId id =
        new CataloginventoryStockItemId(
            this.records[0].getItemId(),
            this.records[0].getProductId(),
            this.records[0].getStockId());
    CataloginventoryStockItem testResult = jpa.find(CataloginventoryStockItem.class, id);
    assertEquals("expect equals qty ", this.records[0].getQty(), testResult.getQty());
    assertEquals("expect equals minQty ", this.records[0].getMinQty(), testResult.getMinQty());
    org.junit.Assert.assertEquals(
        "expect equals useConfigMinQty ",
        this.records[0].getUseConfigMinQty(),
        testResult.getUseConfigMinQty());
    org.junit.Assert.assertEquals(
        "expect equals isQtyDecimal ",
        this.records[0].getIsQtyDecimal(),
        testResult.getIsQtyDecimal());
    org.junit.Assert.assertEquals(
        "expect equals backorders ", this.records[0].getBackorders(), testResult.getBackorders());
    org.junit.Assert.assertEquals(
        "expect equals useConfigBackorders ",
        this.records[0].getUseConfigBackorders(),
        testResult.getUseConfigBackorders());
    assertEquals(
        "expect equals minSaleQty ", this.records[0].getMinSaleQty(), testResult.getMinSaleQty());
    org.junit.Assert.assertEquals(
        "expect equals useConfigMinSaleQty ",
        this.records[0].getUseConfigMinSaleQty(),
        testResult.getUseConfigMinSaleQty());
    assertEquals(
        "expect equals maxSaleQty ", this.records[0].getMaxSaleQty(), testResult.getMaxSaleQty());
    org.junit.Assert.assertEquals(
        "expect equals useConfigMaxSaleQty ",
        this.records[0].getUseConfigMaxSaleQty(),
        testResult.getUseConfigMaxSaleQty());
    org.junit.Assert.assertEquals(
        "expect equals isInStock ", this.records[0].getIsInStock(), testResult.getIsInStock());
    assertEquals(
        "expect equals notifyStockQty ",
        this.records[0].getNotifyStockQty(),
        testResult.getNotifyStockQty());
    org.junit.Assert.assertEquals(
        "expect equals useConfigNotifyStockQty ",
        this.records[0].getUseConfigNotifyStockQty(),
        testResult.getUseConfigNotifyStockQty());
    org.junit.Assert.assertEquals(
        "expect equals manageStock ",
        this.records[0].getManageStock(),
        testResult.getManageStock());
    org.junit.Assert.assertEquals(
        "expect equals useConfigManageStock ",
        this.records[0].getUseConfigManageStock(),
        testResult.getUseConfigManageStock());
    org.junit.Assert.assertEquals(
        "expect equals stockStatusChangedAuto ",
        this.records[0].getStockStatusChangedAuto(),
        testResult.getStockStatusChangedAuto());
    org.junit.Assert.assertEquals(
        "expect equals useConfigQtyIncrements ",
        this.records[0].getUseConfigQtyIncrements(),
        testResult.getUseConfigQtyIncrements());
    assertEquals(
        "expect equals qtyIncrements ",
        this.records[0].getQtyIncrements(),
        testResult.getQtyIncrements());
    org.junit.Assert.assertEquals(
        "expect equals useConfigEnableQtyInc ",
        this.records[0].getUseConfigEnableQtyInc(),
        testResult.getUseConfigEnableQtyInc());
    org.junit.Assert.assertEquals(
        "expect equals enableQtyIncrements ",
        this.records[0].getEnableQtyIncrements(),
        testResult.getEnableQtyIncrements());
    org.junit.Assert.assertEquals(
        "expect equals isDecimalDivided ",
        this.records[0].getIsDecimalDivided(),
        testResult.getIsDecimalDivided());
    org.junit.Assert.assertEquals(
        "expect equals websiteId ", this.records[0].getWebsiteId(), testResult.getWebsiteId());

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
