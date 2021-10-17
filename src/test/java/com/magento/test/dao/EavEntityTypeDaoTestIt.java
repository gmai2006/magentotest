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
import com.magento.test.entity.EavEntityType;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class EavEntityTypeDaoTestIt {
  static final String inputFile = "EavEntityType.json";
  static EavEntityTypeDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private EavEntityType[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultEavEntityTypeDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, EavEntityType[].class);
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
    EavEntityType testResult = dao.find(records[1].getEntityTypeId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals entityTypeCode ",
        this.records[1].getEntityTypeCode(),
        testResult.getEntityTypeCode());
    org.junit.Assert.assertEquals(
        "expect equals entityModel ",
        this.records[1].getEntityModel(),
        testResult.getEntityModel());
    org.junit.Assert.assertEquals(
        "expect equals attributeModel ",
        this.records[1].getAttributeModel(),
        testResult.getAttributeModel());
    org.junit.Assert.assertEquals(
        "expect equals entityTable ",
        this.records[1].getEntityTable(),
        testResult.getEntityTable());
    org.junit.Assert.assertEquals(
        "expect equals valueTablePrefix ",
        this.records[1].getValueTablePrefix(),
        testResult.getValueTablePrefix());
    org.junit.Assert.assertEquals(
        "expect equals entityIdField ",
        this.records[1].getEntityIdField(),
        testResult.getEntityIdField());
    org.junit.Assert.assertTrue(
        "expect equals isDataSharing ",
        this.records[1].getIsDataSharing() == testResult.getIsDataSharing());
    org.junit.Assert.assertEquals(
        "expect equals dataSharingKey ",
        this.records[1].getDataSharingKey(),
        testResult.getDataSharingKey());
    org.junit.Assert.assertTrue(
        "expect equals defaultAttributeSetId ",
        this.records[1].getDefaultAttributeSetId() == testResult.getDefaultAttributeSetId());
    org.junit.Assert.assertEquals(
        "expect equals incrementModel ",
        this.records[1].getIncrementModel(),
        testResult.getIncrementModel());
    org.junit.Assert.assertTrue(
        "expect equals incrementPerStore ",
        this.records[1].getIncrementPerStore() == testResult.getIncrementPerStore());
    org.junit.Assert.assertTrue(
        "expect equals incrementPadLength ",
        this.records[1].getIncrementPadLength() == testResult.getIncrementPadLength());
    org.junit.Assert.assertEquals(
        "expect equals incrementPadChar ",
        this.records[1].getIncrementPadChar(),
        testResult.getIncrementPadChar());
    org.junit.Assert.assertEquals(
        "expect equals additionalAttributeTable ",
        this.records[1].getAdditionalAttributeTable(),
        testResult.getAdditionalAttributeTable());
    org.junit.Assert.assertEquals(
        "expect equals entityAttributeCollection ",
        this.records[1].getEntityAttributeCollection(),
        testResult.getEntityAttributeCollection());
  }
}
