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
package com.magento.test.rest;

import com.magento.test.dao.JpaDao;
import com.magento.test.entity.*;
import com.magento.test.service.*;
import com.magento.test.handler.*;
import com.magento.test.utils.MetaDataEnum;
import javax.inject.Inject;
import java.io.InputStream;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import static java.util.Objects.requireNonNull;

@Path("/meta")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class DatabaseMetaResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());

  public DatabaseMetaResource() {}

  @Inject private AdminPasswordsService service;

  @Inject
  @Named("DefaultJpaDao")
  JpaDao jpa;

  /**
   * hello.
   *
   * @return a hello.
   */
  @GET
  @Path("")
  public Response hello() {
    List<AdminPasswords> result = service.selectAll();
    if (result.isEmpty()) {
      loadData();
    }

    return Response.status(Response.Status.OK).entity(this.getClass().getName()).build();
  }

  /**
   * Select all tables.
   *
   * @return a list tables.
   */
  @GET
  @Path("tables")
  public Response selectAll() {
    List<String> result =
        Arrays.asList(
            new String[] {
              "AdminPasswords",
              "AdminSystemMessages",
              "AdminUser",
              "AdminUserSession",
              "AdminnotificationInbox",
              "AmazonCustomer",
              "AmazonPendingAuthorization",
              "AmazonPendingCapture",
              "AmazonPendingRefund",
              "AmazonQuote",
              "AmazonSalesOrder",
              "AuthorizationRole",
              "AuthorizationRule",
              "Cache",
              "CacheTag",
              "CaptchaLog",
              "CatalogCategoryEntity",
              "CatalogCategoryEntityDatetime",
              "CatalogCategoryEntityDecimal",
              "CatalogCategoryEntityInt",
              "CatalogCategoryEntityText",
              "CatalogCategoryEntityVarchar",
              "CatalogCategoryProduct",
              "CatalogCategoryProductIndex",
              "CatalogCategoryProductIndexReplica",
              "CatalogCategoryProductIndexStore1",
              "CatalogCategoryProductIndexStore1Replica",
              "CatalogCategoryProductIndexTmp",
              "CatalogCompareItem",
              "CatalogEavAttribute",
              "CatalogProductBundleOption",
              "CatalogProductBundleOptionValue",
              "CatalogProductBundlePriceIndex",
              "CatalogProductBundleSelection",
              "CatalogProductBundleSelectionPrice",
              "CatalogProductBundleStockIndex",
              "CatalogProductEntity",
              "CatalogProductEntityDatetime",
              "CatalogProductEntityDecimal",
              "CatalogProductEntityGallery",
              "CatalogProductEntityInt",
              "CatalogProductEntityMediaGallery",
              "CatalogProductEntityMediaGalleryValue",
              "CatalogProductEntityMediaGalleryValueToEntity",
              "CatalogProductEntityMediaGalleryValueVideo",
              "CatalogProductEntityText",
              "CatalogProductEntityTierPrice",
              "CatalogProductEntityVarchar",
              "CatalogProductFrontendAction",
              "CatalogProductIndexEav",
              "CatalogProductIndexEavDecimal",
              "CatalogProductIndexEavDecimalIdx",
              "CatalogProductIndexEavDecimalReplica",
              "CatalogProductIndexEavDecimalTmp",
              "CatalogProductIndexEavIdx",
              "CatalogProductIndexEavReplica",
              "CatalogProductIndexEavTmp",
              "CatalogProductIndexPrice",
              "CatalogProductIndexPriceBundleIdx",
              "CatalogProductIndexPriceBundleOptIdx",
              "CatalogProductIndexPriceBundleOptTmp",
              "CatalogProductIndexPriceBundleSelIdx",
              "CatalogProductIndexPriceBundleSelTmp",
              "CatalogProductIndexPriceBundleTmp",
              "CatalogProductIndexPriceCfgOptAgrIdx",
              "CatalogProductIndexPriceCfgOptAgrTmp",
              "CatalogProductIndexPriceCfgOptIdx",
              "CatalogProductIndexPriceCfgOptTmp",
              "CatalogProductIndexPriceDownlodIdx",
              "CatalogProductIndexPriceDownlodTmp",
              "CatalogProductIndexPriceFinalIdx",
              "CatalogProductIndexPriceFinalTmp",
              "CatalogProductIndexPriceIdx",
              "CatalogProductIndexPriceOptAgrIdx",
              "CatalogProductIndexPriceOptAgrTmp",
              "CatalogProductIndexPriceOptIdx",
              "CatalogProductIndexPriceOptTmp",
              "CatalogProductIndexPriceReplica",
              "CatalogProductIndexPriceTmp",
              "CatalogProductIndexTierPrice",
              "CatalogProductIndexWebsite",
              "CatalogProductLink",
              "CatalogProductLinkAttribute",
              "CatalogProductLinkAttributeDecimal",
              "CatalogProductLinkAttributeInt",
              "CatalogProductLinkAttributeVarchar",
              "CatalogProductLinkType",
              "CatalogProductOption",
              "CatalogProductOptionPrice",
              "CatalogProductOptionTitle",
              "CatalogProductOptionTypePrice",
              "CatalogProductOptionTypeTitle",
              "CatalogProductOptionTypeValue",
              "CatalogProductRelation",
              "CatalogProductSuperAttribute",
              "CatalogProductSuperAttributeLabel",
              "CatalogProductSuperLink",
              "CatalogProductWebsite",
              "CatalogUrlRewriteProductCategory",
              "CataloginventoryStock",
              "CataloginventoryStockItem",
              "CataloginventoryStockStatus",
              "CataloginventoryStockStatusIdx",
              "CataloginventoryStockStatusReplica",
              "CataloginventoryStockStatusTmp",
              "Catalogrule",
              "CatalogruleCustomerGroup",
              "CatalogruleGroupWebsite",
              "CatalogruleGroupWebsiteReplica",
              "CatalogruleProduct",
              "CatalogruleProductPrice",
              "CatalogruleProductPriceReplica",
              "CatalogruleProductReplica",
              "CatalogruleWebsite",
              "CatalogsearchFulltextScope1",
              "CatalogsearchRecommendations",
              "CheckoutAgreement",
              "CheckoutAgreementStore",
              "CmsBlock",
              "CmsBlockStore",
              "CmsPage",
              "CmsPageStore",
              "CoreConfigData",
              "CronSchedule",
              "CustomerAddressEntity",
              "CustomerAddressEntityDatetime",
              "CustomerAddressEntityDecimal",
              "CustomerAddressEntityInt",
              "CustomerAddressEntityText",
              "CustomerAddressEntityVarchar",
              "CustomerEavAttribute",
              "CustomerEavAttributeWebsite",
              "CustomerEntity",
              "CustomerEntityDatetime",
              "CustomerEntityDecimal",
              "CustomerEntityInt",
              "CustomerEntityText",
              "CustomerEntityVarchar",
              "CustomerFormAttribute",
              "CustomerGridFlat",
              "CustomerGroup",
              "CustomerLog",
              "CustomerVisitor",
              "DesignChange",
              "DesignConfigGridFlat",
              "DirectoryCountry",
              "DirectoryCountryFormat",
              "DirectoryCountryRegion",
              "DirectoryCountryRegionName",
              "DirectoryCurrencyRate",
              "DownloadableLink",
              "DownloadableLinkPrice",
              "DownloadableLinkPurchased",
              "DownloadableLinkPurchasedItem",
              "DownloadableLinkTitle",
              "DownloadableSample",
              "DownloadableSampleTitle",
              "EavAttribute",
              "EavAttributeGroup",
              "EavAttributeLabel",
              "EavAttributeOption",
              "EavAttributeOptionSwatch",
              "EavAttributeOptionValue",
              "EavAttributeSet",
              "EavEntity",
              "EavEntityAttribute",
              "EavEntityDatetime",
              "EavEntityDecimal",
              "EavEntityInt",
              "EavEntityStore",
              "EavEntityText",
              "EavEntityType",
              "EavEntityVarchar",
              "EavFormElement",
              "EavFormFieldset",
              "EavFormFieldsetLabel",
              "EavFormType",
              "EavFormTypeEntity",
              "EmailAbandonedCart",
              "EmailAutomation",
              "EmailCampaign",
              "EmailCatalog",
              "EmailContact",
              "EmailContactConsent",
              "EmailFailedAuth",
              "EmailImporter",
              "EmailOrder",
              "EmailReview",
              "EmailRules",
              "EmailTemplate",
              "EmailWishlist",
              "Flag",
              "GiftMessage",
              "GoogleoptimizerCode",
              "ImportHistory",
              "ImportexportImportdata",
              "IndexerState",
              "Integration",
              "InventoryGeoname",
              "InventoryLowStockNotificationConfiguration",
              "InventoryReservation",
              "InventoryShipmentSource",
              "InventorySource",
              "InventorySourceCarrierLink",
              "InventorySourceItem",
              "InventorySourceStockLink",
              "InventoryStock",
              "InventoryStockSalesChannel",
              "KlarnaCoreOrder",
              "KlarnaPaymentsQuote",
              "LayoutLink",
              "LayoutUpdate",
              "MagentoAcknowledgedBulk",
              "MagentoBulk",
              "MagentoOperation",
              "MspTfaCountryCodes",
              "MspTfaTrusted",
              "MspTfaUserConfig",
              "MviewState",
              "NewsletterProblem",
              "NewsletterQueue",
              "NewsletterQueueLink",
              "NewsletterQueueStoreLink",
              "NewsletterSubscriber",
              "NewsletterTemplate",
              "OauthConsumer",
              "OauthNonce",
              "OauthToken",
              "OauthTokenRequestLog",
              "PasswordResetRequestEvent",
              "PatchList",
              "PaypalBillingAgreement",
              "PaypalBillingAgreementOrder",
              "PaypalCert",
              "PaypalPaymentTransaction",
              "PaypalSettlementReport",
              "PaypalSettlementReportRow",
              "PersistentSession",
              "ProductAlertPrice",
              "ProductAlertStock",
              "Queue",
              "QueueLock",
              "QueueMessage",
              "QueueMessageStatus",
              "QueuePoisonPill",
              "Quote",
              "QuoteAddress",
              "QuoteAddressItem",
              "QuoteIdMask",
              "QuoteItem",
              "QuoteItemOption",
              "QuotePayment",
              "QuoteShippingRate",
              "Rating",
              "RatingEntity",
              "RatingOption",
              "RatingOptionVote",
              "RatingOptionVoteAggregated",
              "RatingStore",
              "RatingTitle",
              "ReleaseNotificationViewerLog",
              "ReportComparedProductIndex",
              "ReportEvent",
              "ReportEventTypes",
              "ReportViewedProductAggregatedDaily",
              "ReportViewedProductAggregatedMonthly",
              "ReportViewedProductAggregatedYearly",
              "ReportViewedProductIndex",
              "ReportingCounts",
              "ReportingModuleStatus",
              "ReportingOrders",
              "ReportingSystemUpdates",
              "ReportingUsers",
              "Review",
              "ReviewDetail",
              "ReviewEntity",
              "ReviewEntitySummary",
              "ReviewStatus",
              "ReviewStore",
              "SalesBestsellersAggregatedDaily",
              "SalesBestsellersAggregatedMonthly",
              "SalesBestsellersAggregatedYearly",
              "SalesCreditmemo",
              "SalesCreditmemoComment",
              "SalesCreditmemoGrid",
              "SalesCreditmemoItem",
              "SalesInvoice",
              "SalesInvoiceComment",
              "SalesInvoiceGrid",
              "SalesInvoiceItem",
              "SalesInvoicedAggregated",
              "SalesInvoicedAggregatedOrder",
              "SalesOrder",
              "SalesOrderAddress",
              "SalesOrderAggregatedCreated",
              "SalesOrderAggregatedUpdated",
              "SalesOrderGrid",
              "SalesOrderItem",
              "SalesOrderPayment",
              "SalesOrderStatus",
              "SalesOrderStatusHistory",
              "SalesOrderStatusLabel",
              "SalesOrderStatusState",
              "SalesOrderTax",
              "SalesOrderTaxItem",
              "SalesPaymentTransaction",
              "SalesRefundedAggregated",
              "SalesRefundedAggregatedOrder",
              "SalesSequenceMeta",
              "SalesSequenceProfile",
              "SalesShipment",
              "SalesShipmentComment",
              "SalesShipmentGrid",
              "SalesShipmentItem",
              "SalesShipmentTrack",
              "SalesShippingAggregated",
              "SalesShippingAggregatedOrder",
              "Salesrule",
              "SalesruleCoupon",
              "SalesruleCouponAggregated",
              "SalesruleCouponAggregatedOrder",
              "SalesruleCouponAggregatedUpdated",
              "SalesruleCouponUsage",
              "SalesruleCustomer",
              "SalesruleCustomerGroup",
              "SalesruleLabel",
              "SalesruleProductAttribute",
              "SalesruleWebsite",
              "SearchQuery",
              "SearchSynonyms",
              "SendfriendLog",
              "SequenceCreditmemo0",
              "SequenceCreditmemo1",
              "SequenceInvoice0",
              "SequenceInvoice1",
              "SequenceOrder0",
              "SequenceOrder1",
              "SequenceShipment0",
              "SequenceShipment1",
              "Session",
              "SetupModule",
              "ShippingTablerate",
              "SignifydCase",
              "Sitemap",
              "Store",
              "StoreGroup",
              "StoreWebsite",
              "TaxCalculation",
              "TaxCalculationRate",
              "TaxCalculationRateTitle",
              "TaxCalculationRule",
              "TaxClass",
              "TaxOrderAggregatedCreated",
              "TaxOrderAggregatedUpdated",
              "TemandoCheckoutAddress",
              "TemandoCollectionPointSearch",
              "TemandoOrder",
              "TemandoOrderCollectionPoint",
              "TemandoOrderPickupLocation",
              "TemandoPickupLocationSearch",
              "TemandoQuoteCollectionPoint",
              "TemandoQuotePickupLocation",
              "TemandoShipment",
              "Theme",
              "ThemeFile",
              "Translation",
              "UiBookmark",
              "UrlRewrite",
              "Variable",
              "VariableValue",
              "VaultPaymentToken",
              "VaultPaymentTokenOrderPaymentLink",
              "VertexCustomerCode",
              "VertexInvoiceSent",
              "VertexOrderInvoiceStatus",
              "VertexSalesCreditmemoItemInvoiceTextCode",
              "VertexSalesCreditmemoItemTaxCode",
              "VertexSalesCreditmemoItemVertexTaxCode",
              "VertexSalesOrderItemInvoiceTextCode",
              "VertexSalesOrderItemTaxCode",
              "VertexSalesOrderItemVertexTaxCode",
              "VertexTaxrequest",
              "WeeeTax",
              "Widget",
              "WidgetInstance",
              "WidgetInstancePage",
              "WidgetInstancePageLayout",
              "Wishlist",
              "WishlistItem",
              "WishlistItemOption",
            });
    return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(result)
        .build();
  }

  private void loadData() {

    Arrays.stream(MetaDataEnum.values())
        .forEach(
            item -> {
              logger.info("processing " + item.name());
              InputStream in =
                  DatabaseLoadingResource.class.getResourceAsStream("/" + item.name() + ".csv");
              process(item.name(), in, jpa);
            });
  }

  private static void process(String handlerName, InputStream inputStream, JpaDao jpa) {
    DelimiterFileHandler handler = null;

    switch (handlerName) {
      case "AdminPasswords":
        handler = new AdminPasswordsHandler(jpa);
        handler.process(inputStream);
        break;

      case "AdminSystemMessages":
        handler = new AdminSystemMessagesHandler(jpa);
        handler.process(inputStream);
        break;

      case "AdminUser":
        handler = new AdminUserHandler(jpa);
        handler.process(inputStream);
        break;

      case "AdminUserSession":
        handler = new AdminUserSessionHandler(jpa);
        handler.process(inputStream);
        break;

      case "AdminnotificationInbox":
        handler = new AdminnotificationInboxHandler(jpa);
        handler.process(inputStream);
        break;

      case "AmazonCustomer":
        handler = new AmazonCustomerHandler(jpa);
        handler.process(inputStream);
        break;

      case "AmazonPendingAuthorization":
        handler = new AmazonPendingAuthorizationHandler(jpa);
        handler.process(inputStream);
        break;

      case "AmazonPendingCapture":
        handler = new AmazonPendingCaptureHandler(jpa);
        handler.process(inputStream);
        break;

      case "AmazonPendingRefund":
        handler = new AmazonPendingRefundHandler(jpa);
        handler.process(inputStream);
        break;

      case "AmazonQuote":
        handler = new AmazonQuoteHandler(jpa);
        handler.process(inputStream);
        break;

      case "AmazonSalesOrder":
        handler = new AmazonSalesOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "AuthorizationRole":
        handler = new AuthorizationRoleHandler(jpa);
        handler.process(inputStream);
        break;

      case "AuthorizationRule":
        handler = new AuthorizationRuleHandler(jpa);
        handler.process(inputStream);
        break;

      case "Cache":
        handler = new CacheHandler(jpa);
        handler.process(inputStream);
        break;

      case "CacheTag":
        handler = new CacheTagHandler(jpa);
        handler.process(inputStream);
        break;

      case "CaptchaLog":
        handler = new CaptchaLogHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryEntity":
        handler = new CatalogCategoryEntityHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryEntityDatetime":
        handler = new CatalogCategoryEntityDatetimeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryEntityDecimal":
        handler = new CatalogCategoryEntityDecimalHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryEntityInt":
        handler = new CatalogCategoryEntityIntHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryEntityText":
        handler = new CatalogCategoryEntityTextHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryEntityVarchar":
        handler = new CatalogCategoryEntityVarcharHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryProduct":
        handler = new CatalogCategoryProductHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryProductIndex":
        handler = new CatalogCategoryProductIndexHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryProductIndexReplica":
        handler = new CatalogCategoryProductIndexReplicaHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryProductIndexStore1":
        handler = new CatalogCategoryProductIndexStore1Handler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryProductIndexStore1Replica":
        handler = new CatalogCategoryProductIndexStore1ReplicaHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCategoryProductIndexTmp":
        handler = new CatalogCategoryProductIndexTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogCompareItem":
        handler = new CatalogCompareItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogEavAttribute":
        handler = new CatalogEavAttributeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductBundleOption":
        handler = new CatalogProductBundleOptionHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductBundleOptionValue":
        handler = new CatalogProductBundleOptionValueHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductBundlePriceIndex":
        handler = new CatalogProductBundlePriceIndexHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductBundleSelection":
        handler = new CatalogProductBundleSelectionHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductBundleSelectionPrice":
        handler = new CatalogProductBundleSelectionPriceHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductBundleStockIndex":
        handler = new CatalogProductBundleStockIndexHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntity":
        handler = new CatalogProductEntityHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityDatetime":
        handler = new CatalogProductEntityDatetimeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityDecimal":
        handler = new CatalogProductEntityDecimalHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityGallery":
        handler = new CatalogProductEntityGalleryHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityInt":
        handler = new CatalogProductEntityIntHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityMediaGallery":
        handler = new CatalogProductEntityMediaGalleryHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityMediaGalleryValue":
        handler = new CatalogProductEntityMediaGalleryValueHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityMediaGalleryValueToEntity":
        handler = new CatalogProductEntityMediaGalleryValueToEntityHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityMediaGalleryValueVideo":
        handler = new CatalogProductEntityMediaGalleryValueVideoHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityText":
        handler = new CatalogProductEntityTextHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityTierPrice":
        handler = new CatalogProductEntityTierPriceHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductEntityVarchar":
        handler = new CatalogProductEntityVarcharHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductFrontendAction":
        handler = new CatalogProductFrontendActionHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexEav":
        handler = new CatalogProductIndexEavHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexEavDecimal":
        handler = new CatalogProductIndexEavDecimalHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexEavDecimalIdx":
        handler = new CatalogProductIndexEavDecimalIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexEavDecimalReplica":
        handler = new CatalogProductIndexEavDecimalReplicaHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexEavDecimalTmp":
        handler = new CatalogProductIndexEavDecimalTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexEavIdx":
        handler = new CatalogProductIndexEavIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexEavReplica":
        handler = new CatalogProductIndexEavReplicaHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexEavTmp":
        handler = new CatalogProductIndexEavTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPrice":
        handler = new CatalogProductIndexPriceHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceBundleIdx":
        handler = new CatalogProductIndexPriceBundleIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceBundleOptIdx":
        handler = new CatalogProductIndexPriceBundleOptIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceBundleOptTmp":
        handler = new CatalogProductIndexPriceBundleOptTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceBundleSelIdx":
        handler = new CatalogProductIndexPriceBundleSelIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceBundleSelTmp":
        handler = new CatalogProductIndexPriceBundleSelTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceBundleTmp":
        handler = new CatalogProductIndexPriceBundleTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceCfgOptAgrIdx":
        handler = new CatalogProductIndexPriceCfgOptAgrIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceCfgOptAgrTmp":
        handler = new CatalogProductIndexPriceCfgOptAgrTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceCfgOptIdx":
        handler = new CatalogProductIndexPriceCfgOptIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceCfgOptTmp":
        handler = new CatalogProductIndexPriceCfgOptTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceDownlodIdx":
        handler = new CatalogProductIndexPriceDownlodIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceDownlodTmp":
        handler = new CatalogProductIndexPriceDownlodTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceFinalIdx":
        handler = new CatalogProductIndexPriceFinalIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceFinalTmp":
        handler = new CatalogProductIndexPriceFinalTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceIdx":
        handler = new CatalogProductIndexPriceIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceOptAgrIdx":
        handler = new CatalogProductIndexPriceOptAgrIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceOptAgrTmp":
        handler = new CatalogProductIndexPriceOptAgrTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceOptIdx":
        handler = new CatalogProductIndexPriceOptIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceOptTmp":
        handler = new CatalogProductIndexPriceOptTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceReplica":
        handler = new CatalogProductIndexPriceReplicaHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexPriceTmp":
        handler = new CatalogProductIndexPriceTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexTierPrice":
        handler = new CatalogProductIndexTierPriceHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductIndexWebsite":
        handler = new CatalogProductIndexWebsiteHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductLink":
        handler = new CatalogProductLinkHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductLinkAttribute":
        handler = new CatalogProductLinkAttributeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductLinkAttributeDecimal":
        handler = new CatalogProductLinkAttributeDecimalHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductLinkAttributeInt":
        handler = new CatalogProductLinkAttributeIntHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductLinkAttributeVarchar":
        handler = new CatalogProductLinkAttributeVarcharHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductLinkType":
        handler = new CatalogProductLinkTypeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductOption":
        handler = new CatalogProductOptionHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductOptionPrice":
        handler = new CatalogProductOptionPriceHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductOptionTitle":
        handler = new CatalogProductOptionTitleHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductOptionTypePrice":
        handler = new CatalogProductOptionTypePriceHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductOptionTypeTitle":
        handler = new CatalogProductOptionTypeTitleHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductOptionTypeValue":
        handler = new CatalogProductOptionTypeValueHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductRelation":
        handler = new CatalogProductRelationHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductSuperAttribute":
        handler = new CatalogProductSuperAttributeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductSuperAttributeLabel":
        handler = new CatalogProductSuperAttributeLabelHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductSuperLink":
        handler = new CatalogProductSuperLinkHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogProductWebsite":
        handler = new CatalogProductWebsiteHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogUrlRewriteProductCategory":
        handler = new CatalogUrlRewriteProductCategoryHandler(jpa);
        handler.process(inputStream);
        break;

      case "CataloginventoryStock":
        handler = new CataloginventoryStockHandler(jpa);
        handler.process(inputStream);
        break;

      case "CataloginventoryStockItem":
        handler = new CataloginventoryStockItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "CataloginventoryStockStatus":
        handler = new CataloginventoryStockStatusHandler(jpa);
        handler.process(inputStream);
        break;

      case "CataloginventoryStockStatusIdx":
        handler = new CataloginventoryStockStatusIdxHandler(jpa);
        handler.process(inputStream);
        break;

      case "CataloginventoryStockStatusReplica":
        handler = new CataloginventoryStockStatusReplicaHandler(jpa);
        handler.process(inputStream);
        break;

      case "CataloginventoryStockStatusTmp":
        handler = new CataloginventoryStockStatusTmpHandler(jpa);
        handler.process(inputStream);
        break;

      case "Catalogrule":
        handler = new CatalogruleHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogruleCustomerGroup":
        handler = new CatalogruleCustomerGroupHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogruleGroupWebsite":
        handler = new CatalogruleGroupWebsiteHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogruleGroupWebsiteReplica":
        handler = new CatalogruleGroupWebsiteReplicaHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogruleProduct":
        handler = new CatalogruleProductHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogruleProductPrice":
        handler = new CatalogruleProductPriceHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogruleProductPriceReplica":
        handler = new CatalogruleProductPriceReplicaHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogruleProductReplica":
        handler = new CatalogruleProductReplicaHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogruleWebsite":
        handler = new CatalogruleWebsiteHandler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogsearchFulltextScope1":
        handler = new CatalogsearchFulltextScope1Handler(jpa);
        handler.process(inputStream);
        break;

      case "CatalogsearchRecommendations":
        handler = new CatalogsearchRecommendationsHandler(jpa);
        handler.process(inputStream);
        break;

      case "CheckoutAgreement":
        handler = new CheckoutAgreementHandler(jpa);
        handler.process(inputStream);
        break;

      case "CheckoutAgreementStore":
        handler = new CheckoutAgreementStoreHandler(jpa);
        handler.process(inputStream);
        break;

      case "CmsBlock":
        handler = new CmsBlockHandler(jpa);
        handler.process(inputStream);
        break;

      case "CmsBlockStore":
        handler = new CmsBlockStoreHandler(jpa);
        handler.process(inputStream);
        break;

      case "CmsPage":
        handler = new CmsPageHandler(jpa);
        handler.process(inputStream);
        break;

      case "CmsPageStore":
        handler = new CmsPageStoreHandler(jpa);
        handler.process(inputStream);
        break;

      case "CoreConfigData":
        handler = new CoreConfigDataHandler(jpa);
        handler.process(inputStream);
        break;

      case "CronSchedule":
        handler = new CronScheduleHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerAddressEntity":
        handler = new CustomerAddressEntityHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerAddressEntityDatetime":
        handler = new CustomerAddressEntityDatetimeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerAddressEntityDecimal":
        handler = new CustomerAddressEntityDecimalHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerAddressEntityInt":
        handler = new CustomerAddressEntityIntHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerAddressEntityText":
        handler = new CustomerAddressEntityTextHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerAddressEntityVarchar":
        handler = new CustomerAddressEntityVarcharHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerEavAttribute":
        handler = new CustomerEavAttributeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerEavAttributeWebsite":
        handler = new CustomerEavAttributeWebsiteHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerEntity":
        handler = new CustomerEntityHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerEntityDatetime":
        handler = new CustomerEntityDatetimeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerEntityDecimal":
        handler = new CustomerEntityDecimalHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerEntityInt":
        handler = new CustomerEntityIntHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerEntityText":
        handler = new CustomerEntityTextHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerEntityVarchar":
        handler = new CustomerEntityVarcharHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerFormAttribute":
        handler = new CustomerFormAttributeHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerGridFlat":
        handler = new CustomerGridFlatHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerGroup":
        handler = new CustomerGroupHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerLog":
        handler = new CustomerLogHandler(jpa);
        handler.process(inputStream);
        break;

      case "CustomerVisitor":
        handler = new CustomerVisitorHandler(jpa);
        handler.process(inputStream);
        break;

      case "DesignChange":
        handler = new DesignChangeHandler(jpa);
        handler.process(inputStream);
        break;

      case "DesignConfigGridFlat":
        handler = new DesignConfigGridFlatHandler(jpa);
        handler.process(inputStream);
        break;

      case "DirectoryCountry":
        handler = new DirectoryCountryHandler(jpa);
        handler.process(inputStream);
        break;

      case "DirectoryCountryFormat":
        handler = new DirectoryCountryFormatHandler(jpa);
        handler.process(inputStream);
        break;

      case "DirectoryCountryRegion":
        handler = new DirectoryCountryRegionHandler(jpa);
        handler.process(inputStream);
        break;

      case "DirectoryCountryRegionName":
        handler = new DirectoryCountryRegionNameHandler(jpa);
        handler.process(inputStream);
        break;

      case "DirectoryCurrencyRate":
        handler = new DirectoryCurrencyRateHandler(jpa);
        handler.process(inputStream);
        break;

      case "DownloadableLink":
        handler = new DownloadableLinkHandler(jpa);
        handler.process(inputStream);
        break;

      case "DownloadableLinkPrice":
        handler = new DownloadableLinkPriceHandler(jpa);
        handler.process(inputStream);
        break;

      case "DownloadableLinkPurchased":
        handler = new DownloadableLinkPurchasedHandler(jpa);
        handler.process(inputStream);
        break;

      case "DownloadableLinkPurchasedItem":
        handler = new DownloadableLinkPurchasedItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "DownloadableLinkTitle":
        handler = new DownloadableLinkTitleHandler(jpa);
        handler.process(inputStream);
        break;

      case "DownloadableSample":
        handler = new DownloadableSampleHandler(jpa);
        handler.process(inputStream);
        break;

      case "DownloadableSampleTitle":
        handler = new DownloadableSampleTitleHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavAttribute":
        handler = new EavAttributeHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavAttributeGroup":
        handler = new EavAttributeGroupHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavAttributeLabel":
        handler = new EavAttributeLabelHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavAttributeOption":
        handler = new EavAttributeOptionHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavAttributeOptionSwatch":
        handler = new EavAttributeOptionSwatchHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavAttributeOptionValue":
        handler = new EavAttributeOptionValueHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavAttributeSet":
        handler = new EavAttributeSetHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavEntity":
        handler = new EavEntityHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavEntityAttribute":
        handler = new EavEntityAttributeHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavEntityDatetime":
        handler = new EavEntityDatetimeHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavEntityDecimal":
        handler = new EavEntityDecimalHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavEntityInt":
        handler = new EavEntityIntHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavEntityStore":
        handler = new EavEntityStoreHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavEntityText":
        handler = new EavEntityTextHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavEntityType":
        handler = new EavEntityTypeHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavEntityVarchar":
        handler = new EavEntityVarcharHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavFormElement":
        handler = new EavFormElementHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavFormFieldset":
        handler = new EavFormFieldsetHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavFormFieldsetLabel":
        handler = new EavFormFieldsetLabelHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavFormType":
        handler = new EavFormTypeHandler(jpa);
        handler.process(inputStream);
        break;

      case "EavFormTypeEntity":
        handler = new EavFormTypeEntityHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailAbandonedCart":
        handler = new EmailAbandonedCartHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailAutomation":
        handler = new EmailAutomationHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailCampaign":
        handler = new EmailCampaignHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailCatalog":
        handler = new EmailCatalogHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailContact":
        handler = new EmailContactHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailContactConsent":
        handler = new EmailContactConsentHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailFailedAuth":
        handler = new EmailFailedAuthHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailImporter":
        handler = new EmailImporterHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailOrder":
        handler = new EmailOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailReview":
        handler = new EmailReviewHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailRules":
        handler = new EmailRulesHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailTemplate":
        handler = new EmailTemplateHandler(jpa);
        handler.process(inputStream);
        break;

      case "EmailWishlist":
        handler = new EmailWishlistHandler(jpa);
        handler.process(inputStream);
        break;

      case "Flag":
        handler = new FlagHandler(jpa);
        handler.process(inputStream);
        break;

      case "GiftMessage":
        handler = new GiftMessageHandler(jpa);
        handler.process(inputStream);
        break;

      case "GoogleoptimizerCode":
        handler = new GoogleoptimizerCodeHandler(jpa);
        handler.process(inputStream);
        break;

      case "ImportHistory":
        handler = new ImportHistoryHandler(jpa);
        handler.process(inputStream);
        break;

      case "ImportexportImportdata":
        handler = new ImportexportImportdataHandler(jpa);
        handler.process(inputStream);
        break;

      case "IndexerState":
        handler = new IndexerStateHandler(jpa);
        handler.process(inputStream);
        break;

      case "Integration":
        handler = new IntegrationHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventoryGeoname":
        handler = new InventoryGeonameHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventoryLowStockNotificationConfiguration":
        handler = new InventoryLowStockNotificationConfigurationHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventoryReservation":
        handler = new InventoryReservationHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventoryShipmentSource":
        handler = new InventoryShipmentSourceHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventorySource":
        handler = new InventorySourceHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventorySourceCarrierLink":
        handler = new InventorySourceCarrierLinkHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventorySourceItem":
        handler = new InventorySourceItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventorySourceStockLink":
        handler = new InventorySourceStockLinkHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventoryStock":
        handler = new InventoryStockHandler(jpa);
        handler.process(inputStream);
        break;

      case "InventoryStockSalesChannel":
        handler = new InventoryStockSalesChannelHandler(jpa);
        handler.process(inputStream);
        break;

      case "KlarnaCoreOrder":
        handler = new KlarnaCoreOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "KlarnaPaymentsQuote":
        handler = new KlarnaPaymentsQuoteHandler(jpa);
        handler.process(inputStream);
        break;

      case "LayoutLink":
        handler = new LayoutLinkHandler(jpa);
        handler.process(inputStream);
        break;

      case "LayoutUpdate":
        handler = new LayoutUpdateHandler(jpa);
        handler.process(inputStream);
        break;

      case "MagentoAcknowledgedBulk":
        handler = new MagentoAcknowledgedBulkHandler(jpa);
        handler.process(inputStream);
        break;

      case "MagentoBulk":
        handler = new MagentoBulkHandler(jpa);
        handler.process(inputStream);
        break;

      case "MagentoOperation":
        handler = new MagentoOperationHandler(jpa);
        handler.process(inputStream);
        break;

      case "MspTfaCountryCodes":
        handler = new MspTfaCountryCodesHandler(jpa);
        handler.process(inputStream);
        break;

      case "MspTfaTrusted":
        handler = new MspTfaTrustedHandler(jpa);
        handler.process(inputStream);
        break;

      case "MspTfaUserConfig":
        handler = new MspTfaUserConfigHandler(jpa);
        handler.process(inputStream);
        break;

      case "MviewState":
        handler = new MviewStateHandler(jpa);
        handler.process(inputStream);
        break;

      case "NewsletterProblem":
        handler = new NewsletterProblemHandler(jpa);
        handler.process(inputStream);
        break;

      case "NewsletterQueue":
        handler = new NewsletterQueueHandler(jpa);
        handler.process(inputStream);
        break;

      case "NewsletterQueueLink":
        handler = new NewsletterQueueLinkHandler(jpa);
        handler.process(inputStream);
        break;

      case "NewsletterQueueStoreLink":
        handler = new NewsletterQueueStoreLinkHandler(jpa);
        handler.process(inputStream);
        break;

      case "NewsletterSubscriber":
        handler = new NewsletterSubscriberHandler(jpa);
        handler.process(inputStream);
        break;

      case "NewsletterTemplate":
        handler = new NewsletterTemplateHandler(jpa);
        handler.process(inputStream);
        break;

      case "OauthConsumer":
        handler = new OauthConsumerHandler(jpa);
        handler.process(inputStream);
        break;

      case "OauthNonce":
        handler = new OauthNonceHandler(jpa);
        handler.process(inputStream);
        break;

      case "OauthToken":
        handler = new OauthTokenHandler(jpa);
        handler.process(inputStream);
        break;

      case "OauthTokenRequestLog":
        handler = new OauthTokenRequestLogHandler(jpa);
        handler.process(inputStream);
        break;

      case "PasswordResetRequestEvent":
        handler = new PasswordResetRequestEventHandler(jpa);
        handler.process(inputStream);
        break;

      case "PatchList":
        handler = new PatchListHandler(jpa);
        handler.process(inputStream);
        break;

      case "PaypalBillingAgreement":
        handler = new PaypalBillingAgreementHandler(jpa);
        handler.process(inputStream);
        break;

      case "PaypalBillingAgreementOrder":
        handler = new PaypalBillingAgreementOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "PaypalCert":
        handler = new PaypalCertHandler(jpa);
        handler.process(inputStream);
        break;

      case "PaypalPaymentTransaction":
        handler = new PaypalPaymentTransactionHandler(jpa);
        handler.process(inputStream);
        break;

      case "PaypalSettlementReport":
        handler = new PaypalSettlementReportHandler(jpa);
        handler.process(inputStream);
        break;

      case "PaypalSettlementReportRow":
        handler = new PaypalSettlementReportRowHandler(jpa);
        handler.process(inputStream);
        break;

      case "PersistentSession":
        handler = new PersistentSessionHandler(jpa);
        handler.process(inputStream);
        break;

      case "ProductAlertPrice":
        handler = new ProductAlertPriceHandler(jpa);
        handler.process(inputStream);
        break;

      case "ProductAlertStock":
        handler = new ProductAlertStockHandler(jpa);
        handler.process(inputStream);
        break;

      case "Queue":
        handler = new QueueHandler(jpa);
        handler.process(inputStream);
        break;

      case "QueueLock":
        handler = new QueueLockHandler(jpa);
        handler.process(inputStream);
        break;

      case "QueueMessage":
        handler = new QueueMessageHandler(jpa);
        handler.process(inputStream);
        break;

      case "QueueMessageStatus":
        handler = new QueueMessageStatusHandler(jpa);
        handler.process(inputStream);
        break;

      case "QueuePoisonPill":
        handler = new QueuePoisonPillHandler(jpa);
        handler.process(inputStream);
        break;

      case "Quote":
        handler = new QuoteHandler(jpa);
        handler.process(inputStream);
        break;

      case "QuoteAddress":
        handler = new QuoteAddressHandler(jpa);
        handler.process(inputStream);
        break;

      case "QuoteAddressItem":
        handler = new QuoteAddressItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "QuoteIdMask":
        handler = new QuoteIdMaskHandler(jpa);
        handler.process(inputStream);
        break;

      case "QuoteItem":
        handler = new QuoteItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "QuoteItemOption":
        handler = new QuoteItemOptionHandler(jpa);
        handler.process(inputStream);
        break;

      case "QuotePayment":
        handler = new QuotePaymentHandler(jpa);
        handler.process(inputStream);
        break;

      case "QuoteShippingRate":
        handler = new QuoteShippingRateHandler(jpa);
        handler.process(inputStream);
        break;

      case "Rating":
        handler = new RatingHandler(jpa);
        handler.process(inputStream);
        break;

      case "RatingEntity":
        handler = new RatingEntityHandler(jpa);
        handler.process(inputStream);
        break;

      case "RatingOption":
        handler = new RatingOptionHandler(jpa);
        handler.process(inputStream);
        break;

      case "RatingOptionVote":
        handler = new RatingOptionVoteHandler(jpa);
        handler.process(inputStream);
        break;

      case "RatingOptionVoteAggregated":
        handler = new RatingOptionVoteAggregatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "RatingStore":
        handler = new RatingStoreHandler(jpa);
        handler.process(inputStream);
        break;

      case "RatingTitle":
        handler = new RatingTitleHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReleaseNotificationViewerLog":
        handler = new ReleaseNotificationViewerLogHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportComparedProductIndex":
        handler = new ReportComparedProductIndexHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportEvent":
        handler = new ReportEventHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportEventTypes":
        handler = new ReportEventTypesHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportViewedProductAggregatedDaily":
        handler = new ReportViewedProductAggregatedDailyHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportViewedProductAggregatedMonthly":
        handler = new ReportViewedProductAggregatedMonthlyHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportViewedProductAggregatedYearly":
        handler = new ReportViewedProductAggregatedYearlyHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportViewedProductIndex":
        handler = new ReportViewedProductIndexHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportingCounts":
        handler = new ReportingCountsHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportingModuleStatus":
        handler = new ReportingModuleStatusHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportingOrders":
        handler = new ReportingOrdersHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportingSystemUpdates":
        handler = new ReportingSystemUpdatesHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReportingUsers":
        handler = new ReportingUsersHandler(jpa);
        handler.process(inputStream);
        break;

      case "Review":
        handler = new ReviewHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReviewDetail":
        handler = new ReviewDetailHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReviewEntity":
        handler = new ReviewEntityHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReviewEntitySummary":
        handler = new ReviewEntitySummaryHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReviewStatus":
        handler = new ReviewStatusHandler(jpa);
        handler.process(inputStream);
        break;

      case "ReviewStore":
        handler = new ReviewStoreHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesBestsellersAggregatedDaily":
        handler = new SalesBestsellersAggregatedDailyHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesBestsellersAggregatedMonthly":
        handler = new SalesBestsellersAggregatedMonthlyHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesBestsellersAggregatedYearly":
        handler = new SalesBestsellersAggregatedYearlyHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesCreditmemo":
        handler = new SalesCreditmemoHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesCreditmemoComment":
        handler = new SalesCreditmemoCommentHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesCreditmemoGrid":
        handler = new SalesCreditmemoGridHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesCreditmemoItem":
        handler = new SalesCreditmemoItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesInvoice":
        handler = new SalesInvoiceHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesInvoiceComment":
        handler = new SalesInvoiceCommentHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesInvoiceGrid":
        handler = new SalesInvoiceGridHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesInvoiceItem":
        handler = new SalesInvoiceItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesInvoicedAggregated":
        handler = new SalesInvoicedAggregatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesInvoicedAggregatedOrder":
        handler = new SalesInvoicedAggregatedOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrder":
        handler = new SalesOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderAddress":
        handler = new SalesOrderAddressHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderAggregatedCreated":
        handler = new SalesOrderAggregatedCreatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderAggregatedUpdated":
        handler = new SalesOrderAggregatedUpdatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderGrid":
        handler = new SalesOrderGridHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderItem":
        handler = new SalesOrderItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderPayment":
        handler = new SalesOrderPaymentHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderStatus":
        handler = new SalesOrderStatusHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderStatusHistory":
        handler = new SalesOrderStatusHistoryHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderStatusLabel":
        handler = new SalesOrderStatusLabelHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderStatusState":
        handler = new SalesOrderStatusStateHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderTax":
        handler = new SalesOrderTaxHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesOrderTaxItem":
        handler = new SalesOrderTaxItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesPaymentTransaction":
        handler = new SalesPaymentTransactionHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesRefundedAggregated":
        handler = new SalesRefundedAggregatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesRefundedAggregatedOrder":
        handler = new SalesRefundedAggregatedOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesSequenceMeta":
        handler = new SalesSequenceMetaHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesSequenceProfile":
        handler = new SalesSequenceProfileHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesShipment":
        handler = new SalesShipmentHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesShipmentComment":
        handler = new SalesShipmentCommentHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesShipmentGrid":
        handler = new SalesShipmentGridHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesShipmentItem":
        handler = new SalesShipmentItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesShipmentTrack":
        handler = new SalesShipmentTrackHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesShippingAggregated":
        handler = new SalesShippingAggregatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesShippingAggregatedOrder":
        handler = new SalesShippingAggregatedOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "Salesrule":
        handler = new SalesruleHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleCoupon":
        handler = new SalesruleCouponHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleCouponAggregated":
        handler = new SalesruleCouponAggregatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleCouponAggregatedOrder":
        handler = new SalesruleCouponAggregatedOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleCouponAggregatedUpdated":
        handler = new SalesruleCouponAggregatedUpdatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleCouponUsage":
        handler = new SalesruleCouponUsageHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleCustomer":
        handler = new SalesruleCustomerHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleCustomerGroup":
        handler = new SalesruleCustomerGroupHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleLabel":
        handler = new SalesruleLabelHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleProductAttribute":
        handler = new SalesruleProductAttributeHandler(jpa);
        handler.process(inputStream);
        break;

      case "SalesruleWebsite":
        handler = new SalesruleWebsiteHandler(jpa);
        handler.process(inputStream);
        break;

      case "SearchQuery":
        handler = new SearchQueryHandler(jpa);
        handler.process(inputStream);
        break;

      case "SearchSynonyms":
        handler = new SearchSynonymsHandler(jpa);
        handler.process(inputStream);
        break;

      case "SendfriendLog":
        handler = new SendfriendLogHandler(jpa);
        handler.process(inputStream);
        break;

      case "SequenceCreditmemo0":
        handler = new SequenceCreditmemo0Handler(jpa);
        handler.process(inputStream);
        break;

      case "SequenceCreditmemo1":
        handler = new SequenceCreditmemo1Handler(jpa);
        handler.process(inputStream);
        break;

      case "SequenceInvoice0":
        handler = new SequenceInvoice0Handler(jpa);
        handler.process(inputStream);
        break;

      case "SequenceInvoice1":
        handler = new SequenceInvoice1Handler(jpa);
        handler.process(inputStream);
        break;

      case "SequenceOrder0":
        handler = new SequenceOrder0Handler(jpa);
        handler.process(inputStream);
        break;

      case "SequenceOrder1":
        handler = new SequenceOrder1Handler(jpa);
        handler.process(inputStream);
        break;

      case "SequenceShipment0":
        handler = new SequenceShipment0Handler(jpa);
        handler.process(inputStream);
        break;

      case "SequenceShipment1":
        handler = new SequenceShipment1Handler(jpa);
        handler.process(inputStream);
        break;

      case "Session":
        handler = new SessionHandler(jpa);
        handler.process(inputStream);
        break;

      case "SetupModule":
        handler = new SetupModuleHandler(jpa);
        handler.process(inputStream);
        break;

      case "ShippingTablerate":
        handler = new ShippingTablerateHandler(jpa);
        handler.process(inputStream);
        break;

      case "SignifydCase":
        handler = new SignifydCaseHandler(jpa);
        handler.process(inputStream);
        break;

      case "Sitemap":
        handler = new SitemapHandler(jpa);
        handler.process(inputStream);
        break;

      case "Store":
        handler = new StoreHandler(jpa);
        handler.process(inputStream);
        break;

      case "StoreGroup":
        handler = new StoreGroupHandler(jpa);
        handler.process(inputStream);
        break;

      case "StoreWebsite":
        handler = new StoreWebsiteHandler(jpa);
        handler.process(inputStream);
        break;

      case "TaxCalculation":
        handler = new TaxCalculationHandler(jpa);
        handler.process(inputStream);
        break;

      case "TaxCalculationRate":
        handler = new TaxCalculationRateHandler(jpa);
        handler.process(inputStream);
        break;

      case "TaxCalculationRateTitle":
        handler = new TaxCalculationRateTitleHandler(jpa);
        handler.process(inputStream);
        break;

      case "TaxCalculationRule":
        handler = new TaxCalculationRuleHandler(jpa);
        handler.process(inputStream);
        break;

      case "TaxClass":
        handler = new TaxClassHandler(jpa);
        handler.process(inputStream);
        break;

      case "TaxOrderAggregatedCreated":
        handler = new TaxOrderAggregatedCreatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "TaxOrderAggregatedUpdated":
        handler = new TaxOrderAggregatedUpdatedHandler(jpa);
        handler.process(inputStream);
        break;

      case "TemandoCheckoutAddress":
        handler = new TemandoCheckoutAddressHandler(jpa);
        handler.process(inputStream);
        break;

      case "TemandoCollectionPointSearch":
        handler = new TemandoCollectionPointSearchHandler(jpa);
        handler.process(inputStream);
        break;

      case "TemandoOrder":
        handler = new TemandoOrderHandler(jpa);
        handler.process(inputStream);
        break;

      case "TemandoOrderCollectionPoint":
        handler = new TemandoOrderCollectionPointHandler(jpa);
        handler.process(inputStream);
        break;

      case "TemandoOrderPickupLocation":
        handler = new TemandoOrderPickupLocationHandler(jpa);
        handler.process(inputStream);
        break;

      case "TemandoPickupLocationSearch":
        handler = new TemandoPickupLocationSearchHandler(jpa);
        handler.process(inputStream);
        break;

      case "TemandoQuoteCollectionPoint":
        handler = new TemandoQuoteCollectionPointHandler(jpa);
        handler.process(inputStream);
        break;

      case "TemandoQuotePickupLocation":
        handler = new TemandoQuotePickupLocationHandler(jpa);
        handler.process(inputStream);
        break;

      case "TemandoShipment":
        handler = new TemandoShipmentHandler(jpa);
        handler.process(inputStream);
        break;

      case "Theme":
        handler = new ThemeHandler(jpa);
        handler.process(inputStream);
        break;

      case "ThemeFile":
        handler = new ThemeFileHandler(jpa);
        handler.process(inputStream);
        break;

      case "Translation":
        handler = new TranslationHandler(jpa);
        handler.process(inputStream);
        break;

      case "UiBookmark":
        handler = new UiBookmarkHandler(jpa);
        handler.process(inputStream);
        break;

      case "UrlRewrite":
        handler = new UrlRewriteHandler(jpa);
        handler.process(inputStream);
        break;

      case "Variable":
        handler = new VariableHandler(jpa);
        handler.process(inputStream);
        break;

      case "VariableValue":
        handler = new VariableValueHandler(jpa);
        handler.process(inputStream);
        break;

      case "VaultPaymentToken":
        handler = new VaultPaymentTokenHandler(jpa);
        handler.process(inputStream);
        break;

      case "VaultPaymentTokenOrderPaymentLink":
        handler = new VaultPaymentTokenOrderPaymentLinkHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexCustomerCode":
        handler = new VertexCustomerCodeHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexInvoiceSent":
        handler = new VertexInvoiceSentHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexOrderInvoiceStatus":
        handler = new VertexOrderInvoiceStatusHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexSalesCreditmemoItemInvoiceTextCode":
        handler = new VertexSalesCreditmemoItemInvoiceTextCodeHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexSalesCreditmemoItemTaxCode":
        handler = new VertexSalesCreditmemoItemTaxCodeHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexSalesCreditmemoItemVertexTaxCode":
        handler = new VertexSalesCreditmemoItemVertexTaxCodeHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexSalesOrderItemInvoiceTextCode":
        handler = new VertexSalesOrderItemInvoiceTextCodeHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexSalesOrderItemTaxCode":
        handler = new VertexSalesOrderItemTaxCodeHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexSalesOrderItemVertexTaxCode":
        handler = new VertexSalesOrderItemVertexTaxCodeHandler(jpa);
        handler.process(inputStream);
        break;

      case "VertexTaxrequest":
        handler = new VertexTaxrequestHandler(jpa);
        handler.process(inputStream);
        break;

      case "WeeeTax":
        handler = new WeeeTaxHandler(jpa);
        handler.process(inputStream);
        break;

      case "Widget":
        handler = new WidgetHandler(jpa);
        handler.process(inputStream);
        break;

      case "WidgetInstance":
        handler = new WidgetInstanceHandler(jpa);
        handler.process(inputStream);
        break;

      case "WidgetInstancePage":
        handler = new WidgetInstancePageHandler(jpa);
        handler.process(inputStream);
        break;

      case "WidgetInstancePageLayout":
        handler = new WidgetInstancePageLayoutHandler(jpa);
        handler.process(inputStream);
        break;

      case "Wishlist":
        handler = new WishlistHandler(jpa);
        handler.process(inputStream);
        break;

      case "WishlistItem":
        handler = new WishlistItemHandler(jpa);
        handler.process(inputStream);
        break;

      case "WishlistItemOption":
        handler = new WishlistItemOptionHandler(jpa);
        handler.process(inputStream);
        break;

      default:
        System.out.println("Not found " + handlerName);
    }
  }
}
