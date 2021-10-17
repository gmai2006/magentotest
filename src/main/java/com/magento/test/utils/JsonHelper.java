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

import com.magento.test.entity.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Objects;

public class JsonHelper {
  static final Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AdminPasswords.
   */
  public static AdminPasswords fromJson2AdminPasswords(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AdminPasswords.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AdminSystemMessages.
   */
  public static AdminSystemMessages fromJson2AdminSystemMessages(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AdminSystemMessages.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AdminUser.
   */
  public static AdminUser fromJson2AdminUser(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AdminUser.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AdminUserSession.
   */
  public static AdminUserSession fromJson2AdminUserSession(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AdminUserSession.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AdminnotificationInbox.
   */
  public static AdminnotificationInbox fromJson2AdminnotificationInbox(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AdminnotificationInbox.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AmazonCustomer.
   */
  public static AmazonCustomer fromJson2AmazonCustomer(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AmazonCustomer.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AmazonPendingAuthorization.
   */
  public static AmazonPendingAuthorization fromJson2AmazonPendingAuthorization(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AmazonPendingAuthorization.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AmazonPendingCapture.
   */
  public static AmazonPendingCapture fromJson2AmazonPendingCapture(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AmazonPendingCapture.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AmazonPendingRefund.
   */
  public static AmazonPendingRefund fromJson2AmazonPendingRefund(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AmazonPendingRefund.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AmazonQuote.
   */
  public static AmazonQuote fromJson2AmazonQuote(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AmazonQuote.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AmazonSalesOrder.
   */
  public static AmazonSalesOrder fromJson2AmazonSalesOrder(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AmazonSalesOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AuthorizationRole.
   */
  public static AuthorizationRole fromJson2AuthorizationRole(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AuthorizationRole.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The AuthorizationRule.
   */
  public static AuthorizationRule fromJson2AuthorizationRule(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, AuthorizationRule.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Cache.
   */
  public static Cache fromJson2Cache(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Cache.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CacheTag.
   */
  public static CacheTag fromJson2CacheTag(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CacheTag.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CaptchaLog.
   */
  public static CaptchaLog fromJson2CaptchaLog(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CaptchaLog.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryEntity.
   */
  public static CatalogCategoryEntity fromJson2CatalogCategoryEntity(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryEntity.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryEntityDatetime.
   */
  public static CatalogCategoryEntityDatetime fromJson2CatalogCategoryEntityDatetime(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryEntityDatetime.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryEntityDecimal.
   */
  public static CatalogCategoryEntityDecimal fromJson2CatalogCategoryEntityDecimal(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryEntityDecimal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryEntityInt.
   */
  public static CatalogCategoryEntityInt fromJson2CatalogCategoryEntityInt(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryEntityInt.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryEntityText.
   */
  public static CatalogCategoryEntityText fromJson2CatalogCategoryEntityText(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryEntityText.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryEntityVarchar.
   */
  public static CatalogCategoryEntityVarchar fromJson2CatalogCategoryEntityVarchar(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryEntityVarchar.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryProduct.
   */
  public static CatalogCategoryProduct fromJson2CatalogCategoryProduct(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryProduct.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryProductIndex.
   */
  public static CatalogCategoryProductIndex fromJson2CatalogCategoryProductIndex(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryProductIndex.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryProductIndexReplica.
   */
  public static CatalogCategoryProductIndexReplica fromJson2CatalogCategoryProductIndexReplica(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryProductIndexReplica.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryProductIndexStore1.
   */
  public static CatalogCategoryProductIndexStore1 fromJson2CatalogCategoryProductIndexStore1(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryProductIndexStore1.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryProductIndexStore1Replica.
   */
  public static CatalogCategoryProductIndexStore1Replica
      fromJson2CatalogCategoryProductIndexStore1Replica(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryProductIndexStore1Replica.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCategoryProductIndexTmp.
   */
  public static CatalogCategoryProductIndexTmp fromJson2CatalogCategoryProductIndexTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCategoryProductIndexTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogCompareItem.
   */
  public static CatalogCompareItem fromJson2CatalogCompareItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogCompareItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogEavAttribute.
   */
  public static CatalogEavAttribute fromJson2CatalogEavAttribute(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogEavAttribute.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductBundleOption.
   */
  public static CatalogProductBundleOption fromJson2CatalogProductBundleOption(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductBundleOption.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductBundleOptionValue.
   */
  public static CatalogProductBundleOptionValue fromJson2CatalogProductBundleOptionValue(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductBundleOptionValue.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductBundlePriceIndex.
   */
  public static CatalogProductBundlePriceIndex fromJson2CatalogProductBundlePriceIndex(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductBundlePriceIndex.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductBundleSelection.
   */
  public static CatalogProductBundleSelection fromJson2CatalogProductBundleSelection(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductBundleSelection.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductBundleSelectionPrice.
   */
  public static CatalogProductBundleSelectionPrice fromJson2CatalogProductBundleSelectionPrice(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductBundleSelectionPrice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductBundleStockIndex.
   */
  public static CatalogProductBundleStockIndex fromJson2CatalogProductBundleStockIndex(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductBundleStockIndex.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntity.
   */
  public static CatalogProductEntity fromJson2CatalogProductEntity(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntity.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityDatetime.
   */
  public static CatalogProductEntityDatetime fromJson2CatalogProductEntityDatetime(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityDatetime.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityDecimal.
   */
  public static CatalogProductEntityDecimal fromJson2CatalogProductEntityDecimal(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityDecimal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityGallery.
   */
  public static CatalogProductEntityGallery fromJson2CatalogProductEntityGallery(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityGallery.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityInt.
   */
  public static CatalogProductEntityInt fromJson2CatalogProductEntityInt(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityInt.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityMediaGallery.
   */
  public static CatalogProductEntityMediaGallery fromJson2CatalogProductEntityMediaGallery(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityMediaGallery.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityMediaGalleryValue.
   */
  public static CatalogProductEntityMediaGalleryValue
      fromJson2CatalogProductEntityMediaGalleryValue(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityMediaGalleryValue.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityMediaGalleryValueToEntity.
   */
  public static CatalogProductEntityMediaGalleryValueToEntity
      fromJson2CatalogProductEntityMediaGalleryValueToEntity(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityMediaGalleryValueToEntity.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityMediaGalleryValueVideo.
   */
  public static CatalogProductEntityMediaGalleryValueVideo
      fromJson2CatalogProductEntityMediaGalleryValueVideo(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityMediaGalleryValueVideo.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityText.
   */
  public static CatalogProductEntityText fromJson2CatalogProductEntityText(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityText.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityTierPrice.
   */
  public static CatalogProductEntityTierPrice fromJson2CatalogProductEntityTierPrice(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityTierPrice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductEntityVarchar.
   */
  public static CatalogProductEntityVarchar fromJson2CatalogProductEntityVarchar(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductEntityVarchar.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductFrontendAction.
   */
  public static CatalogProductFrontendAction fromJson2CatalogProductFrontendAction(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductFrontendAction.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexEav.
   */
  public static CatalogProductIndexEav fromJson2CatalogProductIndexEav(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexEav.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexEavDecimal.
   */
  public static CatalogProductIndexEavDecimal fromJson2CatalogProductIndexEavDecimal(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexEavDecimal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexEavDecimalIdx.
   */
  public static CatalogProductIndexEavDecimalIdx fromJson2CatalogProductIndexEavDecimalIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexEavDecimalIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexEavDecimalReplica.
   */
  public static CatalogProductIndexEavDecimalReplica fromJson2CatalogProductIndexEavDecimalReplica(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexEavDecimalReplica.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexEavDecimalTmp.
   */
  public static CatalogProductIndexEavDecimalTmp fromJson2CatalogProductIndexEavDecimalTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexEavDecimalTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexEavIdx.
   */
  public static CatalogProductIndexEavIdx fromJson2CatalogProductIndexEavIdx(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexEavIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexEavReplica.
   */
  public static CatalogProductIndexEavReplica fromJson2CatalogProductIndexEavReplica(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexEavReplica.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexEavTmp.
   */
  public static CatalogProductIndexEavTmp fromJson2CatalogProductIndexEavTmp(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexEavTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPrice.
   */
  public static CatalogProductIndexPrice fromJson2CatalogProductIndexPrice(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPrice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceBundleIdx.
   */
  public static CatalogProductIndexPriceBundleIdx fromJson2CatalogProductIndexPriceBundleIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceBundleIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceBundleOptIdx.
   */
  public static CatalogProductIndexPriceBundleOptIdx fromJson2CatalogProductIndexPriceBundleOptIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceBundleOptIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceBundleOptTmp.
   */
  public static CatalogProductIndexPriceBundleOptTmp fromJson2CatalogProductIndexPriceBundleOptTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceBundleOptTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceBundleSelIdx.
   */
  public static CatalogProductIndexPriceBundleSelIdx fromJson2CatalogProductIndexPriceBundleSelIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceBundleSelIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceBundleSelTmp.
   */
  public static CatalogProductIndexPriceBundleSelTmp fromJson2CatalogProductIndexPriceBundleSelTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceBundleSelTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceBundleTmp.
   */
  public static CatalogProductIndexPriceBundleTmp fromJson2CatalogProductIndexPriceBundleTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceBundleTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceCfgOptAgrIdx.
   */
  public static CatalogProductIndexPriceCfgOptAgrIdx fromJson2CatalogProductIndexPriceCfgOptAgrIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceCfgOptAgrIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceCfgOptAgrTmp.
   */
  public static CatalogProductIndexPriceCfgOptAgrTmp fromJson2CatalogProductIndexPriceCfgOptAgrTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceCfgOptAgrTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceCfgOptIdx.
   */
  public static CatalogProductIndexPriceCfgOptIdx fromJson2CatalogProductIndexPriceCfgOptIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceCfgOptIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceCfgOptTmp.
   */
  public static CatalogProductIndexPriceCfgOptTmp fromJson2CatalogProductIndexPriceCfgOptTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceCfgOptTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceDownlodIdx.
   */
  public static CatalogProductIndexPriceDownlodIdx fromJson2CatalogProductIndexPriceDownlodIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceDownlodIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceDownlodTmp.
   */
  public static CatalogProductIndexPriceDownlodTmp fromJson2CatalogProductIndexPriceDownlodTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceDownlodTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceFinalIdx.
   */
  public static CatalogProductIndexPriceFinalIdx fromJson2CatalogProductIndexPriceFinalIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceFinalIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceFinalTmp.
   */
  public static CatalogProductIndexPriceFinalTmp fromJson2CatalogProductIndexPriceFinalTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceFinalTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceIdx.
   */
  public static CatalogProductIndexPriceIdx fromJson2CatalogProductIndexPriceIdx(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceOptAgrIdx.
   */
  public static CatalogProductIndexPriceOptAgrIdx fromJson2CatalogProductIndexPriceOptAgrIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceOptAgrIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceOptAgrTmp.
   */
  public static CatalogProductIndexPriceOptAgrTmp fromJson2CatalogProductIndexPriceOptAgrTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceOptAgrTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceOptIdx.
   */
  public static CatalogProductIndexPriceOptIdx fromJson2CatalogProductIndexPriceOptIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceOptIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceOptTmp.
   */
  public static CatalogProductIndexPriceOptTmp fromJson2CatalogProductIndexPriceOptTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceOptTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceReplica.
   */
  public static CatalogProductIndexPriceReplica fromJson2CatalogProductIndexPriceReplica(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceReplica.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexPriceTmp.
   */
  public static CatalogProductIndexPriceTmp fromJson2CatalogProductIndexPriceTmp(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexPriceTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexTierPrice.
   */
  public static CatalogProductIndexTierPrice fromJson2CatalogProductIndexTierPrice(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexTierPrice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductIndexWebsite.
   */
  public static CatalogProductIndexWebsite fromJson2CatalogProductIndexWebsite(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductIndexWebsite.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductLink.
   */
  public static CatalogProductLink fromJson2CatalogProductLink(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductLink.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductLinkAttribute.
   */
  public static CatalogProductLinkAttribute fromJson2CatalogProductLinkAttribute(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductLinkAttribute.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductLinkAttributeDecimal.
   */
  public static CatalogProductLinkAttributeDecimal fromJson2CatalogProductLinkAttributeDecimal(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductLinkAttributeDecimal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductLinkAttributeInt.
   */
  public static CatalogProductLinkAttributeInt fromJson2CatalogProductLinkAttributeInt(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductLinkAttributeInt.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductLinkAttributeVarchar.
   */
  public static CatalogProductLinkAttributeVarchar fromJson2CatalogProductLinkAttributeVarchar(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductLinkAttributeVarchar.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductLinkType.
   */
  public static CatalogProductLinkType fromJson2CatalogProductLinkType(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductLinkType.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductOption.
   */
  public static CatalogProductOption fromJson2CatalogProductOption(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductOption.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductOptionPrice.
   */
  public static CatalogProductOptionPrice fromJson2CatalogProductOptionPrice(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductOptionPrice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductOptionTitle.
   */
  public static CatalogProductOptionTitle fromJson2CatalogProductOptionTitle(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductOptionTitle.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductOptionTypePrice.
   */
  public static CatalogProductOptionTypePrice fromJson2CatalogProductOptionTypePrice(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductOptionTypePrice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductOptionTypeTitle.
   */
  public static CatalogProductOptionTypeTitle fromJson2CatalogProductOptionTypeTitle(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductOptionTypeTitle.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductOptionTypeValue.
   */
  public static CatalogProductOptionTypeValue fromJson2CatalogProductOptionTypeValue(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductOptionTypeValue.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductRelation.
   */
  public static CatalogProductRelation fromJson2CatalogProductRelation(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductRelation.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductSuperAttribute.
   */
  public static CatalogProductSuperAttribute fromJson2CatalogProductSuperAttribute(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductSuperAttribute.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductSuperAttributeLabel.
   */
  public static CatalogProductSuperAttributeLabel fromJson2CatalogProductSuperAttributeLabel(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductSuperAttributeLabel.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductSuperLink.
   */
  public static CatalogProductSuperLink fromJson2CatalogProductSuperLink(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductSuperLink.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogProductWebsite.
   */
  public static CatalogProductWebsite fromJson2CatalogProductWebsite(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogProductWebsite.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogUrlRewriteProductCategory.
   */
  public static CatalogUrlRewriteProductCategory fromJson2CatalogUrlRewriteProductCategory(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogUrlRewriteProductCategory.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CataloginventoryStock.
   */
  public static CataloginventoryStock fromJson2CataloginventoryStock(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CataloginventoryStock.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CataloginventoryStockItem.
   */
  public static CataloginventoryStockItem fromJson2CataloginventoryStockItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CataloginventoryStockItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CataloginventoryStockStatus.
   */
  public static CataloginventoryStockStatus fromJson2CataloginventoryStockStatus(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CataloginventoryStockStatus.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CataloginventoryStockStatusIdx.
   */
  public static CataloginventoryStockStatusIdx fromJson2CataloginventoryStockStatusIdx(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CataloginventoryStockStatusIdx.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CataloginventoryStockStatusReplica.
   */
  public static CataloginventoryStockStatusReplica fromJson2CataloginventoryStockStatusReplica(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CataloginventoryStockStatusReplica.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CataloginventoryStockStatusTmp.
   */
  public static CataloginventoryStockStatusTmp fromJson2CataloginventoryStockStatusTmp(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CataloginventoryStockStatusTmp.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Catalogrule.
   */
  public static Catalogrule fromJson2Catalogrule(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Catalogrule.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogruleCustomerGroup.
   */
  public static CatalogruleCustomerGroup fromJson2CatalogruleCustomerGroup(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogruleCustomerGroup.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogruleGroupWebsite.
   */
  public static CatalogruleGroupWebsite fromJson2CatalogruleGroupWebsite(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogruleGroupWebsite.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogruleGroupWebsiteReplica.
   */
  public static CatalogruleGroupWebsiteReplica fromJson2CatalogruleGroupWebsiteReplica(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogruleGroupWebsiteReplica.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogruleProduct.
   */
  public static CatalogruleProduct fromJson2CatalogruleProduct(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogruleProduct.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogruleProductPrice.
   */
  public static CatalogruleProductPrice fromJson2CatalogruleProductPrice(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogruleProductPrice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogruleProductPriceReplica.
   */
  public static CatalogruleProductPriceReplica fromJson2CatalogruleProductPriceReplica(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogruleProductPriceReplica.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogruleProductReplica.
   */
  public static CatalogruleProductReplica fromJson2CatalogruleProductReplica(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogruleProductReplica.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogruleWebsite.
   */
  public static CatalogruleWebsite fromJson2CatalogruleWebsite(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogruleWebsite.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogsearchFulltextScope1.
   */
  public static CatalogsearchFulltextScope1 fromJson2CatalogsearchFulltextScope1(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogsearchFulltextScope1.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CatalogsearchRecommendations.
   */
  public static CatalogsearchRecommendations fromJson2CatalogsearchRecommendations(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CatalogsearchRecommendations.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CheckoutAgreement.
   */
  public static CheckoutAgreement fromJson2CheckoutAgreement(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CheckoutAgreement.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CheckoutAgreementStore.
   */
  public static CheckoutAgreementStore fromJson2CheckoutAgreementStore(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CheckoutAgreementStore.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CmsBlock.
   */
  public static CmsBlock fromJson2CmsBlock(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CmsBlock.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CmsBlockStore.
   */
  public static CmsBlockStore fromJson2CmsBlockStore(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CmsBlockStore.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CmsPage.
   */
  public static CmsPage fromJson2CmsPage(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CmsPage.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CmsPageStore.
   */
  public static CmsPageStore fromJson2CmsPageStore(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CmsPageStore.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CoreConfigData.
   */
  public static CoreConfigData fromJson2CoreConfigData(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CoreConfigData.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CronSchedule.
   */
  public static CronSchedule fromJson2CronSchedule(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CronSchedule.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerAddressEntity.
   */
  public static CustomerAddressEntity fromJson2CustomerAddressEntity(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerAddressEntity.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerAddressEntityDatetime.
   */
  public static CustomerAddressEntityDatetime fromJson2CustomerAddressEntityDatetime(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerAddressEntityDatetime.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerAddressEntityDecimal.
   */
  public static CustomerAddressEntityDecimal fromJson2CustomerAddressEntityDecimal(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerAddressEntityDecimal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerAddressEntityInt.
   */
  public static CustomerAddressEntityInt fromJson2CustomerAddressEntityInt(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerAddressEntityInt.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerAddressEntityText.
   */
  public static CustomerAddressEntityText fromJson2CustomerAddressEntityText(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerAddressEntityText.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerAddressEntityVarchar.
   */
  public static CustomerAddressEntityVarchar fromJson2CustomerAddressEntityVarchar(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerAddressEntityVarchar.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerEavAttribute.
   */
  public static CustomerEavAttribute fromJson2CustomerEavAttribute(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerEavAttribute.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerEavAttributeWebsite.
   */
  public static CustomerEavAttributeWebsite fromJson2CustomerEavAttributeWebsite(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerEavAttributeWebsite.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerEntity.
   */
  public static CustomerEntity fromJson2CustomerEntity(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerEntity.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerEntityDatetime.
   */
  public static CustomerEntityDatetime fromJson2CustomerEntityDatetime(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerEntityDatetime.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerEntityDecimal.
   */
  public static CustomerEntityDecimal fromJson2CustomerEntityDecimal(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerEntityDecimal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerEntityInt.
   */
  public static CustomerEntityInt fromJson2CustomerEntityInt(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerEntityInt.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerEntityText.
   */
  public static CustomerEntityText fromJson2CustomerEntityText(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerEntityText.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerEntityVarchar.
   */
  public static CustomerEntityVarchar fromJson2CustomerEntityVarchar(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerEntityVarchar.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerFormAttribute.
   */
  public static CustomerFormAttribute fromJson2CustomerFormAttribute(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerFormAttribute.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerGridFlat.
   */
  public static CustomerGridFlat fromJson2CustomerGridFlat(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerGridFlat.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerGroup.
   */
  public static CustomerGroup fromJson2CustomerGroup(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerGroup.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerLog.
   */
  public static CustomerLog fromJson2CustomerLog(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerLog.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The CustomerVisitor.
   */
  public static CustomerVisitor fromJson2CustomerVisitor(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, CustomerVisitor.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DesignChange.
   */
  public static DesignChange fromJson2DesignChange(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DesignChange.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DesignConfigGridFlat.
   */
  public static DesignConfigGridFlat fromJson2DesignConfigGridFlat(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DesignConfigGridFlat.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DirectoryCountry.
   */
  public static DirectoryCountry fromJson2DirectoryCountry(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DirectoryCountry.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DirectoryCountryFormat.
   */
  public static DirectoryCountryFormat fromJson2DirectoryCountryFormat(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DirectoryCountryFormat.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DirectoryCountryRegion.
   */
  public static DirectoryCountryRegion fromJson2DirectoryCountryRegion(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DirectoryCountryRegion.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DirectoryCountryRegionName.
   */
  public static DirectoryCountryRegionName fromJson2DirectoryCountryRegionName(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DirectoryCountryRegionName.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DirectoryCurrencyRate.
   */
  public static DirectoryCurrencyRate fromJson2DirectoryCurrencyRate(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DirectoryCurrencyRate.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DownloadableLink.
   */
  public static DownloadableLink fromJson2DownloadableLink(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DownloadableLink.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DownloadableLinkPrice.
   */
  public static DownloadableLinkPrice fromJson2DownloadableLinkPrice(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DownloadableLinkPrice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DownloadableLinkPurchased.
   */
  public static DownloadableLinkPurchased fromJson2DownloadableLinkPurchased(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DownloadableLinkPurchased.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DownloadableLinkPurchasedItem.
   */
  public static DownloadableLinkPurchasedItem fromJson2DownloadableLinkPurchasedItem(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DownloadableLinkPurchasedItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DownloadableLinkTitle.
   */
  public static DownloadableLinkTitle fromJson2DownloadableLinkTitle(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DownloadableLinkTitle.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DownloadableSample.
   */
  public static DownloadableSample fromJson2DownloadableSample(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DownloadableSample.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The DownloadableSampleTitle.
   */
  public static DownloadableSampleTitle fromJson2DownloadableSampleTitle(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, DownloadableSampleTitle.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavAttribute.
   */
  public static EavAttribute fromJson2EavAttribute(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavAttribute.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavAttributeGroup.
   */
  public static EavAttributeGroup fromJson2EavAttributeGroup(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavAttributeGroup.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavAttributeLabel.
   */
  public static EavAttributeLabel fromJson2EavAttributeLabel(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavAttributeLabel.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavAttributeOption.
   */
  public static EavAttributeOption fromJson2EavAttributeOption(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavAttributeOption.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavAttributeOptionSwatch.
   */
  public static EavAttributeOptionSwatch fromJson2EavAttributeOptionSwatch(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavAttributeOptionSwatch.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavAttributeOptionValue.
   */
  public static EavAttributeOptionValue fromJson2EavAttributeOptionValue(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavAttributeOptionValue.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavAttributeSet.
   */
  public static EavAttributeSet fromJson2EavAttributeSet(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavAttributeSet.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavEntity.
   */
  public static EavEntity fromJson2EavEntity(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavEntity.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavEntityAttribute.
   */
  public static EavEntityAttribute fromJson2EavEntityAttribute(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavEntityAttribute.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavEntityDatetime.
   */
  public static EavEntityDatetime fromJson2EavEntityDatetime(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavEntityDatetime.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavEntityDecimal.
   */
  public static EavEntityDecimal fromJson2EavEntityDecimal(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavEntityDecimal.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavEntityInt.
   */
  public static EavEntityInt fromJson2EavEntityInt(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavEntityInt.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavEntityStore.
   */
  public static EavEntityStore fromJson2EavEntityStore(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavEntityStore.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavEntityText.
   */
  public static EavEntityText fromJson2EavEntityText(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavEntityText.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavEntityType.
   */
  public static EavEntityType fromJson2EavEntityType(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavEntityType.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavEntityVarchar.
   */
  public static EavEntityVarchar fromJson2EavEntityVarchar(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavEntityVarchar.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavFormElement.
   */
  public static EavFormElement fromJson2EavFormElement(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavFormElement.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavFormFieldset.
   */
  public static EavFormFieldset fromJson2EavFormFieldset(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavFormFieldset.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavFormFieldsetLabel.
   */
  public static EavFormFieldsetLabel fromJson2EavFormFieldsetLabel(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavFormFieldsetLabel.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavFormType.
   */
  public static EavFormType fromJson2EavFormType(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavFormType.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EavFormTypeEntity.
   */
  public static EavFormTypeEntity fromJson2EavFormTypeEntity(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EavFormTypeEntity.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailAbandonedCart.
   */
  public static EmailAbandonedCart fromJson2EmailAbandonedCart(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailAbandonedCart.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailAutomation.
   */
  public static EmailAutomation fromJson2EmailAutomation(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailAutomation.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailCampaign.
   */
  public static EmailCampaign fromJson2EmailCampaign(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailCampaign.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailCatalog.
   */
  public static EmailCatalog fromJson2EmailCatalog(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailCatalog.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailContact.
   */
  public static EmailContact fromJson2EmailContact(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailContact.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailContactConsent.
   */
  public static EmailContactConsent fromJson2EmailContactConsent(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailContactConsent.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailFailedAuth.
   */
  public static EmailFailedAuth fromJson2EmailFailedAuth(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailFailedAuth.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailImporter.
   */
  public static EmailImporter fromJson2EmailImporter(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailImporter.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailOrder.
   */
  public static EmailOrder fromJson2EmailOrder(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailReview.
   */
  public static EmailReview fromJson2EmailReview(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailReview.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailRules.
   */
  public static EmailRules fromJson2EmailRules(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailRules.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailTemplate.
   */
  public static EmailTemplate fromJson2EmailTemplate(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailTemplate.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The EmailWishlist.
   */
  public static EmailWishlist fromJson2EmailWishlist(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, EmailWishlist.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Flag.
   */
  public static Flag fromJson2Flag(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Flag.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The GiftMessage.
   */
  public static GiftMessage fromJson2GiftMessage(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, GiftMessage.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The GoogleoptimizerCode.
   */
  public static GoogleoptimizerCode fromJson2GoogleoptimizerCode(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, GoogleoptimizerCode.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ImportHistory.
   */
  public static ImportHistory fromJson2ImportHistory(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ImportHistory.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ImportexportImportdata.
   */
  public static ImportexportImportdata fromJson2ImportexportImportdata(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ImportexportImportdata.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The IndexerState.
   */
  public static IndexerState fromJson2IndexerState(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, IndexerState.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Integration.
   */
  public static Integration fromJson2Integration(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Integration.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventoryGeoname.
   */
  public static InventoryGeoname fromJson2InventoryGeoname(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventoryGeoname.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventoryLowStockNotificationConfiguration.
   */
  public static InventoryLowStockNotificationConfiguration
      fromJson2InventoryLowStockNotificationConfiguration(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventoryLowStockNotificationConfiguration.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventoryReservation.
   */
  public static InventoryReservation fromJson2InventoryReservation(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventoryReservation.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventoryShipmentSource.
   */
  public static InventoryShipmentSource fromJson2InventoryShipmentSource(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventoryShipmentSource.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventorySource.
   */
  public static InventorySource fromJson2InventorySource(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventorySource.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventorySourceCarrierLink.
   */
  public static InventorySourceCarrierLink fromJson2InventorySourceCarrierLink(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventorySourceCarrierLink.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventorySourceItem.
   */
  public static InventorySourceItem fromJson2InventorySourceItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventorySourceItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventorySourceStockLink.
   */
  public static InventorySourceStockLink fromJson2InventorySourceStockLink(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventorySourceStockLink.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventoryStock.
   */
  public static InventoryStock fromJson2InventoryStock(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventoryStock.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The InventoryStockSalesChannel.
   */
  public static InventoryStockSalesChannel fromJson2InventoryStockSalesChannel(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, InventoryStockSalesChannel.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The KlarnaCoreOrder.
   */
  public static KlarnaCoreOrder fromJson2KlarnaCoreOrder(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, KlarnaCoreOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The KlarnaPaymentsQuote.
   */
  public static KlarnaPaymentsQuote fromJson2KlarnaPaymentsQuote(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, KlarnaPaymentsQuote.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The LayoutLink.
   */
  public static LayoutLink fromJson2LayoutLink(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, LayoutLink.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The LayoutUpdate.
   */
  public static LayoutUpdate fromJson2LayoutUpdate(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, LayoutUpdate.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MagentoAcknowledgedBulk.
   */
  public static MagentoAcknowledgedBulk fromJson2MagentoAcknowledgedBulk(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MagentoAcknowledgedBulk.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MagentoBulk.
   */
  public static MagentoBulk fromJson2MagentoBulk(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MagentoBulk.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MagentoOperation.
   */
  public static MagentoOperation fromJson2MagentoOperation(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MagentoOperation.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MspTfaCountryCodes.
   */
  public static MspTfaCountryCodes fromJson2MspTfaCountryCodes(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MspTfaCountryCodes.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MspTfaTrusted.
   */
  public static MspTfaTrusted fromJson2MspTfaTrusted(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MspTfaTrusted.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MspTfaUserConfig.
   */
  public static MspTfaUserConfig fromJson2MspTfaUserConfig(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MspTfaUserConfig.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The MviewState.
   */
  public static MviewState fromJson2MviewState(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, MviewState.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The NewsletterProblem.
   */
  public static NewsletterProblem fromJson2NewsletterProblem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, NewsletterProblem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The NewsletterQueue.
   */
  public static NewsletterQueue fromJson2NewsletterQueue(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, NewsletterQueue.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The NewsletterQueueLink.
   */
  public static NewsletterQueueLink fromJson2NewsletterQueueLink(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, NewsletterQueueLink.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The NewsletterQueueStoreLink.
   */
  public static NewsletterQueueStoreLink fromJson2NewsletterQueueStoreLink(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, NewsletterQueueStoreLink.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The NewsletterSubscriber.
   */
  public static NewsletterSubscriber fromJson2NewsletterSubscriber(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, NewsletterSubscriber.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The NewsletterTemplate.
   */
  public static NewsletterTemplate fromJson2NewsletterTemplate(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, NewsletterTemplate.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The OauthConsumer.
   */
  public static OauthConsumer fromJson2OauthConsumer(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, OauthConsumer.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The OauthNonce.
   */
  public static OauthNonce fromJson2OauthNonce(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, OauthNonce.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The OauthToken.
   */
  public static OauthToken fromJson2OauthToken(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, OauthToken.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The OauthTokenRequestLog.
   */
  public static OauthTokenRequestLog fromJson2OauthTokenRequestLog(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, OauthTokenRequestLog.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The PasswordResetRequestEvent.
   */
  public static PasswordResetRequestEvent fromJson2PasswordResetRequestEvent(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, PasswordResetRequestEvent.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The PatchList.
   */
  public static PatchList fromJson2PatchList(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, PatchList.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The PaypalBillingAgreement.
   */
  public static PaypalBillingAgreement fromJson2PaypalBillingAgreement(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, PaypalBillingAgreement.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The PaypalBillingAgreementOrder.
   */
  public static PaypalBillingAgreementOrder fromJson2PaypalBillingAgreementOrder(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, PaypalBillingAgreementOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The PaypalCert.
   */
  public static PaypalCert fromJson2PaypalCert(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, PaypalCert.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The PaypalPaymentTransaction.
   */
  public static PaypalPaymentTransaction fromJson2PaypalPaymentTransaction(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, PaypalPaymentTransaction.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The PaypalSettlementReport.
   */
  public static PaypalSettlementReport fromJson2PaypalSettlementReport(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, PaypalSettlementReport.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The PaypalSettlementReportRow.
   */
  public static PaypalSettlementReportRow fromJson2PaypalSettlementReportRow(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, PaypalSettlementReportRow.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The PersistentSession.
   */
  public static PersistentSession fromJson2PersistentSession(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, PersistentSession.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ProductAlertPrice.
   */
  public static ProductAlertPrice fromJson2ProductAlertPrice(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ProductAlertPrice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ProductAlertStock.
   */
  public static ProductAlertStock fromJson2ProductAlertStock(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ProductAlertStock.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Queue.
   */
  public static Queue fromJson2Queue(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Queue.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QueueLock.
   */
  public static QueueLock fromJson2QueueLock(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QueueLock.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QueueMessage.
   */
  public static QueueMessage fromJson2QueueMessage(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QueueMessage.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QueueMessageStatus.
   */
  public static QueueMessageStatus fromJson2QueueMessageStatus(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QueueMessageStatus.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QueuePoisonPill.
   */
  public static QueuePoisonPill fromJson2QueuePoisonPill(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QueuePoisonPill.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Quote.
   */
  public static Quote fromJson2Quote(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Quote.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QuoteAddress.
   */
  public static QuoteAddress fromJson2QuoteAddress(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QuoteAddress.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QuoteAddressItem.
   */
  public static QuoteAddressItem fromJson2QuoteAddressItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QuoteAddressItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QuoteIdMask.
   */
  public static QuoteIdMask fromJson2QuoteIdMask(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QuoteIdMask.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QuoteItem.
   */
  public static QuoteItem fromJson2QuoteItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QuoteItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QuoteItemOption.
   */
  public static QuoteItemOption fromJson2QuoteItemOption(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QuoteItemOption.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QuotePayment.
   */
  public static QuotePayment fromJson2QuotePayment(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QuotePayment.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The QuoteShippingRate.
   */
  public static QuoteShippingRate fromJson2QuoteShippingRate(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, QuoteShippingRate.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Rating.
   */
  public static Rating fromJson2Rating(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Rating.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The RatingEntity.
   */
  public static RatingEntity fromJson2RatingEntity(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, RatingEntity.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The RatingOption.
   */
  public static RatingOption fromJson2RatingOption(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, RatingOption.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The RatingOptionVote.
   */
  public static RatingOptionVote fromJson2RatingOptionVote(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, RatingOptionVote.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The RatingOptionVoteAggregated.
   */
  public static RatingOptionVoteAggregated fromJson2RatingOptionVoteAggregated(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, RatingOptionVoteAggregated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The RatingStore.
   */
  public static RatingStore fromJson2RatingStore(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, RatingStore.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The RatingTitle.
   */
  public static RatingTitle fromJson2RatingTitle(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, RatingTitle.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReleaseNotificationViewerLog.
   */
  public static ReleaseNotificationViewerLog fromJson2ReleaseNotificationViewerLog(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReleaseNotificationViewerLog.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportComparedProductIndex.
   */
  public static ReportComparedProductIndex fromJson2ReportComparedProductIndex(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportComparedProductIndex.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportEvent.
   */
  public static ReportEvent fromJson2ReportEvent(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportEvent.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportEventTypes.
   */
  public static ReportEventTypes fromJson2ReportEventTypes(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportEventTypes.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportViewedProductAggregatedDaily.
   */
  public static ReportViewedProductAggregatedDaily fromJson2ReportViewedProductAggregatedDaily(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportViewedProductAggregatedDaily.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportViewedProductAggregatedMonthly.
   */
  public static ReportViewedProductAggregatedMonthly fromJson2ReportViewedProductAggregatedMonthly(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportViewedProductAggregatedMonthly.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportViewedProductAggregatedYearly.
   */
  public static ReportViewedProductAggregatedYearly fromJson2ReportViewedProductAggregatedYearly(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportViewedProductAggregatedYearly.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportViewedProductIndex.
   */
  public static ReportViewedProductIndex fromJson2ReportViewedProductIndex(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportViewedProductIndex.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportingCounts.
   */
  public static ReportingCounts fromJson2ReportingCounts(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportingCounts.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportingModuleStatus.
   */
  public static ReportingModuleStatus fromJson2ReportingModuleStatus(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportingModuleStatus.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportingOrders.
   */
  public static ReportingOrders fromJson2ReportingOrders(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportingOrders.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportingSystemUpdates.
   */
  public static ReportingSystemUpdates fromJson2ReportingSystemUpdates(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportingSystemUpdates.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReportingUsers.
   */
  public static ReportingUsers fromJson2ReportingUsers(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReportingUsers.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Review.
   */
  public static Review fromJson2Review(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Review.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReviewDetail.
   */
  public static ReviewDetail fromJson2ReviewDetail(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReviewDetail.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReviewEntity.
   */
  public static ReviewEntity fromJson2ReviewEntity(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReviewEntity.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReviewEntitySummary.
   */
  public static ReviewEntitySummary fromJson2ReviewEntitySummary(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReviewEntitySummary.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReviewStatus.
   */
  public static ReviewStatus fromJson2ReviewStatus(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReviewStatus.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ReviewStore.
   */
  public static ReviewStore fromJson2ReviewStore(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ReviewStore.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesBestsellersAggregatedDaily.
   */
  public static SalesBestsellersAggregatedDaily fromJson2SalesBestsellersAggregatedDaily(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesBestsellersAggregatedDaily.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesBestsellersAggregatedMonthly.
   */
  public static SalesBestsellersAggregatedMonthly fromJson2SalesBestsellersAggregatedMonthly(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesBestsellersAggregatedMonthly.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesBestsellersAggregatedYearly.
   */
  public static SalesBestsellersAggregatedYearly fromJson2SalesBestsellersAggregatedYearly(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesBestsellersAggregatedYearly.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesCreditmemo.
   */
  public static SalesCreditmemo fromJson2SalesCreditmemo(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesCreditmemo.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesCreditmemoComment.
   */
  public static SalesCreditmemoComment fromJson2SalesCreditmemoComment(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesCreditmemoComment.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesCreditmemoGrid.
   */
  public static SalesCreditmemoGrid fromJson2SalesCreditmemoGrid(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesCreditmemoGrid.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesCreditmemoItem.
   */
  public static SalesCreditmemoItem fromJson2SalesCreditmemoItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesCreditmemoItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesInvoice.
   */
  public static SalesInvoice fromJson2SalesInvoice(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesInvoice.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesInvoiceComment.
   */
  public static SalesInvoiceComment fromJson2SalesInvoiceComment(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesInvoiceComment.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesInvoiceGrid.
   */
  public static SalesInvoiceGrid fromJson2SalesInvoiceGrid(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesInvoiceGrid.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesInvoiceItem.
   */
  public static SalesInvoiceItem fromJson2SalesInvoiceItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesInvoiceItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesInvoicedAggregated.
   */
  public static SalesInvoicedAggregated fromJson2SalesInvoicedAggregated(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesInvoicedAggregated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesInvoicedAggregatedOrder.
   */
  public static SalesInvoicedAggregatedOrder fromJson2SalesInvoicedAggregatedOrder(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesInvoicedAggregatedOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrder.
   */
  public static SalesOrder fromJson2SalesOrder(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderAddress.
   */
  public static SalesOrderAddress fromJson2SalesOrderAddress(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderAddress.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderAggregatedCreated.
   */
  public static SalesOrderAggregatedCreated fromJson2SalesOrderAggregatedCreated(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderAggregatedCreated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderAggregatedUpdated.
   */
  public static SalesOrderAggregatedUpdated fromJson2SalesOrderAggregatedUpdated(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderAggregatedUpdated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderGrid.
   */
  public static SalesOrderGrid fromJson2SalesOrderGrid(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderGrid.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderItem.
   */
  public static SalesOrderItem fromJson2SalesOrderItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderPayment.
   */
  public static SalesOrderPayment fromJson2SalesOrderPayment(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderPayment.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderStatus.
   */
  public static SalesOrderStatus fromJson2SalesOrderStatus(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderStatus.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderStatusHistory.
   */
  public static SalesOrderStatusHistory fromJson2SalesOrderStatusHistory(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderStatusHistory.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderStatusLabel.
   */
  public static SalesOrderStatusLabel fromJson2SalesOrderStatusLabel(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderStatusLabel.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderStatusState.
   */
  public static SalesOrderStatusState fromJson2SalesOrderStatusState(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderStatusState.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderTax.
   */
  public static SalesOrderTax fromJson2SalesOrderTax(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderTax.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesOrderTaxItem.
   */
  public static SalesOrderTaxItem fromJson2SalesOrderTaxItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesOrderTaxItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesPaymentTransaction.
   */
  public static SalesPaymentTransaction fromJson2SalesPaymentTransaction(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesPaymentTransaction.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesRefundedAggregated.
   */
  public static SalesRefundedAggregated fromJson2SalesRefundedAggregated(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesRefundedAggregated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesRefundedAggregatedOrder.
   */
  public static SalesRefundedAggregatedOrder fromJson2SalesRefundedAggregatedOrder(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesRefundedAggregatedOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesSequenceMeta.
   */
  public static SalesSequenceMeta fromJson2SalesSequenceMeta(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesSequenceMeta.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesSequenceProfile.
   */
  public static SalesSequenceProfile fromJson2SalesSequenceProfile(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesSequenceProfile.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesShipment.
   */
  public static SalesShipment fromJson2SalesShipment(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesShipment.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesShipmentComment.
   */
  public static SalesShipmentComment fromJson2SalesShipmentComment(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesShipmentComment.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesShipmentGrid.
   */
  public static SalesShipmentGrid fromJson2SalesShipmentGrid(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesShipmentGrid.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesShipmentItem.
   */
  public static SalesShipmentItem fromJson2SalesShipmentItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesShipmentItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesShipmentTrack.
   */
  public static SalesShipmentTrack fromJson2SalesShipmentTrack(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesShipmentTrack.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesShippingAggregated.
   */
  public static SalesShippingAggregated fromJson2SalesShippingAggregated(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesShippingAggregated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesShippingAggregatedOrder.
   */
  public static SalesShippingAggregatedOrder fromJson2SalesShippingAggregatedOrder(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesShippingAggregatedOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Salesrule.
   */
  public static Salesrule fromJson2Salesrule(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Salesrule.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleCoupon.
   */
  public static SalesruleCoupon fromJson2SalesruleCoupon(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleCoupon.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleCouponAggregated.
   */
  public static SalesruleCouponAggregated fromJson2SalesruleCouponAggregated(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleCouponAggregated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleCouponAggregatedOrder.
   */
  public static SalesruleCouponAggregatedOrder fromJson2SalesruleCouponAggregatedOrder(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleCouponAggregatedOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleCouponAggregatedUpdated.
   */
  public static SalesruleCouponAggregatedUpdated fromJson2SalesruleCouponAggregatedUpdated(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleCouponAggregatedUpdated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleCouponUsage.
   */
  public static SalesruleCouponUsage fromJson2SalesruleCouponUsage(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleCouponUsage.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleCustomer.
   */
  public static SalesruleCustomer fromJson2SalesruleCustomer(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleCustomer.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleCustomerGroup.
   */
  public static SalesruleCustomerGroup fromJson2SalesruleCustomerGroup(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleCustomerGroup.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleLabel.
   */
  public static SalesruleLabel fromJson2SalesruleLabel(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleLabel.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleProductAttribute.
   */
  public static SalesruleProductAttribute fromJson2SalesruleProductAttribute(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleProductAttribute.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SalesruleWebsite.
   */
  public static SalesruleWebsite fromJson2SalesruleWebsite(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SalesruleWebsite.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SearchQuery.
   */
  public static SearchQuery fromJson2SearchQuery(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SearchQuery.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SearchSynonyms.
   */
  public static SearchSynonyms fromJson2SearchSynonyms(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SearchSynonyms.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SendfriendLog.
   */
  public static SendfriendLog fromJson2SendfriendLog(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SendfriendLog.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SequenceCreditmemo0.
   */
  public static SequenceCreditmemo0 fromJson2SequenceCreditmemo0(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SequenceCreditmemo0.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SequenceCreditmemo1.
   */
  public static SequenceCreditmemo1 fromJson2SequenceCreditmemo1(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SequenceCreditmemo1.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SequenceInvoice0.
   */
  public static SequenceInvoice0 fromJson2SequenceInvoice0(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SequenceInvoice0.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SequenceInvoice1.
   */
  public static SequenceInvoice1 fromJson2SequenceInvoice1(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SequenceInvoice1.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SequenceOrder0.
   */
  public static SequenceOrder0 fromJson2SequenceOrder0(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SequenceOrder0.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SequenceOrder1.
   */
  public static SequenceOrder1 fromJson2SequenceOrder1(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SequenceOrder1.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SequenceShipment0.
   */
  public static SequenceShipment0 fromJson2SequenceShipment0(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SequenceShipment0.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SequenceShipment1.
   */
  public static SequenceShipment1 fromJson2SequenceShipment1(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SequenceShipment1.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Session.
   */
  public static Session fromJson2Session(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Session.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SetupModule.
   */
  public static SetupModule fromJson2SetupModule(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SetupModule.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ShippingTablerate.
   */
  public static ShippingTablerate fromJson2ShippingTablerate(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ShippingTablerate.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The SignifydCase.
   */
  public static SignifydCase fromJson2SignifydCase(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, SignifydCase.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Sitemap.
   */
  public static Sitemap fromJson2Sitemap(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Sitemap.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Store.
   */
  public static Store fromJson2Store(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Store.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The StoreGroup.
   */
  public static StoreGroup fromJson2StoreGroup(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, StoreGroup.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The StoreWebsite.
   */
  public static StoreWebsite fromJson2StoreWebsite(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, StoreWebsite.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TaxCalculation.
   */
  public static TaxCalculation fromJson2TaxCalculation(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TaxCalculation.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TaxCalculationRate.
   */
  public static TaxCalculationRate fromJson2TaxCalculationRate(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TaxCalculationRate.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TaxCalculationRateTitle.
   */
  public static TaxCalculationRateTitle fromJson2TaxCalculationRateTitle(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TaxCalculationRateTitle.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TaxCalculationRule.
   */
  public static TaxCalculationRule fromJson2TaxCalculationRule(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TaxCalculationRule.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TaxClass.
   */
  public static TaxClass fromJson2TaxClass(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TaxClass.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TaxOrderAggregatedCreated.
   */
  public static TaxOrderAggregatedCreated fromJson2TaxOrderAggregatedCreated(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TaxOrderAggregatedCreated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TaxOrderAggregatedUpdated.
   */
  public static TaxOrderAggregatedUpdated fromJson2TaxOrderAggregatedUpdated(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TaxOrderAggregatedUpdated.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TemandoCheckoutAddress.
   */
  public static TemandoCheckoutAddress fromJson2TemandoCheckoutAddress(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TemandoCheckoutAddress.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TemandoCollectionPointSearch.
   */
  public static TemandoCollectionPointSearch fromJson2TemandoCollectionPointSearch(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TemandoCollectionPointSearch.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TemandoOrder.
   */
  public static TemandoOrder fromJson2TemandoOrder(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TemandoOrder.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TemandoOrderCollectionPoint.
   */
  public static TemandoOrderCollectionPoint fromJson2TemandoOrderCollectionPoint(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TemandoOrderCollectionPoint.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TemandoOrderPickupLocation.
   */
  public static TemandoOrderPickupLocation fromJson2TemandoOrderPickupLocation(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TemandoOrderPickupLocation.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TemandoPickupLocationSearch.
   */
  public static TemandoPickupLocationSearch fromJson2TemandoPickupLocationSearch(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TemandoPickupLocationSearch.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TemandoQuoteCollectionPoint.
   */
  public static TemandoQuoteCollectionPoint fromJson2TemandoQuoteCollectionPoint(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TemandoQuoteCollectionPoint.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TemandoQuotePickupLocation.
   */
  public static TemandoQuotePickupLocation fromJson2TemandoQuotePickupLocation(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TemandoQuotePickupLocation.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The TemandoShipment.
   */
  public static TemandoShipment fromJson2TemandoShipment(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, TemandoShipment.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Theme.
   */
  public static Theme fromJson2Theme(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Theme.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The ThemeFile.
   */
  public static ThemeFile fromJson2ThemeFile(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, ThemeFile.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Translation.
   */
  public static Translation fromJson2Translation(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Translation.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The UiBookmark.
   */
  public static UiBookmark fromJson2UiBookmark(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, UiBookmark.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The UrlRewrite.
   */
  public static UrlRewrite fromJson2UrlRewrite(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, UrlRewrite.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Variable.
   */
  public static Variable fromJson2Variable(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Variable.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VariableValue.
   */
  public static VariableValue fromJson2VariableValue(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VariableValue.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VaultPaymentToken.
   */
  public static VaultPaymentToken fromJson2VaultPaymentToken(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VaultPaymentToken.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VaultPaymentTokenOrderPaymentLink.
   */
  public static VaultPaymentTokenOrderPaymentLink fromJson2VaultPaymentTokenOrderPaymentLink(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VaultPaymentTokenOrderPaymentLink.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexCustomerCode.
   */
  public static VertexCustomerCode fromJson2VertexCustomerCode(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexCustomerCode.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexInvoiceSent.
   */
  public static VertexInvoiceSent fromJson2VertexInvoiceSent(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexInvoiceSent.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexOrderInvoiceStatus.
   */
  public static VertexOrderInvoiceStatus fromJson2VertexOrderInvoiceStatus(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexOrderInvoiceStatus.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexSalesCreditmemoItemInvoiceTextCode.
   */
  public static VertexSalesCreditmemoItemInvoiceTextCode
      fromJson2VertexSalesCreditmemoItemInvoiceTextCode(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexSalesCreditmemoItemInvoiceTextCode.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexSalesCreditmemoItemTaxCode.
   */
  public static VertexSalesCreditmemoItemTaxCode fromJson2VertexSalesCreditmemoItemTaxCode(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexSalesCreditmemoItemTaxCode.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexSalesCreditmemoItemVertexTaxCode.
   */
  public static VertexSalesCreditmemoItemVertexTaxCode
      fromJson2VertexSalesCreditmemoItemVertexTaxCode(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexSalesCreditmemoItemVertexTaxCode.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexSalesOrderItemInvoiceTextCode.
   */
  public static VertexSalesOrderItemInvoiceTextCode fromJson2VertexSalesOrderItemInvoiceTextCode(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexSalesOrderItemInvoiceTextCode.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexSalesOrderItemTaxCode.
   */
  public static VertexSalesOrderItemTaxCode fromJson2VertexSalesOrderItemTaxCode(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexSalesOrderItemTaxCode.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexSalesOrderItemVertexTaxCode.
   */
  public static VertexSalesOrderItemVertexTaxCode fromJson2VertexSalesOrderItemVertexTaxCode(
      JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexSalesOrderItemVertexTaxCode.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The VertexTaxrequest.
   */
  public static VertexTaxrequest fromJson2VertexTaxrequest(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, VertexTaxrequest.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The WeeeTax.
   */
  public static WeeeTax fromJson2WeeeTax(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, WeeeTax.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Widget.
   */
  public static Widget fromJson2Widget(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Widget.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The WidgetInstance.
   */
  public static WidgetInstance fromJson2WidgetInstance(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, WidgetInstance.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The WidgetInstancePage.
   */
  public static WidgetInstancePage fromJson2WidgetInstancePage(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, WidgetInstancePage.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The WidgetInstancePageLayout.
   */
  public static WidgetInstancePageLayout fromJson2WidgetInstancePageLayout(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, WidgetInstancePageLayout.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The Wishlist.
   */
  public static Wishlist fromJson2Wishlist(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, Wishlist.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The WishlistItem.
   */
  public static WishlistItem fromJson2WishlistItem(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, WishlistItem.class);
  }

  /**
   * Helper function that converts JSON to an POJO.
   *
   * @param json The JSON string.
   * @return The WishlistItemOption.
   */
  public static WishlistItemOption fromJson2WishlistItemOption(JsonElement json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, WishlistItemOption.class);
  }

  /**
   * Helper function that converts JSON to an JSON array.
   *
   * @param json The JSON string.
   * @return an JSON array.
   */
  public static JsonArray fromJson2Arr(String json) {
    Objects.requireNonNull(json);
    return gson.fromJson(json, JsonArray.class);
  }
}
