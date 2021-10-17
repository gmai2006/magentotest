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
import com.magento.test.entity.CatalogProductBundleSelection;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class CatalogProductBundleSelectionDaoTestIt {
  static final String inputFile = "CatalogProductBundleSelection.json";
  static CatalogProductBundleSelectionDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CatalogProductBundleSelection[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultCatalogProductBundleSelectionDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CatalogProductBundleSelection[].class);
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
    CatalogProductBundleSelection testResult = dao.find(records[1].getSelectionId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals optionId ", this.records[1].getOptionId() == testResult.getOptionId());
    org.junit.Assert.assertTrue(
        "expect equals parentProductId ",
        this.records[1].getParentProductId() == testResult.getParentProductId());
    org.junit.Assert.assertTrue(
        "expect equals productId ", this.records[1].getProductId() == testResult.getProductId());
    org.junit.Assert.assertTrue(
        "expect equals position ", this.records[1].getPosition() == testResult.getPosition());
    org.junit.Assert.assertTrue(
        "expect equals isDefault ", this.records[1].getIsDefault() == testResult.getIsDefault());
    org.junit.Assert.assertTrue(
        "expect equals selectionPriceType ",
        this.records[1].getSelectionPriceType() == testResult.getSelectionPriceType());
    org.junit.Assert.assertEquals(
        "expect equals selectionPriceValue ",
        this.records[1].getSelectionPriceValue(),
        testResult.getSelectionPriceValue());
    org.junit.Assert.assertEquals(
        "expect equals selectionQty ",
        this.records[1].getSelectionQty(),
        testResult.getSelectionQty());
    org.junit.Assert.assertTrue(
        "expect equals selectionCanChangeQty ",
        this.records[1].getSelectionCanChangeQty() == testResult.getSelectionCanChangeQty());
  }
}
