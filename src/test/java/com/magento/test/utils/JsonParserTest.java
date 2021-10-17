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
package com.magento.test.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.magento.test.entity.*;

public class JsonParserTest {
  @Test
  public void testParsingAdminPasswords() throws IOException {
    final String inputFile = "AdminPasswords.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AdminPasswords> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AdminPasswords(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals passwordId ",
          o.get("passwordId").getAsInt(),
          result.get(i).getPasswordId(),
          0.0001);
      assertEquals(
          "expect equals userId ", o.get("userId").getAsInt(), result.get(i).getUserId(), 0.0001);
      assertEquals(
          "expect equals passwordHash ",
          o.get("passwordHash").getAsString(),
          result.get(i).getPasswordHash());
      assertEquals(
          "expect equals expires ",
          o.get("expires").getAsInt(),
          result.get(i).getExpires(),
          0.0001);
      assertEquals(
          "expect equals lastUpdated ",
          o.get("lastUpdated").getAsInt(),
          result.get(i).getLastUpdated(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAdminSystemMessages() throws IOException {
    final String inputFile = "AdminSystemMessages.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AdminSystemMessages> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AdminSystemMessages(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals identity ", o.get("identity").getAsString(), result.get(i).getIdentity());
      assertEquals(
          "expect equals severity ",
          o.get("severity").getAsInt(),
          result.get(i).getSeverity(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAdminUser() throws IOException {
    final String inputFile = "AdminUser.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AdminUser> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AdminUser(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals userId ", o.get("userId").getAsInt(), result.get(i).getUserId(), 0.0001);
      assertEquals(
          "expect equals username ", o.get("username").getAsString(), result.get(i).getUsername());
      assertEquals(
          "expect equals firstname ",
          o.get("firstname").getAsString(),
          result.get(i).getFirstname());
      assertEquals(
          "expect equals lastname ", o.get("lastname").getAsString(), result.get(i).getLastname());
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals password ", o.get("password").getAsString(), result.get(i).getPassword());
      assertEquals(
          "expect equals lognum ", o.get("lognum").getAsInt(), result.get(i).getLognum(), 0.0001);
      assertEquals(
          "expect equals reloadAclFlag ",
          o.get("reloadAclFlag").getAsInt(),
          result.get(i).getReloadAclFlag(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals("expect equals extra ", o.get("extra").getAsString(), result.get(i).getExtra());
      assertEquals(
          "expect equals rpToken ", o.get("rpToken").getAsString(), result.get(i).getRpToken());
      assertEquals(
          "expect equals interfaceLocale ",
          o.get("interfaceLocale").getAsString(),
          result.get(i).getInterfaceLocale());
      assertEquals(
          "expect equals failuresNum ",
          o.get("failuresNum").getAsInt(),
          result.get(i).getFailuresNum(),
          0.0001);
      assertEquals(
          "expect equals refreshToken ",
          o.get("refreshToken").getAsString(),
          result.get(i).getRefreshToken());
    }

    result.clear();
  }

  @Test
  public void testParsingAdminUserSession() throws IOException {
    final String inputFile = "AdminUserSession.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AdminUserSession> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AdminUserSession(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals sessionId ",
          o.get("sessionId").getAsString(),
          result.get(i).getSessionId());
      assertEquals(
          "expect equals userId ", o.get("userId").getAsInt(), result.get(i).getUserId(), 0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
    }

    result.clear();
  }

  @Test
  public void testParsingAdminnotificationInbox() throws IOException {
    final String inputFile = "AdminnotificationInbox.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AdminnotificationInbox> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AdminnotificationInbox(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals notificationId ",
          o.get("notificationId").getAsInt(),
          result.get(i).getNotificationId(),
          0.0001);
      assertEquals(
          "expect equals severity ",
          o.get("severity").getAsInt(),
          result.get(i).getSeverity(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals("expect equals url ", o.get("url").getAsString(), result.get(i).getUrl());
      assertEquals(
          "expect equals isRead ", o.get("isRead").getAsInt(), result.get(i).getIsRead(), 0.0001);
      assertEquals(
          "expect equals isRemove ",
          o.get("isRemove").getAsInt(),
          result.get(i).getIsRemove(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAmazonCustomer() throws IOException {
    final String inputFile = "AmazonCustomer.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmazonCustomer> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmazonCustomer(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals amazonId ", o.get("amazonId").getAsString(), result.get(i).getAmazonId());
    }

    result.clear();
  }

  @Test
  public void testParsingAmazonPendingAuthorization() throws IOException {
    final String inputFile = "AmazonPendingAuthorization.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmazonPendingAuthorization> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmazonPendingAuthorization(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals authorizationId ",
          o.get("authorizationId").getAsString(),
          result.get(i).getAuthorizationId());
      assertEquals(
          "expect equals paymentId ",
          o.get("paymentId").getAsInt(),
          result.get(i).getPaymentId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals processed ",
          o.get("processed").getAsInt(),
          result.get(i).getProcessed(),
          0.0001);
      assertEquals(
          "expect equals capture ",
          o.get("capture").getAsInt(),
          result.get(i).getCapture(),
          0.0001);
      assertEquals(
          "expect equals captureId ",
          o.get("captureId").getAsString(),
          result.get(i).getCaptureId());
    }

    result.clear();
  }

  @Test
  public void testParsingAmazonPendingCapture() throws IOException {
    final String inputFile = "AmazonPendingCapture.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmazonPendingCapture> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmazonPendingCapture(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals paymentId ",
          o.get("paymentId").getAsInt(),
          result.get(i).getPaymentId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals captureId ",
          o.get("captureId").getAsString(),
          result.get(i).getCaptureId());
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAmazonPendingRefund() throws IOException {
    final String inputFile = "AmazonPendingRefund.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmazonPendingRefund> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmazonPendingRefund(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals paymentId ",
          o.get("paymentId").getAsInt(),
          result.get(i).getPaymentId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals refundId ", o.get("refundId").getAsString(), result.get(i).getRefundId());
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAmazonQuote() throws IOException {
    final String inputFile = "AmazonQuote.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmazonQuote> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmazonQuote(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals amazonOrderReferenceId ",
          o.get("amazonOrderReferenceId").getAsString(),
          result.get(i).getAmazonOrderReferenceId());
      assertEquals(
          "expect equals sandboxSimulationReference ",
          o.get("sandboxSimulationReference").getAsString(),
          result.get(i).getSandboxSimulationReference());
      assertEquals(
          "expect equals confirmed ",
          o.get("confirmed").getAsInt(),
          result.get(i).getConfirmed(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingAmazonSalesOrder() throws IOException {
    final String inputFile = "AmazonSalesOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AmazonSalesOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AmazonSalesOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals amazonOrderReferenceId ",
          o.get("amazonOrderReferenceId").getAsString(),
          result.get(i).getAmazonOrderReferenceId());
    }

    result.clear();
  }

  @Test
  public void testParsingAuthorizationRole() throws IOException {
    final String inputFile = "AuthorizationRole.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AuthorizationRole> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AuthorizationRole(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals roleId ", o.get("roleId").getAsInt(), result.get(i).getRoleId(), 0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals treeLevel ",
          o.get("treeLevel").getAsInt(),
          result.get(i).getTreeLevel(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals roleType ", o.get("roleType").getAsString(), result.get(i).getRoleType());
      assertEquals(
          "expect equals userId ", o.get("userId").getAsInt(), result.get(i).getUserId(), 0.0001);
      assertEquals(
          "expect equals userType ", o.get("userType").getAsString(), result.get(i).getUserType());
      assertEquals(
          "expect equals roleName ", o.get("roleName").getAsString(), result.get(i).getRoleName());
    }

    result.clear();
  }

  @Test
  public void testParsingAuthorizationRule() throws IOException {
    final String inputFile = "AuthorizationRule.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<AuthorizationRule> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2AuthorizationRule(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals roleId ", o.get("roleId").getAsInt(), result.get(i).getRoleId(), 0.0001);
      assertEquals(
          "expect equals resourceId ",
          o.get("resourceId").getAsString(),
          result.get(i).getResourceId());
      assertEquals(
          "expect equals privileges ",
          o.get("privileges").getAsString(),
          result.get(i).getPrivileges());
      assertEquals(
          "expect equals permission ",
          o.get("permission").getAsString(),
          result.get(i).getPermission());
    }

    result.clear();
  }

  @Test
  public void testParsingCache() throws IOException {
    final String inputFile = "Cache.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Cache> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Cache(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsString(), result.get(i).getId());
      assertEquals(
          "expect equals createTime ",
          o.get("createTime").getAsInt(),
          result.get(i).getCreateTime(),
          0.0001);
      assertEquals(
          "expect equals updateTime ",
          o.get("updateTime").getAsInt(),
          result.get(i).getUpdateTime(),
          0.0001);
      assertEquals(
          "expect equals expireTime ",
          o.get("expireTime").getAsInt(),
          result.get(i).getExpireTime(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCacheTag() throws IOException {
    final String inputFile = "CacheTag.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CacheTag> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CacheTag(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals cacheId ", o.get("cacheId").getAsString(), result.get(i).getCacheId());
      assertEquals("expect equals tag ", o.get("tag").getAsString(), result.get(i).getTag());
    }

    result.clear();
  }

  @Test
  public void testParsingCaptchaLog() throws IOException {
    final String inputFile = "CaptchaLog.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CaptchaLog> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CaptchaLog(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
      assertEquals(
          "expect equals count ", o.get("count").getAsInt(), result.get(i).getCount(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryEntity() throws IOException {
    final String inputFile = "CatalogCategoryEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryEntity> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals attributeSetId ",
          o.get("attributeSetId").getAsInt(),
          result.get(i).getAttributeSetId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals("expect equals path ", o.get("path").getAsString(), result.get(i).getPath());
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals level ", o.get("level").getAsInt(), result.get(i).getLevel(), 0.0001);
      assertEquals(
          "expect equals childrenCount ",
          o.get("childrenCount").getAsInt(),
          result.get(i).getChildrenCount(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryEntityDatetime() throws IOException {
    final String inputFile = "CatalogCategoryEntityDatetime.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryEntityDatetime> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryEntityDatetime(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryEntityDecimal() throws IOException {
    final String inputFile = "CatalogCategoryEntityDecimal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryEntityDecimal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryEntityDecimal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryEntityInt() throws IOException {
    final String inputFile = "CatalogCategoryEntityInt.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryEntityInt> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryEntityInt(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryEntityText() throws IOException {
    final String inputFile = "CatalogCategoryEntityText.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryEntityText> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryEntityText(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryEntityVarchar() throws IOException {
    final String inputFile = "CatalogCategoryEntityVarchar.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryEntityVarchar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryEntityVarchar(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryProduct() throws IOException {
    final String inputFile = "CatalogCategoryProduct.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryProduct> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryProduct(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals categoryId ",
          o.get("categoryId").getAsInt(),
          result.get(i).getCategoryId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryProductIndex() throws IOException {
    final String inputFile = "CatalogCategoryProductIndex.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryProductIndex> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryProductIndex(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals categoryId ",
          o.get("categoryId").getAsInt(),
          result.get(i).getCategoryId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals isParent ",
          o.get("isParent").getAsInt(),
          result.get(i).getIsParent(),
          0.0001);
      assertEquals(
          "expect equals visibility ",
          o.get("visibility").getAsInt(),
          result.get(i).getVisibility(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryProductIndexReplica() throws IOException {
    final String inputFile = "CatalogCategoryProductIndexReplica.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryProductIndexReplica> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryProductIndexReplica(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals categoryId ",
          o.get("categoryId").getAsInt(),
          result.get(i).getCategoryId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals isParent ",
          o.get("isParent").getAsInt(),
          result.get(i).getIsParent(),
          0.0001);
      assertEquals(
          "expect equals visibility ",
          o.get("visibility").getAsInt(),
          result.get(i).getVisibility(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryProductIndexStore1() throws IOException {
    final String inputFile = "CatalogCategoryProductIndexStore1.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryProductIndexStore1> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryProductIndexStore1(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals categoryId ",
          o.get("categoryId").getAsInt(),
          result.get(i).getCategoryId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals isParent ",
          o.get("isParent").getAsInt(),
          result.get(i).getIsParent(),
          0.0001);
      assertEquals(
          "expect equals visibility ",
          o.get("visibility").getAsInt(),
          result.get(i).getVisibility(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryProductIndexStore1Replica() throws IOException {
    final String inputFile = "CatalogCategoryProductIndexStore1Replica.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryProductIndexStore1Replica> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryProductIndexStore1Replica(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals categoryId ",
          o.get("categoryId").getAsInt(),
          result.get(i).getCategoryId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals isParent ",
          o.get("isParent").getAsInt(),
          result.get(i).getIsParent(),
          0.0001);
      assertEquals(
          "expect equals visibility ",
          o.get("visibility").getAsInt(),
          result.get(i).getVisibility(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCategoryProductIndexTmp() throws IOException {
    final String inputFile = "CatalogCategoryProductIndexTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCategoryProductIndexTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCategoryProductIndexTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals categoryId ",
          o.get("categoryId").getAsInt(),
          result.get(i).getCategoryId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals isParent ",
          o.get("isParent").getAsInt(),
          result.get(i).getIsParent(),
          0.0001);
      assertEquals(
          "expect equals visibility ",
          o.get("visibility").getAsInt(),
          result.get(i).getVisibility(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogCompareItem() throws IOException {
    final String inputFile = "CatalogCompareItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogCompareItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogCompareItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals catalogCompareItemId ",
          o.get("catalogCompareItemId").getAsInt(),
          result.get(i).getCatalogCompareItemId(),
          0.0001);
      assertEquals(
          "expect equals visitorId ",
          o.get("visitorId").getAsInt(),
          result.get(i).getVisitorId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogEavAttribute() throws IOException {
    final String inputFile = "CatalogEavAttribute.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogEavAttribute> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogEavAttribute(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals frontendInputRenderer ",
          o.get("frontendInputRenderer").getAsString(),
          result.get(i).getFrontendInputRenderer());
      assertEquals(
          "expect equals isGlobal ",
          o.get("isGlobal").getAsInt(),
          result.get(i).getIsGlobal(),
          0.0001);
      assertEquals(
          "expect equals isVisible ",
          o.get("isVisible").getAsInt(),
          result.get(i).getIsVisible(),
          0.0001);
      assertEquals(
          "expect equals isSearchable ",
          o.get("isSearchable").getAsInt(),
          result.get(i).getIsSearchable(),
          0.0001);
      assertEquals(
          "expect equals isFilterable ",
          o.get("isFilterable").getAsInt(),
          result.get(i).getIsFilterable(),
          0.0001);
      assertEquals(
          "expect equals isComparable ",
          o.get("isComparable").getAsInt(),
          result.get(i).getIsComparable(),
          0.0001);
      assertEquals(
          "expect equals isVisibleOnFront ",
          o.get("isVisibleOnFront").getAsInt(),
          result.get(i).getIsVisibleOnFront(),
          0.0001);
      assertEquals(
          "expect equals isHtmlAllowedOnFront ",
          o.get("isHtmlAllowedOnFront").getAsInt(),
          result.get(i).getIsHtmlAllowedOnFront(),
          0.0001);
      assertEquals(
          "expect equals isUsedForPriceRules ",
          o.get("isUsedForPriceRules").getAsInt(),
          result.get(i).getIsUsedForPriceRules(),
          0.0001);
      assertEquals(
          "expect equals isFilterableInSearch ",
          o.get("isFilterableInSearch").getAsInt(),
          result.get(i).getIsFilterableInSearch(),
          0.0001);
      assertEquals(
          "expect equals usedInProductListing ",
          o.get("usedInProductListing").getAsInt(),
          result.get(i).getUsedInProductListing(),
          0.0001);
      assertEquals(
          "expect equals usedForSortBy ",
          o.get("usedForSortBy").getAsInt(),
          result.get(i).getUsedForSortBy(),
          0.0001);
      assertEquals(
          "expect equals applyTo ", o.get("applyTo").getAsString(), result.get(i).getApplyTo());
      assertEquals(
          "expect equals isVisibleInAdvancedSearch ",
          o.get("isVisibleInAdvancedSearch").getAsInt(),
          result.get(i).getIsVisibleInAdvancedSearch(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals isWysiwygEnabled ",
          o.get("isWysiwygEnabled").getAsInt(),
          result.get(i).getIsWysiwygEnabled(),
          0.0001);
      assertEquals(
          "expect equals isUsedForPromoRules ",
          o.get("isUsedForPromoRules").getAsInt(),
          result.get(i).getIsUsedForPromoRules(),
          0.0001);
      assertEquals(
          "expect equals isRequiredInAdminStore ",
          o.get("isRequiredInAdminStore").getAsInt(),
          result.get(i).getIsRequiredInAdminStore(),
          0.0001);
      assertEquals(
          "expect equals isUsedInGrid ",
          o.get("isUsedInGrid").getAsInt(),
          result.get(i).getIsUsedInGrid(),
          0.0001);
      assertEquals(
          "expect equals isVisibleInGrid ",
          o.get("isVisibleInGrid").getAsInt(),
          result.get(i).getIsVisibleInGrid(),
          0.0001);
      assertEquals(
          "expect equals isFilterableInGrid ",
          o.get("isFilterableInGrid").getAsInt(),
          result.get(i).getIsFilterableInGrid(),
          0.0001);
      assertEquals(
          "expect equals searchWeight ",
          o.get("searchWeight").getAsFloat(),
          result.get(i).getSearchWeight(),
          0.001);
      assertEquals(
          "expect equals additionalData ",
          o.get("additionalData").getAsString(),
          result.get(i).getAdditionalData());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductBundleOption() throws IOException {
    final String inputFile = "CatalogProductBundleOption.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductBundleOption> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductBundleOption(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals required ",
          o.get("required").getAsInt(),
          result.get(i).getRequired(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductBundleOptionValue() throws IOException {
    final String inputFile = "CatalogProductBundleOptionValue.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductBundleOptionValue> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductBundleOptionValue(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals parentProductId ",
          o.get("parentProductId").getAsInt(),
          result.get(i).getParentProductId(),
          0.0001);
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductBundlePriceIndex() throws IOException {
    final String inputFile = "CatalogProductBundlePriceIndex.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductBundlePriceIndex> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductBundlePriceIndex(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductBundleSelection() throws IOException {
    final String inputFile = "CatalogProductBundleSelection.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductBundleSelection> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductBundleSelection(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals selectionId ",
          o.get("selectionId").getAsInt(),
          result.get(i).getSelectionId(),
          0.0001);
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals parentProductId ",
          o.get("parentProductId").getAsInt(),
          result.get(i).getParentProductId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals isDefault ",
          o.get("isDefault").getAsInt(),
          result.get(i).getIsDefault(),
          0.0001);
      assertEquals(
          "expect equals selectionPriceType ",
          o.get("selectionPriceType").getAsInt(),
          result.get(i).getSelectionPriceType(),
          0.0001);
      assertEquals(
          "expect equals selectionPriceValue ",
          o.get("selectionPriceValue").getAsBigDecimal(),
          result.get(i).getSelectionPriceValue());
      assertEquals(
          "expect equals selectionQty ",
          o.get("selectionQty").getAsBigDecimal(),
          result.get(i).getSelectionQty());
      assertEquals(
          "expect equals selectionCanChangeQty ",
          o.get("selectionCanChangeQty").getAsInt(),
          result.get(i).getSelectionCanChangeQty(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductBundleSelectionPrice() throws IOException {
    final String inputFile = "CatalogProductBundleSelectionPrice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductBundleSelectionPrice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductBundleSelectionPrice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals parentProductId ",
          o.get("parentProductId").getAsInt(),
          result.get(i).getParentProductId(),
          0.0001);
      assertEquals(
          "expect equals selectionId ",
          o.get("selectionId").getAsInt(),
          result.get(i).getSelectionId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals selectionPriceType ",
          o.get("selectionPriceType").getAsInt(),
          result.get(i).getSelectionPriceType(),
          0.0001);
      assertEquals(
          "expect equals selectionPriceValue ",
          o.get("selectionPriceValue").getAsBigDecimal(),
          result.get(i).getSelectionPriceValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductBundleStockIndex() throws IOException {
    final String inputFile = "CatalogProductBundleStockIndex.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductBundleStockIndex> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductBundleStockIndex(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals(
          "expect equals stockStatus ",
          o.get("stockStatus").getAsInt(),
          result.get(i).getStockStatus(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntity() throws IOException {
    final String inputFile = "CatalogProductEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntity> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals attributeSetId ",
          o.get("attributeSetId").getAsInt(),
          result.get(i).getAttributeSetId(),
          0.0001);
      assertEquals(
          "expect equals typeId ", o.get("typeId").getAsString(), result.get(i).getTypeId());
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals(
          "expect equals hasOptions ",
          o.get("hasOptions").getAsInt(),
          result.get(i).getHasOptions(),
          0.0001);
      assertEquals(
          "expect equals requiredOptions ",
          o.get("requiredOptions").getAsInt(),
          result.get(i).getRequiredOptions(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityDatetime() throws IOException {
    final String inputFile = "CatalogProductEntityDatetime.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityDatetime> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityDatetime(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityDecimal() throws IOException {
    final String inputFile = "CatalogProductEntityDecimal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityDecimal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityDecimal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityGallery() throws IOException {
    final String inputFile = "CatalogProductEntityGallery.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityGallery> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityGallery(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityInt() throws IOException {
    final String inputFile = "CatalogProductEntityInt.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityInt> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityInt(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityMediaGallery() throws IOException {
    final String inputFile = "CatalogProductEntityMediaGallery.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityMediaGallery> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityMediaGallery(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
      assertEquals(
          "expect equals mediaType ",
          o.get("mediaType").getAsString(),
          result.get(i).getMediaType());
      assertEquals(
          "expect equals disabled ",
          o.get("disabled").getAsInt(),
          result.get(i).getDisabled(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityMediaGalleryValue() throws IOException {
    final String inputFile = "CatalogProductEntityMediaGalleryValue.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityMediaGalleryValue> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityMediaGalleryValue(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals recordId ",
          o.get("recordId").getAsInt(),
          result.get(i).getRecordId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals label ", o.get("label").getAsString(), result.get(i).getLabel());
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals disabled ",
          o.get("disabled").getAsInt(),
          result.get(i).getDisabled(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityMediaGalleryValueToEntity() throws IOException {
    final String inputFile = "CatalogProductEntityMediaGalleryValueToEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityMediaGalleryValueToEntity> result = new ArrayList<>();
    arr.forEach(
        o -> result.add(JsonHelper.fromJson2CatalogProductEntityMediaGalleryValueToEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityMediaGalleryValueVideo() throws IOException {
    final String inputFile = "CatalogProductEntityMediaGalleryValueVideo.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityMediaGalleryValueVideo> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityMediaGalleryValueVideo(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals provider ", o.get("provider").getAsString(), result.get(i).getProvider());
      assertEquals("expect equals url ", o.get("url").getAsString(), result.get(i).getUrl());
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals metadata ", o.get("metadata").getAsString(), result.get(i).getMetadata());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityText() throws IOException {
    final String inputFile = "CatalogProductEntityText.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityText> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityText(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityTierPrice() throws IOException {
    final String inputFile = "CatalogProductEntityTierPrice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityTierPrice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityTierPrice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals allGroups ",
          o.get("allGroups").getAsInt(),
          result.get(i).getAllGroups(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
      assertEquals(
          "expect equals percentageValue ",
          o.get("percentageValue").getAsBigDecimal(),
          result.get(i).getPercentageValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductEntityVarchar() throws IOException {
    final String inputFile = "CatalogProductEntityVarchar.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductEntityVarchar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductEntityVarchar(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductFrontendAction() throws IOException {
    final String inputFile = "CatalogProductFrontendAction.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductFrontendAction> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductFrontendAction(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals typeId ", o.get("typeId").getAsString(), result.get(i).getTypeId());
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals visitorId ",
          o.get("visitorId").getAsInt(),
          result.get(i).getVisitorId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexEav() throws IOException {
    final String inputFile = "CatalogProductIndexEav.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexEav> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexEav(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexEavDecimal() throws IOException {
    final String inputFile = "CatalogProductIndexEavDecimal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexEavDecimal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexEavDecimal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexEavDecimalIdx() throws IOException {
    final String inputFile = "CatalogProductIndexEavDecimalIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexEavDecimalIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexEavDecimalIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexEavDecimalReplica() throws IOException {
    final String inputFile = "CatalogProductIndexEavDecimalReplica.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexEavDecimalReplica> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexEavDecimalReplica(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexEavDecimalTmp() throws IOException {
    final String inputFile = "CatalogProductIndexEavDecimalTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexEavDecimalTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexEavDecimalTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexEavIdx() throws IOException {
    final String inputFile = "CatalogProductIndexEavIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexEavIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexEavIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexEavReplica() throws IOException {
    final String inputFile = "CatalogProductIndexEavReplica.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexEavReplica> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexEavReplica(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexEavTmp() throws IOException {
    final String inputFile = "CatalogProductIndexEavTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexEavTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexEavTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals sourceId ",
          o.get("sourceId").getAsInt(),
          result.get(i).getSourceId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPrice() throws IOException {
    final String inputFile = "CatalogProductIndexPrice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPrice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPrice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals taxClassId ",
          o.get("taxClassId").getAsInt(),
          result.get(i).getTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals finalPrice ",
          o.get("finalPrice").getAsBigDecimal(),
          result.get(i).getFinalPrice());
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceBundleIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceBundleIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceBundleIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceBundleIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals taxClassId ",
          o.get("taxClassId").getAsInt(),
          result.get(i).getTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals priceType ",
          o.get("priceType").getAsInt(),
          result.get(i).getPriceType(),
          0.0001);
      assertEquals(
          "expect equals specialPrice ",
          o.get("specialPrice").getAsBigDecimal(),
          result.get(i).getSpecialPrice());
      assertEquals(
          "expect equals tierPercent ",
          o.get("tierPercent").getAsBigDecimal(),
          result.get(i).getTierPercent());
      assertEquals(
          "expect equals origPrice ",
          o.get("origPrice").getAsBigDecimal(),
          result.get(i).getOrigPrice());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
      assertEquals(
          "expect equals baseTier ",
          o.get("baseTier").getAsBigDecimal(),
          result.get(i).getBaseTier());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceBundleOptIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceBundleOptIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceBundleOptIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceBundleOptIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals altPrice ",
          o.get("altPrice").getAsBigDecimal(),
          result.get(i).getAltPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
      assertEquals(
          "expect equals altTierPrice ",
          o.get("altTierPrice").getAsBigDecimal(),
          result.get(i).getAltTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceBundleOptTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceBundleOptTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceBundleOptTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceBundleOptTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals altPrice ",
          o.get("altPrice").getAsBigDecimal(),
          result.get(i).getAltPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
      assertEquals(
          "expect equals altTierPrice ",
          o.get("altTierPrice").getAsBigDecimal(),
          result.get(i).getAltTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceBundleSelIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceBundleSelIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceBundleSelIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceBundleSelIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals selectionId ",
          o.get("selectionId").getAsInt(),
          result.get(i).getSelectionId(),
          0.0001);
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals groupType ",
          o.get("groupType").getAsInt(),
          result.get(i).getGroupType(),
          0.0001);
      assertEquals(
          "expect equals isRequired ",
          o.get("isRequired").getAsInt(),
          result.get(i).getIsRequired(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceBundleSelTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceBundleSelTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceBundleSelTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceBundleSelTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals selectionId ",
          o.get("selectionId").getAsInt(),
          result.get(i).getSelectionId(),
          0.0001);
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals groupType ",
          o.get("groupType").getAsInt(),
          result.get(i).getGroupType(),
          0.0001);
      assertEquals(
          "expect equals isRequired ",
          o.get("isRequired").getAsInt(),
          result.get(i).getIsRequired(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceBundleTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceBundleTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceBundleTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceBundleTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals taxClassId ",
          o.get("taxClassId").getAsInt(),
          result.get(i).getTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals priceType ",
          o.get("priceType").getAsInt(),
          result.get(i).getPriceType(),
          0.0001);
      assertEquals(
          "expect equals specialPrice ",
          o.get("specialPrice").getAsBigDecimal(),
          result.get(i).getSpecialPrice());
      assertEquals(
          "expect equals tierPercent ",
          o.get("tierPercent").getAsBigDecimal(),
          result.get(i).getTierPercent());
      assertEquals(
          "expect equals origPrice ",
          o.get("origPrice").getAsBigDecimal(),
          result.get(i).getOrigPrice());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
      assertEquals(
          "expect equals baseTier ",
          o.get("baseTier").getAsBigDecimal(),
          result.get(i).getBaseTier());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceCfgOptAgrIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceCfgOptAgrIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceCfgOptAgrIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceCfgOptAgrIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals childId ",
          o.get("childId").getAsInt(),
          result.get(i).getChildId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceCfgOptAgrTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceCfgOptAgrTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceCfgOptAgrTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceCfgOptAgrTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals childId ",
          o.get("childId").getAsInt(),
          result.get(i).getChildId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceCfgOptIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceCfgOptIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceCfgOptIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceCfgOptIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceCfgOptTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceCfgOptTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceCfgOptTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceCfgOptTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceDownlodIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceDownlodIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceDownlodIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceDownlodIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceDownlodTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceDownlodTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceDownlodTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceDownlodTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceFinalIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceFinalIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceFinalIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceFinalIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals taxClassId ",
          o.get("taxClassId").getAsInt(),
          result.get(i).getTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals origPrice ",
          o.get("origPrice").getAsBigDecimal(),
          result.get(i).getOrigPrice());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
      assertEquals(
          "expect equals baseTier ",
          o.get("baseTier").getAsBigDecimal(),
          result.get(i).getBaseTier());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceFinalTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceFinalTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceFinalTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceFinalTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals taxClassId ",
          o.get("taxClassId").getAsInt(),
          result.get(i).getTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals origPrice ",
          o.get("origPrice").getAsBigDecimal(),
          result.get(i).getOrigPrice());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
      assertEquals(
          "expect equals baseTier ",
          o.get("baseTier").getAsBigDecimal(),
          result.get(i).getBaseTier());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals taxClassId ",
          o.get("taxClassId").getAsInt(),
          result.get(i).getTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals finalPrice ",
          o.get("finalPrice").getAsBigDecimal(),
          result.get(i).getFinalPrice());
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceOptAgrIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceOptAgrIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceOptAgrIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceOptAgrIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceOptAgrTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceOptAgrTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceOptAgrTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceOptAgrTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceOptIdx() throws IOException {
    final String inputFile = "CatalogProductIndexPriceOptIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceOptIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceOptIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceOptTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceOptTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceOptTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceOptTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceReplica() throws IOException {
    final String inputFile = "CatalogProductIndexPriceReplica.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceReplica> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceReplica(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals taxClassId ",
          o.get("taxClassId").getAsInt(),
          result.get(i).getTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals finalPrice ",
          o.get("finalPrice").getAsBigDecimal(),
          result.get(i).getFinalPrice());
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexPriceTmp() throws IOException {
    final String inputFile = "CatalogProductIndexPriceTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexPriceTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexPriceTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals taxClassId ",
          o.get("taxClassId").getAsInt(),
          result.get(i).getTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals finalPrice ",
          o.get("finalPrice").getAsBigDecimal(),
          result.get(i).getFinalPrice());
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
      assertEquals(
          "expect equals maxPrice ",
          o.get("maxPrice").getAsBigDecimal(),
          result.get(i).getMaxPrice());
      assertEquals(
          "expect equals tierPrice ",
          o.get("tierPrice").getAsBigDecimal(),
          result.get(i).getTierPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexTierPrice() throws IOException {
    final String inputFile = "CatalogProductIndexTierPrice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexTierPrice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexTierPrice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals minPrice ",
          o.get("minPrice").getAsBigDecimal(),
          result.get(i).getMinPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductIndexWebsite() throws IOException {
    final String inputFile = "CatalogProductIndexWebsite.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductIndexWebsite> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductIndexWebsite(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals defaultStoreId ",
          o.get("defaultStoreId").getAsInt(),
          result.get(i).getDefaultStoreId(),
          0.0001);
      assertEquals(
          "expect equals rate ", o.get("rate").getAsFloat(), result.get(i).getRate(), 0.001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductLink() throws IOException {
    final String inputFile = "CatalogProductLink.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductLink> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductLink(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals linkTypeId ",
          o.get("linkTypeId").getAsInt(),
          result.get(i).getLinkTypeId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals linkedProductId ",
          o.get("linkedProductId").getAsInt(),
          result.get(i).getLinkedProductId(),
          0.0001);
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductLinkAttribute() throws IOException {
    final String inputFile = "CatalogProductLinkAttribute.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductLinkAttribute> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductLinkAttribute(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productLinkAttributeId ",
          o.get("productLinkAttributeId").getAsInt(),
          result.get(i).getProductLinkAttributeId(),
          0.0001);
      assertEquals(
          "expect equals linkTypeId ",
          o.get("linkTypeId").getAsInt(),
          result.get(i).getLinkTypeId(),
          0.0001);
      assertEquals(
          "expect equals productLinkAttributeCode ",
          o.get("productLinkAttributeCode").getAsString(),
          result.get(i).getProductLinkAttributeCode());
      assertEquals(
          "expect equals dataType ", o.get("dataType").getAsString(), result.get(i).getDataType());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductLinkAttributeDecimal() throws IOException {
    final String inputFile = "CatalogProductLinkAttributeDecimal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductLinkAttributeDecimal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductLinkAttributeDecimal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productLinkAttributeId ",
          o.get("productLinkAttributeId").getAsInt(),
          result.get(i).getProductLinkAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductLinkAttributeInt() throws IOException {
    final String inputFile = "CatalogProductLinkAttributeInt.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductLinkAttributeInt> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductLinkAttributeInt(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productLinkAttributeId ",
          o.get("productLinkAttributeId").getAsInt(),
          result.get(i).getProductLinkAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductLinkAttributeVarchar() throws IOException {
    final String inputFile = "CatalogProductLinkAttributeVarchar.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductLinkAttributeVarchar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductLinkAttributeVarchar(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productLinkAttributeId ",
          o.get("productLinkAttributeId").getAsInt(),
          result.get(i).getProductLinkAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductLinkType() throws IOException {
    final String inputFile = "CatalogProductLinkType.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductLinkType> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductLinkType(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals linkTypeId ",
          o.get("linkTypeId").getAsInt(),
          result.get(i).getLinkTypeId(),
          0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductOption() throws IOException {
    final String inputFile = "CatalogProductOption.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductOption> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductOption(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals isRequire ",
          o.get("isRequire").getAsInt(),
          result.get(i).getIsRequire(),
          0.0001);
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals(
          "expect equals maxCharacters ",
          o.get("maxCharacters").getAsInt(),
          result.get(i).getMaxCharacters(),
          0.0001);
      assertEquals(
          "expect equals fileExtension ",
          o.get("fileExtension").getAsString(),
          result.get(i).getFileExtension());
      assertEquals(
          "expect equals imageSizex ",
          o.get("imageSizex").getAsInt(),
          result.get(i).getImageSizex(),
          0.0001);
      assertEquals(
          "expect equals imageSizey ",
          o.get("imageSizey").getAsInt(),
          result.get(i).getImageSizey(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductOptionPrice() throws IOException {
    final String inputFile = "CatalogProductOptionPrice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductOptionPrice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductOptionPrice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals optionPriceId ",
          o.get("optionPriceId").getAsInt(),
          result.get(i).getOptionPriceId(),
          0.0001);
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals priceType ",
          o.get("priceType").getAsString(),
          result.get(i).getPriceType());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductOptionTitle() throws IOException {
    final String inputFile = "CatalogProductOptionTitle.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductOptionTitle> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductOptionTitle(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals optionTitleId ",
          o.get("optionTitleId").getAsInt(),
          result.get(i).getOptionTitleId(),
          0.0001);
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductOptionTypePrice() throws IOException {
    final String inputFile = "CatalogProductOptionTypePrice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductOptionTypePrice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductOptionTypePrice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals optionTypePriceId ",
          o.get("optionTypePriceId").getAsInt(),
          result.get(i).getOptionTypePriceId(),
          0.0001);
      assertEquals(
          "expect equals optionTypeId ",
          o.get("optionTypeId").getAsInt(),
          result.get(i).getOptionTypeId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals priceType ",
          o.get("priceType").getAsString(),
          result.get(i).getPriceType());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductOptionTypeTitle() throws IOException {
    final String inputFile = "CatalogProductOptionTypeTitle.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductOptionTypeTitle> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductOptionTypeTitle(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals optionTypeTitleId ",
          o.get("optionTypeTitleId").getAsInt(),
          result.get(i).getOptionTypeTitleId(),
          0.0001);
      assertEquals(
          "expect equals optionTypeId ",
          o.get("optionTypeId").getAsInt(),
          result.get(i).getOptionTypeId(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductOptionTypeValue() throws IOException {
    final String inputFile = "CatalogProductOptionTypeValue.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductOptionTypeValue> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductOptionTypeValue(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionTypeId ",
          o.get("optionTypeId").getAsInt(),
          result.get(i).getOptionTypeId(),
          0.0001);
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductRelation() throws IOException {
    final String inputFile = "CatalogProductRelation.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductRelation> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductRelation(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals childId ",
          o.get("childId").getAsInt(),
          result.get(i).getChildId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductSuperAttribute() throws IOException {
    final String inputFile = "CatalogProductSuperAttribute.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductSuperAttribute> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductSuperAttribute(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productSuperAttributeId ",
          o.get("productSuperAttributeId").getAsInt(),
          result.get(i).getProductSuperAttributeId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductSuperAttributeLabel() throws IOException {
    final String inputFile = "CatalogProductSuperAttributeLabel.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductSuperAttributeLabel> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductSuperAttributeLabel(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals productSuperAttributeId ",
          o.get("productSuperAttributeId").getAsInt(),
          result.get(i).getProductSuperAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals useDefault ",
          o.get("useDefault").getAsInt(),
          result.get(i).getUseDefault(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductSuperLink() throws IOException {
    final String inputFile = "CatalogProductSuperLink.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductSuperLink> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductSuperLink(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogProductWebsite() throws IOException {
    final String inputFile = "CatalogProductWebsite.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogProductWebsite> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogProductWebsite(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogUrlRewriteProductCategory() throws IOException {
    final String inputFile = "CatalogUrlRewriteProductCategory.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogUrlRewriteProductCategory> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogUrlRewriteProductCategory(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals urlRewriteId ",
          o.get("urlRewriteId").getAsInt(),
          result.get(i).getUrlRewriteId(),
          0.0001);
      assertEquals(
          "expect equals categoryId ",
          o.get("categoryId").getAsInt(),
          result.get(i).getCategoryId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCataloginventoryStock() throws IOException {
    final String inputFile = "CataloginventoryStock.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CataloginventoryStock> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CataloginventoryStock(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals stockName ",
          o.get("stockName").getAsString(),
          result.get(i).getStockName());
    }

    result.clear();
  }

  @Test
  public void testParsingCataloginventoryStockItem() throws IOException {
    final String inputFile = "CataloginventoryStockItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CataloginventoryStockItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CataloginventoryStockItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals minQty ", o.get("minQty").getAsBigDecimal(), result.get(i).getMinQty());
      assertEquals(
          "expect equals useConfigMinQty ",
          o.get("useConfigMinQty").getAsInt(),
          result.get(i).getUseConfigMinQty(),
          0.0001);
      assertEquals(
          "expect equals isQtyDecimal ",
          o.get("isQtyDecimal").getAsInt(),
          result.get(i).getIsQtyDecimal(),
          0.0001);
      assertEquals(
          "expect equals backorders ",
          o.get("backorders").getAsInt(),
          result.get(i).getBackorders(),
          0.0001);
      assertEquals(
          "expect equals useConfigBackorders ",
          o.get("useConfigBackorders").getAsInt(),
          result.get(i).getUseConfigBackorders(),
          0.0001);
      assertEquals(
          "expect equals minSaleQty ",
          o.get("minSaleQty").getAsBigDecimal(),
          result.get(i).getMinSaleQty());
      assertEquals(
          "expect equals useConfigMinSaleQty ",
          o.get("useConfigMinSaleQty").getAsInt(),
          result.get(i).getUseConfigMinSaleQty(),
          0.0001);
      assertEquals(
          "expect equals maxSaleQty ",
          o.get("maxSaleQty").getAsBigDecimal(),
          result.get(i).getMaxSaleQty());
      assertEquals(
          "expect equals useConfigMaxSaleQty ",
          o.get("useConfigMaxSaleQty").getAsInt(),
          result.get(i).getUseConfigMaxSaleQty(),
          0.0001);
      assertEquals(
          "expect equals isInStock ",
          o.get("isInStock").getAsInt(),
          result.get(i).getIsInStock(),
          0.0001);
      assertEquals(
          "expect equals notifyStockQty ",
          o.get("notifyStockQty").getAsBigDecimal(),
          result.get(i).getNotifyStockQty());
      assertEquals(
          "expect equals useConfigNotifyStockQty ",
          o.get("useConfigNotifyStockQty").getAsInt(),
          result.get(i).getUseConfigNotifyStockQty(),
          0.0001);
      assertEquals(
          "expect equals manageStock ",
          o.get("manageStock").getAsInt(),
          result.get(i).getManageStock(),
          0.0001);
      assertEquals(
          "expect equals useConfigManageStock ",
          o.get("useConfigManageStock").getAsInt(),
          result.get(i).getUseConfigManageStock(),
          0.0001);
      assertEquals(
          "expect equals stockStatusChangedAuto ",
          o.get("stockStatusChangedAuto").getAsInt(),
          result.get(i).getStockStatusChangedAuto(),
          0.0001);
      assertEquals(
          "expect equals useConfigQtyIncrements ",
          o.get("useConfigQtyIncrements").getAsInt(),
          result.get(i).getUseConfigQtyIncrements(),
          0.0001);
      assertEquals(
          "expect equals qtyIncrements ",
          o.get("qtyIncrements").getAsBigDecimal(),
          result.get(i).getQtyIncrements());
      assertEquals(
          "expect equals useConfigEnableQtyInc ",
          o.get("useConfigEnableQtyInc").getAsInt(),
          result.get(i).getUseConfigEnableQtyInc(),
          0.0001);
      assertEquals(
          "expect equals enableQtyIncrements ",
          o.get("enableQtyIncrements").getAsInt(),
          result.get(i).getEnableQtyIncrements(),
          0.0001);
      assertEquals(
          "expect equals isDecimalDivided ",
          o.get("isDecimalDivided").getAsInt(),
          result.get(i).getIsDecimalDivided(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCataloginventoryStockStatus() throws IOException {
    final String inputFile = "CataloginventoryStockStatus.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CataloginventoryStockStatus> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CataloginventoryStockStatus(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals stockStatus ",
          o.get("stockStatus").getAsInt(),
          result.get(i).getStockStatus(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCataloginventoryStockStatusIdx() throws IOException {
    final String inputFile = "CataloginventoryStockStatusIdx.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CataloginventoryStockStatusIdx> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CataloginventoryStockStatusIdx(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals stockStatus ",
          o.get("stockStatus").getAsInt(),
          result.get(i).getStockStatus(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCataloginventoryStockStatusReplica() throws IOException {
    final String inputFile = "CataloginventoryStockStatusReplica.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CataloginventoryStockStatusReplica> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CataloginventoryStockStatusReplica(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals stockStatus ",
          o.get("stockStatus").getAsInt(),
          result.get(i).getStockStatus(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCataloginventoryStockStatusTmp() throws IOException {
    final String inputFile = "CataloginventoryStockStatusTmp.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CataloginventoryStockStatusTmp> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CataloginventoryStockStatusTmp(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals stockStatus ",
          o.get("stockStatus").getAsInt(),
          result.get(i).getStockStatus(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogrule() throws IOException {
    final String inputFile = "Catalogrule.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Catalogrule> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Catalogrule(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals conditionsSerialized ",
          o.get("conditionsSerialized").getAsString(),
          result.get(i).getConditionsSerialized());
      assertEquals(
          "expect equals actionsSerialized ",
          o.get("actionsSerialized").getAsString(),
          result.get(i).getActionsSerialized());
      assertEquals(
          "expect equals stopRulesProcessing ",
          o.get("stopRulesProcessing").getAsInt(),
          result.get(i).getStopRulesProcessing(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals simpleAction ",
          o.get("simpleAction").getAsString(),
          result.get(i).getSimpleAction());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogruleCustomerGroup() throws IOException {
    final String inputFile = "CatalogruleCustomerGroup.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogruleCustomerGroup> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogruleCustomerGroup(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogruleGroupWebsite() throws IOException {
    final String inputFile = "CatalogruleGroupWebsite.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogruleGroupWebsite> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogruleGroupWebsite(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogruleGroupWebsiteReplica() throws IOException {
    final String inputFile = "CatalogruleGroupWebsiteReplica.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogruleGroupWebsiteReplica> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogruleGroupWebsiteReplica(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogruleProduct() throws IOException {
    final String inputFile = "CatalogruleProduct.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogruleProduct> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogruleProduct(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals ruleProductId ",
          o.get("ruleProductId").getAsInt(),
          result.get(i).getRuleProductId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals toTime ", o.get("toTime").getAsInt(), result.get(i).getToTime(), 0.0001);
      assertEquals(
          "expect equals fromTime ",
          o.get("fromTime").getAsInt(),
          result.get(i).getFromTime(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals actionOperator ",
          o.get("actionOperator").getAsString(),
          result.get(i).getActionOperator());
      assertEquals(
          "expect equals actionAmount ",
          o.get("actionAmount").getAsBigDecimal(),
          result.get(i).getActionAmount());
      assertEquals(
          "expect equals actionStop ",
          o.get("actionStop").getAsInt(),
          result.get(i).getActionStop(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogruleProductPrice() throws IOException {
    final String inputFile = "CatalogruleProductPrice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogruleProductPrice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogruleProductPrice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleProductPriceId ",
          o.get("ruleProductPriceId").getAsInt(),
          result.get(i).getRuleProductPriceId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals rulePrice ",
          o.get("rulePrice").getAsBigDecimal(),
          result.get(i).getRulePrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogruleProductPriceReplica() throws IOException {
    final String inputFile = "CatalogruleProductPriceReplica.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogruleProductPriceReplica> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogruleProductPriceReplica(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleProductPriceId ",
          o.get("ruleProductPriceId").getAsInt(),
          result.get(i).getRuleProductPriceId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals rulePrice ",
          o.get("rulePrice").getAsBigDecimal(),
          result.get(i).getRulePrice());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogruleProductReplica() throws IOException {
    final String inputFile = "CatalogruleProductReplica.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogruleProductReplica> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogruleProductReplica(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals ruleProductId ",
          o.get("ruleProductId").getAsInt(),
          result.get(i).getRuleProductId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals toTime ", o.get("toTime").getAsInt(), result.get(i).getToTime(), 0.0001);
      assertEquals(
          "expect equals fromTime ",
          o.get("fromTime").getAsInt(),
          result.get(i).getFromTime(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals actionOperator ",
          o.get("actionOperator").getAsString(),
          result.get(i).getActionOperator());
      assertEquals(
          "expect equals actionAmount ",
          o.get("actionAmount").getAsBigDecimal(),
          result.get(i).getActionAmount());
      assertEquals(
          "expect equals actionStop ",
          o.get("actionStop").getAsInt(),
          result.get(i).getActionStop(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogruleWebsite() throws IOException {
    final String inputFile = "CatalogruleWebsite.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogruleWebsite> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogruleWebsite(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogsearchFulltextScope1() throws IOException {
    final String inputFile = "CatalogsearchFulltextScope1.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogsearchFulltextScope1> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogsearchFulltextScope1(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals dataIndex ",
          o.get("dataIndex").getAsString(),
          result.get(i).getDataIndex());
    }

    result.clear();
  }

  @Test
  public void testParsingCatalogsearchRecommendations() throws IOException {
    final String inputFile = "CatalogsearchRecommendations.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CatalogsearchRecommendations> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CatalogsearchRecommendations(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals queryId ",
          o.get("queryId").getAsInt(),
          result.get(i).getQueryId(),
          0.0001);
      assertEquals(
          "expect equals relationId ",
          o.get("relationId").getAsInt(),
          result.get(i).getRelationId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCheckoutAgreement() throws IOException {
    final String inputFile = "CheckoutAgreement.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CheckoutAgreement> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CheckoutAgreement(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals agreementId ",
          o.get("agreementId").getAsInt(),
          result.get(i).getAgreementId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals content ", o.get("content").getAsString(), result.get(i).getContent());
      assertEquals(
          "expect equals contentHeight ",
          o.get("contentHeight").getAsString(),
          result.get(i).getContentHeight());
      assertEquals(
          "expect equals checkboxText ",
          o.get("checkboxText").getAsString(),
          result.get(i).getCheckboxText());
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals isHtml ", o.get("isHtml").getAsInt(), result.get(i).getIsHtml(), 0.0001);
      assertEquals(
          "expect equals mode ", o.get("mode").getAsInt(), result.get(i).getMode(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCheckoutAgreementStore() throws IOException {
    final String inputFile = "CheckoutAgreementStore.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CheckoutAgreementStore> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CheckoutAgreementStore(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals agreementId ",
          o.get("agreementId").getAsInt(),
          result.get(i).getAgreementId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCmsBlock() throws IOException {
    final String inputFile = "CmsBlock.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CmsBlock> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CmsBlock(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals blockId ",
          o.get("blockId").getAsInt(),
          result.get(i).getBlockId(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals identifier ",
          o.get("identifier").getAsString(),
          result.get(i).getIdentifier());
      assertEquals(
          "expect equals content ", o.get("content").getAsString(), result.get(i).getContent());
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCmsBlockStore() throws IOException {
    final String inputFile = "CmsBlockStore.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CmsBlockStore> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CmsBlockStore(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals blockId ",
          o.get("blockId").getAsInt(),
          result.get(i).getBlockId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCmsPage() throws IOException {
    final String inputFile = "CmsPage.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CmsPage> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CmsPage(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals pageId ", o.get("pageId").getAsInt(), result.get(i).getPageId(), 0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals pageLayout ",
          o.get("pageLayout").getAsString(),
          result.get(i).getPageLayout());
      assertEquals(
          "expect equals metaKeywords ",
          o.get("metaKeywords").getAsString(),
          result.get(i).getMetaKeywords());
      assertEquals(
          "expect equals metaDescription ",
          o.get("metaDescription").getAsString(),
          result.get(i).getMetaDescription());
      assertEquals(
          "expect equals identifier ",
          o.get("identifier").getAsString(),
          result.get(i).getIdentifier());
      assertEquals(
          "expect equals contentHeading ",
          o.get("contentHeading").getAsString(),
          result.get(i).getContentHeading());
      assertEquals(
          "expect equals content ", o.get("content").getAsString(), result.get(i).getContent());
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals layoutUpdateXml ",
          o.get("layoutUpdateXml").getAsString(),
          result.get(i).getLayoutUpdateXml());
      assertEquals(
          "expect equals customTheme ",
          o.get("customTheme").getAsString(),
          result.get(i).getCustomTheme());
      assertEquals(
          "expect equals customRootTemplate ",
          o.get("customRootTemplate").getAsString(),
          result.get(i).getCustomRootTemplate());
      assertEquals(
          "expect equals customLayoutUpdateXml ",
          o.get("customLayoutUpdateXml").getAsString(),
          result.get(i).getCustomLayoutUpdateXml());
      assertEquals(
          "expect equals metaTitle ",
          o.get("metaTitle").getAsString(),
          result.get(i).getMetaTitle());
    }

    result.clear();
  }

  @Test
  public void testParsingCmsPageStore() throws IOException {
    final String inputFile = "CmsPageStore.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CmsPageStore> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CmsPageStore(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals pageId ", o.get("pageId").getAsInt(), result.get(i).getPageId(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCoreConfigData() throws IOException {
    final String inputFile = "CoreConfigData.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CoreConfigData> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CoreConfigData(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals path ", o.get("path").getAsString(), result.get(i).getPath());
      assertEquals(
          "expect equals configId ",
          o.get("configId").getAsInt(),
          result.get(i).getConfigId(),
          0.0001);
      assertEquals(
          "expect equals scopeId ",
          o.get("scopeId").getAsInt(),
          result.get(i).getScopeId(),
          0.0001);
      assertEquals("expect equals scope ", o.get("scope").getAsString(), result.get(i).getScope());
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCronSchedule() throws IOException {
    final String inputFile = "CronSchedule.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CronSchedule> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CronSchedule(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals scheduleId ",
          o.get("scheduleId").getAsInt(),
          result.get(i).getScheduleId(),
          0.0001);
      assertEquals(
          "expect equals jobCode ", o.get("jobCode").getAsString(), result.get(i).getJobCode());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals messages ", o.get("messages").getAsString(), result.get(i).getMessages());
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerAddressEntity() throws IOException {
    final String inputFile = "CustomerAddressEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerAddressEntity> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerAddressEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals(
          "expect equals company ", o.get("company").getAsString(), result.get(i).getCompany());
      assertEquals(
          "expect equals countryId ",
          o.get("countryId").getAsString(),
          result.get(i).getCountryId());
      assertEquals("expect equals fax ", o.get("fax").getAsString(), result.get(i).getFax());
      assertEquals(
          "expect equals firstname ",
          o.get("firstname").getAsString(),
          result.get(i).getFirstname());
      assertEquals(
          "expect equals lastname ", o.get("lastname").getAsString(), result.get(i).getLastname());
      assertEquals(
          "expect equals middlename ",
          o.get("middlename").getAsString(),
          result.get(i).getMiddlename());
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals(
          "expect equals prefix ", o.get("prefix").getAsString(), result.get(i).getPrefix());
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals(
          "expect equals regionId ",
          o.get("regionId").getAsInt(),
          result.get(i).getRegionId(),
          0.0001);
      assertEquals(
          "expect equals street ", o.get("street").getAsString(), result.get(i).getStreet());
      assertEquals(
          "expect equals suffix ", o.get("suffix").getAsString(), result.get(i).getSuffix());
      assertEquals(
          "expect equals telephone ",
          o.get("telephone").getAsString(),
          result.get(i).getTelephone());
      assertEquals("expect equals vatId ", o.get("vatId").getAsString(), result.get(i).getVatId());
      assertEquals(
          "expect equals vatIsValid ",
          o.get("vatIsValid").getAsInt(),
          result.get(i).getVatIsValid(),
          0.0001);
      assertEquals(
          "expect equals vatRequestDate ",
          o.get("vatRequestDate").getAsString(),
          result.get(i).getVatRequestDate());
      assertEquals(
          "expect equals vatRequestId ",
          o.get("vatRequestId").getAsString(),
          result.get(i).getVatRequestId());
      assertEquals(
          "expect equals vatRequestSuccess ",
          o.get("vatRequestSuccess").getAsInt(),
          result.get(i).getVatRequestSuccess(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerAddressEntityDatetime() throws IOException {
    final String inputFile = "CustomerAddressEntityDatetime.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerAddressEntityDatetime> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerAddressEntityDatetime(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerAddressEntityDecimal() throws IOException {
    final String inputFile = "CustomerAddressEntityDecimal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerAddressEntityDecimal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerAddressEntityDecimal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerAddressEntityInt() throws IOException {
    final String inputFile = "CustomerAddressEntityInt.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerAddressEntityInt> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerAddressEntityInt(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerAddressEntityText() throws IOException {
    final String inputFile = "CustomerAddressEntityText.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerAddressEntityText> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerAddressEntityText(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerAddressEntityVarchar() throws IOException {
    final String inputFile = "CustomerAddressEntityVarchar.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerAddressEntityVarchar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerAddressEntityVarchar(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerEavAttribute() throws IOException {
    final String inputFile = "CustomerEavAttribute.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerEavAttribute> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerEavAttribute(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals isVisible ",
          o.get("isVisible").getAsInt(),
          result.get(i).getIsVisible(),
          0.0001);
      assertEquals(
          "expect equals inputFilter ",
          o.get("inputFilter").getAsString(),
          result.get(i).getInputFilter());
      assertEquals(
          "expect equals multilineCount ",
          o.get("multilineCount").getAsInt(),
          result.get(i).getMultilineCount(),
          0.0001);
      assertEquals(
          "expect equals validateRules ",
          o.get("validateRules").getAsString(),
          result.get(i).getValidateRules());
      assertEquals(
          "expect equals isSystem ",
          o.get("isSystem").getAsInt(),
          result.get(i).getIsSystem(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals dataModel ",
          o.get("dataModel").getAsString(),
          result.get(i).getDataModel());
      assertEquals(
          "expect equals isUsedInGrid ",
          o.get("isUsedInGrid").getAsInt(),
          result.get(i).getIsUsedInGrid(),
          0.0001);
      assertEquals(
          "expect equals isVisibleInGrid ",
          o.get("isVisibleInGrid").getAsInt(),
          result.get(i).getIsVisibleInGrid(),
          0.0001);
      assertEquals(
          "expect equals isFilterableInGrid ",
          o.get("isFilterableInGrid").getAsInt(),
          result.get(i).getIsFilterableInGrid(),
          0.0001);
      assertEquals(
          "expect equals isSearchableInGrid ",
          o.get("isSearchableInGrid").getAsInt(),
          result.get(i).getIsSearchableInGrid(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerEavAttributeWebsite() throws IOException {
    final String inputFile = "CustomerEavAttributeWebsite.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerEavAttributeWebsite> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerEavAttributeWebsite(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals isVisible ",
          o.get("isVisible").getAsInt(),
          result.get(i).getIsVisible(),
          0.0001);
      assertEquals(
          "expect equals isRequired ",
          o.get("isRequired").getAsInt(),
          result.get(i).getIsRequired(),
          0.0001);
      assertEquals(
          "expect equals defaultValue ",
          o.get("defaultValue").getAsString(),
          result.get(i).getDefaultValue());
      assertEquals(
          "expect equals multilineCount ",
          o.get("multilineCount").getAsInt(),
          result.get(i).getMultilineCount(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerEntity() throws IOException {
    final String inputFile = "CustomerEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerEntity> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals groupId ",
          o.get("groupId").getAsInt(),
          result.get(i).getGroupId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals disableAutoGroupChange ",
          o.get("disableAutoGroupChange").getAsInt(),
          result.get(i).getDisableAutoGroupChange(),
          0.0001);
      assertEquals(
          "expect equals createdIn ",
          o.get("createdIn").getAsString(),
          result.get(i).getCreatedIn());
      assertEquals(
          "expect equals prefix ", o.get("prefix").getAsString(), result.get(i).getPrefix());
      assertEquals(
          "expect equals firstname ",
          o.get("firstname").getAsString(),
          result.get(i).getFirstname());
      assertEquals(
          "expect equals middlename ",
          o.get("middlename").getAsString(),
          result.get(i).getMiddlename());
      assertEquals(
          "expect equals lastname ", o.get("lastname").getAsString(), result.get(i).getLastname());
      assertEquals(
          "expect equals suffix ", o.get("suffix").getAsString(), result.get(i).getSuffix());
      assertEquals(
          "expect equals passwordHash ",
          o.get("passwordHash").getAsString(),
          result.get(i).getPasswordHash());
      assertEquals(
          "expect equals rpToken ", o.get("rpToken").getAsString(), result.get(i).getRpToken());
      assertEquals(
          "expect equals defaultBilling ",
          o.get("defaultBilling").getAsInt(),
          result.get(i).getDefaultBilling(),
          0.0001);
      assertEquals(
          "expect equals defaultShipping ",
          o.get("defaultShipping").getAsInt(),
          result.get(i).getDefaultShipping(),
          0.0001);
      assertEquals(
          "expect equals taxvat ", o.get("taxvat").getAsString(), result.get(i).getTaxvat());
      assertEquals(
          "expect equals confirmation ",
          o.get("confirmation").getAsString(),
          result.get(i).getConfirmation());
      assertEquals(
          "expect equals gender ", o.get("gender").getAsInt(), result.get(i).getGender(), 0.0001);
      assertEquals(
          "expect equals failuresNum ",
          o.get("failuresNum").getAsInt(),
          result.get(i).getFailuresNum(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerEntityDatetime() throws IOException {
    final String inputFile = "CustomerEntityDatetime.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerEntityDatetime> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerEntityDatetime(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerEntityDecimal() throws IOException {
    final String inputFile = "CustomerEntityDecimal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerEntityDecimal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerEntityDecimal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerEntityInt() throws IOException {
    final String inputFile = "CustomerEntityInt.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerEntityInt> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerEntityInt(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerEntityText() throws IOException {
    final String inputFile = "CustomerEntityText.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerEntityText> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerEntityText(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerEntityVarchar() throws IOException {
    final String inputFile = "CustomerEntityVarchar.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerEntityVarchar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerEntityVarchar(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerFormAttribute() throws IOException {
    final String inputFile = "CustomerFormAttribute.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerFormAttribute> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerFormAttribute(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals formCode ", o.get("formCode").getAsString(), result.get(i).getFormCode());
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerGridFlat() throws IOException {
    final String inputFile = "CustomerGridFlat.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerGridFlat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerGridFlat(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals groupId ",
          o.get("groupId").getAsInt(),
          result.get(i).getGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals confirmation ",
          o.get("confirmation").getAsString(),
          result.get(i).getConfirmation());
      assertEquals(
          "expect equals createdIn ",
          o.get("createdIn").getAsString(),
          result.get(i).getCreatedIn());
      assertEquals(
          "expect equals gender ", o.get("gender").getAsInt(), result.get(i).getGender(), 0.0001);
      assertEquals(
          "expect equals taxvat ", o.get("taxvat").getAsString(), result.get(i).getTaxvat());
      assertEquals(
          "expect equals shippingFull ",
          o.get("shippingFull").getAsString(),
          result.get(i).getShippingFull());
      assertEquals(
          "expect equals billingFull ",
          o.get("billingFull").getAsString(),
          result.get(i).getBillingFull());
      assertEquals(
          "expect equals billingFirstname ",
          o.get("billingFirstname").getAsString(),
          result.get(i).getBillingFirstname());
      assertEquals(
          "expect equals billingLastname ",
          o.get("billingLastname").getAsString(),
          result.get(i).getBillingLastname());
      assertEquals(
          "expect equals billingTelephone ",
          o.get("billingTelephone").getAsString(),
          result.get(i).getBillingTelephone());
      assertEquals(
          "expect equals billingPostcode ",
          o.get("billingPostcode").getAsString(),
          result.get(i).getBillingPostcode());
      assertEquals(
          "expect equals billingCountryId ",
          o.get("billingCountryId").getAsString(),
          result.get(i).getBillingCountryId());
      assertEquals(
          "expect equals billingRegion ",
          o.get("billingRegion").getAsString(),
          result.get(i).getBillingRegion());
      assertEquals(
          "expect equals billingStreet ",
          o.get("billingStreet").getAsString(),
          result.get(i).getBillingStreet());
      assertEquals(
          "expect equals billingCity ",
          o.get("billingCity").getAsString(),
          result.get(i).getBillingCity());
      assertEquals(
          "expect equals billingFax ",
          o.get("billingFax").getAsString(),
          result.get(i).getBillingFax());
      assertEquals(
          "expect equals billingVatId ",
          o.get("billingVatId").getAsString(),
          result.get(i).getBillingVatId());
      assertEquals(
          "expect equals billingCompany ",
          o.get("billingCompany").getAsString(),
          result.get(i).getBillingCompany());
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerGroup() throws IOException {
    final String inputFile = "CustomerGroup.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerGroup> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerGroup(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupCode ",
          o.get("customerGroupCode").getAsString(),
          result.get(i).getCustomerGroupCode());
      assertEquals(
          "expect equals taxClassId ",
          o.get("taxClassId").getAsInt(),
          result.get(i).getTaxClassId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerLog() throws IOException {
    final String inputFile = "CustomerLog.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerLog> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerLog(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals logId ", o.get("logId").getAsInt(), result.get(i).getLogId(), 0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingCustomerVisitor() throws IOException {
    final String inputFile = "CustomerVisitor.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<CustomerVisitor> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2CustomerVisitor(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals sessionId ",
          o.get("sessionId").getAsString(),
          result.get(i).getSessionId());
    }

    result.clear();
  }

  @Test
  public void testParsingDesignChange() throws IOException {
    final String inputFile = "DesignChange.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DesignChange> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DesignChange(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals designChangeId ",
          o.get("designChangeId").getAsInt(),
          result.get(i).getDesignChangeId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals design ", o.get("design").getAsString(), result.get(i).getDesign());
    }

    result.clear();
  }

  @Test
  public void testParsingDesignConfigGridFlat() throws IOException {
    final String inputFile = "DesignConfigGridFlat.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DesignConfigGridFlat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DesignConfigGridFlat(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals storeWebsiteId ",
          o.get("storeWebsiteId").getAsInt(),
          result.get(i).getStoreWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals storeGroupId ",
          o.get("storeGroupId").getAsInt(),
          result.get(i).getStoreGroupId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals themeThemeId ",
          o.get("themeThemeId").getAsString(),
          result.get(i).getThemeThemeId());
    }

    result.clear();
  }

  @Test
  public void testParsingDirectoryCountry() throws IOException {
    final String inputFile = "DirectoryCountry.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DirectoryCountry> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DirectoryCountry(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals countryId ",
          o.get("countryId").getAsString(),
          result.get(i).getCountryId());
      assertEquals(
          "expect equals iso2Code ", o.get("iso2Code").getAsString(), result.get(i).getIso2Code());
      assertEquals(
          "expect equals iso3Code ", o.get("iso3Code").getAsString(), result.get(i).getIso3Code());
    }

    result.clear();
  }

  @Test
  public void testParsingDirectoryCountryFormat() throws IOException {
    final String inputFile = "DirectoryCountryFormat.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DirectoryCountryFormat> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DirectoryCountryFormat(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals countryFormatId ",
          o.get("countryFormatId").getAsInt(),
          result.get(i).getCountryFormatId(),
          0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals countryId ",
          o.get("countryId").getAsString(),
          result.get(i).getCountryId());
      assertEquals(
          "expect equals format ", o.get("format").getAsString(), result.get(i).getFormat());
    }

    result.clear();
  }

  @Test
  public void testParsingDirectoryCountryRegion() throws IOException {
    final String inputFile = "DirectoryCountryRegion.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DirectoryCountryRegion> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DirectoryCountryRegion(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals regionId ",
          o.get("regionId").getAsInt(),
          result.get(i).getRegionId(),
          0.0001);
      assertEquals(
          "expect equals countryId ",
          o.get("countryId").getAsString(),
          result.get(i).getCountryId());
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals defaultName ",
          o.get("defaultName").getAsString(),
          result.get(i).getDefaultName());
    }

    result.clear();
  }

  @Test
  public void testParsingDirectoryCountryRegionName() throws IOException {
    final String inputFile = "DirectoryCountryRegionName.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DirectoryCountryRegionName> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DirectoryCountryRegionName(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals regionId ",
          o.get("regionId").getAsInt(),
          result.get(i).getRegionId(),
          0.0001);
      assertEquals(
          "expect equals locale ", o.get("locale").getAsString(), result.get(i).getLocale());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
    }

    result.clear();
  }

  @Test
  public void testParsingDirectoryCurrencyRate() throws IOException {
    final String inputFile = "DirectoryCurrencyRate.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DirectoryCurrencyRate> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DirectoryCurrencyRate(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals currencyTo ",
          o.get("currencyTo").getAsString(),
          result.get(i).getCurrencyTo());
      assertEquals(
          "expect equals currencyFrom ",
          o.get("currencyFrom").getAsString(),
          result.get(i).getCurrencyFrom());
      assertEquals("expect equals rate ", o.get("rate").getAsBigDecimal(), result.get(i).getRate());
    }

    result.clear();
  }

  @Test
  public void testParsingDownloadableLink() throws IOException {
    final String inputFile = "DownloadableLink.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DownloadableLink> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DownloadableLink(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals numberOfDownloads ",
          o.get("numberOfDownloads").getAsInt(),
          result.get(i).getNumberOfDownloads(),
          0.0001);
      assertEquals(
          "expect equals isShareable ",
          o.get("isShareable").getAsInt(),
          result.get(i).getIsShareable(),
          0.0001);
      assertEquals(
          "expect equals linkUrl ", o.get("linkUrl").getAsString(), result.get(i).getLinkUrl());
      assertEquals(
          "expect equals linkFile ", o.get("linkFile").getAsString(), result.get(i).getLinkFile());
      assertEquals(
          "expect equals linkType ", o.get("linkType").getAsString(), result.get(i).getLinkType());
      assertEquals(
          "expect equals sampleUrl ",
          o.get("sampleUrl").getAsString(),
          result.get(i).getSampleUrl());
      assertEquals(
          "expect equals sampleFile ",
          o.get("sampleFile").getAsString(),
          result.get(i).getSampleFile());
      assertEquals(
          "expect equals sampleType ",
          o.get("sampleType").getAsString(),
          result.get(i).getSampleType());
    }

    result.clear();
  }

  @Test
  public void testParsingDownloadableLinkPrice() throws IOException {
    final String inputFile = "DownloadableLinkPrice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DownloadableLinkPrice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DownloadableLinkPrice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals priceId ",
          o.get("priceId").getAsInt(),
          result.get(i).getPriceId(),
          0.0001);
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
    }

    result.clear();
  }

  @Test
  public void testParsingDownloadableLinkPurchased() throws IOException {
    final String inputFile = "DownloadableLinkPurchased.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DownloadableLinkPurchased> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DownloadableLinkPurchased(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals purchasedId ",
          o.get("purchasedId").getAsInt(),
          result.get(i).getPurchasedId(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals orderIncrementId ",
          o.get("orderIncrementId").getAsString(),
          result.get(i).getOrderIncrementId());
      assertEquals(
          "expect equals orderItemId ",
          o.get("orderItemId").getAsInt(),
          result.get(i).getOrderItemId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals productName ",
          o.get("productName").getAsString(),
          result.get(i).getProductName());
      assertEquals(
          "expect equals productSku ",
          o.get("productSku").getAsString(),
          result.get(i).getProductSku());
      assertEquals(
          "expect equals linkSectionTitle ",
          o.get("linkSectionTitle").getAsString(),
          result.get(i).getLinkSectionTitle());
    }

    result.clear();
  }

  @Test
  public void testParsingDownloadableLinkPurchasedItem() throws IOException {
    final String inputFile = "DownloadableLinkPurchasedItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DownloadableLinkPurchasedItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DownloadableLinkPurchasedItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals purchasedId ",
          o.get("purchasedId").getAsInt(),
          result.get(i).getPurchasedId(),
          0.0001);
      assertEquals(
          "expect equals orderItemId ",
          o.get("orderItemId").getAsInt(),
          result.get(i).getOrderItemId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals linkHash ", o.get("linkHash").getAsString(), result.get(i).getLinkHash());
      assertEquals(
          "expect equals numberOfDownloadsBought ",
          o.get("numberOfDownloadsBought").getAsInt(),
          result.get(i).getNumberOfDownloadsBought(),
          0.0001);
      assertEquals(
          "expect equals numberOfDownloadsUsed ",
          o.get("numberOfDownloadsUsed").getAsInt(),
          result.get(i).getNumberOfDownloadsUsed(),
          0.0001);
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
      assertEquals(
          "expect equals linkTitle ",
          o.get("linkTitle").getAsString(),
          result.get(i).getLinkTitle());
      assertEquals(
          "expect equals isShareable ",
          o.get("isShareable").getAsInt(),
          result.get(i).getIsShareable(),
          0.0001);
      assertEquals(
          "expect equals linkUrl ", o.get("linkUrl").getAsString(), result.get(i).getLinkUrl());
      assertEquals(
          "expect equals linkFile ", o.get("linkFile").getAsString(), result.get(i).getLinkFile());
      assertEquals(
          "expect equals linkType ", o.get("linkType").getAsString(), result.get(i).getLinkType());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
    }

    result.clear();
  }

  @Test
  public void testParsingDownloadableLinkTitle() throws IOException {
    final String inputFile = "DownloadableLinkTitle.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DownloadableLinkTitle> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DownloadableLinkTitle(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals titleId ",
          o.get("titleId").getAsInt(),
          result.get(i).getTitleId(),
          0.0001);
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
    }

    result.clear();
  }

  @Test
  public void testParsingDownloadableSample() throws IOException {
    final String inputFile = "DownloadableSample.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DownloadableSample> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DownloadableSample(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sampleId ",
          o.get("sampleId").getAsInt(),
          result.get(i).getSampleId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals sampleUrl ",
          o.get("sampleUrl").getAsString(),
          result.get(i).getSampleUrl());
      assertEquals(
          "expect equals sampleFile ",
          o.get("sampleFile").getAsString(),
          result.get(i).getSampleFile());
      assertEquals(
          "expect equals sampleType ",
          o.get("sampleType").getAsString(),
          result.get(i).getSampleType());
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingDownloadableSampleTitle() throws IOException {
    final String inputFile = "DownloadableSampleTitle.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<DownloadableSampleTitle> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2DownloadableSampleTitle(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals sampleId ",
          o.get("sampleId").getAsInt(),
          result.get(i).getSampleId(),
          0.0001);
      assertEquals(
          "expect equals titleId ",
          o.get("titleId").getAsInt(),
          result.get(i).getTitleId(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
    }

    result.clear();
  }

  @Test
  public void testParsingEavAttribute() throws IOException {
    final String inputFile = "EavAttribute.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavAttribute> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavAttribute(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals(
          "expect equals attributeCode ",
          o.get("attributeCode").getAsString(),
          result.get(i).getAttributeCode());
      assertEquals(
          "expect equals attributeModel ",
          o.get("attributeModel").getAsString(),
          result.get(i).getAttributeModel());
      assertEquals(
          "expect equals backendModel ",
          o.get("backendModel").getAsString(),
          result.get(i).getBackendModel());
      assertEquals(
          "expect equals backendType ",
          o.get("backendType").getAsString(),
          result.get(i).getBackendType());
      assertEquals(
          "expect equals backendTable ",
          o.get("backendTable").getAsString(),
          result.get(i).getBackendTable());
      assertEquals(
          "expect equals frontendModel ",
          o.get("frontendModel").getAsString(),
          result.get(i).getFrontendModel());
      assertEquals(
          "expect equals frontendInput ",
          o.get("frontendInput").getAsString(),
          result.get(i).getFrontendInput());
      assertEquals(
          "expect equals frontendLabel ",
          o.get("frontendLabel").getAsString(),
          result.get(i).getFrontendLabel());
      assertEquals(
          "expect equals frontendClass ",
          o.get("frontendClass").getAsString(),
          result.get(i).getFrontendClass());
      assertEquals(
          "expect equals sourceModel ",
          o.get("sourceModel").getAsString(),
          result.get(i).getSourceModel());
      assertEquals(
          "expect equals isRequired ",
          o.get("isRequired").getAsInt(),
          result.get(i).getIsRequired(),
          0.0001);
      assertEquals(
          "expect equals isUserDefined ",
          o.get("isUserDefined").getAsInt(),
          result.get(i).getIsUserDefined(),
          0.0001);
      assertEquals(
          "expect equals defaultValue ",
          o.get("defaultValue").getAsString(),
          result.get(i).getDefaultValue());
      assertEquals(
          "expect equals isUnique ",
          o.get("isUnique").getAsInt(),
          result.get(i).getIsUnique(),
          0.0001);
      assertEquals("expect equals note ", o.get("note").getAsString(), result.get(i).getNote());
    }

    result.clear();
  }

  @Test
  public void testParsingEavAttributeGroup() throws IOException {
    final String inputFile = "EavAttributeGroup.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavAttributeGroup> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavAttributeGroup(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeGroupId ",
          o.get("attributeGroupId").getAsInt(),
          result.get(i).getAttributeGroupId(),
          0.0001);
      assertEquals(
          "expect equals attributeGroupCode ",
          o.get("attributeGroupCode").getAsString(),
          result.get(i).getAttributeGroupCode());
      assertEquals(
          "expect equals attributeSetId ",
          o.get("attributeSetId").getAsInt(),
          result.get(i).getAttributeSetId(),
          0.0001);
      assertEquals(
          "expect equals attributeGroupName ",
          o.get("attributeGroupName").getAsString(),
          result.get(i).getAttributeGroupName());
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsInt(),
          result.get(i).getDefaultId(),
          0.0001);
      assertEquals(
          "expect equals tabGroupCode ",
          o.get("tabGroupCode").getAsString(),
          result.get(i).getTabGroupCode());
    }

    result.clear();
  }

  @Test
  public void testParsingEavAttributeLabel() throws IOException {
    final String inputFile = "EavAttributeLabel.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavAttributeLabel> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavAttributeLabel(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeLabelId ",
          o.get("attributeLabelId").getAsInt(),
          result.get(i).getAttributeLabelId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingEavAttributeOption() throws IOException {
    final String inputFile = "EavAttributeOption.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavAttributeOption> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavAttributeOption(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEavAttributeOptionSwatch() throws IOException {
    final String inputFile = "EavAttributeOptionSwatch.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavAttributeOptionSwatch> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavAttributeOptionSwatch(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals swatchId ",
          o.get("swatchId").getAsInt(),
          result.get(i).getSwatchId(),
          0.0001);
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals type ", o.get("type").getAsInt(), result.get(i).getType(), 0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingEavAttributeOptionValue() throws IOException {
    final String inputFile = "EavAttributeOptionValue.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavAttributeOptionValue> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavAttributeOptionValue(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingEavAttributeSet() throws IOException {
    final String inputFile = "EavAttributeSet.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavAttributeSet> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavAttributeSet(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeSetName ",
          o.get("attributeSetName").getAsString(),
          result.get(i).getAttributeSetName());
      assertEquals(
          "expect equals attributeSetId ",
          o.get("attributeSetId").getAsInt(),
          result.get(i).getAttributeSetId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEavEntity() throws IOException {
    final String inputFile = "EavEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavEntity> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals(
          "expect equals attributeSetId ",
          o.get("attributeSetId").getAsInt(),
          result.get(i).getAttributeSetId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEavEntityAttribute() throws IOException {
    final String inputFile = "EavEntityAttribute.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavEntityAttribute> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavEntityAttribute(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals attributeGroupId ",
          o.get("attributeGroupId").getAsInt(),
          result.get(i).getAttributeGroupId(),
          0.0001);
      assertEquals(
          "expect equals attributeSetId ",
          o.get("attributeSetId").getAsInt(),
          result.get(i).getAttributeSetId(),
          0.0001);
      assertEquals(
          "expect equals entityAttributeId ",
          o.get("entityAttributeId").getAsInt(),
          result.get(i).getEntityAttributeId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEavEntityDatetime() throws IOException {
    final String inputFile = "EavEntityDatetime.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavEntityDatetime> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavEntityDatetime(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEavEntityDecimal() throws IOException {
    final String inputFile = "EavEntityDecimal.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavEntityDecimal> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavEntityDecimal(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingEavEntityInt() throws IOException {
    final String inputFile = "EavEntityInt.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavEntityInt> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavEntityInt(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEavEntityStore() throws IOException {
    final String inputFile = "EavEntityStore.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavEntityStore> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavEntityStore(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityStoreId ",
          o.get("entityStoreId").getAsInt(),
          result.get(i).getEntityStoreId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals incrementPrefix ",
          o.get("incrementPrefix").getAsString(),
          result.get(i).getIncrementPrefix());
      assertEquals(
          "expect equals incrementLastId ",
          o.get("incrementLastId").getAsString(),
          result.get(i).getIncrementLastId());
    }

    result.clear();
  }

  @Test
  public void testParsingEavEntityText() throws IOException {
    final String inputFile = "EavEntityText.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavEntityText> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavEntityText(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingEavEntityType() throws IOException {
    final String inputFile = "EavEntityType.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavEntityType> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavEntityType(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeCode ",
          o.get("entityTypeCode").getAsString(),
          result.get(i).getEntityTypeCode());
      assertEquals(
          "expect equals entityModel ",
          o.get("entityModel").getAsString(),
          result.get(i).getEntityModel());
      assertEquals(
          "expect equals attributeModel ",
          o.get("attributeModel").getAsString(),
          result.get(i).getAttributeModel());
      assertEquals(
          "expect equals entityTable ",
          o.get("entityTable").getAsString(),
          result.get(i).getEntityTable());
      assertEquals(
          "expect equals valueTablePrefix ",
          o.get("valueTablePrefix").getAsString(),
          result.get(i).getValueTablePrefix());
      assertEquals(
          "expect equals entityIdField ",
          o.get("entityIdField").getAsString(),
          result.get(i).getEntityIdField());
      assertEquals(
          "expect equals isDataSharing ",
          o.get("isDataSharing").getAsInt(),
          result.get(i).getIsDataSharing(),
          0.0001);
      assertEquals(
          "expect equals dataSharingKey ",
          o.get("dataSharingKey").getAsString(),
          result.get(i).getDataSharingKey());
      assertEquals(
          "expect equals defaultAttributeSetId ",
          o.get("defaultAttributeSetId").getAsInt(),
          result.get(i).getDefaultAttributeSetId(),
          0.0001);
      assertEquals(
          "expect equals incrementModel ",
          o.get("incrementModel").getAsString(),
          result.get(i).getIncrementModel());
      assertEquals(
          "expect equals incrementPerStore ",
          o.get("incrementPerStore").getAsInt(),
          result.get(i).getIncrementPerStore(),
          0.0001);
      assertEquals(
          "expect equals incrementPadLength ",
          o.get("incrementPadLength").getAsInt(),
          result.get(i).getIncrementPadLength(),
          0.0001);
      assertEquals(
          "expect equals incrementPadChar ",
          o.get("incrementPadChar").getAsString(),
          result.get(i).getIncrementPadChar());
      assertEquals(
          "expect equals additionalAttributeTable ",
          o.get("additionalAttributeTable").getAsString(),
          result.get(i).getAdditionalAttributeTable());
      assertEquals(
          "expect equals entityAttributeCollection ",
          o.get("entityAttributeCollection").getAsString(),
          result.get(i).getEntityAttributeCollection());
    }

    result.clear();
  }

  @Test
  public void testParsingEavEntityVarchar() throws IOException {
    final String inputFile = "EavEntityVarchar.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavEntityVarchar> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavEntityVarchar(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingEavFormElement() throws IOException {
    final String inputFile = "EavFormElement.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavFormElement> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavFormElement(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals typeId ", o.get("typeId").getAsInt(), result.get(i).getTypeId(), 0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals elementId ",
          o.get("elementId").getAsInt(),
          result.get(i).getElementId(),
          0.0001);
      assertEquals(
          "expect equals fieldsetId ",
          o.get("fieldsetId").getAsInt(),
          result.get(i).getFieldsetId(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEavFormFieldset() throws IOException {
    final String inputFile = "EavFormFieldset.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavFormFieldset> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavFormFieldset(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals typeId ", o.get("typeId").getAsInt(), result.get(i).getTypeId(), 0.0001);
      assertEquals(
          "expect equals fieldsetId ",
          o.get("fieldsetId").getAsInt(),
          result.get(i).getFieldsetId(),
          0.0001);
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEavFormFieldsetLabel() throws IOException {
    final String inputFile = "EavFormFieldsetLabel.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavFormFieldsetLabel> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavFormFieldsetLabel(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals fieldsetId ",
          o.get("fieldsetId").getAsInt(),
          result.get(i).getFieldsetId(),
          0.0001);
      assertEquals("expect equals label ", o.get("label").getAsString(), result.get(i).getLabel());
    }

    result.clear();
  }

  @Test
  public void testParsingEavFormType() throws IOException {
    final String inputFile = "EavFormType.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavFormType> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavFormType(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals typeId ", o.get("typeId").getAsInt(), result.get(i).getTypeId(), 0.0001);
      assertEquals("expect equals theme ", o.get("theme").getAsString(), result.get(i).getTheme());
      assertEquals("expect equals label ", o.get("label").getAsString(), result.get(i).getLabel());
      assertEquals(
          "expect equals isSystem ",
          o.get("isSystem").getAsInt(),
          result.get(i).getIsSystem(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEavFormTypeEntity() throws IOException {
    final String inputFile = "EavFormTypeEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EavFormTypeEntity> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EavFormTypeEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals typeId ", o.get("typeId").getAsInt(), result.get(i).getTypeId(), 0.0001);
      assertEquals(
          "expect equals entityTypeId ",
          o.get("entityTypeId").getAsInt(),
          result.get(i).getEntityTypeId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEmailAbandonedCart() throws IOException {
    final String inputFile = "EmailAbandonedCart.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailAbandonedCart> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailAbandonedCart(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals abandonedCartNumber ",
          o.get("abandonedCartNumber").getAsInt(),
          result.get(i).getAbandonedCartNumber(),
          0.0001);
      assertEquals(
          "expect equals itemsCount ",
          o.get("itemsCount").getAsInt(),
          result.get(i).getItemsCount(),
          0.0001);
      assertEquals(
          "expect equals itemsIds ", o.get("itemsIds").getAsString(), result.get(i).getItemsIds());
    }

    result.clear();
  }

  @Test
  public void testParsingEmailAutomation() throws IOException {
    final String inputFile = "EmailAutomation.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailAutomation> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailAutomation(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals automationType ",
          o.get("automationType").getAsString(),
          result.get(i).getAutomationType());
      assertEquals(
          "expect equals storeName ",
          o.get("storeName").getAsString(),
          result.get(i).getStoreName());
      assertEquals(
          "expect equals enrolmentStatus ",
          o.get("enrolmentStatus").getAsString(),
          result.get(i).getEnrolmentStatus());
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals typeId ", o.get("typeId").getAsString(), result.get(i).getTypeId());
      assertEquals(
          "expect equals programId ",
          o.get("programId").getAsString(),
          result.get(i).getProgramId());
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals message ", o.get("message").getAsString(), result.get(i).getMessage());
    }

    result.clear();
  }

  @Test
  public void testParsingEmailCampaign() throws IOException {
    final String inputFile = "EmailCampaign.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailCampaign> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailCampaign(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals campaignId ",
          o.get("campaignId").getAsInt(),
          result.get(i).getCampaignId(),
          0.0001);
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals orderIncrementId ",
          o.get("orderIncrementId").getAsString(),
          result.get(i).getOrderIncrementId());
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals message ", o.get("message").getAsString(), result.get(i).getMessage());
      assertEquals(
          "expect equals checkoutMethod ",
          o.get("checkoutMethod").getAsString(),
          result.get(i).getCheckoutMethod());
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals eventName ",
          o.get("eventName").getAsString(),
          result.get(i).getEventName());
      assertEquals(
          "expect equals sendId ", o.get("sendId").getAsString(), result.get(i).getSendId());
      assertEquals(
          "expect equals sendStatus ",
          o.get("sendStatus").getAsInt(),
          result.get(i).getSendStatus(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEmailCatalog() throws IOException {
    final String inputFile = "EmailCatalog.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailCatalog> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailCatalog(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals imported ",
          o.get("imported").getAsInt(),
          result.get(i).getImported(),
          0.0001);
      assertEquals(
          "expect equals modified ",
          o.get("modified").getAsInt(),
          result.get(i).getModified(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEmailContact() throws IOException {
    final String inputFile = "EmailContact.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailContact> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailContact(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals emailContactId ",
          o.get("emailContactId").getAsInt(),
          result.get(i).getEmailContactId(),
          0.0001);
      assertEquals(
          "expect equals isGuest ",
          o.get("isGuest").getAsInt(),
          result.get(i).getIsGuest(),
          0.0001);
      assertEquals(
          "expect equals contactId ",
          o.get("contactId").getAsString(),
          result.get(i).getContactId());
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals isSubscriber ",
          o.get("isSubscriber").getAsInt(),
          result.get(i).getIsSubscriber(),
          0.0001);
      assertEquals(
          "expect equals subscriberStatus ",
          o.get("subscriberStatus").getAsInt(),
          result.get(i).getSubscriberStatus(),
          0.0001);
      assertEquals(
          "expect equals emailImported ",
          o.get("emailImported").getAsInt(),
          result.get(i).getEmailImported(),
          0.0001);
      assertEquals(
          "expect equals subscriberImported ",
          o.get("subscriberImported").getAsInt(),
          result.get(i).getSubscriberImported(),
          0.0001);
      assertEquals(
          "expect equals suppressed ",
          o.get("suppressed").getAsInt(),
          result.get(i).getSuppressed(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEmailContactConsent() throws IOException {
    final String inputFile = "EmailContactConsent.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailContactConsent> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailContactConsent(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals emailContactId ",
          o.get("emailContactId").getAsInt(),
          result.get(i).getEmailContactId(),
          0.0001);
      assertEquals(
          "expect equals consentUrl ",
          o.get("consentUrl").getAsString(),
          result.get(i).getConsentUrl());
      assertEquals(
          "expect equals consentIp ",
          o.get("consentIp").getAsString(),
          result.get(i).getConsentIp());
      assertEquals(
          "expect equals consentUserAgent ",
          o.get("consentUserAgent").getAsString(),
          result.get(i).getConsentUserAgent());
    }

    result.clear();
  }

  @Test
  public void testParsingEmailFailedAuth() throws IOException {
    final String inputFile = "EmailFailedAuth.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailFailedAuth> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailFailedAuth(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals failuresNum ",
          o.get("failuresNum").getAsInt(),
          result.get(i).getFailuresNum(),
          0.0001);
      assertEquals("expect equals url ", o.get("url").getAsString(), result.get(i).getUrl());
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEmailImporter() throws IOException {
    final String inputFile = "EmailImporter.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailImporter> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailImporter(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals importType ",
          o.get("importType").getAsString(),
          result.get(i).getImportType());
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals importStatus ",
          o.get("importStatus").getAsInt(),
          result.get(i).getImportStatus(),
          0.0001);
      assertEquals(
          "expect equals importId ", o.get("importId").getAsString(), result.get(i).getImportId());
      assertEquals(
          "expect equals importMode ",
          o.get("importMode").getAsString(),
          result.get(i).getImportMode());
      assertEquals(
          "expect equals importFile ",
          o.get("importFile").getAsString(),
          result.get(i).getImportFile());
      assertEquals(
          "expect equals message ", o.get("message").getAsString(), result.get(i).getMessage());
    }

    result.clear();
  }

  @Test
  public void testParsingEmailOrder() throws IOException {
    final String inputFile = "EmailOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals emailOrderId ",
          o.get("emailOrderId").getAsInt(),
          result.get(i).getEmailOrderId(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals emailImported ",
          o.get("emailImported").getAsInt(),
          result.get(i).getEmailImported(),
          0.0001);
      assertEquals(
          "expect equals modified ",
          o.get("modified").getAsInt(),
          result.get(i).getModified(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEmailReview() throws IOException {
    final String inputFile = "EmailReview.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailReview> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailReview(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals reviewId ",
          o.get("reviewId").getAsInt(),
          result.get(i).getReviewId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals reviewImported ",
          o.get("reviewImported").getAsInt(),
          result.get(i).getReviewImported(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEmailRules() throws IOException {
    final String inputFile = "EmailRules.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailRules> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailRules(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals websiteIds ",
          o.get("websiteIds").getAsString(),
          result.get(i).getWebsiteIds());
      assertEquals(
          "expect equals type ", o.get("type").getAsInt(), result.get(i).getType(), 0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals(
          "expect equals combination ",
          o.get("combination").getAsInt(),
          result.get(i).getCombination(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingEmailTemplate() throws IOException {
    final String inputFile = "EmailTemplate.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailTemplate> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailTemplate(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals templateId ",
          o.get("templateId").getAsInt(),
          result.get(i).getTemplateId(),
          0.0001);
      assertEquals(
          "expect equals templateCode ",
          o.get("templateCode").getAsString(),
          result.get(i).getTemplateCode());
      assertEquals(
          "expect equals templateText ",
          o.get("templateText").getAsString(),
          result.get(i).getTemplateText());
      assertEquals(
          "expect equals templateStyles ",
          o.get("templateStyles").getAsString(),
          result.get(i).getTemplateStyles());
      assertEquals(
          "expect equals templateType ",
          o.get("templateType").getAsInt(),
          result.get(i).getTemplateType(),
          0.0001);
      assertEquals(
          "expect equals templateSubject ",
          o.get("templateSubject").getAsString(),
          result.get(i).getTemplateSubject());
      assertEquals(
          "expect equals templateSenderName ",
          o.get("templateSenderName").getAsString(),
          result.get(i).getTemplateSenderName());
      assertEquals(
          "expect equals templateSenderEmail ",
          o.get("templateSenderEmail").getAsString(),
          result.get(i).getTemplateSenderEmail());
      assertEquals(
          "expect equals origTemplateCode ",
          o.get("origTemplateCode").getAsString(),
          result.get(i).getOrigTemplateCode());
      assertEquals(
          "expect equals origTemplateVariables ",
          o.get("origTemplateVariables").getAsString(),
          result.get(i).getOrigTemplateVariables());
    }

    result.clear();
  }

  @Test
  public void testParsingEmailWishlist() throws IOException {
    final String inputFile = "EmailWishlist.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<EmailWishlist> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2EmailWishlist(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals wishlistId ",
          o.get("wishlistId").getAsInt(),
          result.get(i).getWishlistId(),
          0.0001);
      assertEquals(
          "expect equals itemCount ",
          o.get("itemCount").getAsInt(),
          result.get(i).getItemCount(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals wishlistImported ",
          o.get("wishlistImported").getAsInt(),
          result.get(i).getWishlistImported(),
          0.0001);
      assertEquals(
          "expect equals wishlistModified ",
          o.get("wishlistModified").getAsInt(),
          result.get(i).getWishlistModified(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingFlag() throws IOException {
    final String inputFile = "Flag.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Flag> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Flag(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals flagId ", o.get("flagId").getAsInt(), result.get(i).getFlagId(), 0.0001);
      assertEquals(
          "expect equals flagCode ", o.get("flagCode").getAsString(), result.get(i).getFlagCode());
      assertEquals(
          "expect equals state ", o.get("state").getAsInt(), result.get(i).getState(), 0.0001);
      assertEquals(
          "expect equals flagData ", o.get("flagData").getAsString(), result.get(i).getFlagData());
    }

    result.clear();
  }

  @Test
  public void testParsingGiftMessage() throws IOException {
    final String inputFile = "GiftMessage.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<GiftMessage> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2GiftMessage(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals giftMessageId ",
          o.get("giftMessageId").getAsInt(),
          result.get(i).getGiftMessageId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals sender ", o.get("sender").getAsString(), result.get(i).getSender());
      assertEquals(
          "expect equals recipient ",
          o.get("recipient").getAsString(),
          result.get(i).getRecipient());
      assertEquals(
          "expect equals message ", o.get("message").getAsString(), result.get(i).getMessage());
    }

    result.clear();
  }

  @Test
  public void testParsingGoogleoptimizerCode() throws IOException {
    final String inputFile = "GoogleoptimizerCode.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<GoogleoptimizerCode> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2GoogleoptimizerCode(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals entityType ",
          o.get("entityType").getAsString(),
          result.get(i).getEntityType());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals codeId ", o.get("codeId").getAsInt(), result.get(i).getCodeId(), 0.0001);
      assertEquals(
          "expect equals experimentScript ",
          o.get("experimentScript").getAsString(),
          result.get(i).getExperimentScript());
    }

    result.clear();
  }

  @Test
  public void testParsingImportHistory() throws IOException {
    final String inputFile = "ImportHistory.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ImportHistory> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ImportHistory(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals historyId ",
          o.get("historyId").getAsInt(),
          result.get(i).getHistoryId(),
          0.0001);
      assertEquals(
          "expect equals userId ", o.get("userId").getAsInt(), result.get(i).getUserId(), 0.0001);
      assertEquals(
          "expect equals importedFile ",
          o.get("importedFile").getAsString(),
          result.get(i).getImportedFile());
      assertEquals(
          "expect equals executionTime ",
          o.get("executionTime").getAsString(),
          result.get(i).getExecutionTime());
      assertEquals(
          "expect equals summary ", o.get("summary").getAsString(), result.get(i).getSummary());
      assertEquals(
          "expect equals errorFile ",
          o.get("errorFile").getAsString(),
          result.get(i).getErrorFile());
    }

    result.clear();
  }

  @Test
  public void testParsingImportexportImportdata() throws IOException {
    final String inputFile = "ImportexportImportdata.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ImportexportImportdata> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ImportexportImportdata(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals entity ", o.get("entity").getAsString(), result.get(i).getEntity());
      assertEquals(
          "expect equals behavior ", o.get("behavior").getAsString(), result.get(i).getBehavior());
      assertEquals("expect equals data ", o.get("data").getAsString(), result.get(i).getData());
    }

    result.clear();
  }

  @Test
  public void testParsingIndexerState() throws IOException {
    final String inputFile = "IndexerState.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<IndexerState> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2IndexerState(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals stateId ",
          o.get("stateId").getAsInt(),
          result.get(i).getStateId(),
          0.0001);
      assertEquals(
          "expect equals indexerId ",
          o.get("indexerId").getAsString(),
          result.get(i).getIndexerId());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals hashConfig ",
          o.get("hashConfig").getAsString(),
          result.get(i).getHashConfig());
    }

    result.clear();
  }

  @Test
  public void testParsingIntegration() throws IOException {
    final String inputFile = "Integration.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Integration> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Integration(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals consumerId ",
          o.get("consumerId").getAsInt(),
          result.get(i).getConsumerId(),
          0.0001);
      assertEquals(
          "expect equals integrationId ",
          o.get("integrationId").getAsInt(),
          result.get(i).getIntegrationId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals endpoint ", o.get("endpoint").getAsString(), result.get(i).getEndpoint());
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals(
          "expect equals setupType ",
          o.get("setupType").getAsInt(),
          result.get(i).getSetupType(),
          0.0001);
      assertEquals(
          "expect equals identityLinkUrl ",
          o.get("identityLinkUrl").getAsString(),
          result.get(i).getIdentityLinkUrl());
    }

    result.clear();
  }

  @Test
  public void testParsingInventoryGeoname() throws IOException {
    final String inputFile = "InventoryGeoname.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventoryGeoname> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventoryGeoname(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals countryCode ",
          o.get("countryCode").getAsString(),
          result.get(i).getCountryCode());
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals(
          "expect equals province ", o.get("province").getAsString(), result.get(i).getProvince());
      assertEquals(
          "expect equals latitude ",
          o.get("latitude").getAsDouble(),
          result.get(i).getLatitude(),
          0.001);
      assertEquals(
          "expect equals longitude ",
          o.get("longitude").getAsDouble(),
          result.get(i).getLongitude(),
          0.001);
    }

    result.clear();
  }

  @Test
  public void testParsingInventoryLowStockNotificationConfiguration() throws IOException {
    final String inputFile = "InventoryLowStockNotificationConfiguration.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventoryLowStockNotificationConfiguration> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventoryLowStockNotificationConfiguration(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals(
          "expect equals sourceCode ",
          o.get("sourceCode").getAsString(),
          result.get(i).getSourceCode());
      assertEquals(
          "expect equals notifyStockQty ",
          o.get("notifyStockQty").getAsBigDecimal(),
          result.get(i).getNotifyStockQty());
    }

    result.clear();
  }

  @Test
  public void testParsingInventoryReservation() throws IOException {
    final String inputFile = "InventoryReservation.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventoryReservation> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventoryReservation(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals reservationId ",
          o.get("reservationId").getAsInt(),
          result.get(i).getReservationId(),
          0.0001);
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals(
          "expect equals quantity ",
          o.get("quantity").getAsBigDecimal(),
          result.get(i).getQuantity());
      assertEquals(
          "expect equals metadata ", o.get("metadata").getAsString(), result.get(i).getMetadata());
    }

    result.clear();
  }

  @Test
  public void testParsingInventoryShipmentSource() throws IOException {
    final String inputFile = "InventoryShipmentSource.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventoryShipmentSource> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventoryShipmentSource(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals shipmentId ",
          o.get("shipmentId").getAsInt(),
          result.get(i).getShipmentId(),
          0.0001);
      assertEquals(
          "expect equals sourceCode ",
          o.get("sourceCode").getAsString(),
          result.get(i).getSourceCode());
    }

    result.clear();
  }

  @Test
  public void testParsingInventorySource() throws IOException {
    final String inputFile = "InventorySource.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventorySource> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventorySource(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sourceCode ",
          o.get("sourceCode").getAsString(),
          result.get(i).getSourceCode());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals enabled ",
          o.get("enabled").getAsInt(),
          result.get(i).getEnabled(),
          0.0001);
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals latitude ",
          o.get("latitude").getAsBigDecimal(),
          result.get(i).getLatitude());
      assertEquals(
          "expect equals longitude ",
          o.get("longitude").getAsBigDecimal(),
          result.get(i).getLongitude());
      assertEquals(
          "expect equals countryId ",
          o.get("countryId").getAsString(),
          result.get(i).getCountryId());
      assertEquals(
          "expect equals regionId ",
          o.get("regionId").getAsInt(),
          result.get(i).getRegionId(),
          0.0001);
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals(
          "expect equals street ", o.get("street").getAsString(), result.get(i).getStreet());
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals(
          "expect equals contactName ",
          o.get("contactName").getAsString(),
          result.get(i).getContactName());
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals("expect equals phone ", o.get("phone").getAsString(), result.get(i).getPhone());
      assertEquals("expect equals fax ", o.get("fax").getAsString(), result.get(i).getFax());
      assertEquals(
          "expect equals useDefaultCarrierConfig ",
          o.get("useDefaultCarrierConfig").getAsInt(),
          result.get(i).getUseDefaultCarrierConfig(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingInventorySourceCarrierLink() throws IOException {
    final String inputFile = "InventorySourceCarrierLink.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventorySourceCarrierLink> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventorySourceCarrierLink(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
      assertEquals(
          "expect equals sourceCode ",
          o.get("sourceCode").getAsString(),
          result.get(i).getSourceCode());
      assertEquals(
          "expect equals carrierCode ",
          o.get("carrierCode").getAsString(),
          result.get(i).getCarrierCode());
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingInventorySourceItem() throws IOException {
    final String inputFile = "InventorySourceItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventorySourceItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventorySourceItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sourceItemId ",
          o.get("sourceItemId").getAsInt(),
          result.get(i).getSourceItemId(),
          0.0001);
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals(
          "expect equals sourceCode ",
          o.get("sourceCode").getAsString(),
          result.get(i).getSourceCode());
      assertEquals(
          "expect equals quantity ",
          o.get("quantity").getAsBigDecimal(),
          result.get(i).getQuantity());
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingInventorySourceStockLink() throws IOException {
    final String inputFile = "InventorySourceStockLink.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventorySourceStockLink> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventorySourceStockLink(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals(
          "expect equals sourceCode ",
          o.get("sourceCode").getAsString(),
          result.get(i).getSourceCode());
      assertEquals(
          "expect equals linkId ", o.get("linkId").getAsInt(), result.get(i).getLinkId(), 0.0001);
      assertEquals(
          "expect equals priority ",
          o.get("priority").getAsInt(),
          result.get(i).getPriority(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingInventoryStock() throws IOException {
    final String inputFile = "InventoryStock.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventoryStock> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventoryStock(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
    }

    result.clear();
  }

  @Test
  public void testParsingInventoryStockSalesChannel() throws IOException {
    final String inputFile = "InventoryStockSalesChannel.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<InventoryStockSalesChannel> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2InventoryStockSalesChannel(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals stockId ",
          o.get("stockId").getAsInt(),
          result.get(i).getStockId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingKlarnaCoreOrder() throws IOException {
    final String inputFile = "KlarnaCoreOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<KlarnaCoreOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2KlarnaCoreOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals klarnaOrderId ",
          o.get("klarnaOrderId").getAsString(),
          result.get(i).getKlarnaOrderId());
      assertEquals(
          "expect equals sessionId ",
          o.get("sessionId").getAsString(),
          result.get(i).getSessionId());
      assertEquals(
          "expect equals reservationId ",
          o.get("reservationId").getAsString(),
          result.get(i).getReservationId());
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals isAcknowledged ",
          o.get("isAcknowledged").getAsInt(),
          result.get(i).getIsAcknowledged(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingKlarnaPaymentsQuote() throws IOException {
    final String inputFile = "KlarnaPaymentsQuote.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<KlarnaPaymentsQuote> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2KlarnaPaymentsQuote(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals paymentsQuoteId ",
          o.get("paymentsQuoteId").getAsInt(),
          result.get(i).getPaymentsQuoteId(),
          0.0001);
      assertEquals(
          "expect equals sessionId ",
          o.get("sessionId").getAsString(),
          result.get(i).getSessionId());
      assertEquals(
          "expect equals clientToken ",
          o.get("clientToken").getAsString(),
          result.get(i).getClientToken());
      assertEquals(
          "expect equals authorizationToken ",
          o.get("authorizationToken").getAsString(),
          result.get(i).getAuthorizationToken());
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals paymentMethods ",
          o.get("paymentMethods").getAsString(),
          result.get(i).getPaymentMethods());
      assertEquals(
          "expect equals paymentMethodInfo ",
          o.get("paymentMethodInfo").getAsString(),
          result.get(i).getPaymentMethodInfo());
    }

    result.clear();
  }

  @Test
  public void testParsingLayoutLink() throws IOException {
    final String inputFile = "LayoutLink.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LayoutLink> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LayoutLink(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals layoutLinkId ",
          o.get("layoutLinkId").getAsInt(),
          result.get(i).getLayoutLinkId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals themeId ",
          o.get("themeId").getAsInt(),
          result.get(i).getThemeId(),
          0.0001);
      assertEquals(
          "expect equals layoutUpdateId ",
          o.get("layoutUpdateId").getAsInt(),
          result.get(i).getLayoutUpdateId(),
          0.0001);
      assertEquals(
          "expect equals isTemporary ",
          o.get("isTemporary").getAsInt(),
          result.get(i).getIsTemporary(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingLayoutUpdate() throws IOException {
    final String inputFile = "LayoutUpdate.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<LayoutUpdate> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2LayoutUpdate(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals layoutUpdateId ",
          o.get("layoutUpdateId").getAsInt(),
          result.get(i).getLayoutUpdateId(),
          0.0001);
      assertEquals(
          "expect equals handle ", o.get("handle").getAsString(), result.get(i).getHandle());
      assertEquals("expect equals xml ", o.get("xml").getAsString(), result.get(i).getXml());
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingMagentoAcknowledgedBulk() throws IOException {
    final String inputFile = "MagentoAcknowledgedBulk.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MagentoAcknowledgedBulk> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MagentoAcknowledgedBulk(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals bulk_uuid ",
          new String(java.util.Base64.getDecoder().decode(o.get("bulkUuid").getAsString())),
          new String(result.get(i).getBulkUuid()));
    }

    result.clear();
  }

  @Test
  public void testParsingMagentoBulk() throws IOException {
    final String inputFile = "MagentoBulk.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MagentoBulk> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MagentoBulk(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals uuid ",
          new String(java.util.Base64.getDecoder().decode(o.get("uuid").getAsString())),
          new String(result.get(i).getUuid()));
      assertEquals(
          "expect equals userId ", o.get("userId").getAsInt(), result.get(i).getUserId(), 0.0001);
      assertEquals(
          "expect equals userType ",
          o.get("userType").getAsInt(),
          result.get(i).getUserType(),
          0.0001);
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals operationCount ",
          o.get("operationCount").getAsInt(),
          result.get(i).getOperationCount(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingMagentoOperation() throws IOException {
    final String inputFile = "MagentoOperation.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MagentoOperation> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MagentoOperation(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals bulk_uuid ",
          new String(java.util.Base64.getDecoder().decode(o.get("bulkUuid").getAsString())),
          new String(result.get(i).getBulkUuid()));
      assertEquals(
          "expect equals topicName ",
          o.get("topicName").getAsString(),
          result.get(i).getTopicName());
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals(
          "expect equals errorCode ",
          o.get("errorCode").getAsInt(),
          result.get(i).getErrorCode(),
          0.0001);
      assertEquals(
          "expect equals resultMessage ",
          o.get("resultMessage").getAsString(),
          result.get(i).getResultMessage());
    }

    result.clear();
  }

  @Test
  public void testParsingMspTfaCountryCodes() throws IOException {
    final String inputFile = "MspTfaCountryCodes.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MspTfaCountryCodes> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MspTfaCountryCodes(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals mspTfaCountryCodesId ",
          o.get("mspTfaCountryCodesId").getAsInt(),
          result.get(i).getMspTfaCountryCodesId(),
          0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals dialCode ", o.get("dialCode").getAsString(), result.get(i).getDialCode());
    }

    result.clear();
  }

  @Test
  public void testParsingMspTfaTrusted() throws IOException {
    final String inputFile = "MspTfaTrusted.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MspTfaTrusted> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MspTfaTrusted(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals mspTfaTrustedId ",
          o.get("mspTfaTrustedId").getAsInt(),
          result.get(i).getMspTfaTrustedId(),
          0.0001);
      assertEquals(
          "expect equals userId ", o.get("userId").getAsInt(), result.get(i).getUserId(), 0.0001);
      assertEquals(
          "expect equals deviceName ",
          o.get("deviceName").getAsString(),
          result.get(i).getDeviceName());
      assertEquals("expect equals token ", o.get("token").getAsString(), result.get(i).getToken());
      assertEquals(
          "expect equals lastIp ", o.get("lastIp").getAsString(), result.get(i).getLastIp());
    }

    result.clear();
  }

  @Test
  public void testParsingMspTfaUserConfig() throws IOException {
    final String inputFile = "MspTfaUserConfig.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MspTfaUserConfig> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MspTfaUserConfig(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals mspTfaUserConfigId ",
          o.get("mspTfaUserConfigId").getAsInt(),
          result.get(i).getMspTfaUserConfigId(),
          0.0001);
      assertEquals(
          "expect equals userId ", o.get("userId").getAsInt(), result.get(i).getUserId(), 0.0001);
      assertEquals(
          "expect equals encodedProviders ",
          o.get("encodedProviders").getAsString(),
          result.get(i).getEncodedProviders());
      assertEquals(
          "expect equals encodedConfig ",
          o.get("encodedConfig").getAsString(),
          result.get(i).getEncodedConfig());
      assertEquals(
          "expect equals defaultProvider ",
          o.get("defaultProvider").getAsString(),
          result.get(i).getDefaultProvider());
    }

    result.clear();
  }

  @Test
  public void testParsingMviewState() throws IOException {
    final String inputFile = "MviewState.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<MviewState> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2MviewState(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals stateId ",
          o.get("stateId").getAsInt(),
          result.get(i).getStateId(),
          0.0001);
      assertEquals(
          "expect equals viewId ", o.get("viewId").getAsString(), result.get(i).getViewId());
      assertEquals("expect equals mode ", o.get("mode").getAsString(), result.get(i).getMode());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals versionId ",
          o.get("versionId").getAsInt(),
          result.get(i).getVersionId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingNewsletterProblem() throws IOException {
    final String inputFile = "NewsletterProblem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<NewsletterProblem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2NewsletterProblem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals problemId ",
          o.get("problemId").getAsInt(),
          result.get(i).getProblemId(),
          0.0001);
      assertEquals(
          "expect equals subscriberId ",
          o.get("subscriberId").getAsInt(),
          result.get(i).getSubscriberId(),
          0.0001);
      assertEquals(
          "expect equals queueId ",
          o.get("queueId").getAsInt(),
          result.get(i).getQueueId(),
          0.0001);
      assertEquals(
          "expect equals problemErrorCode ",
          o.get("problemErrorCode").getAsInt(),
          result.get(i).getProblemErrorCode(),
          0.0001);
      assertEquals(
          "expect equals problemErrorText ",
          o.get("problemErrorText").getAsString(),
          result.get(i).getProblemErrorText());
    }

    result.clear();
  }

  @Test
  public void testParsingNewsletterQueue() throws IOException {
    final String inputFile = "NewsletterQueue.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<NewsletterQueue> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2NewsletterQueue(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals queueId ",
          o.get("queueId").getAsInt(),
          result.get(i).getQueueId(),
          0.0001);
      assertEquals(
          "expect equals templateId ",
          o.get("templateId").getAsInt(),
          result.get(i).getTemplateId(),
          0.0001);
      assertEquals(
          "expect equals newsletterType ",
          o.get("newsletterType").getAsInt(),
          result.get(i).getNewsletterType(),
          0.0001);
      assertEquals(
          "expect equals newsletterText ",
          o.get("newsletterText").getAsString(),
          result.get(i).getNewsletterText());
      assertEquals(
          "expect equals newsletterStyles ",
          o.get("newsletterStyles").getAsString(),
          result.get(i).getNewsletterStyles());
      assertEquals(
          "expect equals newsletterSubject ",
          o.get("newsletterSubject").getAsString(),
          result.get(i).getNewsletterSubject());
      assertEquals(
          "expect equals newsletterSenderName ",
          o.get("newsletterSenderName").getAsString(),
          result.get(i).getNewsletterSenderName());
      assertEquals(
          "expect equals newsletterSenderEmail ",
          o.get("newsletterSenderEmail").getAsString(),
          result.get(i).getNewsletterSenderEmail());
      assertEquals(
          "expect equals queueStatus ",
          o.get("queueStatus").getAsInt(),
          result.get(i).getQueueStatus(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingNewsletterQueueLink() throws IOException {
    final String inputFile = "NewsletterQueueLink.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<NewsletterQueueLink> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2NewsletterQueueLink(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals queueLinkId ",
          o.get("queueLinkId").getAsInt(),
          result.get(i).getQueueLinkId(),
          0.0001);
      assertEquals(
          "expect equals queueId ",
          o.get("queueId").getAsInt(),
          result.get(i).getQueueId(),
          0.0001);
      assertEquals(
          "expect equals subscriberId ",
          o.get("subscriberId").getAsInt(),
          result.get(i).getSubscriberId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingNewsletterQueueStoreLink() throws IOException {
    final String inputFile = "NewsletterQueueStoreLink.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<NewsletterQueueStoreLink> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2NewsletterQueueStoreLink(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals queueId ",
          o.get("queueId").getAsInt(),
          result.get(i).getQueueId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingNewsletterSubscriber() throws IOException {
    final String inputFile = "NewsletterSubscriber.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<NewsletterSubscriber> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2NewsletterSubscriber(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals subscriberId ",
          o.get("subscriberId").getAsInt(),
          result.get(i).getSubscriberId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals subscriberEmail ",
          o.get("subscriberEmail").getAsString(),
          result.get(i).getSubscriberEmail());
      assertEquals(
          "expect equals subscriberStatus ",
          o.get("subscriberStatus").getAsInt(),
          result.get(i).getSubscriberStatus(),
          0.0001);
      assertEquals(
          "expect equals subscriberConfirmCode ",
          o.get("subscriberConfirmCode").getAsString(),
          result.get(i).getSubscriberConfirmCode());
    }

    result.clear();
  }

  @Test
  public void testParsingNewsletterTemplate() throws IOException {
    final String inputFile = "NewsletterTemplate.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<NewsletterTemplate> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2NewsletterTemplate(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals templateId ",
          o.get("templateId").getAsInt(),
          result.get(i).getTemplateId(),
          0.0001);
      assertEquals(
          "expect equals templateCode ",
          o.get("templateCode").getAsString(),
          result.get(i).getTemplateCode());
      assertEquals(
          "expect equals templateText ",
          o.get("templateText").getAsString(),
          result.get(i).getTemplateText());
      assertEquals(
          "expect equals templateStyles ",
          o.get("templateStyles").getAsString(),
          result.get(i).getTemplateStyles());
      assertEquals(
          "expect equals templateType ",
          o.get("templateType").getAsInt(),
          result.get(i).getTemplateType(),
          0.0001);
      assertEquals(
          "expect equals templateSubject ",
          o.get("templateSubject").getAsString(),
          result.get(i).getTemplateSubject());
      assertEquals(
          "expect equals templateSenderName ",
          o.get("templateSenderName").getAsString(),
          result.get(i).getTemplateSenderName());
      assertEquals(
          "expect equals templateSenderEmail ",
          o.get("templateSenderEmail").getAsString(),
          result.get(i).getTemplateSenderEmail());
      assertEquals(
          "expect equals templateActual ",
          o.get("templateActual").getAsInt(),
          result.get(i).getTemplateActual(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingOauthConsumer() throws IOException {
    final String inputFile = "OauthConsumer.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<OauthConsumer> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2OauthConsumer(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals secret ", o.get("secret").getAsString(), result.get(i).getSecret());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals key ", o.get("key").getAsString(), result.get(i).getKey());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals callbackUrl ",
          o.get("callbackUrl").getAsString(),
          result.get(i).getCallbackUrl());
      assertEquals(
          "expect equals rejectedCallbackUrl ",
          o.get("rejectedCallbackUrl").getAsString(),
          result.get(i).getRejectedCallbackUrl());
    }

    result.clear();
  }

  @Test
  public void testParsingOauthNonce() throws IOException {
    final String inputFile = "OauthNonce.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<OauthNonce> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2OauthNonce(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals consumerId ",
          o.get("consumerId").getAsInt(),
          result.get(i).getConsumerId(),
          0.0001);
      assertEquals("expect equals nonce ", o.get("nonce").getAsString(), result.get(i).getNonce());
      assertEquals(
          "expect equals timestamp ",
          o.get("timestamp").getAsInt(),
          result.get(i).getTimestamp(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingOauthToken() throws IOException {
    final String inputFile = "OauthToken.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<OauthToken> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2OauthToken(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals token ", o.get("token").getAsString(), result.get(i).getToken());
      assertEquals(
          "expect equals consumerId ",
          o.get("consumerId").getAsInt(),
          result.get(i).getConsumerId(),
          0.0001);
      assertEquals(
          "expect equals adminId ",
          o.get("adminId").getAsInt(),
          result.get(i).getAdminId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals secret ", o.get("secret").getAsString(), result.get(i).getSecret());
      assertEquals(
          "expect equals verifier ", o.get("verifier").getAsString(), result.get(i).getVerifier());
      assertEquals(
          "expect equals callbackUrl ",
          o.get("callbackUrl").getAsString(),
          result.get(i).getCallbackUrl());
      assertEquals(
          "expect equals revoked ",
          o.get("revoked").getAsInt(),
          result.get(i).getRevoked(),
          0.0001);
      assertEquals(
          "expect equals authorized ",
          o.get("authorized").getAsInt(),
          result.get(i).getAuthorized(),
          0.0001);
      assertEquals(
          "expect equals userType ",
          o.get("userType").getAsInt(),
          result.get(i).getUserType(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingOauthTokenRequestLog() throws IOException {
    final String inputFile = "OauthTokenRequestLog.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<OauthTokenRequestLog> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2OauthTokenRequestLog(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals logId ", o.get("logId").getAsInt(), result.get(i).getLogId(), 0.0001);
      assertEquals(
          "expect equals userType ",
          o.get("userType").getAsInt(),
          result.get(i).getUserType(),
          0.0001);
      assertEquals(
          "expect equals userName ", o.get("userName").getAsString(), result.get(i).getUserName());
      assertEquals(
          "expect equals failuresCount ",
          o.get("failuresCount").getAsInt(),
          result.get(i).getFailuresCount(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingPasswordResetRequestEvent() throws IOException {
    final String inputFile = "PasswordResetRequestEvent.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PasswordResetRequestEvent> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PasswordResetRequestEvent(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals requestType ",
          o.get("requestType").getAsInt(),
          result.get(i).getRequestType(),
          0.0001);
      assertEquals(
          "expect equals accountReference ",
          o.get("accountReference").getAsString(),
          result.get(i).getAccountReference());
      assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
    }

    result.clear();
  }

  @Test
  public void testParsingPatchList() throws IOException {
    final String inputFile = "PatchList.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PatchList> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PatchList(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals patchId ",
          o.get("patchId").getAsInt(),
          result.get(i).getPatchId(),
          0.0001);
      assertEquals(
          "expect equals patchName ",
          o.get("patchName").getAsString(),
          result.get(i).getPatchName());
    }

    result.clear();
  }

  @Test
  public void testParsingPaypalBillingAgreement() throws IOException {
    final String inputFile = "PaypalBillingAgreement.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PaypalBillingAgreement> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PaypalBillingAgreement(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals agreementId ",
          o.get("agreementId").getAsInt(),
          result.get(i).getAgreementId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals methodCode ",
          o.get("methodCode").getAsString(),
          result.get(i).getMethodCode());
      assertEquals(
          "expect equals referenceId ",
          o.get("referenceId").getAsString(),
          result.get(i).getReferenceId());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals agreementLabel ",
          o.get("agreementLabel").getAsString(),
          result.get(i).getAgreementLabel());
    }

    result.clear();
  }

  @Test
  public void testParsingPaypalBillingAgreementOrder() throws IOException {
    final String inputFile = "PaypalBillingAgreementOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PaypalBillingAgreementOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PaypalBillingAgreementOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals agreementId ",
          o.get("agreementId").getAsInt(),
          result.get(i).getAgreementId(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingPaypalCert() throws IOException {
    final String inputFile = "PaypalCert.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PaypalCert> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PaypalCert(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals certId ", o.get("certId").getAsInt(), result.get(i).getCertId(), 0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals content ", o.get("content").getAsString(), result.get(i).getContent());
    }

    result.clear();
  }

  @Test
  public void testParsingPaypalPaymentTransaction() throws IOException {
    final String inputFile = "PaypalPaymentTransaction.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PaypalPaymentTransaction> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PaypalPaymentTransaction(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals transactionId ",
          o.get("transactionId").getAsInt(),
          result.get(i).getTransactionId(),
          0.0001);
      assertEquals("expect equals txnId ", o.get("txnId").getAsString(), result.get(i).getTxnId());
    }

    result.clear();
  }

  @Test
  public void testParsingPaypalSettlementReport() throws IOException {
    final String inputFile = "PaypalSettlementReport.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PaypalSettlementReport> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PaypalSettlementReport(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals accountId ",
          o.get("accountId").getAsString(),
          result.get(i).getAccountId());
      assertEquals(
          "expect equals reportId ",
          o.get("reportId").getAsInt(),
          result.get(i).getReportId(),
          0.0001);
      assertEquals(
          "expect equals filename ", o.get("filename").getAsString(), result.get(i).getFilename());
    }

    result.clear();
  }

  @Test
  public void testParsingPaypalSettlementReportRow() throws IOException {
    final String inputFile = "PaypalSettlementReportRow.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PaypalSettlementReportRow> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PaypalSettlementReportRow(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals rowId ", o.get("rowId").getAsInt(), result.get(i).getRowId(), 0.0001);
      assertEquals(
          "expect equals reportId ",
          o.get("reportId").getAsInt(),
          result.get(i).getReportId(),
          0.0001);
      assertEquals(
          "expect equals transactionId ",
          o.get("transactionId").getAsString(),
          result.get(i).getTransactionId());
      assertEquals(
          "expect equals invoiceId ",
          o.get("invoiceId").getAsString(),
          result.get(i).getInvoiceId());
      assertEquals(
          "expect equals paypalReferenceId ",
          o.get("paypalReferenceId").getAsString(),
          result.get(i).getPaypalReferenceId());
      assertEquals(
          "expect equals paypalReferenceIdType ",
          o.get("paypalReferenceIdType").getAsString(),
          result.get(i).getPaypalReferenceIdType());
      assertEquals(
          "expect equals transactionEventCode ",
          o.get("transactionEventCode").getAsString(),
          result.get(i).getTransactionEventCode());
      assertEquals(
          "expect equals transactionDebitOrCredit ",
          o.get("transactionDebitOrCredit").getAsString(),
          result.get(i).getTransactionDebitOrCredit());
      assertEquals(
          "expect equals grossTransactionAmount ",
          o.get("grossTransactionAmount").getAsBigDecimal(),
          result.get(i).getGrossTransactionAmount());
      assertEquals(
          "expect equals grossTransactionCurrency ",
          o.get("grossTransactionCurrency").getAsString(),
          result.get(i).getGrossTransactionCurrency());
      assertEquals(
          "expect equals feeDebitOrCredit ",
          o.get("feeDebitOrCredit").getAsString(),
          result.get(i).getFeeDebitOrCredit());
      assertEquals(
          "expect equals feeAmount ",
          o.get("feeAmount").getAsBigDecimal(),
          result.get(i).getFeeAmount());
      assertEquals(
          "expect equals feeCurrency ",
          o.get("feeCurrency").getAsString(),
          result.get(i).getFeeCurrency());
      assertEquals(
          "expect equals customField ",
          o.get("customField").getAsString(),
          result.get(i).getCustomField());
      assertEquals(
          "expect equals consumerId ",
          o.get("consumerId").getAsString(),
          result.get(i).getConsumerId());
      assertEquals(
          "expect equals paymentTrackingId ",
          o.get("paymentTrackingId").getAsString(),
          result.get(i).getPaymentTrackingId());
      assertEquals(
          "expect equals storeId ", o.get("storeId").getAsString(), result.get(i).getStoreId());
    }

    result.clear();
  }

  @Test
  public void testParsingPersistentSession() throws IOException {
    final String inputFile = "PersistentSession.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<PersistentSession> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2PersistentSession(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals persistentId ",
          o.get("persistentId").getAsInt(),
          result.get(i).getPersistentId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals("expect equals key ", o.get("key").getAsString(), result.get(i).getKey());
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals("expect equals info ", o.get("info").getAsString(), result.get(i).getInfo());
    }

    result.clear();
  }

  @Test
  public void testParsingProductAlertPrice() throws IOException {
    final String inputFile = "ProductAlertPrice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ProductAlertPrice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ProductAlertPrice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals alertPriceId ",
          o.get("alertPriceId").getAsInt(),
          result.get(i).getAlertPriceId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals sendCount ",
          o.get("sendCount").getAsInt(),
          result.get(i).getSendCount(),
          0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingProductAlertStock() throws IOException {
    final String inputFile = "ProductAlertStock.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ProductAlertStock> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ProductAlertStock(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals alertStockId ",
          o.get("alertStockId").getAsInt(),
          result.get(i).getAlertStockId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals sendCount ",
          o.get("sendCount").getAsInt(),
          result.get(i).getSendCount(),
          0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingQueue() throws IOException {
    final String inputFile = "Queue.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Queue> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Queue(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingQueueLock() throws IOException {
    final String inputFile = "QueueLock.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QueueLock> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QueueLock(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals messageCode ",
          o.get("messageCode").getAsString(),
          result.get(i).getMessageCode());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingQueueMessage() throws IOException {
    final String inputFile = "QueueMessage.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QueueMessage> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QueueMessage(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals topicName ",
          o.get("topicName").getAsString(),
          result.get(i).getTopicName());
      assertEquals("expect equals body ", o.get("body").getAsString(), result.get(i).getBody());
    }

    result.clear();
  }

  @Test
  public void testParsingQueueMessageStatus() throws IOException {
    final String inputFile = "QueueMessageStatus.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QueueMessageStatus> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QueueMessageStatus(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals queueId ",
          o.get("queueId").getAsInt(),
          result.get(i).getQueueId(),
          0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsInt(), result.get(i).getStatus(), 0.0001);
      assertEquals(
          "expect equals numberOfTrials ",
          o.get("numberOfTrials").getAsInt(),
          result.get(i).getNumberOfTrials(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingQueuePoisonPill() throws IOException {
    final String inputFile = "QueuePoisonPill.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QueuePoisonPill> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QueuePoisonPill(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals defaultId ",
          o.get("defaultId").getAsString(),
          result.get(i).getDefaultId());
      assertEquals(
          "expect equals version ", o.get("version").getAsString(), result.get(i).getVersion());
    }

    result.clear();
  }

  @Test
  public void testParsingQuote() throws IOException {
    final String inputFile = "Quote.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Quote> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Quote(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals isVirtual ",
          o.get("isVirtual").getAsInt(),
          result.get(i).getIsVirtual(),
          0.0001);
      assertEquals(
          "expect equals isMultiShipping ",
          o.get("isMultiShipping").getAsInt(),
          result.get(i).getIsMultiShipping(),
          0.0001);
      assertEquals(
          "expect equals itemsCount ",
          o.get("itemsCount").getAsInt(),
          result.get(i).getItemsCount(),
          0.0001);
      assertEquals(
          "expect equals itemsQty ",
          o.get("itemsQty").getAsBigDecimal(),
          result.get(i).getItemsQty());
      assertEquals(
          "expect equals origOrderId ",
          o.get("origOrderId").getAsInt(),
          result.get(i).getOrigOrderId(),
          0.0001);
      assertEquals(
          "expect equals storeToBaseRate ",
          o.get("storeToBaseRate").getAsBigDecimal(),
          result.get(i).getStoreToBaseRate());
      assertEquals(
          "expect equals storeToQuoteRate ",
          o.get("storeToQuoteRate").getAsBigDecimal(),
          result.get(i).getStoreToQuoteRate());
      assertEquals(
          "expect equals baseCurrencyCode ",
          o.get("baseCurrencyCode").getAsString(),
          result.get(i).getBaseCurrencyCode());
      assertEquals(
          "expect equals storeCurrencyCode ",
          o.get("storeCurrencyCode").getAsString(),
          result.get(i).getStoreCurrencyCode());
      assertEquals(
          "expect equals quoteCurrencyCode ",
          o.get("quoteCurrencyCode").getAsString(),
          result.get(i).getQuoteCurrencyCode());
      assertEquals(
          "expect equals grandTotal ",
          o.get("grandTotal").getAsBigDecimal(),
          result.get(i).getGrandTotal());
      assertEquals(
          "expect equals baseGrandTotal ",
          o.get("baseGrandTotal").getAsBigDecimal(),
          result.get(i).getBaseGrandTotal());
      assertEquals(
          "expect equals checkoutMethod ",
          o.get("checkoutMethod").getAsString(),
          result.get(i).getCheckoutMethod());
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals customerTaxClassId ",
          o.get("customerTaxClassId").getAsInt(),
          result.get(i).getCustomerTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals customerEmail ",
          o.get("customerEmail").getAsString(),
          result.get(i).getCustomerEmail());
      assertEquals(
          "expect equals customerPrefix ",
          o.get("customerPrefix").getAsString(),
          result.get(i).getCustomerPrefix());
      assertEquals(
          "expect equals customerFirstname ",
          o.get("customerFirstname").getAsString(),
          result.get(i).getCustomerFirstname());
      assertEquals(
          "expect equals customerMiddlename ",
          o.get("customerMiddlename").getAsString(),
          result.get(i).getCustomerMiddlename());
      assertEquals(
          "expect equals customerLastname ",
          o.get("customerLastname").getAsString(),
          result.get(i).getCustomerLastname());
      assertEquals(
          "expect equals customerSuffix ",
          o.get("customerSuffix").getAsString(),
          result.get(i).getCustomerSuffix());
      assertEquals(
          "expect equals customerNote ",
          o.get("customerNote").getAsString(),
          result.get(i).getCustomerNote());
      assertEquals(
          "expect equals customerNoteNotify ",
          o.get("customerNoteNotify").getAsInt(),
          result.get(i).getCustomerNoteNotify(),
          0.0001);
      assertEquals(
          "expect equals customerIsGuest ",
          o.get("customerIsGuest").getAsInt(),
          result.get(i).getCustomerIsGuest(),
          0.0001);
      assertEquals(
          "expect equals remoteIp ", o.get("remoteIp").getAsString(), result.get(i).getRemoteIp());
      assertEquals(
          "expect equals appliedRuleIds ",
          o.get("appliedRuleIds").getAsString(),
          result.get(i).getAppliedRuleIds());
      assertEquals(
          "expect equals reservedOrderId ",
          o.get("reservedOrderId").getAsString(),
          result.get(i).getReservedOrderId());
      assertEquals(
          "expect equals passwordHash ",
          o.get("passwordHash").getAsString(),
          result.get(i).getPasswordHash());
      assertEquals(
          "expect equals couponCode ",
          o.get("couponCode").getAsString(),
          result.get(i).getCouponCode());
      assertEquals(
          "expect equals globalCurrencyCode ",
          o.get("globalCurrencyCode").getAsString(),
          result.get(i).getGlobalCurrencyCode());
      assertEquals(
          "expect equals baseToGlobalRate ",
          o.get("baseToGlobalRate").getAsBigDecimal(),
          result.get(i).getBaseToGlobalRate());
      assertEquals(
          "expect equals baseToQuoteRate ",
          o.get("baseToQuoteRate").getAsBigDecimal(),
          result.get(i).getBaseToQuoteRate());
      assertEquals(
          "expect equals customerTaxvat ",
          o.get("customerTaxvat").getAsString(),
          result.get(i).getCustomerTaxvat());
      assertEquals(
          "expect equals customerGender ",
          o.get("customerGender").getAsString(),
          result.get(i).getCustomerGender());
      assertEquals(
          "expect equals subtotal ",
          o.get("subtotal").getAsBigDecimal(),
          result.get(i).getSubtotal());
      assertEquals(
          "expect equals baseSubtotal ",
          o.get("baseSubtotal").getAsBigDecimal(),
          result.get(i).getBaseSubtotal());
      assertEquals(
          "expect equals subtotalWithDiscount ",
          o.get("subtotalWithDiscount").getAsBigDecimal(),
          result.get(i).getSubtotalWithDiscount());
      assertEquals(
          "expect equals baseSubtotalWithDiscount ",
          o.get("baseSubtotalWithDiscount").getAsBigDecimal(),
          result.get(i).getBaseSubtotalWithDiscount());
      assertEquals(
          "expect equals isChanged ",
          o.get("isChanged").getAsInt(),
          result.get(i).getIsChanged(),
          0.0001);
      assertEquals(
          "expect equals triggerRecollect ",
          o.get("triggerRecollect").getAsInt(),
          result.get(i).getTriggerRecollect(),
          0.0001);
      assertEquals(
          "expect equals extShippingInfo ",
          o.get("extShippingInfo").getAsString(),
          result.get(i).getExtShippingInfo());
      assertEquals(
          "expect equals giftMessageId ",
          o.get("giftMessageId").getAsInt(),
          result.get(i).getGiftMessageId(),
          0.0001);
      assertEquals(
          "expect equals isPersistent ",
          o.get("isPersistent").getAsInt(),
          result.get(i).getIsPersistent(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingQuoteAddress() throws IOException {
    final String inputFile = "QuoteAddress.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QuoteAddress> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QuoteAddress(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals addressId ",
          o.get("addressId").getAsInt(),
          result.get(i).getAddressId(),
          0.0001);
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals saveInAddressBook ",
          o.get("saveInAddressBook").getAsInt(),
          result.get(i).getSaveInAddressBook(),
          0.0001);
      assertEquals(
          "expect equals customerAddressId ",
          o.get("customerAddressId").getAsInt(),
          result.get(i).getCustomerAddressId(),
          0.0001);
      assertEquals(
          "expect equals addressType ",
          o.get("addressType").getAsString(),
          result.get(i).getAddressType());
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals prefix ", o.get("prefix").getAsString(), result.get(i).getPrefix());
      assertEquals(
          "expect equals firstname ",
          o.get("firstname").getAsString(),
          result.get(i).getFirstname());
      assertEquals(
          "expect equals middlename ",
          o.get("middlename").getAsString(),
          result.get(i).getMiddlename());
      assertEquals(
          "expect equals lastname ", o.get("lastname").getAsString(), result.get(i).getLastname());
      assertEquals(
          "expect equals suffix ", o.get("suffix").getAsString(), result.get(i).getSuffix());
      assertEquals(
          "expect equals company ", o.get("company").getAsString(), result.get(i).getCompany());
      assertEquals(
          "expect equals street ", o.get("street").getAsString(), result.get(i).getStreet());
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals(
          "expect equals regionId ",
          o.get("regionId").getAsInt(),
          result.get(i).getRegionId(),
          0.0001);
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals(
          "expect equals countryId ",
          o.get("countryId").getAsString(),
          result.get(i).getCountryId());
      assertEquals(
          "expect equals telephone ",
          o.get("telephone").getAsString(),
          result.get(i).getTelephone());
      assertEquals("expect equals fax ", o.get("fax").getAsString(), result.get(i).getFax());
      assertEquals(
          "expect equals sameAsBilling ",
          o.get("sameAsBilling").getAsInt(),
          result.get(i).getSameAsBilling(),
          0.0001);
      assertEquals(
          "expect equals collectShippingRates ",
          o.get("collectShippingRates").getAsInt(),
          result.get(i).getCollectShippingRates(),
          0.0001);
      assertEquals(
          "expect equals shippingMethod ",
          o.get("shippingMethod").getAsString(),
          result.get(i).getShippingMethod());
      assertEquals(
          "expect equals shippingDescription ",
          o.get("shippingDescription").getAsString(),
          result.get(i).getShippingDescription());
      assertEquals(
          "expect equals weight ", o.get("weight").getAsBigDecimal(), result.get(i).getWeight());
      assertEquals(
          "expect equals subtotal ",
          o.get("subtotal").getAsBigDecimal(),
          result.get(i).getSubtotal());
      assertEquals(
          "expect equals baseSubtotal ",
          o.get("baseSubtotal").getAsBigDecimal(),
          result.get(i).getBaseSubtotal());
      assertEquals(
          "expect equals subtotalWithDiscount ",
          o.get("subtotalWithDiscount").getAsBigDecimal(),
          result.get(i).getSubtotalWithDiscount());
      assertEquals(
          "expect equals baseSubtotalWithDiscount ",
          o.get("baseSubtotalWithDiscount").getAsBigDecimal(),
          result.get(i).getBaseSubtotalWithDiscount());
      assertEquals(
          "expect equals taxAmount ",
          o.get("taxAmount").getAsBigDecimal(),
          result.get(i).getTaxAmount());
      assertEquals(
          "expect equals baseTaxAmount ",
          o.get("baseTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseTaxAmount());
      assertEquals(
          "expect equals shippingAmount ",
          o.get("shippingAmount").getAsBigDecimal(),
          result.get(i).getShippingAmount());
      assertEquals(
          "expect equals baseShippingAmount ",
          o.get("baseShippingAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingAmount());
      assertEquals(
          "expect equals shippingTaxAmount ",
          o.get("shippingTaxAmount").getAsBigDecimal(),
          result.get(i).getShippingTaxAmount());
      assertEquals(
          "expect equals baseShippingTaxAmount ",
          o.get("baseShippingTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingTaxAmount());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals baseDiscountAmount ",
          o.get("baseDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountAmount());
      assertEquals(
          "expect equals grandTotal ",
          o.get("grandTotal").getAsBigDecimal(),
          result.get(i).getGrandTotal());
      assertEquals(
          "expect equals baseGrandTotal ",
          o.get("baseGrandTotal").getAsBigDecimal(),
          result.get(i).getBaseGrandTotal());
      assertEquals(
          "expect equals customerNotes ",
          o.get("customerNotes").getAsString(),
          result.get(i).getCustomerNotes());
      assertEquals(
          "expect equals appliedTaxes ",
          o.get("appliedTaxes").getAsString(),
          result.get(i).getAppliedTaxes());
      assertEquals(
          "expect equals discountDescription ",
          o.get("discountDescription").getAsString(),
          result.get(i).getDiscountDescription());
      assertEquals(
          "expect equals shippingDiscountAmount ",
          o.get("shippingDiscountAmount").getAsBigDecimal(),
          result.get(i).getShippingDiscountAmount());
      assertEquals(
          "expect equals baseShippingDiscountAmount ",
          o.get("baseShippingDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingDiscountAmount());
      assertEquals(
          "expect equals subtotalInclTax ",
          o.get("subtotalInclTax").getAsBigDecimal(),
          result.get(i).getSubtotalInclTax());
      assertEquals(
          "expect equals baseSubtotalTotalInclTax ",
          o.get("baseSubtotalTotalInclTax").getAsBigDecimal(),
          result.get(i).getBaseSubtotalTotalInclTax());
      assertEquals(
          "expect equals discountTaxCompensationAmount ",
          o.get("discountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseDiscountTaxCompensationAmount ",
          o.get("baseDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals shippingDiscountTaxCompensationAmount ",
          o.get("shippingDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getShippingDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseShippingDiscountTaxCompensationAmnt ",
          o.get("baseShippingDiscountTaxCompensationAmnt").getAsBigDecimal(),
          result.get(i).getBaseShippingDiscountTaxCompensationAmnt());
      assertEquals(
          "expect equals shippingInclTax ",
          o.get("shippingInclTax").getAsBigDecimal(),
          result.get(i).getShippingInclTax());
      assertEquals(
          "expect equals baseShippingInclTax ",
          o.get("baseShippingInclTax").getAsBigDecimal(),
          result.get(i).getBaseShippingInclTax());
      assertEquals("expect equals vatId ", o.get("vatId").getAsString(), result.get(i).getVatId());
      assertEquals(
          "expect equals vatIsValid ",
          o.get("vatIsValid").getAsInt(),
          result.get(i).getVatIsValid(),
          0.0001);
      assertEquals(
          "expect equals vatRequestId ",
          o.get("vatRequestId").getAsString(),
          result.get(i).getVatRequestId());
      assertEquals(
          "expect equals vatRequestDate ",
          o.get("vatRequestDate").getAsString(),
          result.get(i).getVatRequestDate());
      assertEquals(
          "expect equals vatRequestSuccess ",
          o.get("vatRequestSuccess").getAsInt(),
          result.get(i).getVatRequestSuccess(),
          0.0001);
      assertEquals(
          "expect equals validatedCountryCode ",
          o.get("validatedCountryCode").getAsString(),
          result.get(i).getValidatedCountryCode());
      assertEquals(
          "expect equals validatedVatNumber ",
          o.get("validatedVatNumber").getAsString(),
          result.get(i).getValidatedVatNumber());
      assertEquals(
          "expect equals giftMessageId ",
          o.get("giftMessageId").getAsInt(),
          result.get(i).getGiftMessageId(),
          0.0001);
      assertEquals(
          "expect equals freeShipping ",
          o.get("freeShipping").getAsInt(),
          result.get(i).getFreeShipping(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingQuoteAddressItem() throws IOException {
    final String inputFile = "QuoteAddressItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QuoteAddressItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QuoteAddressItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals addressItemId ",
          o.get("addressItemId").getAsInt(),
          result.get(i).getAddressItemId(),
          0.0001);
      assertEquals(
          "expect equals parentItemId ",
          o.get("parentItemId").getAsInt(),
          result.get(i).getParentItemId(),
          0.0001);
      assertEquals(
          "expect equals quoteAddressId ",
          o.get("quoteAddressId").getAsInt(),
          result.get(i).getQuoteAddressId(),
          0.0001);
      assertEquals(
          "expect equals quoteItemId ",
          o.get("quoteItemId").getAsInt(),
          result.get(i).getQuoteItemId(),
          0.0001);
      assertEquals(
          "expect equals appliedRuleIds ",
          o.get("appliedRuleIds").getAsString(),
          result.get(i).getAppliedRuleIds());
      assertEquals(
          "expect equals additionalData ",
          o.get("additionalData").getAsString(),
          result.get(i).getAdditionalData());
      assertEquals(
          "expect equals weight ", o.get("weight").getAsBigDecimal(), result.get(i).getWeight());
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals taxAmount ",
          o.get("taxAmount").getAsBigDecimal(),
          result.get(i).getTaxAmount());
      assertEquals(
          "expect equals rowTotal ",
          o.get("rowTotal").getAsBigDecimal(),
          result.get(i).getRowTotal());
      assertEquals(
          "expect equals baseRowTotal ",
          o.get("baseRowTotal").getAsBigDecimal(),
          result.get(i).getBaseRowTotal());
      assertEquals(
          "expect equals rowTotalWithDiscount ",
          o.get("rowTotalWithDiscount").getAsBigDecimal(),
          result.get(i).getRowTotalWithDiscount());
      assertEquals(
          "expect equals baseDiscountAmount ",
          o.get("baseDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountAmount());
      assertEquals(
          "expect equals baseTaxAmount ",
          o.get("baseTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseTaxAmount());
      assertEquals(
          "expect equals rowWeight ",
          o.get("rowWeight").getAsBigDecimal(),
          result.get(i).getRowWeight());
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals superProductId ",
          o.get("superProductId").getAsInt(),
          result.get(i).getSuperProductId(),
          0.0001);
      assertEquals(
          "expect equals parentProductId ",
          o.get("parentProductId").getAsInt(),
          result.get(i).getParentProductId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals("expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals isQtyDecimal ",
          o.get("isQtyDecimal").getAsInt(),
          result.get(i).getIsQtyDecimal(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals discountPercent ",
          o.get("discountPercent").getAsBigDecimal(),
          result.get(i).getDiscountPercent());
      assertEquals(
          "expect equals noDiscount ",
          o.get("noDiscount").getAsInt(),
          result.get(i).getNoDiscount(),
          0.0001);
      assertEquals(
          "expect equals taxPercent ",
          o.get("taxPercent").getAsBigDecimal(),
          result.get(i).getTaxPercent());
      assertEquals(
          "expect equals basePrice ",
          o.get("basePrice").getAsBigDecimal(),
          result.get(i).getBasePrice());
      assertEquals(
          "expect equals baseCost ",
          o.get("baseCost").getAsBigDecimal(),
          result.get(i).getBaseCost());
      assertEquals(
          "expect equals priceInclTax ",
          o.get("priceInclTax").getAsBigDecimal(),
          result.get(i).getPriceInclTax());
      assertEquals(
          "expect equals basePriceInclTax ",
          o.get("basePriceInclTax").getAsBigDecimal(),
          result.get(i).getBasePriceInclTax());
      assertEquals(
          "expect equals rowTotalInclTax ",
          o.get("rowTotalInclTax").getAsBigDecimal(),
          result.get(i).getRowTotalInclTax());
      assertEquals(
          "expect equals baseRowTotalInclTax ",
          o.get("baseRowTotalInclTax").getAsBigDecimal(),
          result.get(i).getBaseRowTotalInclTax());
      assertEquals(
          "expect equals discountTaxCompensationAmount ",
          o.get("discountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseDiscountTaxCompensationAmount ",
          o.get("baseDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals giftMessageId ",
          o.get("giftMessageId").getAsInt(),
          result.get(i).getGiftMessageId(),
          0.0001);
      assertEquals(
          "expect equals freeShipping ",
          o.get("freeShipping").getAsInt(),
          result.get(i).getFreeShipping(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingQuoteIdMask() throws IOException {
    final String inputFile = "QuoteIdMask.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QuoteIdMask> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QuoteIdMask(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals maskedId ", o.get("maskedId").getAsString(), result.get(i).getMaskedId());
    }

    result.clear();
  }

  @Test
  public void testParsingQuoteItem() throws IOException {
    final String inputFile = "QuoteItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QuoteItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QuoteItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals parentItemId ",
          o.get("parentItemId").getAsInt(),
          result.get(i).getParentItemId(),
          0.0001);
      assertEquals(
          "expect equals isVirtual ",
          o.get("isVirtual").getAsInt(),
          result.get(i).getIsVirtual(),
          0.0001);
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals appliedRuleIds ",
          o.get("appliedRuleIds").getAsString(),
          result.get(i).getAppliedRuleIds());
      assertEquals(
          "expect equals additionalData ",
          o.get("additionalData").getAsString(),
          result.get(i).getAdditionalData());
      assertEquals(
          "expect equals isQtyDecimal ",
          o.get("isQtyDecimal").getAsInt(),
          result.get(i).getIsQtyDecimal(),
          0.0001);
      assertEquals(
          "expect equals noDiscount ",
          o.get("noDiscount").getAsInt(),
          result.get(i).getNoDiscount(),
          0.0001);
      assertEquals(
          "expect equals weight ", o.get("weight").getAsBigDecimal(), result.get(i).getWeight());
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals basePrice ",
          o.get("basePrice").getAsBigDecimal(),
          result.get(i).getBasePrice());
      assertEquals(
          "expect equals customPrice ",
          o.get("customPrice").getAsBigDecimal(),
          result.get(i).getCustomPrice());
      assertEquals(
          "expect equals discountPercent ",
          o.get("discountPercent").getAsBigDecimal(),
          result.get(i).getDiscountPercent());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals baseDiscountAmount ",
          o.get("baseDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountAmount());
      assertEquals(
          "expect equals taxPercent ",
          o.get("taxPercent").getAsBigDecimal(),
          result.get(i).getTaxPercent());
      assertEquals(
          "expect equals taxAmount ",
          o.get("taxAmount").getAsBigDecimal(),
          result.get(i).getTaxAmount());
      assertEquals(
          "expect equals baseTaxAmount ",
          o.get("baseTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseTaxAmount());
      assertEquals(
          "expect equals rowTotal ",
          o.get("rowTotal").getAsBigDecimal(),
          result.get(i).getRowTotal());
      assertEquals(
          "expect equals baseRowTotal ",
          o.get("baseRowTotal").getAsBigDecimal(),
          result.get(i).getBaseRowTotal());
      assertEquals(
          "expect equals rowTotalWithDiscount ",
          o.get("rowTotalWithDiscount").getAsBigDecimal(),
          result.get(i).getRowTotalWithDiscount());
      assertEquals(
          "expect equals rowWeight ",
          o.get("rowWeight").getAsBigDecimal(),
          result.get(i).getRowWeight());
      assertEquals(
          "expect equals productType ",
          o.get("productType").getAsString(),
          result.get(i).getProductType());
      assertEquals(
          "expect equals baseTaxBeforeDiscount ",
          o.get("baseTaxBeforeDiscount").getAsBigDecimal(),
          result.get(i).getBaseTaxBeforeDiscount());
      assertEquals(
          "expect equals taxBeforeDiscount ",
          o.get("taxBeforeDiscount").getAsBigDecimal(),
          result.get(i).getTaxBeforeDiscount());
      assertEquals(
          "expect equals originalCustomPrice ",
          o.get("originalCustomPrice").getAsBigDecimal(),
          result.get(i).getOriginalCustomPrice());
      assertEquals(
          "expect equals redirectUrl ",
          o.get("redirectUrl").getAsString(),
          result.get(i).getRedirectUrl());
      assertEquals(
          "expect equals baseCost ",
          o.get("baseCost").getAsBigDecimal(),
          result.get(i).getBaseCost());
      assertEquals(
          "expect equals priceInclTax ",
          o.get("priceInclTax").getAsBigDecimal(),
          result.get(i).getPriceInclTax());
      assertEquals(
          "expect equals basePriceInclTax ",
          o.get("basePriceInclTax").getAsBigDecimal(),
          result.get(i).getBasePriceInclTax());
      assertEquals(
          "expect equals rowTotalInclTax ",
          o.get("rowTotalInclTax").getAsBigDecimal(),
          result.get(i).getRowTotalInclTax());
      assertEquals(
          "expect equals baseRowTotalInclTax ",
          o.get("baseRowTotalInclTax").getAsBigDecimal(),
          result.get(i).getBaseRowTotalInclTax());
      assertEquals(
          "expect equals discountTaxCompensationAmount ",
          o.get("discountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseDiscountTaxCompensationAmount ",
          o.get("baseDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals giftMessageId ",
          o.get("giftMessageId").getAsInt(),
          result.get(i).getGiftMessageId(),
          0.0001);
      assertEquals(
          "expect equals freeShipping ",
          o.get("freeShipping").getAsInt(),
          result.get(i).getFreeShipping(),
          0.0001);
      assertEquals(
          "expect equals weeeTaxApplied ",
          o.get("weeeTaxApplied").getAsString(),
          result.get(i).getWeeeTaxApplied());
      assertEquals(
          "expect equals weeeTaxAppliedAmount ",
          o.get("weeeTaxAppliedAmount").getAsBigDecimal(),
          result.get(i).getWeeeTaxAppliedAmount());
      assertEquals(
          "expect equals weeeTaxAppliedRowAmount ",
          o.get("weeeTaxAppliedRowAmount").getAsBigDecimal(),
          result.get(i).getWeeeTaxAppliedRowAmount());
      assertEquals(
          "expect equals weeeTaxDisposition ",
          o.get("weeeTaxDisposition").getAsBigDecimal(),
          result.get(i).getWeeeTaxDisposition());
      assertEquals(
          "expect equals weeeTaxRowDisposition ",
          o.get("weeeTaxRowDisposition").getAsBigDecimal(),
          result.get(i).getWeeeTaxRowDisposition());
      assertEquals(
          "expect equals baseWeeeTaxAppliedAmount ",
          o.get("baseWeeeTaxAppliedAmount").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxAppliedAmount());
      assertEquals(
          "expect equals baseWeeeTaxAppliedRowAmnt ",
          o.get("baseWeeeTaxAppliedRowAmnt").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxAppliedRowAmnt());
      assertEquals(
          "expect equals baseWeeeTaxDisposition ",
          o.get("baseWeeeTaxDisposition").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxDisposition());
      assertEquals(
          "expect equals baseWeeeTaxRowDisposition ",
          o.get("baseWeeeTaxRowDisposition").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxRowDisposition());
    }

    result.clear();
  }

  @Test
  public void testParsingQuoteItemOption() throws IOException {
    final String inputFile = "QuoteItemOption.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QuoteItemOption> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QuoteItemOption(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingQuotePayment() throws IOException {
    final String inputFile = "QuotePayment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QuotePayment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QuotePayment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals paymentId ",
          o.get("paymentId").getAsInt(),
          result.get(i).getPaymentId(),
          0.0001);
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals method ", o.get("method").getAsString(), result.get(i).getMethod());
      assertEquals(
          "expect equals ccType ", o.get("ccType").getAsString(), result.get(i).getCcType());
      assertEquals(
          "expect equals ccNumberEnc ",
          o.get("ccNumberEnc").getAsString(),
          result.get(i).getCcNumberEnc());
      assertEquals(
          "expect equals ccLast4 ", o.get("ccLast4").getAsString(), result.get(i).getCcLast4());
      assertEquals(
          "expect equals ccCidEnc ", o.get("ccCidEnc").getAsString(), result.get(i).getCcCidEnc());
      assertEquals(
          "expect equals ccOwner ", o.get("ccOwner").getAsString(), result.get(i).getCcOwner());
      assertEquals(
          "expect equals ccExpMonth ",
          o.get("ccExpMonth").getAsString(),
          result.get(i).getCcExpMonth());
      assertEquals(
          "expect equals ccExpYear ",
          o.get("ccExpYear").getAsInt(),
          result.get(i).getCcExpYear(),
          0.0001);
      assertEquals(
          "expect equals ccSsOwner ",
          o.get("ccSsOwner").getAsString(),
          result.get(i).getCcSsOwner());
      assertEquals(
          "expect equals ccSsStartMonth ",
          o.get("ccSsStartMonth").getAsInt(),
          result.get(i).getCcSsStartMonth(),
          0.0001);
      assertEquals(
          "expect equals ccSsStartYear ",
          o.get("ccSsStartYear").getAsInt(),
          result.get(i).getCcSsStartYear(),
          0.0001);
      assertEquals(
          "expect equals poNumber ", o.get("poNumber").getAsString(), result.get(i).getPoNumber());
      assertEquals(
          "expect equals additionalData ",
          o.get("additionalData").getAsString(),
          result.get(i).getAdditionalData());
      assertEquals(
          "expect equals ccSsIssue ",
          o.get("ccSsIssue").getAsString(),
          result.get(i).getCcSsIssue());
      assertEquals(
          "expect equals additionalInformation ",
          o.get("additionalInformation").getAsString(),
          result.get(i).getAdditionalInformation());
      assertEquals(
          "expect equals paypalPayerId ",
          o.get("paypalPayerId").getAsString(),
          result.get(i).getPaypalPayerId());
      assertEquals(
          "expect equals paypalPayerStatus ",
          o.get("paypalPayerStatus").getAsString(),
          result.get(i).getPaypalPayerStatus());
      assertEquals(
          "expect equals paypalCorrelationId ",
          o.get("paypalCorrelationId").getAsString(),
          result.get(i).getPaypalCorrelationId());
    }

    result.clear();
  }

  @Test
  public void testParsingQuoteShippingRate() throws IOException {
    final String inputFile = "QuoteShippingRate.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<QuoteShippingRate> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2QuoteShippingRate(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals rateId ", o.get("rateId").getAsInt(), result.get(i).getRateId(), 0.0001);
      assertEquals(
          "expect equals addressId ",
          o.get("addressId").getAsInt(),
          result.get(i).getAddressId(),
          0.0001);
      assertEquals(
          "expect equals carrier ", o.get("carrier").getAsString(), result.get(i).getCarrier());
      assertEquals(
          "expect equals carrierTitle ",
          o.get("carrierTitle").getAsString(),
          result.get(i).getCarrierTitle());
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals method ", o.get("method").getAsString(), result.get(i).getMethod());
      assertEquals(
          "expect equals methodDescription ",
          o.get("methodDescription").getAsString(),
          result.get(i).getMethodDescription());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals errorMessage ",
          o.get("errorMessage").getAsString(),
          result.get(i).getErrorMessage());
      assertEquals(
          "expect equals methodTitle ",
          o.get("methodTitle").getAsString(),
          result.get(i).getMethodTitle());
    }

    result.clear();
  }

  @Test
  public void testParsingRating() throws IOException {
    final String inputFile = "Rating.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Rating> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Rating(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ratingId ",
          o.get("ratingId").getAsInt(),
          result.get(i).getRatingId(),
          0.0001);
      assertEquals(
          "expect equals ratingCode ",
          o.get("ratingCode").getAsString(),
          result.get(i).getRatingCode());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingRatingEntity() throws IOException {
    final String inputFile = "RatingEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<RatingEntity> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2RatingEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityCode ",
          o.get("entityCode").getAsString(),
          result.get(i).getEntityCode());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingRatingOption() throws IOException {
    final String inputFile = "RatingOption.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<RatingOption> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2RatingOption(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals ratingId ",
          o.get("ratingId").getAsInt(),
          result.get(i).getRatingId(),
          0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingRatingOptionVote() throws IOException {
    final String inputFile = "RatingOptionVote.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<RatingOptionVote> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2RatingOptionVote(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals remoteIp ", o.get("remoteIp").getAsString(), result.get(i).getRemoteIp());
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals ratingId ",
          o.get("ratingId").getAsInt(),
          result.get(i).getRatingId(),
          0.0001);
      assertEquals(
          "expect equals percent ",
          o.get("percent").getAsInt(),
          result.get(i).getPercent(),
          0.0001);
      assertEquals(
          "expect equals value ", o.get("value").getAsInt(), result.get(i).getValue(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingRatingOptionVoteAggregated() throws IOException {
    final String inputFile = "RatingOptionVoteAggregated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<RatingOptionVoteAggregated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2RatingOptionVoteAggregated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals primaryId ",
          o.get("primaryId").getAsInt(),
          result.get(i).getPrimaryId(),
          0.0001);
      assertEquals(
          "expect equals ratingId ",
          o.get("ratingId").getAsInt(),
          result.get(i).getRatingId(),
          0.0001);
      assertEquals(
          "expect equals voteCount ",
          o.get("voteCount").getAsInt(),
          result.get(i).getVoteCount(),
          0.0001);
      assertEquals(
          "expect equals voteValueSum ",
          o.get("voteValueSum").getAsInt(),
          result.get(i).getVoteValueSum(),
          0.0001);
      assertEquals(
          "expect equals percent ",
          o.get("percent").getAsInt(),
          result.get(i).getPercent(),
          0.0001);
      assertEquals(
          "expect equals percentApproved ",
          o.get("percentApproved").getAsInt(),
          result.get(i).getPercentApproved(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingRatingStore() throws IOException {
    final String inputFile = "RatingStore.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<RatingStore> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2RatingStore(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals ratingId ",
          o.get("ratingId").getAsInt(),
          result.get(i).getRatingId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingRatingTitle() throws IOException {
    final String inputFile = "RatingTitle.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<RatingTitle> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2RatingTitle(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals ratingId ",
          o.get("ratingId").getAsInt(),
          result.get(i).getRatingId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingReleaseNotificationViewerLog() throws IOException {
    final String inputFile = "ReleaseNotificationViewerLog.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReleaseNotificationViewerLog> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReleaseNotificationViewerLog(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals viewerId ",
          o.get("viewerId").getAsInt(),
          result.get(i).getViewerId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals lastViewVersion ",
          o.get("lastViewVersion").getAsString(),
          result.get(i).getLastViewVersion());
    }

    result.clear();
  }

  @Test
  public void testParsingReportComparedProductIndex() throws IOException {
    final String inputFile = "ReportComparedProductIndex.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportComparedProductIndex> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportComparedProductIndex(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals visitorId ",
          o.get("visitorId").getAsInt(),
          result.get(i).getVisitorId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReportEvent() throws IOException {
    final String inputFile = "ReportEvent.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportEvent> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportEvent(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals eventTypeId ",
          o.get("eventTypeId").getAsInt(),
          result.get(i).getEventTypeId(),
          0.0001);
      assertEquals(
          "expect equals objectId ",
          o.get("objectId").getAsInt(),
          result.get(i).getObjectId(),
          0.0001);
      assertEquals(
          "expect equals subjectId ",
          o.get("subjectId").getAsInt(),
          result.get(i).getSubjectId(),
          0.0001);
      assertEquals(
          "expect equals subtype ",
          o.get("subtype").getAsInt(),
          result.get(i).getSubtype(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReportEventTypes() throws IOException {
    final String inputFile = "ReportEventTypes.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportEventTypes> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportEventTypes(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals eventTypeId ",
          o.get("eventTypeId").getAsInt(),
          result.get(i).getEventTypeId(),
          0.0001);
      assertEquals(
          "expect equals eventName ",
          o.get("eventName").getAsString(),
          result.get(i).getEventName());
      assertEquals(
          "expect equals customerLogin ",
          o.get("customerLogin").getAsInt(),
          result.get(i).getCustomerLogin(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReportViewedProductAggregatedDaily() throws IOException {
    final String inputFile = "ReportViewedProductAggregatedDaily.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportViewedProductAggregatedDaily> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportViewedProductAggregatedDaily(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals productName ",
          o.get("productName").getAsString(),
          result.get(i).getProductName());
      assertEquals(
          "expect equals productPrice ",
          o.get("productPrice").getAsBigDecimal(),
          result.get(i).getProductPrice());
      assertEquals(
          "expect equals viewsNum ",
          o.get("viewsNum").getAsInt(),
          result.get(i).getViewsNum(),
          0.0001);
      assertEquals(
          "expect equals ratingPos ",
          o.get("ratingPos").getAsInt(),
          result.get(i).getRatingPos(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReportViewedProductAggregatedMonthly() throws IOException {
    final String inputFile = "ReportViewedProductAggregatedMonthly.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportViewedProductAggregatedMonthly> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportViewedProductAggregatedMonthly(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals productName ",
          o.get("productName").getAsString(),
          result.get(i).getProductName());
      assertEquals(
          "expect equals productPrice ",
          o.get("productPrice").getAsBigDecimal(),
          result.get(i).getProductPrice());
      assertEquals(
          "expect equals viewsNum ",
          o.get("viewsNum").getAsInt(),
          result.get(i).getViewsNum(),
          0.0001);
      assertEquals(
          "expect equals ratingPos ",
          o.get("ratingPos").getAsInt(),
          result.get(i).getRatingPos(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReportViewedProductAggregatedYearly() throws IOException {
    final String inputFile = "ReportViewedProductAggregatedYearly.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportViewedProductAggregatedYearly> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportViewedProductAggregatedYearly(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals productName ",
          o.get("productName").getAsString(),
          result.get(i).getProductName());
      assertEquals(
          "expect equals productPrice ",
          o.get("productPrice").getAsBigDecimal(),
          result.get(i).getProductPrice());
      assertEquals(
          "expect equals viewsNum ",
          o.get("viewsNum").getAsInt(),
          result.get(i).getViewsNum(),
          0.0001);
      assertEquals(
          "expect equals ratingPos ",
          o.get("ratingPos").getAsInt(),
          result.get(i).getRatingPos(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReportViewedProductIndex() throws IOException {
    final String inputFile = "ReportViewedProductIndex.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportViewedProductIndex> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportViewedProductIndex(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals visitorId ",
          o.get("visitorId").getAsInt(),
          result.get(i).getVisitorId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReportingCounts() throws IOException {
    final String inputFile = "ReportingCounts.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportingCounts> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportingCounts(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals count ", o.get("count").getAsInt(), result.get(i).getCount(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReportingModuleStatus() throws IOException {
    final String inputFile = "ReportingModuleStatus.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportingModuleStatus> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportingModuleStatus(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals active ", o.get("active").getAsString(), result.get(i).getActive());
      assertEquals(
          "expect equals setupVersion ",
          o.get("setupVersion").getAsString(),
          result.get(i).getSetupVersion());
      assertEquals("expect equals state ", o.get("state").getAsString(), result.get(i).getState());
    }

    result.clear();
  }

  @Test
  public void testParsingReportingOrders() throws IOException {
    final String inputFile = "ReportingOrders.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportingOrders> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportingOrders(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals total ", o.get("total").getAsBigDecimal(), result.get(i).getTotal());
      assertEquals(
          "expect equals totalBase ",
          o.get("totalBase").getAsBigDecimal(),
          result.get(i).getTotalBase());
      assertEquals(
          "expect equals itemCount ",
          o.get("itemCount").getAsInt(),
          result.get(i).getItemCount(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReportingSystemUpdates() throws IOException {
    final String inputFile = "ReportingSystemUpdates.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportingSystemUpdates> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportingSystemUpdates(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals action ", o.get("action").getAsString(), result.get(i).getAction());
    }

    result.clear();
  }

  @Test
  public void testParsingReportingUsers() throws IOException {
    final String inputFile = "ReportingUsers.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReportingUsers> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReportingUsers(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals action ", o.get("action").getAsString(), result.get(i).getAction());
    }

    result.clear();
  }

  @Test
  public void testParsingReview() throws IOException {
    final String inputFile = "Review.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Review> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Review(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals entityPkValue ",
          o.get("entityPkValue").getAsInt(),
          result.get(i).getEntityPkValue(),
          0.0001);
      assertEquals(
          "expect equals statusId ",
          o.get("statusId").getAsInt(),
          result.get(i).getStatusId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReviewDetail() throws IOException {
    final String inputFile = "ReviewDetail.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReviewDetail> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReviewDetail(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals detail ", o.get("detail").getAsString(), result.get(i).getDetail());
      assertEquals(
          "expect equals nickname ", o.get("nickname").getAsString(), result.get(i).getNickname());
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReviewEntity() throws IOException {
    final String inputFile = "ReviewEntity.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReviewEntity> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReviewEntity(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals entityCode ",
          o.get("entityCode").getAsString(),
          result.get(i).getEntityCode());
    }

    result.clear();
  }

  @Test
  public void testParsingReviewEntitySummary() throws IOException {
    final String inputFile = "ReviewEntitySummary.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReviewEntitySummary> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReviewEntitySummary(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityType ",
          o.get("entityType").getAsInt(),
          result.get(i).getEntityType(),
          0.0001);
      assertEquals(
          "expect equals reviewsCount ",
          o.get("reviewsCount").getAsInt(),
          result.get(i).getReviewsCount(),
          0.0001);
      assertEquals(
          "expect equals ratingSummary ",
          o.get("ratingSummary").getAsInt(),
          result.get(i).getRatingSummary(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingReviewStatus() throws IOException {
    final String inputFile = "ReviewStatus.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReviewStatus> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReviewStatus(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals statusId ",
          o.get("statusId").getAsInt(),
          result.get(i).getStatusId(),
          0.0001);
      assertEquals(
          "expect equals statusCode ",
          o.get("statusCode").getAsString(),
          result.get(i).getStatusCode());
    }

    result.clear();
  }

  @Test
  public void testParsingReviewStore() throws IOException {
    final String inputFile = "ReviewStore.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ReviewStore> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ReviewStore(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesBestsellersAggregatedDaily() throws IOException {
    final String inputFile = "SalesBestsellersAggregatedDaily.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesBestsellersAggregatedDaily> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesBestsellersAggregatedDaily(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals productName ",
          o.get("productName").getAsString(),
          result.get(i).getProductName());
      assertEquals(
          "expect equals productPrice ",
          o.get("productPrice").getAsBigDecimal(),
          result.get(i).getProductPrice());
      assertEquals(
          "expect equals qtyOrdered ",
          o.get("qtyOrdered").getAsBigDecimal(),
          result.get(i).getQtyOrdered());
      assertEquals(
          "expect equals ratingPos ",
          o.get("ratingPos").getAsInt(),
          result.get(i).getRatingPos(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesBestsellersAggregatedMonthly() throws IOException {
    final String inputFile = "SalesBestsellersAggregatedMonthly.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesBestsellersAggregatedMonthly> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesBestsellersAggregatedMonthly(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals productName ",
          o.get("productName").getAsString(),
          result.get(i).getProductName());
      assertEquals(
          "expect equals productPrice ",
          o.get("productPrice").getAsBigDecimal(),
          result.get(i).getProductPrice());
      assertEquals(
          "expect equals qtyOrdered ",
          o.get("qtyOrdered").getAsBigDecimal(),
          result.get(i).getQtyOrdered());
      assertEquals(
          "expect equals ratingPos ",
          o.get("ratingPos").getAsInt(),
          result.get(i).getRatingPos(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesBestsellersAggregatedYearly() throws IOException {
    final String inputFile = "SalesBestsellersAggregatedYearly.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesBestsellersAggregatedYearly> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesBestsellersAggregatedYearly(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals productName ",
          o.get("productName").getAsString(),
          result.get(i).getProductName());
      assertEquals(
          "expect equals productPrice ",
          o.get("productPrice").getAsBigDecimal(),
          result.get(i).getProductPrice());
      assertEquals(
          "expect equals qtyOrdered ",
          o.get("qtyOrdered").getAsBigDecimal(),
          result.get(i).getQtyOrdered());
      assertEquals(
          "expect equals ratingPos ",
          o.get("ratingPos").getAsInt(),
          result.get(i).getRatingPos(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesCreditmemo() throws IOException {
    final String inputFile = "SalesCreditmemo.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesCreditmemo> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesCreditmemo(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals adjustmentPositive ",
          o.get("adjustmentPositive").getAsBigDecimal(),
          result.get(i).getAdjustmentPositive());
      assertEquals(
          "expect equals baseShippingTaxAmount ",
          o.get("baseShippingTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingTaxAmount());
      assertEquals(
          "expect equals storeToOrderRate ",
          o.get("storeToOrderRate").getAsBigDecimal(),
          result.get(i).getStoreToOrderRate());
      assertEquals(
          "expect equals baseDiscountAmount ",
          o.get("baseDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountAmount());
      assertEquals(
          "expect equals baseToOrderRate ",
          o.get("baseToOrderRate").getAsBigDecimal(),
          result.get(i).getBaseToOrderRate());
      assertEquals(
          "expect equals grandTotal ",
          o.get("grandTotal").getAsBigDecimal(),
          result.get(i).getGrandTotal());
      assertEquals(
          "expect equals baseAdjustmentNegative ",
          o.get("baseAdjustmentNegative").getAsBigDecimal(),
          result.get(i).getBaseAdjustmentNegative());
      assertEquals(
          "expect equals baseSubtotalInclTax ",
          o.get("baseSubtotalInclTax").getAsBigDecimal(),
          result.get(i).getBaseSubtotalInclTax());
      assertEquals(
          "expect equals shippingAmount ",
          o.get("shippingAmount").getAsBigDecimal(),
          result.get(i).getShippingAmount());
      assertEquals(
          "expect equals subtotalInclTax ",
          o.get("subtotalInclTax").getAsBigDecimal(),
          result.get(i).getSubtotalInclTax());
      assertEquals(
          "expect equals adjustmentNegative ",
          o.get("adjustmentNegative").getAsBigDecimal(),
          result.get(i).getAdjustmentNegative());
      assertEquals(
          "expect equals baseShippingAmount ",
          o.get("baseShippingAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingAmount());
      assertEquals(
          "expect equals storeToBaseRate ",
          o.get("storeToBaseRate").getAsBigDecimal(),
          result.get(i).getStoreToBaseRate());
      assertEquals(
          "expect equals baseToGlobalRate ",
          o.get("baseToGlobalRate").getAsBigDecimal(),
          result.get(i).getBaseToGlobalRate());
      assertEquals(
          "expect equals baseAdjustment ",
          o.get("baseAdjustment").getAsBigDecimal(),
          result.get(i).getBaseAdjustment());
      assertEquals(
          "expect equals baseSubtotal ",
          o.get("baseSubtotal").getAsBigDecimal(),
          result.get(i).getBaseSubtotal());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals subtotal ",
          o.get("subtotal").getAsBigDecimal(),
          result.get(i).getSubtotal());
      assertEquals(
          "expect equals adjustment ",
          o.get("adjustment").getAsBigDecimal(),
          result.get(i).getAdjustment());
      assertEquals(
          "expect equals baseGrandTotal ",
          o.get("baseGrandTotal").getAsBigDecimal(),
          result.get(i).getBaseGrandTotal());
      assertEquals(
          "expect equals baseAdjustmentPositive ",
          o.get("baseAdjustmentPositive").getAsBigDecimal(),
          result.get(i).getBaseAdjustmentPositive());
      assertEquals(
          "expect equals baseTaxAmount ",
          o.get("baseTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseTaxAmount());
      assertEquals(
          "expect equals shippingTaxAmount ",
          o.get("shippingTaxAmount").getAsBigDecimal(),
          result.get(i).getShippingTaxAmount());
      assertEquals(
          "expect equals taxAmount ",
          o.get("taxAmount").getAsBigDecimal(),
          result.get(i).getTaxAmount());
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals emailSent ",
          o.get("emailSent").getAsInt(),
          result.get(i).getEmailSent(),
          0.0001);
      assertEquals(
          "expect equals sendEmail ",
          o.get("sendEmail").getAsInt(),
          result.get(i).getSendEmail(),
          0.0001);
      assertEquals(
          "expect equals creditmemoStatus ",
          o.get("creditmemoStatus").getAsInt(),
          result.get(i).getCreditmemoStatus(),
          0.0001);
      assertEquals(
          "expect equals state ", o.get("state").getAsInt(), result.get(i).getState(), 0.0001);
      assertEquals(
          "expect equals shippingAddressId ",
          o.get("shippingAddressId").getAsInt(),
          result.get(i).getShippingAddressId(),
          0.0001);
      assertEquals(
          "expect equals billingAddressId ",
          o.get("billingAddressId").getAsInt(),
          result.get(i).getBillingAddressId(),
          0.0001);
      assertEquals(
          "expect equals invoiceId ",
          o.get("invoiceId").getAsInt(),
          result.get(i).getInvoiceId(),
          0.0001);
      assertEquals(
          "expect equals storeCurrencyCode ",
          o.get("storeCurrencyCode").getAsString(),
          result.get(i).getStoreCurrencyCode());
      assertEquals(
          "expect equals orderCurrencyCode ",
          o.get("orderCurrencyCode").getAsString(),
          result.get(i).getOrderCurrencyCode());
      assertEquals(
          "expect equals baseCurrencyCode ",
          o.get("baseCurrencyCode").getAsString(),
          result.get(i).getBaseCurrencyCode());
      assertEquals(
          "expect equals globalCurrencyCode ",
          o.get("globalCurrencyCode").getAsString(),
          result.get(i).getGlobalCurrencyCode());
      assertEquals(
          "expect equals transactionId ",
          o.get("transactionId").getAsString(),
          result.get(i).getTransactionId());
      assertEquals(
          "expect equals discountTaxCompensationAmount ",
          o.get("discountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseDiscountTaxCompensationAmount ",
          o.get("baseDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals shippingDiscountTaxCompensationAmount ",
          o.get("shippingDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getShippingDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseShippingDiscountTaxCompensationAmnt ",
          o.get("baseShippingDiscountTaxCompensationAmnt").getAsBigDecimal(),
          result.get(i).getBaseShippingDiscountTaxCompensationAmnt());
      assertEquals(
          "expect equals shippingInclTax ",
          o.get("shippingInclTax").getAsBigDecimal(),
          result.get(i).getShippingInclTax());
      assertEquals(
          "expect equals baseShippingInclTax ",
          o.get("baseShippingInclTax").getAsBigDecimal(),
          result.get(i).getBaseShippingInclTax());
      assertEquals(
          "expect equals discountDescription ",
          o.get("discountDescription").getAsString(),
          result.get(i).getDiscountDescription());
      assertEquals(
          "expect equals customerNote ",
          o.get("customerNote").getAsString(),
          result.get(i).getCustomerNote());
      assertEquals(
          "expect equals customerNoteNotify ",
          o.get("customerNoteNotify").getAsInt(),
          result.get(i).getCustomerNoteNotify(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesCreditmemoComment() throws IOException {
    final String inputFile = "SalesCreditmemoComment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesCreditmemoComment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesCreditmemoComment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals isCustomerNotified ",
          o.get("isCustomerNotified").getAsInt(),
          result.get(i).getIsCustomerNotified(),
          0.0001);
      assertEquals(
          "expect equals isVisibleOnFront ",
          o.get("isVisibleOnFront").getAsInt(),
          result.get(i).getIsVisibleOnFront(),
          0.0001);
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesCreditmemoGrid() throws IOException {
    final String inputFile = "SalesCreditmemoGrid.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesCreditmemoGrid> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesCreditmemoGrid(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals orderIncrementId ",
          o.get("orderIncrementId").getAsString(),
          result.get(i).getOrderIncrementId());
      assertEquals(
          "expect equals billingName ",
          o.get("billingName").getAsString(),
          result.get(i).getBillingName());
      assertEquals(
          "expect equals state ", o.get("state").getAsInt(), result.get(i).getState(), 0.0001);
      assertEquals(
          "expect equals baseGrandTotal ",
          o.get("baseGrandTotal").getAsBigDecimal(),
          result.get(i).getBaseGrandTotal());
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals(
          "expect equals billingAddress ",
          o.get("billingAddress").getAsString(),
          result.get(i).getBillingAddress());
      assertEquals(
          "expect equals shippingAddress ",
          o.get("shippingAddress").getAsString(),
          result.get(i).getShippingAddress());
      assertEquals(
          "expect equals customerName ",
          o.get("customerName").getAsString(),
          result.get(i).getCustomerName());
      assertEquals(
          "expect equals customerEmail ",
          o.get("customerEmail").getAsString(),
          result.get(i).getCustomerEmail());
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals paymentMethod ",
          o.get("paymentMethod").getAsString(),
          result.get(i).getPaymentMethod());
      assertEquals(
          "expect equals shippingInformation ",
          o.get("shippingInformation").getAsString(),
          result.get(i).getShippingInformation());
      assertEquals(
          "expect equals subtotal ",
          o.get("subtotal").getAsBigDecimal(),
          result.get(i).getSubtotal());
      assertEquals(
          "expect equals shippingAndHandling ",
          o.get("shippingAndHandling").getAsBigDecimal(),
          result.get(i).getShippingAndHandling());
      assertEquals(
          "expect equals adjustmentPositive ",
          o.get("adjustmentPositive").getAsBigDecimal(),
          result.get(i).getAdjustmentPositive());
      assertEquals(
          "expect equals adjustmentNegative ",
          o.get("adjustmentNegative").getAsBigDecimal(),
          result.get(i).getAdjustmentNegative());
      assertEquals(
          "expect equals orderBaseGrandTotal ",
          o.get("orderBaseGrandTotal").getAsBigDecimal(),
          result.get(i).getOrderBaseGrandTotal());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesCreditmemoItem() throws IOException {
    final String inputFile = "SalesCreditmemoItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesCreditmemoItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesCreditmemoItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals basePrice ",
          o.get("basePrice").getAsBigDecimal(),
          result.get(i).getBasePrice());
      assertEquals(
          "expect equals taxAmount ",
          o.get("taxAmount").getAsBigDecimal(),
          result.get(i).getTaxAmount());
      assertEquals(
          "expect equals baseRowTotal ",
          o.get("baseRowTotal").getAsBigDecimal(),
          result.get(i).getBaseRowTotal());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals rowTotal ",
          o.get("rowTotal").getAsBigDecimal(),
          result.get(i).getRowTotal());
      assertEquals(
          "expect equals baseDiscountAmount ",
          o.get("baseDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountAmount());
      assertEquals(
          "expect equals priceInclTax ",
          o.get("priceInclTax").getAsBigDecimal(),
          result.get(i).getPriceInclTax());
      assertEquals(
          "expect equals baseTaxAmount ",
          o.get("baseTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseTaxAmount());
      assertEquals(
          "expect equals basePriceInclTax ",
          o.get("basePriceInclTax").getAsBigDecimal(),
          result.get(i).getBasePriceInclTax());
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals baseCost ",
          o.get("baseCost").getAsBigDecimal(),
          result.get(i).getBaseCost());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals baseRowTotalInclTax ",
          o.get("baseRowTotalInclTax").getAsBigDecimal(),
          result.get(i).getBaseRowTotalInclTax());
      assertEquals(
          "expect equals rowTotalInclTax ",
          o.get("rowTotalInclTax").getAsBigDecimal(),
          result.get(i).getRowTotalInclTax());
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals orderItemId ",
          o.get("orderItemId").getAsInt(),
          result.get(i).getOrderItemId(),
          0.0001);
      assertEquals(
          "expect equals additionalData ",
          o.get("additionalData").getAsString(),
          result.get(i).getAdditionalData());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals discountTaxCompensationAmount ",
          o.get("discountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseDiscountTaxCompensationAmount ",
          o.get("baseDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals taxRatio ", o.get("taxRatio").getAsString(), result.get(i).getTaxRatio());
      assertEquals(
          "expect equals weeeTaxApplied ",
          o.get("weeeTaxApplied").getAsString(),
          result.get(i).getWeeeTaxApplied());
      assertEquals(
          "expect equals weeeTaxAppliedAmount ",
          o.get("weeeTaxAppliedAmount").getAsBigDecimal(),
          result.get(i).getWeeeTaxAppliedAmount());
      assertEquals(
          "expect equals weeeTaxAppliedRowAmount ",
          o.get("weeeTaxAppliedRowAmount").getAsBigDecimal(),
          result.get(i).getWeeeTaxAppliedRowAmount());
      assertEquals(
          "expect equals weeeTaxDisposition ",
          o.get("weeeTaxDisposition").getAsBigDecimal(),
          result.get(i).getWeeeTaxDisposition());
      assertEquals(
          "expect equals weeeTaxRowDisposition ",
          o.get("weeeTaxRowDisposition").getAsBigDecimal(),
          result.get(i).getWeeeTaxRowDisposition());
      assertEquals(
          "expect equals baseWeeeTaxAppliedAmount ",
          o.get("baseWeeeTaxAppliedAmount").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxAppliedAmount());
      assertEquals(
          "expect equals baseWeeeTaxAppliedRowAmnt ",
          o.get("baseWeeeTaxAppliedRowAmnt").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxAppliedRowAmnt());
      assertEquals(
          "expect equals baseWeeeTaxDisposition ",
          o.get("baseWeeeTaxDisposition").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxDisposition());
      assertEquals(
          "expect equals baseWeeeTaxRowDisposition ",
          o.get("baseWeeeTaxRowDisposition").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxRowDisposition());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesInvoice() throws IOException {
    final String inputFile = "SalesInvoice.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesInvoice> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesInvoice(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals baseGrandTotal ",
          o.get("baseGrandTotal").getAsBigDecimal(),
          result.get(i).getBaseGrandTotal());
      assertEquals(
          "expect equals shippingTaxAmount ",
          o.get("shippingTaxAmount").getAsBigDecimal(),
          result.get(i).getShippingTaxAmount());
      assertEquals(
          "expect equals taxAmount ",
          o.get("taxAmount").getAsBigDecimal(),
          result.get(i).getTaxAmount());
      assertEquals(
          "expect equals baseTaxAmount ",
          o.get("baseTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseTaxAmount());
      assertEquals(
          "expect equals storeToOrderRate ",
          o.get("storeToOrderRate").getAsBigDecimal(),
          result.get(i).getStoreToOrderRate());
      assertEquals(
          "expect equals baseShippingTaxAmount ",
          o.get("baseShippingTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingTaxAmount());
      assertEquals(
          "expect equals baseDiscountAmount ",
          o.get("baseDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountAmount());
      assertEquals(
          "expect equals baseToOrderRate ",
          o.get("baseToOrderRate").getAsBigDecimal(),
          result.get(i).getBaseToOrderRate());
      assertEquals(
          "expect equals grandTotal ",
          o.get("grandTotal").getAsBigDecimal(),
          result.get(i).getGrandTotal());
      assertEquals(
          "expect equals shippingAmount ",
          o.get("shippingAmount").getAsBigDecimal(),
          result.get(i).getShippingAmount());
      assertEquals(
          "expect equals subtotalInclTax ",
          o.get("subtotalInclTax").getAsBigDecimal(),
          result.get(i).getSubtotalInclTax());
      assertEquals(
          "expect equals baseSubtotalInclTax ",
          o.get("baseSubtotalInclTax").getAsBigDecimal(),
          result.get(i).getBaseSubtotalInclTax());
      assertEquals(
          "expect equals storeToBaseRate ",
          o.get("storeToBaseRate").getAsBigDecimal(),
          result.get(i).getStoreToBaseRate());
      assertEquals(
          "expect equals baseShippingAmount ",
          o.get("baseShippingAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingAmount());
      assertEquals(
          "expect equals totalQty ",
          o.get("totalQty").getAsBigDecimal(),
          result.get(i).getTotalQty());
      assertEquals(
          "expect equals baseToGlobalRate ",
          o.get("baseToGlobalRate").getAsBigDecimal(),
          result.get(i).getBaseToGlobalRate());
      assertEquals(
          "expect equals subtotal ",
          o.get("subtotal").getAsBigDecimal(),
          result.get(i).getSubtotal());
      assertEquals(
          "expect equals baseSubtotal ",
          o.get("baseSubtotal").getAsBigDecimal(),
          result.get(i).getBaseSubtotal());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals billingAddressId ",
          o.get("billingAddressId").getAsInt(),
          result.get(i).getBillingAddressId(),
          0.0001);
      assertEquals(
          "expect equals isUsedForRefund ",
          o.get("isUsedForRefund").getAsInt(),
          result.get(i).getIsUsedForRefund(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals emailSent ",
          o.get("emailSent").getAsInt(),
          result.get(i).getEmailSent(),
          0.0001);
      assertEquals(
          "expect equals sendEmail ",
          o.get("sendEmail").getAsInt(),
          result.get(i).getSendEmail(),
          0.0001);
      assertEquals(
          "expect equals canVoidFlag ",
          o.get("canVoidFlag").getAsInt(),
          result.get(i).getCanVoidFlag(),
          0.0001);
      assertEquals(
          "expect equals state ", o.get("state").getAsInt(), result.get(i).getState(), 0.0001);
      assertEquals(
          "expect equals shippingAddressId ",
          o.get("shippingAddressId").getAsInt(),
          result.get(i).getShippingAddressId(),
          0.0001);
      assertEquals(
          "expect equals storeCurrencyCode ",
          o.get("storeCurrencyCode").getAsString(),
          result.get(i).getStoreCurrencyCode());
      assertEquals(
          "expect equals transactionId ",
          o.get("transactionId").getAsString(),
          result.get(i).getTransactionId());
      assertEquals(
          "expect equals orderCurrencyCode ",
          o.get("orderCurrencyCode").getAsString(),
          result.get(i).getOrderCurrencyCode());
      assertEquals(
          "expect equals baseCurrencyCode ",
          o.get("baseCurrencyCode").getAsString(),
          result.get(i).getBaseCurrencyCode());
      assertEquals(
          "expect equals globalCurrencyCode ",
          o.get("globalCurrencyCode").getAsString(),
          result.get(i).getGlobalCurrencyCode());
      assertEquals(
          "expect equals discountTaxCompensationAmount ",
          o.get("discountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseDiscountTaxCompensationAmount ",
          o.get("baseDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals shippingDiscountTaxCompensationAmount ",
          o.get("shippingDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getShippingDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseShippingDiscountTaxCompensationAmnt ",
          o.get("baseShippingDiscountTaxCompensationAmnt").getAsBigDecimal(),
          result.get(i).getBaseShippingDiscountTaxCompensationAmnt());
      assertEquals(
          "expect equals shippingInclTax ",
          o.get("shippingInclTax").getAsBigDecimal(),
          result.get(i).getShippingInclTax());
      assertEquals(
          "expect equals baseShippingInclTax ",
          o.get("baseShippingInclTax").getAsBigDecimal(),
          result.get(i).getBaseShippingInclTax());
      assertEquals(
          "expect equals baseTotalRefunded ",
          o.get("baseTotalRefunded").getAsBigDecimal(),
          result.get(i).getBaseTotalRefunded());
      assertEquals(
          "expect equals discountDescription ",
          o.get("discountDescription").getAsString(),
          result.get(i).getDiscountDescription());
      assertEquals(
          "expect equals customerNote ",
          o.get("customerNote").getAsString(),
          result.get(i).getCustomerNote());
      assertEquals(
          "expect equals customerNoteNotify ",
          o.get("customerNoteNotify").getAsInt(),
          result.get(i).getCustomerNoteNotify(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesInvoiceComment() throws IOException {
    final String inputFile = "SalesInvoiceComment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesInvoiceComment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesInvoiceComment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals isCustomerNotified ",
          o.get("isCustomerNotified").getAsInt(),
          result.get(i).getIsCustomerNotified(),
          0.0001);
      assertEquals(
          "expect equals isVisibleOnFront ",
          o.get("isVisibleOnFront").getAsInt(),
          result.get(i).getIsVisibleOnFront(),
          0.0001);
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesInvoiceGrid() throws IOException {
    final String inputFile = "SalesInvoiceGrid.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesInvoiceGrid> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesInvoiceGrid(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals state ", o.get("state").getAsInt(), result.get(i).getState(), 0.0001);
      assertEquals(
          "expect equals storeName ",
          o.get("storeName").getAsString(),
          result.get(i).getStoreName());
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals orderIncrementId ",
          o.get("orderIncrementId").getAsString(),
          result.get(i).getOrderIncrementId());
      assertEquals(
          "expect equals customerName ",
          o.get("customerName").getAsString(),
          result.get(i).getCustomerName());
      assertEquals(
          "expect equals customerEmail ",
          o.get("customerEmail").getAsString(),
          result.get(i).getCustomerEmail());
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals paymentMethod ",
          o.get("paymentMethod").getAsString(),
          result.get(i).getPaymentMethod());
      assertEquals(
          "expect equals storeCurrencyCode ",
          o.get("storeCurrencyCode").getAsString(),
          result.get(i).getStoreCurrencyCode());
      assertEquals(
          "expect equals orderCurrencyCode ",
          o.get("orderCurrencyCode").getAsString(),
          result.get(i).getOrderCurrencyCode());
      assertEquals(
          "expect equals baseCurrencyCode ",
          o.get("baseCurrencyCode").getAsString(),
          result.get(i).getBaseCurrencyCode());
      assertEquals(
          "expect equals globalCurrencyCode ",
          o.get("globalCurrencyCode").getAsString(),
          result.get(i).getGlobalCurrencyCode());
      assertEquals(
          "expect equals billingName ",
          o.get("billingName").getAsString(),
          result.get(i).getBillingName());
      assertEquals(
          "expect equals billingAddress ",
          o.get("billingAddress").getAsString(),
          result.get(i).getBillingAddress());
      assertEquals(
          "expect equals shippingAddress ",
          o.get("shippingAddress").getAsString(),
          result.get(i).getShippingAddress());
      assertEquals(
          "expect equals shippingInformation ",
          o.get("shippingInformation").getAsString(),
          result.get(i).getShippingInformation());
      assertEquals(
          "expect equals subtotal ",
          o.get("subtotal").getAsBigDecimal(),
          result.get(i).getSubtotal());
      assertEquals(
          "expect equals shippingAndHandling ",
          o.get("shippingAndHandling").getAsBigDecimal(),
          result.get(i).getShippingAndHandling());
      assertEquals(
          "expect equals grandTotal ",
          o.get("grandTotal").getAsBigDecimal(),
          result.get(i).getGrandTotal());
      assertEquals(
          "expect equals baseGrandTotal ",
          o.get("baseGrandTotal").getAsBigDecimal(),
          result.get(i).getBaseGrandTotal());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesInvoiceItem() throws IOException {
    final String inputFile = "SalesInvoiceItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesInvoiceItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesInvoiceItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals basePrice ",
          o.get("basePrice").getAsBigDecimal(),
          result.get(i).getBasePrice());
      assertEquals(
          "expect equals taxAmount ",
          o.get("taxAmount").getAsBigDecimal(),
          result.get(i).getTaxAmount());
      assertEquals(
          "expect equals baseRowTotal ",
          o.get("baseRowTotal").getAsBigDecimal(),
          result.get(i).getBaseRowTotal());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals rowTotal ",
          o.get("rowTotal").getAsBigDecimal(),
          result.get(i).getRowTotal());
      assertEquals(
          "expect equals baseDiscountAmount ",
          o.get("baseDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountAmount());
      assertEquals(
          "expect equals priceInclTax ",
          o.get("priceInclTax").getAsBigDecimal(),
          result.get(i).getPriceInclTax());
      assertEquals(
          "expect equals baseTaxAmount ",
          o.get("baseTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseTaxAmount());
      assertEquals(
          "expect equals basePriceInclTax ",
          o.get("basePriceInclTax").getAsBigDecimal(),
          result.get(i).getBasePriceInclTax());
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals baseCost ",
          o.get("baseCost").getAsBigDecimal(),
          result.get(i).getBaseCost());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals baseRowTotalInclTax ",
          o.get("baseRowTotalInclTax").getAsBigDecimal(),
          result.get(i).getBaseRowTotalInclTax());
      assertEquals(
          "expect equals rowTotalInclTax ",
          o.get("rowTotalInclTax").getAsBigDecimal(),
          result.get(i).getRowTotalInclTax());
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals orderItemId ",
          o.get("orderItemId").getAsInt(),
          result.get(i).getOrderItemId(),
          0.0001);
      assertEquals(
          "expect equals additionalData ",
          o.get("additionalData").getAsString(),
          result.get(i).getAdditionalData());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals discountTaxCompensationAmount ",
          o.get("discountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseDiscountTaxCompensationAmount ",
          o.get("baseDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals taxRatio ", o.get("taxRatio").getAsString(), result.get(i).getTaxRatio());
      assertEquals(
          "expect equals weeeTaxApplied ",
          o.get("weeeTaxApplied").getAsString(),
          result.get(i).getWeeeTaxApplied());
      assertEquals(
          "expect equals weeeTaxAppliedAmount ",
          o.get("weeeTaxAppliedAmount").getAsBigDecimal(),
          result.get(i).getWeeeTaxAppliedAmount());
      assertEquals(
          "expect equals weeeTaxAppliedRowAmount ",
          o.get("weeeTaxAppliedRowAmount").getAsBigDecimal(),
          result.get(i).getWeeeTaxAppliedRowAmount());
      assertEquals(
          "expect equals weeeTaxDisposition ",
          o.get("weeeTaxDisposition").getAsBigDecimal(),
          result.get(i).getWeeeTaxDisposition());
      assertEquals(
          "expect equals weeeTaxRowDisposition ",
          o.get("weeeTaxRowDisposition").getAsBigDecimal(),
          result.get(i).getWeeeTaxRowDisposition());
      assertEquals(
          "expect equals baseWeeeTaxAppliedAmount ",
          o.get("baseWeeeTaxAppliedAmount").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxAppliedAmount());
      assertEquals(
          "expect equals baseWeeeTaxAppliedRowAmnt ",
          o.get("baseWeeeTaxAppliedRowAmnt").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxAppliedRowAmnt());
      assertEquals(
          "expect equals baseWeeeTaxDisposition ",
          o.get("baseWeeeTaxDisposition").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxDisposition());
      assertEquals(
          "expect equals baseWeeeTaxRowDisposition ",
          o.get("baseWeeeTaxRowDisposition").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxRowDisposition());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesInvoicedAggregated() throws IOException {
    final String inputFile = "SalesInvoicedAggregated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesInvoicedAggregated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesInvoicedAggregated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals ordersInvoiced ",
          o.get("ordersInvoiced").getAsBigDecimal(),
          result.get(i).getOrdersInvoiced());
      assertEquals(
          "expect equals invoiced ",
          o.get("invoiced").getAsBigDecimal(),
          result.get(i).getInvoiced());
      assertEquals(
          "expect equals invoicedCaptured ",
          o.get("invoicedCaptured").getAsBigDecimal(),
          result.get(i).getInvoicedCaptured());
      assertEquals(
          "expect equals invoicedNotCaptured ",
          o.get("invoicedNotCaptured").getAsBigDecimal(),
          result.get(i).getInvoicedNotCaptured());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesInvoicedAggregatedOrder() throws IOException {
    final String inputFile = "SalesInvoicedAggregatedOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesInvoicedAggregatedOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesInvoicedAggregatedOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals ordersInvoiced ",
          o.get("ordersInvoiced").getAsBigDecimal(),
          result.get(i).getOrdersInvoiced());
      assertEquals(
          "expect equals invoiced ",
          o.get("invoiced").getAsBigDecimal(),
          result.get(i).getInvoiced());
      assertEquals(
          "expect equals invoicedCaptured ",
          o.get("invoicedCaptured").getAsBigDecimal(),
          result.get(i).getInvoicedCaptured());
      assertEquals(
          "expect equals invoicedNotCaptured ",
          o.get("invoicedNotCaptured").getAsBigDecimal(),
          result.get(i).getInvoicedNotCaptured());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrder() throws IOException {
    final String inputFile = "SalesOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals("expect equals state ", o.get("state").getAsString(), result.get(i).getState());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals couponCode ",
          o.get("couponCode").getAsString(),
          result.get(i).getCouponCode());
      assertEquals(
          "expect equals protectCode ",
          o.get("protectCode").getAsString(),
          result.get(i).getProtectCode());
      assertEquals(
          "expect equals shippingDescription ",
          o.get("shippingDescription").getAsString(),
          result.get(i).getShippingDescription());
      assertEquals(
          "expect equals isVirtual ",
          o.get("isVirtual").getAsInt(),
          result.get(i).getIsVirtual(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals baseDiscountAmount ",
          o.get("baseDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountAmount());
      assertEquals(
          "expect equals baseDiscountCanceled ",
          o.get("baseDiscountCanceled").getAsBigDecimal(),
          result.get(i).getBaseDiscountCanceled());
      assertEquals(
          "expect equals baseDiscountInvoiced ",
          o.get("baseDiscountInvoiced").getAsBigDecimal(),
          result.get(i).getBaseDiscountInvoiced());
      assertEquals(
          "expect equals baseDiscountRefunded ",
          o.get("baseDiscountRefunded").getAsBigDecimal(),
          result.get(i).getBaseDiscountRefunded());
      assertEquals(
          "expect equals baseGrandTotal ",
          o.get("baseGrandTotal").getAsBigDecimal(),
          result.get(i).getBaseGrandTotal());
      assertEquals(
          "expect equals baseShippingAmount ",
          o.get("baseShippingAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingAmount());
      assertEquals(
          "expect equals baseShippingCanceled ",
          o.get("baseShippingCanceled").getAsBigDecimal(),
          result.get(i).getBaseShippingCanceled());
      assertEquals(
          "expect equals baseShippingInvoiced ",
          o.get("baseShippingInvoiced").getAsBigDecimal(),
          result.get(i).getBaseShippingInvoiced());
      assertEquals(
          "expect equals baseShippingRefunded ",
          o.get("baseShippingRefunded").getAsBigDecimal(),
          result.get(i).getBaseShippingRefunded());
      assertEquals(
          "expect equals baseShippingTaxAmount ",
          o.get("baseShippingTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingTaxAmount());
      assertEquals(
          "expect equals baseShippingTaxRefunded ",
          o.get("baseShippingTaxRefunded").getAsBigDecimal(),
          result.get(i).getBaseShippingTaxRefunded());
      assertEquals(
          "expect equals baseSubtotal ",
          o.get("baseSubtotal").getAsBigDecimal(),
          result.get(i).getBaseSubtotal());
      assertEquals(
          "expect equals baseSubtotalCanceled ",
          o.get("baseSubtotalCanceled").getAsBigDecimal(),
          result.get(i).getBaseSubtotalCanceled());
      assertEquals(
          "expect equals baseSubtotalInvoiced ",
          o.get("baseSubtotalInvoiced").getAsBigDecimal(),
          result.get(i).getBaseSubtotalInvoiced());
      assertEquals(
          "expect equals baseSubtotalRefunded ",
          o.get("baseSubtotalRefunded").getAsBigDecimal(),
          result.get(i).getBaseSubtotalRefunded());
      assertEquals(
          "expect equals baseTaxAmount ",
          o.get("baseTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseTaxAmount());
      assertEquals(
          "expect equals baseTaxCanceled ",
          o.get("baseTaxCanceled").getAsBigDecimal(),
          result.get(i).getBaseTaxCanceled());
      assertEquals(
          "expect equals baseTaxInvoiced ",
          o.get("baseTaxInvoiced").getAsBigDecimal(),
          result.get(i).getBaseTaxInvoiced());
      assertEquals(
          "expect equals baseTaxRefunded ",
          o.get("baseTaxRefunded").getAsBigDecimal(),
          result.get(i).getBaseTaxRefunded());
      assertEquals(
          "expect equals baseToGlobalRate ",
          o.get("baseToGlobalRate").getAsBigDecimal(),
          result.get(i).getBaseToGlobalRate());
      assertEquals(
          "expect equals baseToOrderRate ",
          o.get("baseToOrderRate").getAsBigDecimal(),
          result.get(i).getBaseToOrderRate());
      assertEquals(
          "expect equals baseTotalCanceled ",
          o.get("baseTotalCanceled").getAsBigDecimal(),
          result.get(i).getBaseTotalCanceled());
      assertEquals(
          "expect equals baseTotalInvoiced ",
          o.get("baseTotalInvoiced").getAsBigDecimal(),
          result.get(i).getBaseTotalInvoiced());
      assertEquals(
          "expect equals baseTotalInvoicedCost ",
          o.get("baseTotalInvoicedCost").getAsBigDecimal(),
          result.get(i).getBaseTotalInvoicedCost());
      assertEquals(
          "expect equals baseTotalOfflineRefunded ",
          o.get("baseTotalOfflineRefunded").getAsBigDecimal(),
          result.get(i).getBaseTotalOfflineRefunded());
      assertEquals(
          "expect equals baseTotalOnlineRefunded ",
          o.get("baseTotalOnlineRefunded").getAsBigDecimal(),
          result.get(i).getBaseTotalOnlineRefunded());
      assertEquals(
          "expect equals baseTotalPaid ",
          o.get("baseTotalPaid").getAsBigDecimal(),
          result.get(i).getBaseTotalPaid());
      assertEquals(
          "expect equals baseTotalQtyOrdered ",
          o.get("baseTotalQtyOrdered").getAsBigDecimal(),
          result.get(i).getBaseTotalQtyOrdered());
      assertEquals(
          "expect equals baseTotalRefunded ",
          o.get("baseTotalRefunded").getAsBigDecimal(),
          result.get(i).getBaseTotalRefunded());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals discountCanceled ",
          o.get("discountCanceled").getAsBigDecimal(),
          result.get(i).getDiscountCanceled());
      assertEquals(
          "expect equals discountInvoiced ",
          o.get("discountInvoiced").getAsBigDecimal(),
          result.get(i).getDiscountInvoiced());
      assertEquals(
          "expect equals discountRefunded ",
          o.get("discountRefunded").getAsBigDecimal(),
          result.get(i).getDiscountRefunded());
      assertEquals(
          "expect equals grandTotal ",
          o.get("grandTotal").getAsBigDecimal(),
          result.get(i).getGrandTotal());
      assertEquals(
          "expect equals shippingAmount ",
          o.get("shippingAmount").getAsBigDecimal(),
          result.get(i).getShippingAmount());
      assertEquals(
          "expect equals shippingCanceled ",
          o.get("shippingCanceled").getAsBigDecimal(),
          result.get(i).getShippingCanceled());
      assertEquals(
          "expect equals shippingInvoiced ",
          o.get("shippingInvoiced").getAsBigDecimal(),
          result.get(i).getShippingInvoiced());
      assertEquals(
          "expect equals shippingRefunded ",
          o.get("shippingRefunded").getAsBigDecimal(),
          result.get(i).getShippingRefunded());
      assertEquals(
          "expect equals shippingTaxAmount ",
          o.get("shippingTaxAmount").getAsBigDecimal(),
          result.get(i).getShippingTaxAmount());
      assertEquals(
          "expect equals shippingTaxRefunded ",
          o.get("shippingTaxRefunded").getAsBigDecimal(),
          result.get(i).getShippingTaxRefunded());
      assertEquals(
          "expect equals storeToBaseRate ",
          o.get("storeToBaseRate").getAsBigDecimal(),
          result.get(i).getStoreToBaseRate());
      assertEquals(
          "expect equals storeToOrderRate ",
          o.get("storeToOrderRate").getAsBigDecimal(),
          result.get(i).getStoreToOrderRate());
      assertEquals(
          "expect equals subtotal ",
          o.get("subtotal").getAsBigDecimal(),
          result.get(i).getSubtotal());
      assertEquals(
          "expect equals subtotalCanceled ",
          o.get("subtotalCanceled").getAsBigDecimal(),
          result.get(i).getSubtotalCanceled());
      assertEquals(
          "expect equals subtotalInvoiced ",
          o.get("subtotalInvoiced").getAsBigDecimal(),
          result.get(i).getSubtotalInvoiced());
      assertEquals(
          "expect equals subtotalRefunded ",
          o.get("subtotalRefunded").getAsBigDecimal(),
          result.get(i).getSubtotalRefunded());
      assertEquals(
          "expect equals taxAmount ",
          o.get("taxAmount").getAsBigDecimal(),
          result.get(i).getTaxAmount());
      assertEquals(
          "expect equals taxCanceled ",
          o.get("taxCanceled").getAsBigDecimal(),
          result.get(i).getTaxCanceled());
      assertEquals(
          "expect equals taxInvoiced ",
          o.get("taxInvoiced").getAsBigDecimal(),
          result.get(i).getTaxInvoiced());
      assertEquals(
          "expect equals taxRefunded ",
          o.get("taxRefunded").getAsBigDecimal(),
          result.get(i).getTaxRefunded());
      assertEquals(
          "expect equals totalCanceled ",
          o.get("totalCanceled").getAsBigDecimal(),
          result.get(i).getTotalCanceled());
      assertEquals(
          "expect equals totalInvoiced ",
          o.get("totalInvoiced").getAsBigDecimal(),
          result.get(i).getTotalInvoiced());
      assertEquals(
          "expect equals totalOfflineRefunded ",
          o.get("totalOfflineRefunded").getAsBigDecimal(),
          result.get(i).getTotalOfflineRefunded());
      assertEquals(
          "expect equals totalOnlineRefunded ",
          o.get("totalOnlineRefunded").getAsBigDecimal(),
          result.get(i).getTotalOnlineRefunded());
      assertEquals(
          "expect equals totalPaid ",
          o.get("totalPaid").getAsBigDecimal(),
          result.get(i).getTotalPaid());
      assertEquals(
          "expect equals totalQtyOrdered ",
          o.get("totalQtyOrdered").getAsBigDecimal(),
          result.get(i).getTotalQtyOrdered());
      assertEquals(
          "expect equals totalRefunded ",
          o.get("totalRefunded").getAsBigDecimal(),
          result.get(i).getTotalRefunded());
      assertEquals(
          "expect equals canShipPartially ",
          o.get("canShipPartially").getAsInt(),
          result.get(i).getCanShipPartially(),
          0.0001);
      assertEquals(
          "expect equals canShipPartiallyItem ",
          o.get("canShipPartiallyItem").getAsInt(),
          result.get(i).getCanShipPartiallyItem(),
          0.0001);
      assertEquals(
          "expect equals customerIsGuest ",
          o.get("customerIsGuest").getAsInt(),
          result.get(i).getCustomerIsGuest(),
          0.0001);
      assertEquals(
          "expect equals customerNoteNotify ",
          o.get("customerNoteNotify").getAsInt(),
          result.get(i).getCustomerNoteNotify(),
          0.0001);
      assertEquals(
          "expect equals billingAddressId ",
          o.get("billingAddressId").getAsInt(),
          result.get(i).getBillingAddressId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals editIncrement ",
          o.get("editIncrement").getAsInt(),
          result.get(i).getEditIncrement(),
          0.0001);
      assertEquals(
          "expect equals emailSent ",
          o.get("emailSent").getAsInt(),
          result.get(i).getEmailSent(),
          0.0001);
      assertEquals(
          "expect equals sendEmail ",
          o.get("sendEmail").getAsInt(),
          result.get(i).getSendEmail(),
          0.0001);
      assertEquals(
          "expect equals forcedShipmentWithInvoice ",
          o.get("forcedShipmentWithInvoice").getAsInt(),
          result.get(i).getForcedShipmentWithInvoice(),
          0.0001);
      assertEquals(
          "expect equals paymentAuthExpiration ",
          o.get("paymentAuthExpiration").getAsInt(),
          result.get(i).getPaymentAuthExpiration(),
          0.0001);
      assertEquals(
          "expect equals quoteAddressId ",
          o.get("quoteAddressId").getAsInt(),
          result.get(i).getQuoteAddressId(),
          0.0001);
      assertEquals(
          "expect equals quoteId ",
          o.get("quoteId").getAsInt(),
          result.get(i).getQuoteId(),
          0.0001);
      assertEquals(
          "expect equals shippingAddressId ",
          o.get("shippingAddressId").getAsInt(),
          result.get(i).getShippingAddressId(),
          0.0001);
      assertEquals(
          "expect equals adjustmentNegative ",
          o.get("adjustmentNegative").getAsBigDecimal(),
          result.get(i).getAdjustmentNegative());
      assertEquals(
          "expect equals adjustmentPositive ",
          o.get("adjustmentPositive").getAsBigDecimal(),
          result.get(i).getAdjustmentPositive());
      assertEquals(
          "expect equals baseAdjustmentNegative ",
          o.get("baseAdjustmentNegative").getAsBigDecimal(),
          result.get(i).getBaseAdjustmentNegative());
      assertEquals(
          "expect equals baseAdjustmentPositive ",
          o.get("baseAdjustmentPositive").getAsBigDecimal(),
          result.get(i).getBaseAdjustmentPositive());
      assertEquals(
          "expect equals baseShippingDiscountAmount ",
          o.get("baseShippingDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingDiscountAmount());
      assertEquals(
          "expect equals baseSubtotalInclTax ",
          o.get("baseSubtotalInclTax").getAsBigDecimal(),
          result.get(i).getBaseSubtotalInclTax());
      assertEquals(
          "expect equals baseTotalDue ",
          o.get("baseTotalDue").getAsBigDecimal(),
          result.get(i).getBaseTotalDue());
      assertEquals(
          "expect equals paymentAuthorizationAmount ",
          o.get("paymentAuthorizationAmount").getAsBigDecimal(),
          result.get(i).getPaymentAuthorizationAmount());
      assertEquals(
          "expect equals shippingDiscountAmount ",
          o.get("shippingDiscountAmount").getAsBigDecimal(),
          result.get(i).getShippingDiscountAmount());
      assertEquals(
          "expect equals subtotalInclTax ",
          o.get("subtotalInclTax").getAsBigDecimal(),
          result.get(i).getSubtotalInclTax());
      assertEquals(
          "expect equals totalDue ",
          o.get("totalDue").getAsBigDecimal(),
          result.get(i).getTotalDue());
      assertEquals(
          "expect equals weight ", o.get("weight").getAsBigDecimal(), result.get(i).getWeight());
      assertEquals(
          "expect equals appliedRuleIds ",
          o.get("appliedRuleIds").getAsString(),
          result.get(i).getAppliedRuleIds());
      assertEquals(
          "expect equals baseCurrencyCode ",
          o.get("baseCurrencyCode").getAsString(),
          result.get(i).getBaseCurrencyCode());
      assertEquals(
          "expect equals customerEmail ",
          o.get("customerEmail").getAsString(),
          result.get(i).getCustomerEmail());
      assertEquals(
          "expect equals customerFirstname ",
          o.get("customerFirstname").getAsString(),
          result.get(i).getCustomerFirstname());
      assertEquals(
          "expect equals customerLastname ",
          o.get("customerLastname").getAsString(),
          result.get(i).getCustomerLastname());
      assertEquals(
          "expect equals customerMiddlename ",
          o.get("customerMiddlename").getAsString(),
          result.get(i).getCustomerMiddlename());
      assertEquals(
          "expect equals customerPrefix ",
          o.get("customerPrefix").getAsString(),
          result.get(i).getCustomerPrefix());
      assertEquals(
          "expect equals customerSuffix ",
          o.get("customerSuffix").getAsString(),
          result.get(i).getCustomerSuffix());
      assertEquals(
          "expect equals customerTaxvat ",
          o.get("customerTaxvat").getAsString(),
          result.get(i).getCustomerTaxvat());
      assertEquals(
          "expect equals discountDescription ",
          o.get("discountDescription").getAsString(),
          result.get(i).getDiscountDescription());
      assertEquals(
          "expect equals extCustomerId ",
          o.get("extCustomerId").getAsString(),
          result.get(i).getExtCustomerId());
      assertEquals(
          "expect equals extOrderId ",
          o.get("extOrderId").getAsString(),
          result.get(i).getExtOrderId());
      assertEquals(
          "expect equals globalCurrencyCode ",
          o.get("globalCurrencyCode").getAsString(),
          result.get(i).getGlobalCurrencyCode());
      assertEquals(
          "expect equals holdBeforeState ",
          o.get("holdBeforeState").getAsString(),
          result.get(i).getHoldBeforeState());
      assertEquals(
          "expect equals holdBeforeStatus ",
          o.get("holdBeforeStatus").getAsString(),
          result.get(i).getHoldBeforeStatus());
      assertEquals(
          "expect equals orderCurrencyCode ",
          o.get("orderCurrencyCode").getAsString(),
          result.get(i).getOrderCurrencyCode());
      assertEquals(
          "expect equals originalIncrementId ",
          o.get("originalIncrementId").getAsString(),
          result.get(i).getOriginalIncrementId());
      assertEquals(
          "expect equals relationChildId ",
          o.get("relationChildId").getAsString(),
          result.get(i).getRelationChildId());
      assertEquals(
          "expect equals relationChildRealId ",
          o.get("relationChildRealId").getAsString(),
          result.get(i).getRelationChildRealId());
      assertEquals(
          "expect equals relationParentId ",
          o.get("relationParentId").getAsString(),
          result.get(i).getRelationParentId());
      assertEquals(
          "expect equals relationParentRealId ",
          o.get("relationParentRealId").getAsString(),
          result.get(i).getRelationParentRealId());
      assertEquals(
          "expect equals remoteIp ", o.get("remoteIp").getAsString(), result.get(i).getRemoteIp());
      assertEquals(
          "expect equals shippingMethod ",
          o.get("shippingMethod").getAsString(),
          result.get(i).getShippingMethod());
      assertEquals(
          "expect equals storeCurrencyCode ",
          o.get("storeCurrencyCode").getAsString(),
          result.get(i).getStoreCurrencyCode());
      assertEquals(
          "expect equals storeName ",
          o.get("storeName").getAsString(),
          result.get(i).getStoreName());
      assertEquals(
          "expect equals xForwardedFor ",
          o.get("xForwardedFor").getAsString(),
          result.get(i).getXForwardedFor());
      assertEquals(
          "expect equals customerNote ",
          o.get("customerNote").getAsString(),
          result.get(i).getCustomerNote());
      assertEquals(
          "expect equals totalItemCount ",
          o.get("totalItemCount").getAsInt(),
          result.get(i).getTotalItemCount(),
          0.0001);
      assertEquals(
          "expect equals customerGender ",
          o.get("customerGender").getAsInt(),
          result.get(i).getCustomerGender(),
          0.0001);
      assertEquals(
          "expect equals discountTaxCompensationAmount ",
          o.get("discountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseDiscountTaxCompensationAmount ",
          o.get("baseDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals shippingDiscountTaxCompensationAmount ",
          o.get("shippingDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getShippingDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseShippingDiscountTaxCompensationAmnt ",
          o.get("baseShippingDiscountTaxCompensationAmnt").getAsBigDecimal(),
          result.get(i).getBaseShippingDiscountTaxCompensationAmnt());
      assertEquals(
          "expect equals discountTaxCompensationInvoiced ",
          o.get("discountTaxCompensationInvoiced").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationInvoiced());
      assertEquals(
          "expect equals baseDiscountTaxCompensationInvoiced ",
          o.get("baseDiscountTaxCompensationInvoiced").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationInvoiced());
      assertEquals(
          "expect equals discountTaxCompensationRefunded ",
          o.get("discountTaxCompensationRefunded").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationRefunded());
      assertEquals(
          "expect equals baseDiscountTaxCompensationRefunded ",
          o.get("baseDiscountTaxCompensationRefunded").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationRefunded());
      assertEquals(
          "expect equals shippingInclTax ",
          o.get("shippingInclTax").getAsBigDecimal(),
          result.get(i).getShippingInclTax());
      assertEquals(
          "expect equals baseShippingInclTax ",
          o.get("baseShippingInclTax").getAsBigDecimal(),
          result.get(i).getBaseShippingInclTax());
      assertEquals(
          "expect equals couponRuleName ",
          o.get("couponRuleName").getAsString(),
          result.get(i).getCouponRuleName());
      assertEquals(
          "expect equals giftMessageId ",
          o.get("giftMessageId").getAsInt(),
          result.get(i).getGiftMessageId(),
          0.0001);
      assertEquals(
          "expect equals paypalIpnCustomerNotified ",
          o.get("paypalIpnCustomerNotified").getAsInt(),
          result.get(i).getPaypalIpnCustomerNotified(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderAddress() throws IOException {
    final String inputFile = "SalesOrderAddress.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderAddress> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderAddress(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals customerAddressId ",
          o.get("customerAddressId").getAsInt(),
          result.get(i).getCustomerAddressId(),
          0.0001);
      assertEquals(
          "expect equals quoteAddressId ",
          o.get("quoteAddressId").getAsInt(),
          result.get(i).getQuoteAddressId(),
          0.0001);
      assertEquals(
          "expect equals regionId ",
          o.get("regionId").getAsInt(),
          result.get(i).getRegionId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals("expect equals fax ", o.get("fax").getAsString(), result.get(i).getFax());
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals(
          "expect equals lastname ", o.get("lastname").getAsString(), result.get(i).getLastname());
      assertEquals(
          "expect equals street ", o.get("street").getAsString(), result.get(i).getStreet());
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals("expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
      assertEquals(
          "expect equals telephone ",
          o.get("telephone").getAsString(),
          result.get(i).getTelephone());
      assertEquals(
          "expect equals countryId ",
          o.get("countryId").getAsString(),
          result.get(i).getCountryId());
      assertEquals(
          "expect equals firstname ",
          o.get("firstname").getAsString(),
          result.get(i).getFirstname());
      assertEquals(
          "expect equals addressType ",
          o.get("addressType").getAsString(),
          result.get(i).getAddressType());
      assertEquals(
          "expect equals prefix ", o.get("prefix").getAsString(), result.get(i).getPrefix());
      assertEquals(
          "expect equals middlename ",
          o.get("middlename").getAsString(),
          result.get(i).getMiddlename());
      assertEquals(
          "expect equals suffix ", o.get("suffix").getAsString(), result.get(i).getSuffix());
      assertEquals(
          "expect equals company ", o.get("company").getAsString(), result.get(i).getCompany());
      assertEquals("expect equals vatId ", o.get("vatId").getAsString(), result.get(i).getVatId());
      assertEquals(
          "expect equals vatIsValid ",
          o.get("vatIsValid").getAsInt(),
          result.get(i).getVatIsValid(),
          0.0001);
      assertEquals(
          "expect equals vatRequestId ",
          o.get("vatRequestId").getAsString(),
          result.get(i).getVatRequestId());
      assertEquals(
          "expect equals vatRequestDate ",
          o.get("vatRequestDate").getAsString(),
          result.get(i).getVatRequestDate());
      assertEquals(
          "expect equals vatRequestSuccess ",
          o.get("vatRequestSuccess").getAsInt(),
          result.get(i).getVatRequestSuccess(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderAggregatedCreated() throws IOException {
    final String inputFile = "SalesOrderAggregatedCreated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderAggregatedCreated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderAggregatedCreated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals totalQtyOrdered ",
          o.get("totalQtyOrdered").getAsBigDecimal(),
          result.get(i).getTotalQtyOrdered());
      assertEquals(
          "expect equals totalQtyInvoiced ",
          o.get("totalQtyInvoiced").getAsBigDecimal(),
          result.get(i).getTotalQtyInvoiced());
      assertEquals(
          "expect equals totalIncomeAmount ",
          o.get("totalIncomeAmount").getAsBigDecimal(),
          result.get(i).getTotalIncomeAmount());
      assertEquals(
          "expect equals totalRevenueAmount ",
          o.get("totalRevenueAmount").getAsBigDecimal(),
          result.get(i).getTotalRevenueAmount());
      assertEquals(
          "expect equals totalProfitAmount ",
          o.get("totalProfitAmount").getAsBigDecimal(),
          result.get(i).getTotalProfitAmount());
      assertEquals(
          "expect equals totalInvoicedAmount ",
          o.get("totalInvoicedAmount").getAsBigDecimal(),
          result.get(i).getTotalInvoicedAmount());
      assertEquals(
          "expect equals totalCanceledAmount ",
          o.get("totalCanceledAmount").getAsBigDecimal(),
          result.get(i).getTotalCanceledAmount());
      assertEquals(
          "expect equals totalPaidAmount ",
          o.get("totalPaidAmount").getAsBigDecimal(),
          result.get(i).getTotalPaidAmount());
      assertEquals(
          "expect equals totalRefundedAmount ",
          o.get("totalRefundedAmount").getAsBigDecimal(),
          result.get(i).getTotalRefundedAmount());
      assertEquals(
          "expect equals totalTaxAmount ",
          o.get("totalTaxAmount").getAsBigDecimal(),
          result.get(i).getTotalTaxAmount());
      assertEquals(
          "expect equals totalTaxAmountActual ",
          o.get("totalTaxAmountActual").getAsBigDecimal(),
          result.get(i).getTotalTaxAmountActual());
      assertEquals(
          "expect equals totalShippingAmount ",
          o.get("totalShippingAmount").getAsBigDecimal(),
          result.get(i).getTotalShippingAmount());
      assertEquals(
          "expect equals totalShippingAmountActual ",
          o.get("totalShippingAmountActual").getAsBigDecimal(),
          result.get(i).getTotalShippingAmountActual());
      assertEquals(
          "expect equals totalDiscountAmount ",
          o.get("totalDiscountAmount").getAsBigDecimal(),
          result.get(i).getTotalDiscountAmount());
      assertEquals(
          "expect equals totalDiscountAmountActual ",
          o.get("totalDiscountAmountActual").getAsBigDecimal(),
          result.get(i).getTotalDiscountAmountActual());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderAggregatedUpdated() throws IOException {
    final String inputFile = "SalesOrderAggregatedUpdated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderAggregatedUpdated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderAggregatedUpdated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals totalQtyOrdered ",
          o.get("totalQtyOrdered").getAsBigDecimal(),
          result.get(i).getTotalQtyOrdered());
      assertEquals(
          "expect equals totalQtyInvoiced ",
          o.get("totalQtyInvoiced").getAsBigDecimal(),
          result.get(i).getTotalQtyInvoiced());
      assertEquals(
          "expect equals totalIncomeAmount ",
          o.get("totalIncomeAmount").getAsBigDecimal(),
          result.get(i).getTotalIncomeAmount());
      assertEquals(
          "expect equals totalRevenueAmount ",
          o.get("totalRevenueAmount").getAsBigDecimal(),
          result.get(i).getTotalRevenueAmount());
      assertEquals(
          "expect equals totalProfitAmount ",
          o.get("totalProfitAmount").getAsBigDecimal(),
          result.get(i).getTotalProfitAmount());
      assertEquals(
          "expect equals totalInvoicedAmount ",
          o.get("totalInvoicedAmount").getAsBigDecimal(),
          result.get(i).getTotalInvoicedAmount());
      assertEquals(
          "expect equals totalCanceledAmount ",
          o.get("totalCanceledAmount").getAsBigDecimal(),
          result.get(i).getTotalCanceledAmount());
      assertEquals(
          "expect equals totalPaidAmount ",
          o.get("totalPaidAmount").getAsBigDecimal(),
          result.get(i).getTotalPaidAmount());
      assertEquals(
          "expect equals totalRefundedAmount ",
          o.get("totalRefundedAmount").getAsBigDecimal(),
          result.get(i).getTotalRefundedAmount());
      assertEquals(
          "expect equals totalTaxAmount ",
          o.get("totalTaxAmount").getAsBigDecimal(),
          result.get(i).getTotalTaxAmount());
      assertEquals(
          "expect equals totalTaxAmountActual ",
          o.get("totalTaxAmountActual").getAsBigDecimal(),
          result.get(i).getTotalTaxAmountActual());
      assertEquals(
          "expect equals totalShippingAmount ",
          o.get("totalShippingAmount").getAsBigDecimal(),
          result.get(i).getTotalShippingAmount());
      assertEquals(
          "expect equals totalShippingAmountActual ",
          o.get("totalShippingAmountActual").getAsBigDecimal(),
          result.get(i).getTotalShippingAmountActual());
      assertEquals(
          "expect equals totalDiscountAmount ",
          o.get("totalDiscountAmount").getAsBigDecimal(),
          result.get(i).getTotalDiscountAmount());
      assertEquals(
          "expect equals totalDiscountAmountActual ",
          o.get("totalDiscountAmountActual").getAsBigDecimal(),
          result.get(i).getTotalDiscountAmountActual());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderGrid() throws IOException {
    final String inputFile = "SalesOrderGrid.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderGrid> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderGrid(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals storeName ",
          o.get("storeName").getAsString(),
          result.get(i).getStoreName());
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals baseGrandTotal ",
          o.get("baseGrandTotal").getAsBigDecimal(),
          result.get(i).getBaseGrandTotal());
      assertEquals(
          "expect equals baseTotalPaid ",
          o.get("baseTotalPaid").getAsBigDecimal(),
          result.get(i).getBaseTotalPaid());
      assertEquals(
          "expect equals grandTotal ",
          o.get("grandTotal").getAsBigDecimal(),
          result.get(i).getGrandTotal());
      assertEquals(
          "expect equals totalPaid ",
          o.get("totalPaid").getAsBigDecimal(),
          result.get(i).getTotalPaid());
      assertEquals(
          "expect equals baseCurrencyCode ",
          o.get("baseCurrencyCode").getAsString(),
          result.get(i).getBaseCurrencyCode());
      assertEquals(
          "expect equals orderCurrencyCode ",
          o.get("orderCurrencyCode").getAsString(),
          result.get(i).getOrderCurrencyCode());
      assertEquals(
          "expect equals shippingName ",
          o.get("shippingName").getAsString(),
          result.get(i).getShippingName());
      assertEquals(
          "expect equals billingName ",
          o.get("billingName").getAsString(),
          result.get(i).getBillingName());
      assertEquals(
          "expect equals billingAddress ",
          o.get("billingAddress").getAsString(),
          result.get(i).getBillingAddress());
      assertEquals(
          "expect equals shippingAddress ",
          o.get("shippingAddress").getAsString(),
          result.get(i).getShippingAddress());
      assertEquals(
          "expect equals shippingInformation ",
          o.get("shippingInformation").getAsString(),
          result.get(i).getShippingInformation());
      assertEquals(
          "expect equals customerEmail ",
          o.get("customerEmail").getAsString(),
          result.get(i).getCustomerEmail());
      assertEquals(
          "expect equals customerGroup ",
          o.get("customerGroup").getAsString(),
          result.get(i).getCustomerGroup());
      assertEquals(
          "expect equals subtotal ",
          o.get("subtotal").getAsBigDecimal(),
          result.get(i).getSubtotal());
      assertEquals(
          "expect equals shippingAndHandling ",
          o.get("shippingAndHandling").getAsBigDecimal(),
          result.get(i).getShippingAndHandling());
      assertEquals(
          "expect equals customerName ",
          o.get("customerName").getAsString(),
          result.get(i).getCustomerName());
      assertEquals(
          "expect equals paymentMethod ",
          o.get("paymentMethod").getAsString(),
          result.get(i).getPaymentMethod());
      assertEquals(
          "expect equals totalRefunded ",
          o.get("totalRefunded").getAsBigDecimal(),
          result.get(i).getTotalRefunded());
      assertEquals(
          "expect equals signifydGuaranteeStatus ",
          o.get("signifydGuaranteeStatus").getAsString(),
          result.get(i).getSignifydGuaranteeStatus());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderItem() throws IOException {
    final String inputFile = "SalesOrderItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals parentItemId ",
          o.get("parentItemId").getAsInt(),
          result.get(i).getParentItemId(),
          0.0001);
      assertEquals(
          "expect equals quoteItemId ",
          o.get("quoteItemId").getAsInt(),
          result.get(i).getQuoteItemId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals productType ",
          o.get("productType").getAsString(),
          result.get(i).getProductType());
      assertEquals(
          "expect equals productOptions ",
          o.get("productOptions").getAsString(),
          result.get(i).getProductOptions());
      assertEquals(
          "expect equals weight ", o.get("weight").getAsBigDecimal(), result.get(i).getWeight());
      assertEquals(
          "expect equals isVirtual ",
          o.get("isVirtual").getAsInt(),
          result.get(i).getIsVirtual(),
          0.0001);
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals appliedRuleIds ",
          o.get("appliedRuleIds").getAsString(),
          result.get(i).getAppliedRuleIds());
      assertEquals(
          "expect equals additionalData ",
          o.get("additionalData").getAsString(),
          result.get(i).getAdditionalData());
      assertEquals(
          "expect equals isQtyDecimal ",
          o.get("isQtyDecimal").getAsInt(),
          result.get(i).getIsQtyDecimal(),
          0.0001);
      assertEquals(
          "expect equals noDiscount ",
          o.get("noDiscount").getAsInt(),
          result.get(i).getNoDiscount(),
          0.0001);
      assertEquals(
          "expect equals qtyBackordered ",
          o.get("qtyBackordered").getAsBigDecimal(),
          result.get(i).getQtyBackordered());
      assertEquals(
          "expect equals qtyCanceled ",
          o.get("qtyCanceled").getAsBigDecimal(),
          result.get(i).getQtyCanceled());
      assertEquals(
          "expect equals qtyInvoiced ",
          o.get("qtyInvoiced").getAsBigDecimal(),
          result.get(i).getQtyInvoiced());
      assertEquals(
          "expect equals qtyOrdered ",
          o.get("qtyOrdered").getAsBigDecimal(),
          result.get(i).getQtyOrdered());
      assertEquals(
          "expect equals qtyRefunded ",
          o.get("qtyRefunded").getAsBigDecimal(),
          result.get(i).getQtyRefunded());
      assertEquals(
          "expect equals qtyShipped ",
          o.get("qtyShipped").getAsBigDecimal(),
          result.get(i).getQtyShipped());
      assertEquals(
          "expect equals baseCost ",
          o.get("baseCost").getAsBigDecimal(),
          result.get(i).getBaseCost());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals basePrice ",
          o.get("basePrice").getAsBigDecimal(),
          result.get(i).getBasePrice());
      assertEquals(
          "expect equals originalPrice ",
          o.get("originalPrice").getAsBigDecimal(),
          result.get(i).getOriginalPrice());
      assertEquals(
          "expect equals baseOriginalPrice ",
          o.get("baseOriginalPrice").getAsBigDecimal(),
          result.get(i).getBaseOriginalPrice());
      assertEquals(
          "expect equals taxPercent ",
          o.get("taxPercent").getAsBigDecimal(),
          result.get(i).getTaxPercent());
      assertEquals(
          "expect equals taxAmount ",
          o.get("taxAmount").getAsBigDecimal(),
          result.get(i).getTaxAmount());
      assertEquals(
          "expect equals baseTaxAmount ",
          o.get("baseTaxAmount").getAsBigDecimal(),
          result.get(i).getBaseTaxAmount());
      assertEquals(
          "expect equals taxInvoiced ",
          o.get("taxInvoiced").getAsBigDecimal(),
          result.get(i).getTaxInvoiced());
      assertEquals(
          "expect equals baseTaxInvoiced ",
          o.get("baseTaxInvoiced").getAsBigDecimal(),
          result.get(i).getBaseTaxInvoiced());
      assertEquals(
          "expect equals discountPercent ",
          o.get("discountPercent").getAsBigDecimal(),
          result.get(i).getDiscountPercent());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals baseDiscountAmount ",
          o.get("baseDiscountAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountAmount());
      assertEquals(
          "expect equals discountInvoiced ",
          o.get("discountInvoiced").getAsBigDecimal(),
          result.get(i).getDiscountInvoiced());
      assertEquals(
          "expect equals baseDiscountInvoiced ",
          o.get("baseDiscountInvoiced").getAsBigDecimal(),
          result.get(i).getBaseDiscountInvoiced());
      assertEquals(
          "expect equals amountRefunded ",
          o.get("amountRefunded").getAsBigDecimal(),
          result.get(i).getAmountRefunded());
      assertEquals(
          "expect equals baseAmountRefunded ",
          o.get("baseAmountRefunded").getAsBigDecimal(),
          result.get(i).getBaseAmountRefunded());
      assertEquals(
          "expect equals rowTotal ",
          o.get("rowTotal").getAsBigDecimal(),
          result.get(i).getRowTotal());
      assertEquals(
          "expect equals baseRowTotal ",
          o.get("baseRowTotal").getAsBigDecimal(),
          result.get(i).getBaseRowTotal());
      assertEquals(
          "expect equals rowInvoiced ",
          o.get("rowInvoiced").getAsBigDecimal(),
          result.get(i).getRowInvoiced());
      assertEquals(
          "expect equals baseRowInvoiced ",
          o.get("baseRowInvoiced").getAsBigDecimal(),
          result.get(i).getBaseRowInvoiced());
      assertEquals(
          "expect equals rowWeight ",
          o.get("rowWeight").getAsBigDecimal(),
          result.get(i).getRowWeight());
      assertEquals(
          "expect equals baseTaxBeforeDiscount ",
          o.get("baseTaxBeforeDiscount").getAsBigDecimal(),
          result.get(i).getBaseTaxBeforeDiscount());
      assertEquals(
          "expect equals taxBeforeDiscount ",
          o.get("taxBeforeDiscount").getAsBigDecimal(),
          result.get(i).getTaxBeforeDiscount());
      assertEquals(
          "expect equals extOrderItemId ",
          o.get("extOrderItemId").getAsString(),
          result.get(i).getExtOrderItemId());
      assertEquals(
          "expect equals lockedDoInvoice ",
          o.get("lockedDoInvoice").getAsInt(),
          result.get(i).getLockedDoInvoice(),
          0.0001);
      assertEquals(
          "expect equals lockedDoShip ",
          o.get("lockedDoShip").getAsInt(),
          result.get(i).getLockedDoShip(),
          0.0001);
      assertEquals(
          "expect equals priceInclTax ",
          o.get("priceInclTax").getAsBigDecimal(),
          result.get(i).getPriceInclTax());
      assertEquals(
          "expect equals basePriceInclTax ",
          o.get("basePriceInclTax").getAsBigDecimal(),
          result.get(i).getBasePriceInclTax());
      assertEquals(
          "expect equals rowTotalInclTax ",
          o.get("rowTotalInclTax").getAsBigDecimal(),
          result.get(i).getRowTotalInclTax());
      assertEquals(
          "expect equals baseRowTotalInclTax ",
          o.get("baseRowTotalInclTax").getAsBigDecimal(),
          result.get(i).getBaseRowTotalInclTax());
      assertEquals(
          "expect equals discountTaxCompensationAmount ",
          o.get("discountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals baseDiscountTaxCompensationAmount ",
          o.get("baseDiscountTaxCompensationAmount").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationAmount());
      assertEquals(
          "expect equals discountTaxCompensationInvoiced ",
          o.get("discountTaxCompensationInvoiced").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationInvoiced());
      assertEquals(
          "expect equals baseDiscountTaxCompensationInvoiced ",
          o.get("baseDiscountTaxCompensationInvoiced").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationInvoiced());
      assertEquals(
          "expect equals discountTaxCompensationRefunded ",
          o.get("discountTaxCompensationRefunded").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationRefunded());
      assertEquals(
          "expect equals baseDiscountTaxCompensationRefunded ",
          o.get("baseDiscountTaxCompensationRefunded").getAsBigDecimal(),
          result.get(i).getBaseDiscountTaxCompensationRefunded());
      assertEquals(
          "expect equals taxCanceled ",
          o.get("taxCanceled").getAsBigDecimal(),
          result.get(i).getTaxCanceled());
      assertEquals(
          "expect equals discountTaxCompensationCanceled ",
          o.get("discountTaxCompensationCanceled").getAsBigDecimal(),
          result.get(i).getDiscountTaxCompensationCanceled());
      assertEquals(
          "expect equals taxRefunded ",
          o.get("taxRefunded").getAsBigDecimal(),
          result.get(i).getTaxRefunded());
      assertEquals(
          "expect equals baseTaxRefunded ",
          o.get("baseTaxRefunded").getAsBigDecimal(),
          result.get(i).getBaseTaxRefunded());
      assertEquals(
          "expect equals discountRefunded ",
          o.get("discountRefunded").getAsBigDecimal(),
          result.get(i).getDiscountRefunded());
      assertEquals(
          "expect equals baseDiscountRefunded ",
          o.get("baseDiscountRefunded").getAsBigDecimal(),
          result.get(i).getBaseDiscountRefunded());
      assertEquals(
          "expect equals giftMessageId ",
          o.get("giftMessageId").getAsInt(),
          result.get(i).getGiftMessageId(),
          0.0001);
      assertEquals(
          "expect equals giftMessageAvailable ",
          o.get("giftMessageAvailable").getAsInt(),
          result.get(i).getGiftMessageAvailable(),
          0.0001);
      assertEquals(
          "expect equals freeShipping ",
          o.get("freeShipping").getAsInt(),
          result.get(i).getFreeShipping(),
          0.0001);
      assertEquals(
          "expect equals weeeTaxApplied ",
          o.get("weeeTaxApplied").getAsString(),
          result.get(i).getWeeeTaxApplied());
      assertEquals(
          "expect equals weeeTaxAppliedAmount ",
          o.get("weeeTaxAppliedAmount").getAsBigDecimal(),
          result.get(i).getWeeeTaxAppliedAmount());
      assertEquals(
          "expect equals weeeTaxAppliedRowAmount ",
          o.get("weeeTaxAppliedRowAmount").getAsBigDecimal(),
          result.get(i).getWeeeTaxAppliedRowAmount());
      assertEquals(
          "expect equals weeeTaxDisposition ",
          o.get("weeeTaxDisposition").getAsBigDecimal(),
          result.get(i).getWeeeTaxDisposition());
      assertEquals(
          "expect equals weeeTaxRowDisposition ",
          o.get("weeeTaxRowDisposition").getAsBigDecimal(),
          result.get(i).getWeeeTaxRowDisposition());
      assertEquals(
          "expect equals baseWeeeTaxAppliedAmount ",
          o.get("baseWeeeTaxAppliedAmount").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxAppliedAmount());
      assertEquals(
          "expect equals baseWeeeTaxAppliedRowAmnt ",
          o.get("baseWeeeTaxAppliedRowAmnt").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxAppliedRowAmnt());
      assertEquals(
          "expect equals baseWeeeTaxDisposition ",
          o.get("baseWeeeTaxDisposition").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxDisposition());
      assertEquals(
          "expect equals baseWeeeTaxRowDisposition ",
          o.get("baseWeeeTaxRowDisposition").getAsBigDecimal(),
          result.get(i).getBaseWeeeTaxRowDisposition());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderPayment() throws IOException {
    final String inputFile = "SalesOrderPayment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderPayment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderPayment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals baseShippingCaptured ",
          o.get("baseShippingCaptured").getAsBigDecimal(),
          result.get(i).getBaseShippingCaptured());
      assertEquals(
          "expect equals shippingCaptured ",
          o.get("shippingCaptured").getAsBigDecimal(),
          result.get(i).getShippingCaptured());
      assertEquals(
          "expect equals amountRefunded ",
          o.get("amountRefunded").getAsBigDecimal(),
          result.get(i).getAmountRefunded());
      assertEquals(
          "expect equals baseAmountPaid ",
          o.get("baseAmountPaid").getAsBigDecimal(),
          result.get(i).getBaseAmountPaid());
      assertEquals(
          "expect equals amountCanceled ",
          o.get("amountCanceled").getAsBigDecimal(),
          result.get(i).getAmountCanceled());
      assertEquals(
          "expect equals baseAmountAuthorized ",
          o.get("baseAmountAuthorized").getAsBigDecimal(),
          result.get(i).getBaseAmountAuthorized());
      assertEquals(
          "expect equals baseAmountPaidOnline ",
          o.get("baseAmountPaidOnline").getAsBigDecimal(),
          result.get(i).getBaseAmountPaidOnline());
      assertEquals(
          "expect equals baseAmountRefundedOnline ",
          o.get("baseAmountRefundedOnline").getAsBigDecimal(),
          result.get(i).getBaseAmountRefundedOnline());
      assertEquals(
          "expect equals baseShippingAmount ",
          o.get("baseShippingAmount").getAsBigDecimal(),
          result.get(i).getBaseShippingAmount());
      assertEquals(
          "expect equals shippingAmount ",
          o.get("shippingAmount").getAsBigDecimal(),
          result.get(i).getShippingAmount());
      assertEquals(
          "expect equals amountPaid ",
          o.get("amountPaid").getAsBigDecimal(),
          result.get(i).getAmountPaid());
      assertEquals(
          "expect equals amountAuthorized ",
          o.get("amountAuthorized").getAsBigDecimal(),
          result.get(i).getAmountAuthorized());
      assertEquals(
          "expect equals baseAmountOrdered ",
          o.get("baseAmountOrdered").getAsBigDecimal(),
          result.get(i).getBaseAmountOrdered());
      assertEquals(
          "expect equals baseShippingRefunded ",
          o.get("baseShippingRefunded").getAsBigDecimal(),
          result.get(i).getBaseShippingRefunded());
      assertEquals(
          "expect equals shippingRefunded ",
          o.get("shippingRefunded").getAsBigDecimal(),
          result.get(i).getShippingRefunded());
      assertEquals(
          "expect equals baseAmountRefunded ",
          o.get("baseAmountRefunded").getAsBigDecimal(),
          result.get(i).getBaseAmountRefunded());
      assertEquals(
          "expect equals amountOrdered ",
          o.get("amountOrdered").getAsBigDecimal(),
          result.get(i).getAmountOrdered());
      assertEquals(
          "expect equals baseAmountCanceled ",
          o.get("baseAmountCanceled").getAsBigDecimal(),
          result.get(i).getBaseAmountCanceled());
      assertEquals(
          "expect equals quotePaymentId ",
          o.get("quotePaymentId").getAsInt(),
          result.get(i).getQuotePaymentId(),
          0.0001);
      assertEquals(
          "expect equals additionalData ",
          o.get("additionalData").getAsString(),
          result.get(i).getAdditionalData());
      assertEquals(
          "expect equals ccExpMonth ",
          o.get("ccExpMonth").getAsString(),
          result.get(i).getCcExpMonth());
      assertEquals(
          "expect equals ccSsStartYear ",
          o.get("ccSsStartYear").getAsString(),
          result.get(i).getCcSsStartYear());
      assertEquals(
          "expect equals echeckBankName ",
          o.get("echeckBankName").getAsString(),
          result.get(i).getEcheckBankName());
      assertEquals(
          "expect equals method ", o.get("method").getAsString(), result.get(i).getMethod());
      assertEquals(
          "expect equals ccDebugRequestBody ",
          o.get("ccDebugRequestBody").getAsString(),
          result.get(i).getCcDebugRequestBody());
      assertEquals(
          "expect equals ccSecureVerify ",
          o.get("ccSecureVerify").getAsString(),
          result.get(i).getCcSecureVerify());
      assertEquals(
          "expect equals protectionEligibility ",
          o.get("protectionEligibility").getAsString(),
          result.get(i).getProtectionEligibility());
      assertEquals(
          "expect equals ccApproval ",
          o.get("ccApproval").getAsString(),
          result.get(i).getCcApproval());
      assertEquals(
          "expect equals ccLast4 ", o.get("ccLast4").getAsString(), result.get(i).getCcLast4());
      assertEquals(
          "expect equals ccStatusDescription ",
          o.get("ccStatusDescription").getAsString(),
          result.get(i).getCcStatusDescription());
      assertEquals(
          "expect equals echeckType ",
          o.get("echeckType").getAsString(),
          result.get(i).getEcheckType());
      assertEquals(
          "expect equals ccDebugResponseSerialized ",
          o.get("ccDebugResponseSerialized").getAsString(),
          result.get(i).getCcDebugResponseSerialized());
      assertEquals(
          "expect equals ccSsStartMonth ",
          o.get("ccSsStartMonth").getAsString(),
          result.get(i).getCcSsStartMonth());
      assertEquals(
          "expect equals echeckAccountType ",
          o.get("echeckAccountType").getAsString(),
          result.get(i).getEcheckAccountType());
      assertEquals(
          "expect equals lastTransId ",
          o.get("lastTransId").getAsString(),
          result.get(i).getLastTransId());
      assertEquals(
          "expect equals ccCidStatus ",
          o.get("ccCidStatus").getAsString(),
          result.get(i).getCcCidStatus());
      assertEquals(
          "expect equals ccOwner ", o.get("ccOwner").getAsString(), result.get(i).getCcOwner());
      assertEquals(
          "expect equals ccType ", o.get("ccType").getAsString(), result.get(i).getCcType());
      assertEquals(
          "expect equals poNumber ", o.get("poNumber").getAsString(), result.get(i).getPoNumber());
      assertEquals(
          "expect equals ccExpYear ",
          o.get("ccExpYear").getAsString(),
          result.get(i).getCcExpYear());
      assertEquals(
          "expect equals ccStatus ", o.get("ccStatus").getAsString(), result.get(i).getCcStatus());
      assertEquals(
          "expect equals echeckRoutingNumber ",
          o.get("echeckRoutingNumber").getAsString(),
          result.get(i).getEcheckRoutingNumber());
      assertEquals(
          "expect equals accountStatus ",
          o.get("accountStatus").getAsString(),
          result.get(i).getAccountStatus());
      assertEquals(
          "expect equals anetTransMethod ",
          o.get("anetTransMethod").getAsString(),
          result.get(i).getAnetTransMethod());
      assertEquals(
          "expect equals ccDebugResponseBody ",
          o.get("ccDebugResponseBody").getAsString(),
          result.get(i).getCcDebugResponseBody());
      assertEquals(
          "expect equals ccSsIssue ",
          o.get("ccSsIssue").getAsString(),
          result.get(i).getCcSsIssue());
      assertEquals(
          "expect equals echeckAccountName ",
          o.get("echeckAccountName").getAsString(),
          result.get(i).getEcheckAccountName());
      assertEquals(
          "expect equals ccAvsStatus ",
          o.get("ccAvsStatus").getAsString(),
          result.get(i).getCcAvsStatus());
      assertEquals(
          "expect equals ccNumberEnc ",
          o.get("ccNumberEnc").getAsString(),
          result.get(i).getCcNumberEnc());
      assertEquals(
          "expect equals ccTransId ",
          o.get("ccTransId").getAsString(),
          result.get(i).getCcTransId());
      assertEquals(
          "expect equals addressStatus ",
          o.get("addressStatus").getAsString(),
          result.get(i).getAddressStatus());
      assertEquals(
          "expect equals additionalInformation ",
          o.get("additionalInformation").getAsString(),
          result.get(i).getAdditionalInformation());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderStatus() throws IOException {
    final String inputFile = "SalesOrderStatus.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderStatus> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderStatus(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals("expect equals label ", o.get("label").getAsString(), result.get(i).getLabel());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderStatusHistory() throws IOException {
    final String inputFile = "SalesOrderStatusHistory.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderStatusHistory> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderStatusHistory(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals isCustomerNotified ",
          o.get("isCustomerNotified").getAsInt(),
          result.get(i).getIsCustomerNotified(),
          0.0001);
      assertEquals(
          "expect equals isVisibleOnFront ",
          o.get("isVisibleOnFront").getAsInt(),
          result.get(i).getIsVisibleOnFront(),
          0.0001);
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals entityName ",
          o.get("entityName").getAsString(),
          result.get(i).getEntityName());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderStatusLabel() throws IOException {
    final String inputFile = "SalesOrderStatusLabel.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderStatusLabel> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderStatusLabel(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals("expect equals label ", o.get("label").getAsString(), result.get(i).getLabel());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderStatusState() throws IOException {
    final String inputFile = "SalesOrderStatusState.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderStatusState> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderStatusState(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals state ", o.get("state").getAsString(), result.get(i).getState());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals isDefault ",
          o.get("isDefault").getAsInt(),
          result.get(i).getIsDefault(),
          0.0001);
      assertEquals(
          "expect equals visibleOnFront ",
          o.get("visibleOnFront").getAsInt(),
          result.get(i).getVisibleOnFront(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderTax() throws IOException {
    final String inputFile = "SalesOrderTax.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderTax> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderTax(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals taxId ", o.get("taxId").getAsInt(), result.get(i).getTaxId(), 0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals percent ", o.get("percent").getAsBigDecimal(), result.get(i).getPercent());
      assertEquals(
          "expect equals amount ", o.get("amount").getAsBigDecimal(), result.get(i).getAmount());
      assertEquals(
          "expect equals priority ",
          o.get("priority").getAsInt(),
          result.get(i).getPriority(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals baseAmount ",
          o.get("baseAmount").getAsBigDecimal(),
          result.get(i).getBaseAmount());
      assertEquals(
          "expect equals process ",
          o.get("process").getAsInt(),
          result.get(i).getProcess(),
          0.0001);
      assertEquals(
          "expect equals baseRealAmount ",
          o.get("baseRealAmount").getAsBigDecimal(),
          result.get(i).getBaseRealAmount());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesOrderTaxItem() throws IOException {
    final String inputFile = "SalesOrderTaxItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesOrderTaxItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesOrderTaxItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals taxItemId ",
          o.get("taxItemId").getAsInt(),
          result.get(i).getTaxItemId(),
          0.0001);
      assertEquals(
          "expect equals taxId ", o.get("taxId").getAsInt(), result.get(i).getTaxId(), 0.0001);
      assertEquals(
          "expect equals taxPercent ",
          o.get("taxPercent").getAsBigDecimal(),
          result.get(i).getTaxPercent());
      assertEquals(
          "expect equals amount ", o.get("amount").getAsBigDecimal(), result.get(i).getAmount());
      assertEquals(
          "expect equals baseAmount ",
          o.get("baseAmount").getAsBigDecimal(),
          result.get(i).getBaseAmount());
      assertEquals(
          "expect equals realAmount ",
          o.get("realAmount").getAsBigDecimal(),
          result.get(i).getRealAmount());
      assertEquals(
          "expect equals realBaseAmount ",
          o.get("realBaseAmount").getAsBigDecimal(),
          result.get(i).getRealBaseAmount());
      assertEquals(
          "expect equals associatedItemId ",
          o.get("associatedItemId").getAsInt(),
          result.get(i).getAssociatedItemId(),
          0.0001);
      assertEquals(
          "expect equals taxableItemType ",
          o.get("taxableItemType").getAsString(),
          result.get(i).getTaxableItemType());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesPaymentTransaction() throws IOException {
    final String inputFile = "SalesPaymentTransaction.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesPaymentTransaction> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesPaymentTransaction(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals transactionId ",
          o.get("transactionId").getAsInt(),
          result.get(i).getTransactionId(),
          0.0001);
      assertEquals("expect equals txnId ", o.get("txnId").getAsString(), result.get(i).getTxnId());
      assertEquals(
          "expect equals paymentId ",
          o.get("paymentId").getAsInt(),
          result.get(i).getPaymentId(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals parentTxnId ",
          o.get("parentTxnId").getAsString(),
          result.get(i).getParentTxnId());
      assertEquals(
          "expect equals txnType ", o.get("txnType").getAsString(), result.get(i).getTxnType());
      assertEquals(
          "expect equals isClosed ",
          o.get("isClosed").getAsInt(),
          result.get(i).getIsClosed(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesRefundedAggregated() throws IOException {
    final String inputFile = "SalesRefundedAggregated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesRefundedAggregated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesRefundedAggregated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals refunded ",
          o.get("refunded").getAsBigDecimal(),
          result.get(i).getRefunded());
      assertEquals(
          "expect equals onlineRefunded ",
          o.get("onlineRefunded").getAsBigDecimal(),
          result.get(i).getOnlineRefunded());
      assertEquals(
          "expect equals offlineRefunded ",
          o.get("offlineRefunded").getAsBigDecimal(),
          result.get(i).getOfflineRefunded());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesRefundedAggregatedOrder() throws IOException {
    final String inputFile = "SalesRefundedAggregatedOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesRefundedAggregatedOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesRefundedAggregatedOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals refunded ",
          o.get("refunded").getAsBigDecimal(),
          result.get(i).getRefunded());
      assertEquals(
          "expect equals onlineRefunded ",
          o.get("onlineRefunded").getAsBigDecimal(),
          result.get(i).getOnlineRefunded());
      assertEquals(
          "expect equals offlineRefunded ",
          o.get("offlineRefunded").getAsBigDecimal(),
          result.get(i).getOfflineRefunded());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesSequenceMeta() throws IOException {
    final String inputFile = "SalesSequenceMeta.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesSequenceMeta> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesSequenceMeta(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals entityType ",
          o.get("entityType").getAsString(),
          result.get(i).getEntityType());
      assertEquals(
          "expect equals metaId ", o.get("metaId").getAsInt(), result.get(i).getMetaId(), 0.0001);
      assertEquals(
          "expect equals sequenceTable ",
          o.get("sequenceTable").getAsString(),
          result.get(i).getSequenceTable());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesSequenceProfile() throws IOException {
    final String inputFile = "SalesSequenceProfile.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesSequenceProfile> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesSequenceProfile(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals metaId ", o.get("metaId").getAsInt(), result.get(i).getMetaId(), 0.0001);
      assertEquals(
          "expect equals profileId ",
          o.get("profileId").getAsInt(),
          result.get(i).getProfileId(),
          0.0001);
      assertEquals(
          "expect equals prefix ", o.get("prefix").getAsString(), result.get(i).getPrefix());
      assertEquals(
          "expect equals suffix ", o.get("suffix").getAsString(), result.get(i).getSuffix());
      assertEquals(
          "expect equals startValue ",
          o.get("startValue").getAsInt(),
          result.get(i).getStartValue(),
          0.0001);
      assertEquals(
          "expect equals step ", o.get("step").getAsInt(), result.get(i).getStep(), 0.0001);
      assertEquals(
          "expect equals maxValue ",
          o.get("maxValue").getAsInt(),
          result.get(i).getMaxValue(),
          0.0001);
      assertEquals(
          "expect equals warningValue ",
          o.get("warningValue").getAsInt(),
          result.get(i).getWarningValue(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesShipment() throws IOException {
    final String inputFile = "SalesShipment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesShipment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesShipment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals totalWeight ",
          o.get("totalWeight").getAsBigDecimal(),
          result.get(i).getTotalWeight());
      assertEquals(
          "expect equals totalQty ",
          o.get("totalQty").getAsBigDecimal(),
          result.get(i).getTotalQty());
      assertEquals(
          "expect equals emailSent ",
          o.get("emailSent").getAsInt(),
          result.get(i).getEmailSent(),
          0.0001);
      assertEquals(
          "expect equals sendEmail ",
          o.get("sendEmail").getAsInt(),
          result.get(i).getSendEmail(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals shippingAddressId ",
          o.get("shippingAddressId").getAsInt(),
          result.get(i).getShippingAddressId(),
          0.0001);
      assertEquals(
          "expect equals billingAddressId ",
          o.get("billingAddressId").getAsInt(),
          result.get(i).getBillingAddressId(),
          0.0001);
      assertEquals(
          "expect equals shipmentStatus ",
          o.get("shipmentStatus").getAsInt(),
          result.get(i).getShipmentStatus(),
          0.0001);
      assertEquals(
          "expect equals packages ", o.get("packages").getAsString(), result.get(i).getPackages());
      assertEquals(
          "expect equals customerNote ",
          o.get("customerNote").getAsString(),
          result.get(i).getCustomerNote());
      assertEquals(
          "expect equals customerNoteNotify ",
          o.get("customerNoteNotify").getAsInt(),
          result.get(i).getCustomerNoteNotify(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesShipmentComment() throws IOException {
    final String inputFile = "SalesShipmentComment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesShipmentComment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesShipmentComment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals isCustomerNotified ",
          o.get("isCustomerNotified").getAsInt(),
          result.get(i).getIsCustomerNotified(),
          0.0001);
      assertEquals(
          "expect equals isVisibleOnFront ",
          o.get("isVisibleOnFront").getAsInt(),
          result.get(i).getIsVisibleOnFront(),
          0.0001);
      assertEquals(
          "expect equals comment ", o.get("comment").getAsString(), result.get(i).getComment());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesShipmentGrid() throws IOException {
    final String inputFile = "SalesShipmentGrid.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesShipmentGrid> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesShipmentGrid(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals incrementId ",
          o.get("incrementId").getAsString(),
          result.get(i).getIncrementId());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals orderIncrementId ",
          o.get("orderIncrementId").getAsString(),
          result.get(i).getOrderIncrementId());
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals customerName ",
          o.get("customerName").getAsString(),
          result.get(i).getCustomerName());
      assertEquals(
          "expect equals totalQty ",
          o.get("totalQty").getAsBigDecimal(),
          result.get(i).getTotalQty());
      assertEquals(
          "expect equals shipmentStatus ",
          o.get("shipmentStatus").getAsInt(),
          result.get(i).getShipmentStatus(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals(
          "expect equals billingAddress ",
          o.get("billingAddress").getAsString(),
          result.get(i).getBillingAddress());
      assertEquals(
          "expect equals shippingAddress ",
          o.get("shippingAddress").getAsString(),
          result.get(i).getShippingAddress());
      assertEquals(
          "expect equals billingName ",
          o.get("billingName").getAsString(),
          result.get(i).getBillingName());
      assertEquals(
          "expect equals shippingName ",
          o.get("shippingName").getAsString(),
          result.get(i).getShippingName());
      assertEquals(
          "expect equals customerEmail ",
          o.get("customerEmail").getAsString(),
          result.get(i).getCustomerEmail());
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
      assertEquals(
          "expect equals paymentMethod ",
          o.get("paymentMethod").getAsString(),
          result.get(i).getPaymentMethod());
      assertEquals(
          "expect equals shippingInformation ",
          o.get("shippingInformation").getAsString(),
          result.get(i).getShippingInformation());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesShipmentItem() throws IOException {
    final String inputFile = "SalesShipmentItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesShipmentItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesShipmentItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals rowTotal ",
          o.get("rowTotal").getAsBigDecimal(),
          result.get(i).getRowTotal());
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals(
          "expect equals weight ", o.get("weight").getAsBigDecimal(), result.get(i).getWeight());
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals orderItemId ",
          o.get("orderItemId").getAsInt(),
          result.get(i).getOrderItemId(),
          0.0001);
      assertEquals(
          "expect equals additionalData ",
          o.get("additionalData").getAsString(),
          result.get(i).getAdditionalData());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesShipmentTrack() throws IOException {
    final String inputFile = "SalesShipmentTrack.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesShipmentTrack> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesShipmentTrack(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals weight ", o.get("weight").getAsBigDecimal(), result.get(i).getWeight());
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals trackNumber ",
          o.get("trackNumber").getAsString(),
          result.get(i).getTrackNumber());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals carrierCode ",
          o.get("carrierCode").getAsString(),
          result.get(i).getCarrierCode());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesShippingAggregated() throws IOException {
    final String inputFile = "SalesShippingAggregated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesShippingAggregated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesShippingAggregated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals shippingDescription ",
          o.get("shippingDescription").getAsString(),
          result.get(i).getShippingDescription());
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals totalShipping ",
          o.get("totalShipping").getAsBigDecimal(),
          result.get(i).getTotalShipping());
      assertEquals(
          "expect equals totalShippingActual ",
          o.get("totalShippingActual").getAsBigDecimal(),
          result.get(i).getTotalShippingActual());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesShippingAggregatedOrder() throws IOException {
    final String inputFile = "SalesShippingAggregatedOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesShippingAggregatedOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesShippingAggregatedOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals shippingDescription ",
          o.get("shippingDescription").getAsString(),
          result.get(i).getShippingDescription());
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals totalShipping ",
          o.get("totalShipping").getAsBigDecimal(),
          result.get(i).getTotalShipping());
      assertEquals(
          "expect equals totalShippingActual ",
          o.get("totalShippingActual").getAsBigDecimal(),
          result.get(i).getTotalShippingActual());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesrule() throws IOException {
    final String inputFile = "Salesrule.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Salesrule> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Salesrule(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals usesPerCustomer ",
          o.get("usesPerCustomer").getAsInt(),
          result.get(i).getUsesPerCustomer(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals conditionsSerialized ",
          o.get("conditionsSerialized").getAsString(),
          result.get(i).getConditionsSerialized());
      assertEquals(
          "expect equals actionsSerialized ",
          o.get("actionsSerialized").getAsString(),
          result.get(i).getActionsSerialized());
      assertEquals(
          "expect equals stopRulesProcessing ",
          o.get("stopRulesProcessing").getAsInt(),
          result.get(i).getStopRulesProcessing(),
          0.0001);
      assertEquals(
          "expect equals isAdvanced ",
          o.get("isAdvanced").getAsInt(),
          result.get(i).getIsAdvanced(),
          0.0001);
      assertEquals(
          "expect equals productIds ",
          o.get("productIds").getAsString(),
          result.get(i).getProductIds());
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals simpleAction ",
          o.get("simpleAction").getAsString(),
          result.get(i).getSimpleAction());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals discountQty ",
          o.get("discountQty").getAsBigDecimal(),
          result.get(i).getDiscountQty());
      assertEquals(
          "expect equals discountStep ",
          o.get("discountStep").getAsInt(),
          result.get(i).getDiscountStep(),
          0.0001);
      assertEquals(
          "expect equals applyToShipping ",
          o.get("applyToShipping").getAsInt(),
          result.get(i).getApplyToShipping(),
          0.0001);
      assertEquals(
          "expect equals timesUsed ",
          o.get("timesUsed").getAsInt(),
          result.get(i).getTimesUsed(),
          0.0001);
      assertEquals(
          "expect equals isRss ", o.get("isRss").getAsInt(), result.get(i).getIsRss(), 0.0001);
      assertEquals(
          "expect equals couponType ",
          o.get("couponType").getAsInt(),
          result.get(i).getCouponType(),
          0.0001);
      assertEquals(
          "expect equals useAutoGeneration ",
          o.get("useAutoGeneration").getAsInt(),
          result.get(i).getUseAutoGeneration(),
          0.0001);
      assertEquals(
          "expect equals usesPerCoupon ",
          o.get("usesPerCoupon").getAsInt(),
          result.get(i).getUsesPerCoupon(),
          0.0001);
      assertEquals(
          "expect equals simpleFreeShipping ",
          o.get("simpleFreeShipping").getAsInt(),
          result.get(i).getSimpleFreeShipping(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleCoupon() throws IOException {
    final String inputFile = "SalesruleCoupon.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleCoupon> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleCoupon(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals couponId ",
          o.get("couponId").getAsInt(),
          result.get(i).getCouponId(),
          0.0001);
      assertEquals(
          "expect equals isPrimary ",
          o.get("isPrimary").getAsInt(),
          result.get(i).getIsPrimary(),
          0.0001);
      assertEquals(
          "expect equals usageLimit ",
          o.get("usageLimit").getAsInt(),
          result.get(i).getUsageLimit(),
          0.0001);
      assertEquals(
          "expect equals usagePerCustomer ",
          o.get("usagePerCustomer").getAsInt(),
          result.get(i).getUsagePerCustomer(),
          0.0001);
      assertEquals(
          "expect equals timesUsed ",
          o.get("timesUsed").getAsInt(),
          result.get(i).getTimesUsed(),
          0.0001);
      assertEquals(
          "expect equals type ", o.get("type").getAsInt(), result.get(i).getType(), 0.0001);
      assertEquals(
          "expect equals generatedByDotmailer ",
          o.get("generatedByDotmailer").getAsInt(),
          result.get(i).getGeneratedByDotmailer(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleCouponAggregated() throws IOException {
    final String inputFile = "SalesruleCouponAggregated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleCouponAggregated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleCouponAggregated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals(
          "expect equals couponCode ",
          o.get("couponCode").getAsString(),
          result.get(i).getCouponCode());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals couponUses ",
          o.get("couponUses").getAsInt(),
          result.get(i).getCouponUses(),
          0.0001);
      assertEquals(
          "expect equals subtotalAmount ",
          o.get("subtotalAmount").getAsBigDecimal(),
          result.get(i).getSubtotalAmount());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals totalAmount ",
          o.get("totalAmount").getAsBigDecimal(),
          result.get(i).getTotalAmount());
      assertEquals(
          "expect equals subtotalAmountActual ",
          o.get("subtotalAmountActual").getAsBigDecimal(),
          result.get(i).getSubtotalAmountActual());
      assertEquals(
          "expect equals discountAmountActual ",
          o.get("discountAmountActual").getAsBigDecimal(),
          result.get(i).getDiscountAmountActual());
      assertEquals(
          "expect equals totalAmountActual ",
          o.get("totalAmountActual").getAsBigDecimal(),
          result.get(i).getTotalAmountActual());
      assertEquals(
          "expect equals ruleName ", o.get("ruleName").getAsString(), result.get(i).getRuleName());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleCouponAggregatedOrder() throws IOException {
    final String inputFile = "SalesruleCouponAggregatedOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleCouponAggregatedOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleCouponAggregatedOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals(
          "expect equals couponCode ",
          o.get("couponCode").getAsString(),
          result.get(i).getCouponCode());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals couponUses ",
          o.get("couponUses").getAsInt(),
          result.get(i).getCouponUses(),
          0.0001);
      assertEquals(
          "expect equals subtotalAmount ",
          o.get("subtotalAmount").getAsBigDecimal(),
          result.get(i).getSubtotalAmount());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals totalAmount ",
          o.get("totalAmount").getAsBigDecimal(),
          result.get(i).getTotalAmount());
      assertEquals(
          "expect equals ruleName ", o.get("ruleName").getAsString(), result.get(i).getRuleName());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleCouponAggregatedUpdated() throws IOException {
    final String inputFile = "SalesruleCouponAggregatedUpdated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleCouponAggregatedUpdated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleCouponAggregatedUpdated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals(
          "expect equals couponCode ",
          o.get("couponCode").getAsString(),
          result.get(i).getCouponCode());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals couponUses ",
          o.get("couponUses").getAsInt(),
          result.get(i).getCouponUses(),
          0.0001);
      assertEquals(
          "expect equals subtotalAmount ",
          o.get("subtotalAmount").getAsBigDecimal(),
          result.get(i).getSubtotalAmount());
      assertEquals(
          "expect equals discountAmount ",
          o.get("discountAmount").getAsBigDecimal(),
          result.get(i).getDiscountAmount());
      assertEquals(
          "expect equals totalAmount ",
          o.get("totalAmount").getAsBigDecimal(),
          result.get(i).getTotalAmount());
      assertEquals(
          "expect equals subtotalAmountActual ",
          o.get("subtotalAmountActual").getAsBigDecimal(),
          result.get(i).getSubtotalAmountActual());
      assertEquals(
          "expect equals discountAmountActual ",
          o.get("discountAmountActual").getAsBigDecimal(),
          result.get(i).getDiscountAmountActual());
      assertEquals(
          "expect equals totalAmountActual ",
          o.get("totalAmountActual").getAsBigDecimal(),
          result.get(i).getTotalAmountActual());
      assertEquals(
          "expect equals ruleName ", o.get("ruleName").getAsString(), result.get(i).getRuleName());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleCouponUsage() throws IOException {
    final String inputFile = "SalesruleCouponUsage.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleCouponUsage> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleCouponUsage(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals couponId ",
          o.get("couponId").getAsInt(),
          result.get(i).getCouponId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals timesUsed ",
          o.get("timesUsed").getAsInt(),
          result.get(i).getTimesUsed(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleCustomer() throws IOException {
    final String inputFile = "SalesruleCustomer.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleCustomer> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleCustomer(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleCustomerId ",
          o.get("ruleCustomerId").getAsInt(),
          result.get(i).getRuleCustomerId(),
          0.0001);
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals timesUsed ",
          o.get("timesUsed").getAsInt(),
          result.get(i).getTimesUsed(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleCustomerGroup() throws IOException {
    final String inputFile = "SalesruleCustomerGroup.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleCustomerGroup> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleCustomerGroup(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleLabel() throws IOException {
    final String inputFile = "SalesruleLabel.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleLabel> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleLabel(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals labelId ",
          o.get("labelId").getAsInt(),
          result.get(i).getLabelId(),
          0.0001);
      assertEquals("expect equals label ", o.get("label").getAsString(), result.get(i).getLabel());
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleProductAttribute() throws IOException {
    final String inputFile = "SalesruleProductAttribute.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleProductAttribute> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleProductAttribute(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals customerGroupId ",
          o.get("customerGroupId").getAsInt(),
          result.get(i).getCustomerGroupId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSalesruleWebsite() throws IOException {
    final String inputFile = "SalesruleWebsite.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SalesruleWebsite> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SalesruleWebsite(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals ruleId ", o.get("ruleId").getAsInt(), result.get(i).getRuleId(), 0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSearchQuery() throws IOException {
    final String inputFile = "SearchQuery.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SearchQuery> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SearchQuery(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals queryId ",
          o.get("queryId").getAsInt(),
          result.get(i).getQueryId(),
          0.0001);
      assertEquals(
          "expect equals queryText ",
          o.get("queryText").getAsString(),
          result.get(i).getQueryText());
      assertEquals(
          "expect equals numResults ",
          o.get("numResults").getAsInt(),
          result.get(i).getNumResults(),
          0.0001);
      assertEquals(
          "expect equals popularity ",
          o.get("popularity").getAsInt(),
          result.get(i).getPopularity(),
          0.0001);
      assertEquals(
          "expect equals redirect ", o.get("redirect").getAsString(), result.get(i).getRedirect());
      assertEquals(
          "expect equals displayInTerms ",
          o.get("displayInTerms").getAsInt(),
          result.get(i).getDisplayInTerms(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals isProcessed ",
          o.get("isProcessed").getAsInt(),
          result.get(i).getIsProcessed(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSearchSynonyms() throws IOException {
    final String inputFile = "SearchSynonyms.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SearchSynonyms> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SearchSynonyms(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals synonyms ", o.get("synonyms").getAsString(), result.get(i).getSynonyms());
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSendfriendLog() throws IOException {
    final String inputFile = "SendfriendLog.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SendfriendLog> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SendfriendLog(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals logId ", o.get("logId").getAsInt(), result.get(i).getLogId(), 0.0001);
      assertEquals(
          "expect equals time ", o.get("time").getAsInt(), result.get(i).getTime(), 0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSequenceCreditmemo0() throws IOException {
    final String inputFile = "SequenceCreditmemo0.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SequenceCreditmemo0> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SequenceCreditmemo0(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sequenceValue ",
          o.get("sequenceValue").getAsInt(),
          result.get(i).getSequenceValue(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSequenceCreditmemo1() throws IOException {
    final String inputFile = "SequenceCreditmemo1.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SequenceCreditmemo1> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SequenceCreditmemo1(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sequenceValue ",
          o.get("sequenceValue").getAsInt(),
          result.get(i).getSequenceValue(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSequenceInvoice0() throws IOException {
    final String inputFile = "SequenceInvoice0.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SequenceInvoice0> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SequenceInvoice0(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sequenceValue ",
          o.get("sequenceValue").getAsInt(),
          result.get(i).getSequenceValue(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSequenceInvoice1() throws IOException {
    final String inputFile = "SequenceInvoice1.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SequenceInvoice1> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SequenceInvoice1(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sequenceValue ",
          o.get("sequenceValue").getAsInt(),
          result.get(i).getSequenceValue(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSequenceOrder0() throws IOException {
    final String inputFile = "SequenceOrder0.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SequenceOrder0> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SequenceOrder0(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sequenceValue ",
          o.get("sequenceValue").getAsInt(),
          result.get(i).getSequenceValue(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSequenceOrder1() throws IOException {
    final String inputFile = "SequenceOrder1.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SequenceOrder1> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SequenceOrder1(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sequenceValue ",
          o.get("sequenceValue").getAsInt(),
          result.get(i).getSequenceValue(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSequenceShipment0() throws IOException {
    final String inputFile = "SequenceShipment0.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SequenceShipment0> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SequenceShipment0(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sequenceValue ",
          o.get("sequenceValue").getAsInt(),
          result.get(i).getSequenceValue(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSequenceShipment1() throws IOException {
    final String inputFile = "SequenceShipment1.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SequenceShipment1> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SequenceShipment1(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sequenceValue ",
          o.get("sequenceValue").getAsInt(),
          result.get(i).getSequenceValue(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSession() throws IOException {
    final String inputFile = "Session.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Session> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Session(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sessionId ",
          o.get("sessionId").getAsString(),
          result.get(i).getSessionId());
      assertEquals(
          "expect equals sessionExpires ",
          o.get("sessionExpires").getAsInt(),
          result.get(i).getSessionExpires(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingSetupModule() throws IOException {
    final String inputFile = "SetupModule.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SetupModule> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SetupModule(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals module ", o.get("module").getAsString(), result.get(i).getModule());
      assertEquals(
          "expect equals schemaVersion ",
          o.get("schemaVersion").getAsString(),
          result.get(i).getSchemaVersion());
      assertEquals(
          "expect equals dataVersion ",
          o.get("dataVersion").getAsString(),
          result.get(i).getDataVersion());
    }

    result.clear();
  }

  @Test
  public void testParsingShippingTablerate() throws IOException {
    final String inputFile = "ShippingTablerate.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ShippingTablerate> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ShippingTablerate(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals destZip ", o.get("destZip").getAsString(), result.get(i).getDestZip());
      assertEquals(
          "expect equals conditionValue ",
          o.get("conditionValue").getAsBigDecimal(),
          result.get(i).getConditionValue());
      assertEquals("expect equals pk ", o.get("pk").getAsInt(), result.get(i).getPk(), 0.0001);
      assertEquals(
          "expect equals destCountryId ",
          o.get("destCountryId").getAsString(),
          result.get(i).getDestCountryId());
      assertEquals(
          "expect equals destRegionId ",
          o.get("destRegionId").getAsInt(),
          result.get(i).getDestRegionId(),
          0.0001);
      assertEquals(
          "expect equals conditionName ",
          o.get("conditionName").getAsString(),
          result.get(i).getConditionName());
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals price ", o.get("price").getAsBigDecimal(), result.get(i).getPrice());
      assertEquals("expect equals cost ", o.get("cost").getAsBigDecimal(), result.get(i).getCost());
    }

    result.clear();
  }

  @Test
  public void testParsingSignifydCase() throws IOException {
    final String inputFile = "SignifydCase.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<SignifydCase> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2SignifydCase(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals caseId ", o.get("caseId").getAsInt(), result.get(i).getCaseId(), 0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals guaranteeEligible ",
          o.get("guaranteeEligible").getAsInt(),
          result.get(i).getGuaranteeEligible(),
          0.0001);
      assertEquals(
          "expect equals guaranteeDisposition ",
          o.get("guaranteeDisposition").getAsString(),
          result.get(i).getGuaranteeDisposition());
      assertEquals(
          "expect equals status ", o.get("status").getAsString(), result.get(i).getStatus());
      assertEquals(
          "expect equals score ", o.get("score").getAsInt(), result.get(i).getScore(), 0.0001);
      assertEquals(
          "expect equals associatedTeam ",
          o.get("associatedTeam").getAsString(),
          result.get(i).getAssociatedTeam());
      assertEquals(
          "expect equals reviewDisposition ",
          o.get("reviewDisposition").getAsString(),
          result.get(i).getReviewDisposition());
    }

    result.clear();
  }

  @Test
  public void testParsingSitemap() throws IOException {
    final String inputFile = "Sitemap.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Sitemap> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Sitemap(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals sitemapId ",
          o.get("sitemapId").getAsInt(),
          result.get(i).getSitemapId(),
          0.0001);
      assertEquals(
          "expect equals sitemapType ",
          o.get("sitemapType").getAsString(),
          result.get(i).getSitemapType());
      assertEquals(
          "expect equals sitemapFilename ",
          o.get("sitemapFilename").getAsString(),
          result.get(i).getSitemapFilename());
      assertEquals(
          "expect equals sitemapPath ",
          o.get("sitemapPath").getAsString(),
          result.get(i).getSitemapPath());
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingStore() throws IOException {
    final String inputFile = "Store.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Store> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Store(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals groupId ",
          o.get("groupId").getAsInt(),
          result.get(i).getGroupId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingStoreGroup() throws IOException {
    final String inputFile = "StoreGroup.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<StoreGroup> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2StoreGroup(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals groupId ",
          o.get("groupId").getAsInt(),
          result.get(i).getGroupId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals rootCategoryId ",
          o.get("rootCategoryId").getAsInt(),
          result.get(i).getRootCategoryId(),
          0.0001);
      assertEquals(
          "expect equals defaultStoreId ",
          o.get("defaultStoreId").getAsInt(),
          result.get(i).getDefaultStoreId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingStoreWebsite() throws IOException {
    final String inputFile = "StoreWebsite.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<StoreWebsite> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2StoreWebsite(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals defaultGroupId ",
          o.get("defaultGroupId").getAsInt(),
          result.get(i).getDefaultGroupId(),
          0.0001);
      assertEquals(
          "expect equals isDefault ",
          o.get("isDefault").getAsInt(),
          result.get(i).getIsDefault(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTaxCalculation() throws IOException {
    final String inputFile = "TaxCalculation.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TaxCalculation> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TaxCalculation(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals taxCalculationId ",
          o.get("taxCalculationId").getAsInt(),
          result.get(i).getTaxCalculationId(),
          0.0001);
      assertEquals(
          "expect equals taxCalculationRateId ",
          o.get("taxCalculationRateId").getAsInt(),
          result.get(i).getTaxCalculationRateId(),
          0.0001);
      assertEquals(
          "expect equals taxCalculationRuleId ",
          o.get("taxCalculationRuleId").getAsInt(),
          result.get(i).getTaxCalculationRuleId(),
          0.0001);
      assertEquals(
          "expect equals customerTaxClassId ",
          o.get("customerTaxClassId").getAsInt(),
          result.get(i).getCustomerTaxClassId(),
          0.0001);
      assertEquals(
          "expect equals productTaxClassId ",
          o.get("productTaxClassId").getAsInt(),
          result.get(i).getProductTaxClassId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTaxCalculationRate() throws IOException {
    final String inputFile = "TaxCalculationRate.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TaxCalculationRate> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TaxCalculationRate(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals taxCalculationRateId ",
          o.get("taxCalculationRateId").getAsInt(),
          result.get(i).getTaxCalculationRateId(),
          0.0001);
      assertEquals(
          "expect equals taxCountryId ",
          o.get("taxCountryId").getAsString(),
          result.get(i).getTaxCountryId());
      assertEquals(
          "expect equals taxRegionId ",
          o.get("taxRegionId").getAsInt(),
          result.get(i).getTaxRegionId(),
          0.0001);
      assertEquals(
          "expect equals taxPostcode ",
          o.get("taxPostcode").getAsString(),
          result.get(i).getTaxPostcode());
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals("expect equals rate ", o.get("rate").getAsBigDecimal(), result.get(i).getRate());
      assertEquals(
          "expect equals zipIsRange ",
          o.get("zipIsRange").getAsInt(),
          result.get(i).getZipIsRange(),
          0.0001);
      assertEquals(
          "expect equals zipFrom ",
          o.get("zipFrom").getAsInt(),
          result.get(i).getZipFrom(),
          0.0001);
      assertEquals(
          "expect equals zipTo ", o.get("zipTo").getAsInt(), result.get(i).getZipTo(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTaxCalculationRateTitle() throws IOException {
    final String inputFile = "TaxCalculationRateTitle.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TaxCalculationRateTitle> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TaxCalculationRateTitle(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals taxCalculationRateTitleId ",
          o.get("taxCalculationRateTitleId").getAsInt(),
          result.get(i).getTaxCalculationRateTitleId(),
          0.0001);
      assertEquals(
          "expect equals taxCalculationRateId ",
          o.get("taxCalculationRateId").getAsInt(),
          result.get(i).getTaxCalculationRateId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }

  @Test
  public void testParsingTaxCalculationRule() throws IOException {
    final String inputFile = "TaxCalculationRule.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TaxCalculationRule> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TaxCalculationRule(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals taxCalculationRuleId ",
          o.get("taxCalculationRuleId").getAsInt(),
          result.get(i).getTaxCalculationRuleId(),
          0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals priority ",
          o.get("priority").getAsInt(),
          result.get(i).getPriority(),
          0.0001);
      assertEquals(
          "expect equals position ",
          o.get("position").getAsInt(),
          result.get(i).getPosition(),
          0.0001);
      assertEquals(
          "expect equals calculateSubtotal ",
          o.get("calculateSubtotal").getAsInt(),
          result.get(i).getCalculateSubtotal(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTaxClass() throws IOException {
    final String inputFile = "TaxClass.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TaxClass> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TaxClass(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals classId ",
          o.get("classId").getAsInt(),
          result.get(i).getClassId(),
          0.0001);
      assertEquals(
          "expect equals className ",
          o.get("className").getAsString(),
          result.get(i).getClassName());
      assertEquals(
          "expect equals classType ",
          o.get("classType").getAsString(),
          result.get(i).getClassType());
    }

    result.clear();
  }

  @Test
  public void testParsingTaxOrderAggregatedCreated() throws IOException {
    final String inputFile = "TaxOrderAggregatedCreated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TaxOrderAggregatedCreated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TaxOrderAggregatedCreated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals percent ",
          o.get("percent").getAsFloat(),
          result.get(i).getPercent(),
          0.001);
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals taxBaseAmountSum ",
          o.get("taxBaseAmountSum").getAsFloat(),
          result.get(i).getTaxBaseAmountSum(),
          0.001);
    }

    result.clear();
  }

  @Test
  public void testParsingTaxOrderAggregatedUpdated() throws IOException {
    final String inputFile = "TaxOrderAggregatedUpdated.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TaxOrderAggregatedUpdated> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TaxOrderAggregatedUpdated(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals orderStatus ",
          o.get("orderStatus").getAsString(),
          result.get(i).getOrderStatus());
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals("expect equals id ", o.get("id").getAsInt(), result.get(i).getId(), 0.0001);
      assertEquals(
          "expect equals percent ",
          o.get("percent").getAsFloat(),
          result.get(i).getPercent(),
          0.001);
      assertEquals(
          "expect equals ordersCount ",
          o.get("ordersCount").getAsInt(),
          result.get(i).getOrdersCount(),
          0.0001);
      assertEquals(
          "expect equals taxBaseAmountSum ",
          o.get("taxBaseAmountSum").getAsFloat(),
          result.get(i).getTaxBaseAmountSum(),
          0.001);
    }

    result.clear();
  }

  @Test
  public void testParsingTemandoCheckoutAddress() throws IOException {
    final String inputFile = "TemandoCheckoutAddress.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TemandoCheckoutAddress> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TemandoCheckoutAddress(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals shippingAddressId ",
          o.get("shippingAddressId").getAsInt(),
          result.get(i).getShippingAddressId(),
          0.0001);
      assertEquals(
          "expect equals serviceSelection ",
          o.get("serviceSelection").getAsString(),
          result.get(i).getServiceSelection());
    }

    result.clear();
  }

  @Test
  public void testParsingTemandoCollectionPointSearch() throws IOException {
    final String inputFile = "TemandoCollectionPointSearch.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TemandoCollectionPointSearch> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TemandoCollectionPointSearch(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals shippingAddressId ",
          o.get("shippingAddressId").getAsInt(),
          result.get(i).getShippingAddressId(),
          0.0001);
      assertEquals(
          "expect equals countryId ",
          o.get("countryId").getAsString(),
          result.get(i).getCountryId());
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals(
          "expect equals pending ",
          o.get("pending").getAsInt(),
          result.get(i).getPending(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTemandoOrder() throws IOException {
    final String inputFile = "TemandoOrder.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TemandoOrder> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TemandoOrder(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals extOrderId ",
          o.get("extOrderId").getAsString(),
          result.get(i).getExtOrderId());
    }

    result.clear();
  }

  @Test
  public void testParsingTemandoOrderCollectionPoint() throws IOException {
    final String inputFile = "TemandoOrderCollectionPoint.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TemandoOrderCollectionPoint> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TemandoOrderCollectionPoint(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals recipientAddressId ",
          o.get("recipientAddressId").getAsInt(),
          result.get(i).getRecipientAddressId(),
          0.0001);
      assertEquals(
          "expect equals collectionPointId ",
          o.get("collectionPointId").getAsString(),
          result.get(i).getCollectionPointId());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals country ", o.get("country").getAsString(), result.get(i).getCountry());
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals(
          "expect equals street ", o.get("street").getAsString(), result.get(i).getStreet());
    }

    result.clear();
  }

  @Test
  public void testParsingTemandoOrderPickupLocation() throws IOException {
    final String inputFile = "TemandoOrderPickupLocation.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TemandoOrderPickupLocation> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TemandoOrderPickupLocation(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals recipientAddressId ",
          o.get("recipientAddressId").getAsInt(),
          result.get(i).getRecipientAddressId(),
          0.0001);
      assertEquals(
          "expect equals pickupLocationId ",
          o.get("pickupLocationId").getAsString(),
          result.get(i).getPickupLocationId());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals country ", o.get("country").getAsString(), result.get(i).getCountry());
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals(
          "expect equals street ", o.get("street").getAsString(), result.get(i).getStreet());
    }

    result.clear();
  }

  @Test
  public void testParsingTemandoPickupLocationSearch() throws IOException {
    final String inputFile = "TemandoPickupLocationSearch.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TemandoPickupLocationSearch> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TemandoPickupLocationSearch(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals shippingAddressId ",
          o.get("shippingAddressId").getAsInt(),
          result.get(i).getShippingAddressId(),
          0.0001);
      assertEquals(
          "expect equals active ", o.get("active").getAsInt(), result.get(i).getActive(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTemandoQuoteCollectionPoint() throws IOException {
    final String inputFile = "TemandoQuoteCollectionPoint.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TemandoQuoteCollectionPoint> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TemandoQuoteCollectionPoint(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals recipientAddressId ",
          o.get("recipientAddressId").getAsInt(),
          result.get(i).getRecipientAddressId(),
          0.0001);
      assertEquals(
          "expect equals collectionPointId ",
          o.get("collectionPointId").getAsString(),
          result.get(i).getCollectionPointId());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals country ", o.get("country").getAsString(), result.get(i).getCountry());
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals(
          "expect equals street ", o.get("street").getAsString(), result.get(i).getStreet());
      assertEquals(
          "expect equals openingHours ",
          o.get("openingHours").getAsString(),
          result.get(i).getOpeningHours());
      assertEquals(
          "expect equals shippingExperiences ",
          o.get("shippingExperiences").getAsString(),
          result.get(i).getShippingExperiences());
      assertEquals(
          "expect equals selected ",
          o.get("selected").getAsInt(),
          result.get(i).getSelected(),
          0.0001);
      assertEquals(
          "expect equals distance ",
          o.get("distance").getAsInt(),
          result.get(i).getDistance(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTemandoQuotePickupLocation() throws IOException {
    final String inputFile = "TemandoQuotePickupLocation.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TemandoQuotePickupLocation> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TemandoQuotePickupLocation(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals recipientAddressId ",
          o.get("recipientAddressId").getAsInt(),
          result.get(i).getRecipientAddressId(),
          0.0001);
      assertEquals(
          "expect equals pickupLocationId ",
          o.get("pickupLocationId").getAsString(),
          result.get(i).getPickupLocationId());
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
      assertEquals(
          "expect equals country ", o.get("country").getAsString(), result.get(i).getCountry());
      assertEquals(
          "expect equals region ", o.get("region").getAsString(), result.get(i).getRegion());
      assertEquals(
          "expect equals postcode ", o.get("postcode").getAsString(), result.get(i).getPostcode());
      assertEquals("expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
      assertEquals(
          "expect equals street ", o.get("street").getAsString(), result.get(i).getStreet());
      assertEquals(
          "expect equals openingHours ",
          o.get("openingHours").getAsString(),
          result.get(i).getOpeningHours());
      assertEquals(
          "expect equals shippingExperiences ",
          o.get("shippingExperiences").getAsString(),
          result.get(i).getShippingExperiences());
      assertEquals(
          "expect equals selected ",
          o.get("selected").getAsInt(),
          result.get(i).getSelected(),
          0.0001);
      assertEquals(
          "expect equals distance ",
          o.get("distance").getAsInt(),
          result.get(i).getDistance(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTemandoShipment() throws IOException {
    final String inputFile = "TemandoShipment.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<TemandoShipment> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2TemandoShipment(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals shipmentId ",
          o.get("shipmentId").getAsInt(),
          result.get(i).getShipmentId(),
          0.0001);
      assertEquals(
          "expect equals extShipmentId ",
          o.get("extShipmentId").getAsString(),
          result.get(i).getExtShipmentId());
      assertEquals(
          "expect equals extLocationId ",
          o.get("extLocationId").getAsString(),
          result.get(i).getExtLocationId());
      assertEquals(
          "expect equals extTrackingUrl ",
          o.get("extTrackingUrl").getAsString(),
          result.get(i).getExtTrackingUrl());
      assertEquals(
          "expect equals extTrackingReference ",
          o.get("extTrackingReference").getAsString(),
          result.get(i).getExtTrackingReference());
      assertEquals(
          "expect equals extReturnShipmentId ",
          o.get("extReturnShipmentId").getAsString(),
          result.get(i).getExtReturnShipmentId());
    }

    result.clear();
  }

  @Test
  public void testParsingTheme() throws IOException {
    final String inputFile = "Theme.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Theme> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Theme(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals themeId ",
          o.get("themeId").getAsInt(),
          result.get(i).getThemeId(),
          0.0001);
      assertEquals(
          "expect equals parentId ",
          o.get("parentId").getAsInt(),
          result.get(i).getParentId(),
          0.0001);
      assertEquals(
          "expect equals themePath ",
          o.get("themePath").getAsString(),
          result.get(i).getThemePath());
      assertEquals(
          "expect equals themeTitle ",
          o.get("themeTitle").getAsString(),
          result.get(i).getThemeTitle());
      assertEquals(
          "expect equals previewImage ",
          o.get("previewImage").getAsString(),
          result.get(i).getPreviewImage());
      assertEquals(
          "expect equals isFeatured ",
          o.get("isFeatured").getAsInt(),
          result.get(i).getIsFeatured(),
          0.0001);
      assertEquals("expect equals area ", o.get("area").getAsString(), result.get(i).getArea());
      assertEquals(
          "expect equals type ", o.get("type").getAsInt(), result.get(i).getType(), 0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
    }

    result.clear();
  }

  @Test
  public void testParsingThemeFile() throws IOException {
    final String inputFile = "ThemeFile.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<ThemeFile> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2ThemeFile(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals themeFilesId ",
          o.get("themeFilesId").getAsInt(),
          result.get(i).getThemeFilesId(),
          0.0001);
      assertEquals(
          "expect equals themeId ",
          o.get("themeId").getAsInt(),
          result.get(i).getThemeId(),
          0.0001);
      assertEquals(
          "expect equals filePath ", o.get("filePath").getAsString(), result.get(i).getFilePath());
      assertEquals(
          "expect equals fileType ", o.get("fileType").getAsString(), result.get(i).getFileType());
      assertEquals(
          "expect equals content ", o.get("content").getAsString(), result.get(i).getContent());
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
      assertEquals(
          "expect equals isTemporary ",
          o.get("isTemporary").getAsInt(),
          result.get(i).getIsTemporary(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingTranslation() throws IOException {
    final String inputFile = "Translation.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Translation> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Translation(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals string ", o.get("string").getAsString(), result.get(i).getString());
      assertEquals(
          "expect equals keyId ", o.get("keyId").getAsInt(), result.get(i).getKeyId(), 0.0001);
      assertEquals(
          "expect equals locale ", o.get("locale").getAsString(), result.get(i).getLocale());
      assertEquals(
          "expect equals translate ",
          o.get("translate").getAsString(),
          result.get(i).getTranslate());
    }

    result.clear();
  }

  @Test
  public void testParsingUiBookmark() throws IOException {
    final String inputFile = "UiBookmark.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<UiBookmark> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2UiBookmark(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals bookmarkId ",
          o.get("bookmarkId").getAsInt(),
          result.get(i).getBookmarkId(),
          0.0001);
      assertEquals(
          "expect equals userId ", o.get("userId").getAsInt(), result.get(i).getUserId(), 0.0001);
      assertEquals(
          "expect equals namespace ",
          o.get("namespace").getAsString(),
          result.get(i).getNamespace());
      assertEquals(
          "expect equals identifier ",
          o.get("identifier").getAsString(),
          result.get(i).getIdentifier());
      assertEquals(
          "expect equals current ",
          o.get("current").getAsInt(),
          result.get(i).getCurrent(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals config ", o.get("config").getAsString(), result.get(i).getConfig());
    }

    result.clear();
  }

  @Test
  public void testParsingUrlRewrite() throws IOException {
    final String inputFile = "UrlRewrite.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<UrlRewrite> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2UrlRewrite(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals urlRewriteId ",
          o.get("urlRewriteId").getAsInt(),
          result.get(i).getUrlRewriteId(),
          0.0001);
      assertEquals(
          "expect equals requestPath ",
          o.get("requestPath").getAsString(),
          result.get(i).getRequestPath());
      assertEquals(
          "expect equals entityType ",
          o.get("entityType").getAsString(),
          result.get(i).getEntityType());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals targetPath ",
          o.get("targetPath").getAsString(),
          result.get(i).getTargetPath());
      assertEquals(
          "expect equals redirectType ",
          o.get("redirectType").getAsInt(),
          result.get(i).getRedirectType(),
          0.0001);
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals(
          "expect equals isAutogenerated ",
          o.get("isAutogenerated").getAsInt(),
          result.get(i).getIsAutogenerated(),
          0.0001);
      assertEquals(
          "expect equals metadata ", o.get("metadata").getAsString(), result.get(i).getMetadata());
    }

    result.clear();
  }

  @Test
  public void testParsingVariable() throws IOException {
    final String inputFile = "Variable.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Variable> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Variable(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals(
          "expect equals variableId ",
          o.get("variableId").getAsInt(),
          result.get(i).getVariableId(),
          0.0001);
      assertEquals("expect equals name ", o.get("name").getAsString(), result.get(i).getName());
    }

    result.clear();
  }

  @Test
  public void testParsingVariableValue() throws IOException {
    final String inputFile = "VariableValue.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VariableValue> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VariableValue(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals variableId ",
          o.get("variableId").getAsInt(),
          result.get(i).getVariableId(),
          0.0001);
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals plainValue ",
          o.get("plainValue").getAsString(),
          result.get(i).getPlainValue());
      assertEquals(
          "expect equals htmlValue ",
          o.get("htmlValue").getAsString(),
          result.get(i).getHtmlValue());
    }

    result.clear();
  }

  @Test
  public void testParsingVaultPaymentToken() throws IOException {
    final String inputFile = "VaultPaymentToken.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VaultPaymentToken> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VaultPaymentToken(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals paymentMethodCode ",
          o.get("paymentMethodCode").getAsString(),
          result.get(i).getPaymentMethodCode());
      assertEquals(
          "expect equals gatewayToken ",
          o.get("gatewayToken").getAsString(),
          result.get(i).getGatewayToken());
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals publicHash ",
          o.get("publicHash").getAsString(),
          result.get(i).getPublicHash());
      assertEquals("expect equals type ", o.get("type").getAsString(), result.get(i).getType());
      assertEquals(
          "expect equals details ", o.get("details").getAsString(), result.get(i).getDetails());
      assertEquals(
          "expect equals isActive ",
          o.get("isActive").getAsInt(),
          result.get(i).getIsActive(),
          0.0001);
      assertEquals(
          "expect equals isVisible ",
          o.get("isVisible").getAsInt(),
          result.get(i).getIsVisible(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingVaultPaymentTokenOrderPaymentLink() throws IOException {
    final String inputFile = "VaultPaymentTokenOrderPaymentLink.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VaultPaymentTokenOrderPaymentLink> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VaultPaymentTokenOrderPaymentLink(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals orderPaymentId ",
          o.get("orderPaymentId").getAsInt(),
          result.get(i).getOrderPaymentId(),
          0.0001);
      assertEquals(
          "expect equals paymentTokenId ",
          o.get("paymentTokenId").getAsInt(),
          result.get(i).getPaymentTokenId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingVertexCustomerCode() throws IOException {
    final String inputFile = "VertexCustomerCode.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexCustomerCode> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexCustomerCode(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals customerCode ",
          o.get("customerCode").getAsString(),
          result.get(i).getCustomerCode());
    }

    result.clear();
  }

  @Test
  public void testParsingVertexInvoiceSent() throws IOException {
    final String inputFile = "VertexInvoiceSent.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexInvoiceSent> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexInvoiceSent(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals invoiceId ",
          o.get("invoiceId").getAsInt(),
          result.get(i).getInvoiceId(),
          0.0001);
      assertEquals(
          "expect equals sentToVertex ",
          o.get("sentToVertex").getAsInt(),
          result.get(i).getSentToVertex(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingVertexOrderInvoiceStatus() throws IOException {
    final String inputFile = "VertexOrderInvoiceStatus.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexOrderInvoiceStatus> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexOrderInvoiceStatus(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals orderId ",
          o.get("orderId").getAsInt(),
          result.get(i).getOrderId(),
          0.0001);
      assertEquals(
          "expect equals sentToVertex ",
          o.get("sentToVertex").getAsInt(),
          result.get(i).getSentToVertex(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingVertexSalesCreditmemoItemInvoiceTextCode() throws IOException {
    final String inputFile = "VertexSalesCreditmemoItemInvoiceTextCode.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexSalesCreditmemoItemInvoiceTextCode> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexSalesCreditmemoItemInvoiceTextCode(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals invoiceTextCode ",
          o.get("invoiceTextCode").getAsString(),
          result.get(i).getInvoiceTextCode());
    }

    result.clear();
  }

  @Test
  public void testParsingVertexSalesCreditmemoItemTaxCode() throws IOException {
    final String inputFile = "VertexSalesCreditmemoItemTaxCode.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexSalesCreditmemoItemTaxCode> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexSalesCreditmemoItemTaxCode(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals taxCode ", o.get("taxCode").getAsString(), result.get(i).getTaxCode());
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingVertexSalesCreditmemoItemVertexTaxCode() throws IOException {
    final String inputFile = "VertexSalesCreditmemoItemVertexTaxCode.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexSalesCreditmemoItemVertexTaxCode> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexSalesCreditmemoItemVertexTaxCode(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals vertexTaxCode ",
          o.get("vertexTaxCode").getAsString(),
          result.get(i).getVertexTaxCode());
    }

    result.clear();
  }

  @Test
  public void testParsingVertexSalesOrderItemInvoiceTextCode() throws IOException {
    final String inputFile = "VertexSalesOrderItemInvoiceTextCode.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexSalesOrderItemInvoiceTextCode> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexSalesOrderItemInvoiceTextCode(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals invoiceTextCode ",
          o.get("invoiceTextCode").getAsString(),
          result.get(i).getInvoiceTextCode());
    }

    result.clear();
  }

  @Test
  public void testParsingVertexSalesOrderItemTaxCode() throws IOException {
    final String inputFile = "VertexSalesOrderItemTaxCode.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexSalesOrderItemTaxCode> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexSalesOrderItemTaxCode(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals taxCode ", o.get("taxCode").getAsString(), result.get(i).getTaxCode());
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingVertexSalesOrderItemVertexTaxCode() throws IOException {
    final String inputFile = "VertexSalesOrderItemVertexTaxCode.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexSalesOrderItemVertexTaxCode> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexSalesOrderItemVertexTaxCode(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals itemId ", o.get("itemId").getAsInt(), result.get(i).getItemId(), 0.0001);
      assertEquals(
          "expect equals vertexTaxCode ",
          o.get("vertexTaxCode").getAsString(),
          result.get(i).getVertexTaxCode());
    }

    result.clear();
  }

  @Test
  public void testParsingVertexTaxrequest() throws IOException {
    final String inputFile = "VertexTaxrequest.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<VertexTaxrequest> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2VertexTaxrequest(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals requestType ",
          o.get("requestType").getAsString(),
          result.get(i).getRequestType());
      assertEquals(
          "expect equals totalTax ", o.get("totalTax").getAsString(), result.get(i).getTotalTax());
      assertEquals(
          "expect equals sourcePath ",
          o.get("sourcePath").getAsString(),
          result.get(i).getSourcePath());
      assertEquals(
          "expect equals taxAreaId ",
          o.get("taxAreaId").getAsString(),
          result.get(i).getTaxAreaId());
      assertEquals(
          "expect equals subTotal ", o.get("subTotal").getAsString(), result.get(i).getSubTotal());
      assertEquals("expect equals total ", o.get("total").getAsString(), result.get(i).getTotal());
      assertEquals(
          "expect equals lookupResult ",
          o.get("lookupResult").getAsString(),
          result.get(i).getLookupResult());
      assertEquals(
          "expect equals requestXml ",
          o.get("requestXml").getAsString(),
          result.get(i).getRequestXml());
      assertEquals(
          "expect equals responseXml ",
          o.get("responseXml").getAsString(),
          result.get(i).getResponseXml());
    }

    result.clear();
  }

  @Test
  public void testParsingWeeeTax() throws IOException {
    final String inputFile = "WeeeTax.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WeeeTax> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WeeeTax(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals valueId ",
          o.get("valueId").getAsInt(),
          result.get(i).getValueId(),
          0.0001);
      assertEquals(
          "expect equals websiteId ",
          o.get("websiteId").getAsInt(),
          result.get(i).getWebsiteId(),
          0.0001);
      assertEquals(
          "expect equals entityId ",
          o.get("entityId").getAsInt(),
          result.get(i).getEntityId(),
          0.0001);
      assertEquals(
          "expect equals country ", o.get("country").getAsString(), result.get(i).getCountry());
      assertEquals(
          "expect equals value ", o.get("value").getAsBigDecimal(), result.get(i).getValue());
      assertEquals(
          "expect equals state ", o.get("state").getAsInt(), result.get(i).getState(), 0.0001);
      assertEquals(
          "expect equals attributeId ",
          o.get("attributeId").getAsInt(),
          result.get(i).getAttributeId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingWidget() throws IOException {
    final String inputFile = "Widget.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Widget> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Widget(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals widgetId ",
          o.get("widgetId").getAsInt(),
          result.get(i).getWidgetId(),
          0.0001);
      assertEquals(
          "expect equals widgetCode ",
          o.get("widgetCode").getAsString(),
          result.get(i).getWidgetCode());
      assertEquals(
          "expect equals widgetType ",
          o.get("widgetType").getAsString(),
          result.get(i).getWidgetType());
      assertEquals(
          "expect equals parameters ",
          o.get("parameters").getAsString(),
          result.get(i).getParameters());
    }

    result.clear();
  }

  @Test
  public void testParsingWidgetInstance() throws IOException {
    final String inputFile = "WidgetInstance.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WidgetInstance> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WidgetInstance(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals instanceId ",
          o.get("instanceId").getAsInt(),
          result.get(i).getInstanceId(),
          0.0001);
      assertEquals(
          "expect equals instanceType ",
          o.get("instanceType").getAsString(),
          result.get(i).getInstanceType());
      assertEquals(
          "expect equals themeId ",
          o.get("themeId").getAsInt(),
          result.get(i).getThemeId(),
          0.0001);
      assertEquals("expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
      assertEquals(
          "expect equals storeIds ", o.get("storeIds").getAsString(), result.get(i).getStoreIds());
      assertEquals(
          "expect equals widgetParameters ",
          o.get("widgetParameters").getAsString(),
          result.get(i).getWidgetParameters());
      assertEquals(
          "expect equals sortOrder ",
          o.get("sortOrder").getAsInt(),
          result.get(i).getSortOrder(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingWidgetInstancePage() throws IOException {
    final String inputFile = "WidgetInstancePage.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WidgetInstancePage> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WidgetInstancePage(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals pageId ", o.get("pageId").getAsInt(), result.get(i).getPageId(), 0.0001);
      assertEquals(
          "expect equals instanceId ",
          o.get("instanceId").getAsInt(),
          result.get(i).getInstanceId(),
          0.0001);
      assertEquals(
          "expect equals pageGroup ",
          o.get("pageGroup").getAsString(),
          result.get(i).getPageGroup());
      assertEquals(
          "expect equals layoutHandle ",
          o.get("layoutHandle").getAsString(),
          result.get(i).getLayoutHandle());
      assertEquals(
          "expect equals blockReference ",
          o.get("blockReference").getAsString(),
          result.get(i).getBlockReference());
      assertEquals(
          "expect equals pageFor ", o.get("pageFor").getAsString(), result.get(i).getPageFor());
      assertEquals(
          "expect equals entities ", o.get("entities").getAsString(), result.get(i).getEntities());
      assertEquals(
          "expect equals pageTemplate ",
          o.get("pageTemplate").getAsString(),
          result.get(i).getPageTemplate());
    }

    result.clear();
  }

  @Test
  public void testParsingWidgetInstancePageLayout() throws IOException {
    final String inputFile = "WidgetInstancePageLayout.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WidgetInstancePageLayout> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WidgetInstancePageLayout(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals pageId ", o.get("pageId").getAsInt(), result.get(i).getPageId(), 0.0001);
      assertEquals(
          "expect equals layoutUpdateId ",
          o.get("layoutUpdateId").getAsInt(),
          result.get(i).getLayoutUpdateId(),
          0.0001);
    }

    result.clear();
  }

  @Test
  public void testParsingWishlist() throws IOException {
    final String inputFile = "Wishlist.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<Wishlist> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2Wishlist(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals wishlistId ",
          o.get("wishlistId").getAsInt(),
          result.get(i).getWishlistId(),
          0.0001);
      assertEquals(
          "expect equals customerId ",
          o.get("customerId").getAsInt(),
          result.get(i).getCustomerId(),
          0.0001);
      assertEquals(
          "expect equals shared ", o.get("shared").getAsInt(), result.get(i).getShared(), 0.0001);
      assertEquals(
          "expect equals sharingCode ",
          o.get("sharingCode").getAsString(),
          result.get(i).getSharingCode());
    }

    result.clear();
  }

  @Test
  public void testParsingWishlistItem() throws IOException {
    final String inputFile = "WishlistItem.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WishlistItem> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WishlistItem(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals wishlistItemId ",
          o.get("wishlistItemId").getAsInt(),
          result.get(i).getWishlistItemId(),
          0.0001);
      assertEquals(
          "expect equals wishlistId ",
          o.get("wishlistId").getAsInt(),
          result.get(i).getWishlistId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals(
          "expect equals storeId ",
          o.get("storeId").getAsInt(),
          result.get(i).getStoreId(),
          0.0001);
      assertEquals(
          "expect equals description ",
          o.get("description").getAsString(),
          result.get(i).getDescription());
      assertEquals("expect equals qty ", o.get("qty").getAsBigDecimal(), result.get(i).getQty());
    }

    result.clear();
  }

  @Test
  public void testParsingWishlistItemOption() throws IOException {
    final String inputFile = "WishlistItemOption.json";
    final String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    JsonArray arr = JsonHelper.fromJson2Arr(json);
    final List<WishlistItemOption> result = new ArrayList<>();
    arr.forEach(o -> result.add(JsonHelper.fromJson2WishlistItemOption(o)));
    for (int i = 0; i < arr.size(); i++) {
      JsonObject o = arr.get(i).getAsJsonObject();
      assertEquals(
          "expect equals optionId ",
          o.get("optionId").getAsInt(),
          result.get(i).getOptionId(),
          0.0001);
      assertEquals(
          "expect equals wishlistItemId ",
          o.get("wishlistItemId").getAsInt(),
          result.get(i).getWishlistItemId(),
          0.0001);
      assertEquals(
          "expect equals productId ",
          o.get("productId").getAsInt(),
          result.get(i).getProductId(),
          0.0001);
      assertEquals("expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
      assertEquals("expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
    }

    result.clear();
  }
}
