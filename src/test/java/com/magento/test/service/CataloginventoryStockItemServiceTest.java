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
package com.magento.test.service;

import com.magento.test.entity.CataloginventoryStockItem;
import com.magento.test.entity.CataloginventoryStockItemId;

import com.magento.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class CataloginventoryStockItemServiceTest {
  private static DefaultCataloginventoryStockItemService serviceMock;
  private static CataloginventoryStockItem[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCataloginventoryStockItemService.class);
    String inputFile = "CataloginventoryStockItem.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CataloginventoryStockItem[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final CataloginventoryStockItemId id =
        new CataloginventoryStockItemId(
            records[0].getItemId(), records[0].getProductId(), records[0].getStockId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final CataloginventoryStockItemId id =
        new CataloginventoryStockItemId(
            records[0].getItemId(), records[0].getProductId(), records[0].getStockId());
    CataloginventoryStockItem testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals("expect equals qty ", records[0].getQty(), testResult.getQty());
    org.junit.Assert.assertEquals(
        "expect equals minQty ", records[0].getMinQty(), testResult.getMinQty());
    org.junit.Assert.assertTrue(
        "expect equals useConfigMinQty ",
        records[0].getUseConfigMinQty() == testResult.getUseConfigMinQty());
    org.junit.Assert.assertTrue(
        "expect equals isQtyDecimal ",
        records[0].getIsQtyDecimal() == testResult.getIsQtyDecimal());
    org.junit.Assert.assertTrue(
        "expect equals backorders ", records[0].getBackorders() == testResult.getBackorders());
    org.junit.Assert.assertTrue(
        "expect equals useConfigBackorders ",
        records[0].getUseConfigBackorders() == testResult.getUseConfigBackorders());
    org.junit.Assert.assertEquals(
        "expect equals minSaleQty ", records[0].getMinSaleQty(), testResult.getMinSaleQty());
    org.junit.Assert.assertTrue(
        "expect equals useConfigMinSaleQty ",
        records[0].getUseConfigMinSaleQty() == testResult.getUseConfigMinSaleQty());
    org.junit.Assert.assertEquals(
        "expect equals maxSaleQty ", records[0].getMaxSaleQty(), testResult.getMaxSaleQty());
    org.junit.Assert.assertTrue(
        "expect equals useConfigMaxSaleQty ",
        records[0].getUseConfigMaxSaleQty() == testResult.getUseConfigMaxSaleQty());
    org.junit.Assert.assertTrue(
        "expect equals isInStock ", records[0].getIsInStock() == testResult.getIsInStock());
    org.junit.Assert.assertEquals(
        "expect equals notifyStockQty ",
        records[0].getNotifyStockQty(),
        testResult.getNotifyStockQty());
    org.junit.Assert.assertTrue(
        "expect equals useConfigNotifyStockQty ",
        records[0].getUseConfigNotifyStockQty() == testResult.getUseConfigNotifyStockQty());
    org.junit.Assert.assertTrue(
        "expect equals manageStock ", records[0].getManageStock() == testResult.getManageStock());
    org.junit.Assert.assertTrue(
        "expect equals useConfigManageStock ",
        records[0].getUseConfigManageStock() == testResult.getUseConfigManageStock());
    org.junit.Assert.assertTrue(
        "expect equals stockStatusChangedAuto ",
        records[0].getStockStatusChangedAuto() == testResult.getStockStatusChangedAuto());
    org.junit.Assert.assertTrue(
        "expect equals useConfigQtyIncrements ",
        records[0].getUseConfigQtyIncrements() == testResult.getUseConfigQtyIncrements());
    org.junit.Assert.assertEquals(
        "expect equals qtyIncrements ",
        records[0].getQtyIncrements(),
        testResult.getQtyIncrements());
    org.junit.Assert.assertTrue(
        "expect equals useConfigEnableQtyInc ",
        records[0].getUseConfigEnableQtyInc() == testResult.getUseConfigEnableQtyInc());
    org.junit.Assert.assertTrue(
        "expect equals enableQtyIncrements ",
        records[0].getEnableQtyIncrements() == testResult.getEnableQtyIncrements());
    org.junit.Assert.assertTrue(
        "expect equals isDecimalDivided ",
        records[0].getIsDecimalDivided() == testResult.getIsDecimalDivided());
    org.junit.Assert.assertTrue(
        "expect equals websiteId ", records[0].getWebsiteId() == testResult.getWebsiteId());
  }
}
