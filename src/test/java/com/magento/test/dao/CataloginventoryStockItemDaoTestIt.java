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
import com.magento.test.entity.CataloginventoryStockItem;
import com.magento.test.entity.CataloginventoryStockItemId;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class CataloginventoryStockItemDaoTestIt {
  static final String inputFile = "CataloginventoryStockItem.json";
  static CataloginventoryStockItemDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CataloginventoryStockItem[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultCataloginventoryStockItemDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CataloginventoryStockItem[].class);
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
    final CataloginventoryStockItemId id =
        new CataloginventoryStockItemId(
            this.records[1].getItemId(),
            this.records[1].getProductId(),
            this.records[1].getStockId());
    CataloginventoryStockItem testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals qty ", this.records[1].getQty(), testResult.getQty());
    org.junit.Assert.assertEquals(
        "expect equals minQty ", this.records[1].getMinQty(), testResult.getMinQty());
    org.junit.Assert.assertTrue(
        "expect equals useConfigMinQty ",
        this.records[1].getUseConfigMinQty() == testResult.getUseConfigMinQty());
    org.junit.Assert.assertTrue(
        "expect equals isQtyDecimal ",
        this.records[1].getIsQtyDecimal() == testResult.getIsQtyDecimal());
    org.junit.Assert.assertTrue(
        "expect equals backorders ", this.records[1].getBackorders() == testResult.getBackorders());
    org.junit.Assert.assertTrue(
        "expect equals useConfigBackorders ",
        this.records[1].getUseConfigBackorders() == testResult.getUseConfigBackorders());
    org.junit.Assert.assertEquals(
        "expect equals minSaleQty ", this.records[1].getMinSaleQty(), testResult.getMinSaleQty());
    org.junit.Assert.assertTrue(
        "expect equals useConfigMinSaleQty ",
        this.records[1].getUseConfigMinSaleQty() == testResult.getUseConfigMinSaleQty());
    org.junit.Assert.assertEquals(
        "expect equals maxSaleQty ", this.records[1].getMaxSaleQty(), testResult.getMaxSaleQty());
    org.junit.Assert.assertTrue(
        "expect equals useConfigMaxSaleQty ",
        this.records[1].getUseConfigMaxSaleQty() == testResult.getUseConfigMaxSaleQty());
    org.junit.Assert.assertTrue(
        "expect equals isInStock ", this.records[1].getIsInStock() == testResult.getIsInStock());
    org.junit.Assert.assertEquals(
        "expect equals notifyStockQty ",
        this.records[1].getNotifyStockQty(),
        testResult.getNotifyStockQty());
    org.junit.Assert.assertTrue(
        "expect equals useConfigNotifyStockQty ",
        this.records[1].getUseConfigNotifyStockQty() == testResult.getUseConfigNotifyStockQty());
    org.junit.Assert.assertTrue(
        "expect equals manageStock ",
        this.records[1].getManageStock() == testResult.getManageStock());
    org.junit.Assert.assertTrue(
        "expect equals useConfigManageStock ",
        this.records[1].getUseConfigManageStock() == testResult.getUseConfigManageStock());
    org.junit.Assert.assertTrue(
        "expect equals stockStatusChangedAuto ",
        this.records[1].getStockStatusChangedAuto() == testResult.getStockStatusChangedAuto());
    org.junit.Assert.assertTrue(
        "expect equals useConfigQtyIncrements ",
        this.records[1].getUseConfigQtyIncrements() == testResult.getUseConfigQtyIncrements());
    org.junit.Assert.assertEquals(
        "expect equals qtyIncrements ",
        this.records[1].getQtyIncrements(),
        testResult.getQtyIncrements());
    org.junit.Assert.assertTrue(
        "expect equals useConfigEnableQtyInc ",
        this.records[1].getUseConfigEnableQtyInc() == testResult.getUseConfigEnableQtyInc());
    org.junit.Assert.assertTrue(
        "expect equals enableQtyIncrements ",
        this.records[1].getEnableQtyIncrements() == testResult.getEnableQtyIncrements());
    org.junit.Assert.assertTrue(
        "expect equals isDecimalDivided ",
        this.records[1].getIsDecimalDivided() == testResult.getIsDecimalDivided());
    org.junit.Assert.assertTrue(
        "expect equals websiteId ", this.records[1].getWebsiteId() == testResult.getWebsiteId());
  }
}
