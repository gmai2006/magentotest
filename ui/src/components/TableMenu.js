import React from 'react';
import init from "../init";
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import AdminPasswords from '../pages/tables/AdminPasswords';
import AdminSystemMessages from '../pages/tables/AdminSystemMessages';
import AdminUser from '../pages/tables/AdminUser';
import AdminUserSession from '../pages/tables/AdminUserSession';
import AdminnotificationInbox from '../pages/tables/AdminnotificationInbox';
import AmazonCustomer from '../pages/tables/AmazonCustomer';
import AmazonPendingAuthorization from '../pages/tables/AmazonPendingAuthorization';
import AmazonPendingCapture from '../pages/tables/AmazonPendingCapture';
import AmazonPendingRefund from '../pages/tables/AmazonPendingRefund';
import AmazonQuote from '../pages/tables/AmazonQuote';
import AmazonSalesOrder from '../pages/tables/AmazonSalesOrder';
import AuthorizationRole from '../pages/tables/AuthorizationRole';
import AuthorizationRule from '../pages/tables/AuthorizationRule';
import Cache from '../pages/tables/Cache';
import CacheTag from '../pages/tables/CacheTag';
import CaptchaLog from '../pages/tables/CaptchaLog';
import CatalogCategoryEntity from '../pages/tables/CatalogCategoryEntity';
import CatalogCategoryEntityDatetime from '../pages/tables/CatalogCategoryEntityDatetime';
import CatalogCategoryEntityDecimal from '../pages/tables/CatalogCategoryEntityDecimal';
import CatalogCategoryEntityInt from '../pages/tables/CatalogCategoryEntityInt';
import CatalogCategoryEntityText from '../pages/tables/CatalogCategoryEntityText';
import CatalogCategoryEntityVarchar from '../pages/tables/CatalogCategoryEntityVarchar';
import CatalogCategoryProduct from '../pages/tables/CatalogCategoryProduct';
import CatalogCategoryProductIndex from '../pages/tables/CatalogCategoryProductIndex';
import CatalogCategoryProductIndexReplica from '../pages/tables/CatalogCategoryProductIndexReplica';
import CatalogCategoryProductIndexStore1 from '../pages/tables/CatalogCategoryProductIndexStore1';
import CatalogCategoryProductIndexStore1Replica from '../pages/tables/CatalogCategoryProductIndexStore1Replica';
import CatalogCategoryProductIndexTmp from '../pages/tables/CatalogCategoryProductIndexTmp';
import CatalogCompareItem from '../pages/tables/CatalogCompareItem';
import CatalogEavAttribute from '../pages/tables/CatalogEavAttribute';
import CatalogProductBundleOption from '../pages/tables/CatalogProductBundleOption';
import CatalogProductBundleOptionValue from '../pages/tables/CatalogProductBundleOptionValue';
import CatalogProductBundlePriceIndex from '../pages/tables/CatalogProductBundlePriceIndex';
import CatalogProductBundleSelection from '../pages/tables/CatalogProductBundleSelection';
import CatalogProductBundleSelectionPrice from '../pages/tables/CatalogProductBundleSelectionPrice';
import CatalogProductBundleStockIndex from '../pages/tables/CatalogProductBundleStockIndex';
import CatalogProductEntity from '../pages/tables/CatalogProductEntity';
import CatalogProductEntityDatetime from '../pages/tables/CatalogProductEntityDatetime';
import CatalogProductEntityDecimal from '../pages/tables/CatalogProductEntityDecimal';
import CatalogProductEntityGallery from '../pages/tables/CatalogProductEntityGallery';
import CatalogProductEntityInt from '../pages/tables/CatalogProductEntityInt';
import CatalogProductEntityMediaGallery from '../pages/tables/CatalogProductEntityMediaGallery';
import CatalogProductEntityMediaGalleryValue from '../pages/tables/CatalogProductEntityMediaGalleryValue';
import CatalogProductEntityMediaGalleryValueToEntity from '../pages/tables/CatalogProductEntityMediaGalleryValueToEntity';
import CatalogProductEntityMediaGalleryValueVideo from '../pages/tables/CatalogProductEntityMediaGalleryValueVideo';
import CatalogProductEntityText from '../pages/tables/CatalogProductEntityText';
import CatalogProductEntityTierPrice from '../pages/tables/CatalogProductEntityTierPrice';
import CatalogProductEntityVarchar from '../pages/tables/CatalogProductEntityVarchar';
import CatalogProductFrontendAction from '../pages/tables/CatalogProductFrontendAction';
import CatalogProductIndexEav from '../pages/tables/CatalogProductIndexEav';
import CatalogProductIndexEavDecimal from '../pages/tables/CatalogProductIndexEavDecimal';
import CatalogProductIndexEavDecimalIdx from '../pages/tables/CatalogProductIndexEavDecimalIdx';
import CatalogProductIndexEavDecimalReplica from '../pages/tables/CatalogProductIndexEavDecimalReplica';
import CatalogProductIndexEavDecimalTmp from '../pages/tables/CatalogProductIndexEavDecimalTmp';
import CatalogProductIndexEavIdx from '../pages/tables/CatalogProductIndexEavIdx';
import CatalogProductIndexEavReplica from '../pages/tables/CatalogProductIndexEavReplica';
import CatalogProductIndexEavTmp from '../pages/tables/CatalogProductIndexEavTmp';
import CatalogProductIndexPrice from '../pages/tables/CatalogProductIndexPrice';
import CatalogProductIndexPriceBundleIdx from '../pages/tables/CatalogProductIndexPriceBundleIdx';
import CatalogProductIndexPriceBundleOptIdx from '../pages/tables/CatalogProductIndexPriceBundleOptIdx';
import CatalogProductIndexPriceBundleOptTmp from '../pages/tables/CatalogProductIndexPriceBundleOptTmp';
import CatalogProductIndexPriceBundleSelIdx from '../pages/tables/CatalogProductIndexPriceBundleSelIdx';
import CatalogProductIndexPriceBundleSelTmp from '../pages/tables/CatalogProductIndexPriceBundleSelTmp';
import CatalogProductIndexPriceBundleTmp from '../pages/tables/CatalogProductIndexPriceBundleTmp';
import CatalogProductIndexPriceCfgOptAgrIdx from '../pages/tables/CatalogProductIndexPriceCfgOptAgrIdx';
import CatalogProductIndexPriceCfgOptAgrTmp from '../pages/tables/CatalogProductIndexPriceCfgOptAgrTmp';
import CatalogProductIndexPriceCfgOptIdx from '../pages/tables/CatalogProductIndexPriceCfgOptIdx';
import CatalogProductIndexPriceCfgOptTmp from '../pages/tables/CatalogProductIndexPriceCfgOptTmp';
import CatalogProductIndexPriceDownlodIdx from '../pages/tables/CatalogProductIndexPriceDownlodIdx';
import CatalogProductIndexPriceDownlodTmp from '../pages/tables/CatalogProductIndexPriceDownlodTmp';
import CatalogProductIndexPriceFinalIdx from '../pages/tables/CatalogProductIndexPriceFinalIdx';
import CatalogProductIndexPriceFinalTmp from '../pages/tables/CatalogProductIndexPriceFinalTmp';
import CatalogProductIndexPriceIdx from '../pages/tables/CatalogProductIndexPriceIdx';
import CatalogProductIndexPriceOptAgrIdx from '../pages/tables/CatalogProductIndexPriceOptAgrIdx';
import CatalogProductIndexPriceOptAgrTmp from '../pages/tables/CatalogProductIndexPriceOptAgrTmp';
import CatalogProductIndexPriceOptIdx from '../pages/tables/CatalogProductIndexPriceOptIdx';
import CatalogProductIndexPriceOptTmp from '../pages/tables/CatalogProductIndexPriceOptTmp';
import CatalogProductIndexPriceReplica from '../pages/tables/CatalogProductIndexPriceReplica';
import CatalogProductIndexPriceTmp from '../pages/tables/CatalogProductIndexPriceTmp';
import CatalogProductIndexTierPrice from '../pages/tables/CatalogProductIndexTierPrice';
import CatalogProductIndexWebsite from '../pages/tables/CatalogProductIndexWebsite';
import CatalogProductLink from '../pages/tables/CatalogProductLink';
import CatalogProductLinkAttribute from '../pages/tables/CatalogProductLinkAttribute';
import CatalogProductLinkAttributeDecimal from '../pages/tables/CatalogProductLinkAttributeDecimal';
import CatalogProductLinkAttributeInt from '../pages/tables/CatalogProductLinkAttributeInt';
import CatalogProductLinkAttributeVarchar from '../pages/tables/CatalogProductLinkAttributeVarchar';
import CatalogProductLinkType from '../pages/tables/CatalogProductLinkType';
import CatalogProductOption from '../pages/tables/CatalogProductOption';
import CatalogProductOptionPrice from '../pages/tables/CatalogProductOptionPrice';
import CatalogProductOptionTitle from '../pages/tables/CatalogProductOptionTitle';
import CatalogProductOptionTypePrice from '../pages/tables/CatalogProductOptionTypePrice';
import CatalogProductOptionTypeTitle from '../pages/tables/CatalogProductOptionTypeTitle';
import CatalogProductOptionTypeValue from '../pages/tables/CatalogProductOptionTypeValue';
import CatalogProductRelation from '../pages/tables/CatalogProductRelation';
import CatalogProductSuperAttribute from '../pages/tables/CatalogProductSuperAttribute';
import CatalogProductSuperAttributeLabel from '../pages/tables/CatalogProductSuperAttributeLabel';
import CatalogProductSuperLink from '../pages/tables/CatalogProductSuperLink';
import CatalogProductWebsite from '../pages/tables/CatalogProductWebsite';
import CatalogUrlRewriteProductCategory from '../pages/tables/CatalogUrlRewriteProductCategory';
import CataloginventoryStock from '../pages/tables/CataloginventoryStock';
import CataloginventoryStockItem from '../pages/tables/CataloginventoryStockItem';
import CataloginventoryStockStatus from '../pages/tables/CataloginventoryStockStatus';
import CataloginventoryStockStatusIdx from '../pages/tables/CataloginventoryStockStatusIdx';
import CataloginventoryStockStatusReplica from '../pages/tables/CataloginventoryStockStatusReplica';
import CataloginventoryStockStatusTmp from '../pages/tables/CataloginventoryStockStatusTmp';
import Catalogrule from '../pages/tables/Catalogrule';
import CatalogruleCustomerGroup from '../pages/tables/CatalogruleCustomerGroup';
import CatalogruleGroupWebsite from '../pages/tables/CatalogruleGroupWebsite';
import CatalogruleGroupWebsiteReplica from '../pages/tables/CatalogruleGroupWebsiteReplica';
import CatalogruleProduct from '../pages/tables/CatalogruleProduct';
import CatalogruleProductPrice from '../pages/tables/CatalogruleProductPrice';
import CatalogruleProductPriceReplica from '../pages/tables/CatalogruleProductPriceReplica';
import CatalogruleProductReplica from '../pages/tables/CatalogruleProductReplica';
import CatalogruleWebsite from '../pages/tables/CatalogruleWebsite';
import CatalogsearchFulltextScope1 from '../pages/tables/CatalogsearchFulltextScope1';
import CatalogsearchRecommendations from '../pages/tables/CatalogsearchRecommendations';
import CheckoutAgreement from '../pages/tables/CheckoutAgreement';
import CheckoutAgreementStore from '../pages/tables/CheckoutAgreementStore';
import CmsBlock from '../pages/tables/CmsBlock';
import CmsBlockStore from '../pages/tables/CmsBlockStore';
import CmsPage from '../pages/tables/CmsPage';
import CmsPageStore from '../pages/tables/CmsPageStore';
import CoreConfigData from '../pages/tables/CoreConfigData';
import CronSchedule from '../pages/tables/CronSchedule';
import CustomerAddressEntity from '../pages/tables/CustomerAddressEntity';
import CustomerAddressEntityDatetime from '../pages/tables/CustomerAddressEntityDatetime';
import CustomerAddressEntityDecimal from '../pages/tables/CustomerAddressEntityDecimal';
import CustomerAddressEntityInt from '../pages/tables/CustomerAddressEntityInt';
import CustomerAddressEntityText from '../pages/tables/CustomerAddressEntityText';
import CustomerAddressEntityVarchar from '../pages/tables/CustomerAddressEntityVarchar';
import CustomerEavAttribute from '../pages/tables/CustomerEavAttribute';
import CustomerEavAttributeWebsite from '../pages/tables/CustomerEavAttributeWebsite';
import CustomerEntity from '../pages/tables/CustomerEntity';
import CustomerEntityDatetime from '../pages/tables/CustomerEntityDatetime';
import CustomerEntityDecimal from '../pages/tables/CustomerEntityDecimal';
import CustomerEntityInt from '../pages/tables/CustomerEntityInt';
import CustomerEntityText from '../pages/tables/CustomerEntityText';
import CustomerEntityVarchar from '../pages/tables/CustomerEntityVarchar';
import CustomerFormAttribute from '../pages/tables/CustomerFormAttribute';
import CustomerGridFlat from '../pages/tables/CustomerGridFlat';
import CustomerGroup from '../pages/tables/CustomerGroup';
import CustomerLog from '../pages/tables/CustomerLog';
import CustomerVisitor from '../pages/tables/CustomerVisitor';
import DesignChange from '../pages/tables/DesignChange';
import DesignConfigGridFlat from '../pages/tables/DesignConfigGridFlat';
import DirectoryCountry from '../pages/tables/DirectoryCountry';
import DirectoryCountryFormat from '../pages/tables/DirectoryCountryFormat';
import DirectoryCountryRegion from '../pages/tables/DirectoryCountryRegion';
import DirectoryCountryRegionName from '../pages/tables/DirectoryCountryRegionName';
import DirectoryCurrencyRate from '../pages/tables/DirectoryCurrencyRate';
import DownloadableLink from '../pages/tables/DownloadableLink';
import DownloadableLinkPrice from '../pages/tables/DownloadableLinkPrice';
import DownloadableLinkPurchased from '../pages/tables/DownloadableLinkPurchased';
import DownloadableLinkPurchasedItem from '../pages/tables/DownloadableLinkPurchasedItem';
import DownloadableLinkTitle from '../pages/tables/DownloadableLinkTitle';
import DownloadableSample from '../pages/tables/DownloadableSample';
import DownloadableSampleTitle from '../pages/tables/DownloadableSampleTitle';
import EavAttribute from '../pages/tables/EavAttribute';
import EavAttributeGroup from '../pages/tables/EavAttributeGroup';
import EavAttributeLabel from '../pages/tables/EavAttributeLabel';
import EavAttributeOption from '../pages/tables/EavAttributeOption';
import EavAttributeOptionSwatch from '../pages/tables/EavAttributeOptionSwatch';
import EavAttributeOptionValue from '../pages/tables/EavAttributeOptionValue';
import EavAttributeSet from '../pages/tables/EavAttributeSet';
import EavEntity from '../pages/tables/EavEntity';
import EavEntityAttribute from '../pages/tables/EavEntityAttribute';
import EavEntityDatetime from '../pages/tables/EavEntityDatetime';
import EavEntityDecimal from '../pages/tables/EavEntityDecimal';
import EavEntityInt from '../pages/tables/EavEntityInt';
import EavEntityStore from '../pages/tables/EavEntityStore';
import EavEntityText from '../pages/tables/EavEntityText';
import EavEntityType from '../pages/tables/EavEntityType';
import EavEntityVarchar from '../pages/tables/EavEntityVarchar';
import EavFormElement from '../pages/tables/EavFormElement';
import EavFormFieldset from '../pages/tables/EavFormFieldset';
import EavFormFieldsetLabel from '../pages/tables/EavFormFieldsetLabel';
import EavFormType from '../pages/tables/EavFormType';
import EavFormTypeEntity from '../pages/tables/EavFormTypeEntity';
import EmailAbandonedCart from '../pages/tables/EmailAbandonedCart';
import EmailAutomation from '../pages/tables/EmailAutomation';
import EmailCampaign from '../pages/tables/EmailCampaign';
import EmailCatalog from '../pages/tables/EmailCatalog';
import EmailContact from '../pages/tables/EmailContact';
import EmailContactConsent from '../pages/tables/EmailContactConsent';
import EmailFailedAuth from '../pages/tables/EmailFailedAuth';
import EmailImporter from '../pages/tables/EmailImporter';
import EmailOrder from '../pages/tables/EmailOrder';
import EmailReview from '../pages/tables/EmailReview';
import EmailRules from '../pages/tables/EmailRules';
import EmailTemplate from '../pages/tables/EmailTemplate';
import EmailWishlist from '../pages/tables/EmailWishlist';
import Flag from '../pages/tables/Flag';
import GiftMessage from '../pages/tables/GiftMessage';
import GoogleoptimizerCode from '../pages/tables/GoogleoptimizerCode';
import ImportHistory from '../pages/tables/ImportHistory';
import ImportexportImportdata from '../pages/tables/ImportexportImportdata';
import IndexerState from '../pages/tables/IndexerState';
import Integration from '../pages/tables/Integration';
import InventoryGeoname from '../pages/tables/InventoryGeoname';
import InventoryLowStockNotificationConfiguration from '../pages/tables/InventoryLowStockNotificationConfiguration';
import InventoryReservation from '../pages/tables/InventoryReservation';
import InventoryShipmentSource from '../pages/tables/InventoryShipmentSource';
import InventorySource from '../pages/tables/InventorySource';
import InventorySourceCarrierLink from '../pages/tables/InventorySourceCarrierLink';
import InventorySourceItem from '../pages/tables/InventorySourceItem';
import InventorySourceStockLink from '../pages/tables/InventorySourceStockLink';
import InventoryStock from '../pages/tables/InventoryStock';
import InventoryStockSalesChannel from '../pages/tables/InventoryStockSalesChannel';
import KlarnaCoreOrder from '../pages/tables/KlarnaCoreOrder';
import KlarnaPaymentsQuote from '../pages/tables/KlarnaPaymentsQuote';
import LayoutLink from '../pages/tables/LayoutLink';
import LayoutUpdate from '../pages/tables/LayoutUpdate';
import MagentoAcknowledgedBulk from '../pages/tables/MagentoAcknowledgedBulk';
import MagentoBulk from '../pages/tables/MagentoBulk';
import MagentoOperation from '../pages/tables/MagentoOperation';
import MspTfaCountryCodes from '../pages/tables/MspTfaCountryCodes';
import MspTfaTrusted from '../pages/tables/MspTfaTrusted';
import MspTfaUserConfig from '../pages/tables/MspTfaUserConfig';
import MviewState from '../pages/tables/MviewState';
import NewsletterProblem from '../pages/tables/NewsletterProblem';
import NewsletterQueue from '../pages/tables/NewsletterQueue';
import NewsletterQueueLink from '../pages/tables/NewsletterQueueLink';
import NewsletterQueueStoreLink from '../pages/tables/NewsletterQueueStoreLink';
import NewsletterSubscriber from '../pages/tables/NewsletterSubscriber';
import NewsletterTemplate from '../pages/tables/NewsletterTemplate';
import OauthConsumer from '../pages/tables/OauthConsumer';
import OauthNonce from '../pages/tables/OauthNonce';
import OauthToken from '../pages/tables/OauthToken';
import OauthTokenRequestLog from '../pages/tables/OauthTokenRequestLog';
import PasswordResetRequestEvent from '../pages/tables/PasswordResetRequestEvent';
import PatchList from '../pages/tables/PatchList';
import PaypalBillingAgreement from '../pages/tables/PaypalBillingAgreement';
import PaypalBillingAgreementOrder from '../pages/tables/PaypalBillingAgreementOrder';
import PaypalCert from '../pages/tables/PaypalCert';
import PaypalPaymentTransaction from '../pages/tables/PaypalPaymentTransaction';
import PaypalSettlementReport from '../pages/tables/PaypalSettlementReport';
import PaypalSettlementReportRow from '../pages/tables/PaypalSettlementReportRow';
import PersistentSession from '../pages/tables/PersistentSession';
import ProductAlertPrice from '../pages/tables/ProductAlertPrice';
import ProductAlertStock from '../pages/tables/ProductAlertStock';
import Queue from '../pages/tables/Queue';
import QueueLock from '../pages/tables/QueueLock';
import QueueMessage from '../pages/tables/QueueMessage';
import QueueMessageStatus from '../pages/tables/QueueMessageStatus';
import QueuePoisonPill from '../pages/tables/QueuePoisonPill';
import Quote from '../pages/tables/Quote';
import QuoteAddress from '../pages/tables/QuoteAddress';
import QuoteAddressItem from '../pages/tables/QuoteAddressItem';
import QuoteIdMask from '../pages/tables/QuoteIdMask';
import QuoteItem from '../pages/tables/QuoteItem';
import QuoteItemOption from '../pages/tables/QuoteItemOption';
import QuotePayment from '../pages/tables/QuotePayment';
import QuoteShippingRate from '../pages/tables/QuoteShippingRate';
import Rating from '../pages/tables/Rating';
import RatingEntity from '../pages/tables/RatingEntity';
import RatingOption from '../pages/tables/RatingOption';
import RatingOptionVote from '../pages/tables/RatingOptionVote';
import RatingOptionVoteAggregated from '../pages/tables/RatingOptionVoteAggregated';
import RatingStore from '../pages/tables/RatingStore';
import RatingTitle from '../pages/tables/RatingTitle';
import ReleaseNotificationViewerLog from '../pages/tables/ReleaseNotificationViewerLog';
import ReportComparedProductIndex from '../pages/tables/ReportComparedProductIndex';
import ReportEvent from '../pages/tables/ReportEvent';
import ReportEventTypes from '../pages/tables/ReportEventTypes';
import ReportViewedProductAggregatedDaily from '../pages/tables/ReportViewedProductAggregatedDaily';
import ReportViewedProductAggregatedMonthly from '../pages/tables/ReportViewedProductAggregatedMonthly';
import ReportViewedProductAggregatedYearly from '../pages/tables/ReportViewedProductAggregatedYearly';
import ReportViewedProductIndex from '../pages/tables/ReportViewedProductIndex';
import ReportingCounts from '../pages/tables/ReportingCounts';
import ReportingModuleStatus from '../pages/tables/ReportingModuleStatus';
import ReportingOrders from '../pages/tables/ReportingOrders';
import ReportingSystemUpdates from '../pages/tables/ReportingSystemUpdates';
import ReportingUsers from '../pages/tables/ReportingUsers';
import Review from '../pages/tables/Review';
import ReviewDetail from '../pages/tables/ReviewDetail';
import ReviewEntity from '../pages/tables/ReviewEntity';
import ReviewEntitySummary from '../pages/tables/ReviewEntitySummary';
import ReviewStatus from '../pages/tables/ReviewStatus';
import ReviewStore from '../pages/tables/ReviewStore';
import SalesBestsellersAggregatedDaily from '../pages/tables/SalesBestsellersAggregatedDaily';
import SalesBestsellersAggregatedMonthly from '../pages/tables/SalesBestsellersAggregatedMonthly';
import SalesBestsellersAggregatedYearly from '../pages/tables/SalesBestsellersAggregatedYearly';
import SalesCreditmemo from '../pages/tables/SalesCreditmemo';
import SalesCreditmemoComment from '../pages/tables/SalesCreditmemoComment';
import SalesCreditmemoGrid from '../pages/tables/SalesCreditmemoGrid';
import SalesCreditmemoItem from '../pages/tables/SalesCreditmemoItem';
import SalesInvoice from '../pages/tables/SalesInvoice';
import SalesInvoiceComment from '../pages/tables/SalesInvoiceComment';
import SalesInvoiceGrid from '../pages/tables/SalesInvoiceGrid';
import SalesInvoiceItem from '../pages/tables/SalesInvoiceItem';
import SalesInvoicedAggregated from '../pages/tables/SalesInvoicedAggregated';
import SalesInvoicedAggregatedOrder from '../pages/tables/SalesInvoicedAggregatedOrder';
import SalesOrder from '../pages/tables/SalesOrder';
import SalesOrderAddress from '../pages/tables/SalesOrderAddress';
import SalesOrderAggregatedCreated from '../pages/tables/SalesOrderAggregatedCreated';
import SalesOrderAggregatedUpdated from '../pages/tables/SalesOrderAggregatedUpdated';
import SalesOrderGrid from '../pages/tables/SalesOrderGrid';
import SalesOrderItem from '../pages/tables/SalesOrderItem';
import SalesOrderPayment from '../pages/tables/SalesOrderPayment';
import SalesOrderStatus from '../pages/tables/SalesOrderStatus';
import SalesOrderStatusHistory from '../pages/tables/SalesOrderStatusHistory';
import SalesOrderStatusLabel from '../pages/tables/SalesOrderStatusLabel';
import SalesOrderStatusState from '../pages/tables/SalesOrderStatusState';
import SalesOrderTax from '../pages/tables/SalesOrderTax';
import SalesOrderTaxItem from '../pages/tables/SalesOrderTaxItem';
import SalesPaymentTransaction from '../pages/tables/SalesPaymentTransaction';
import SalesRefundedAggregated from '../pages/tables/SalesRefundedAggregated';
import SalesRefundedAggregatedOrder from '../pages/tables/SalesRefundedAggregatedOrder';
import SalesSequenceMeta from '../pages/tables/SalesSequenceMeta';
import SalesSequenceProfile from '../pages/tables/SalesSequenceProfile';
import SalesShipment from '../pages/tables/SalesShipment';
import SalesShipmentComment from '../pages/tables/SalesShipmentComment';
import SalesShipmentGrid from '../pages/tables/SalesShipmentGrid';
import SalesShipmentItem from '../pages/tables/SalesShipmentItem';
import SalesShipmentTrack from '../pages/tables/SalesShipmentTrack';
import SalesShippingAggregated from '../pages/tables/SalesShippingAggregated';
import SalesShippingAggregatedOrder from '../pages/tables/SalesShippingAggregatedOrder';
import Salesrule from '../pages/tables/Salesrule';
import SalesruleCoupon from '../pages/tables/SalesruleCoupon';
import SalesruleCouponAggregated from '../pages/tables/SalesruleCouponAggregated';
import SalesruleCouponAggregatedOrder from '../pages/tables/SalesruleCouponAggregatedOrder';
import SalesruleCouponAggregatedUpdated from '../pages/tables/SalesruleCouponAggregatedUpdated';
import SalesruleCouponUsage from '../pages/tables/SalesruleCouponUsage';
import SalesruleCustomer from '../pages/tables/SalesruleCustomer';
import SalesruleCustomerGroup from '../pages/tables/SalesruleCustomerGroup';
import SalesruleLabel from '../pages/tables/SalesruleLabel';
import SalesruleProductAttribute from '../pages/tables/SalesruleProductAttribute';
import SalesruleWebsite from '../pages/tables/SalesruleWebsite';
import SearchQuery from '../pages/tables/SearchQuery';
import SearchSynonyms from '../pages/tables/SearchSynonyms';
import SendfriendLog from '../pages/tables/SendfriendLog';
import SequenceCreditmemo0 from '../pages/tables/SequenceCreditmemo0';
import SequenceCreditmemo1 from '../pages/tables/SequenceCreditmemo1';
import SequenceInvoice0 from '../pages/tables/SequenceInvoice0';
import SequenceInvoice1 from '../pages/tables/SequenceInvoice1';
import SequenceOrder0 from '../pages/tables/SequenceOrder0';
import SequenceOrder1 from '../pages/tables/SequenceOrder1';
import SequenceShipment0 from '../pages/tables/SequenceShipment0';
import SequenceShipment1 from '../pages/tables/SequenceShipment1';
import Session from '../pages/tables/Session';
import SetupModule from '../pages/tables/SetupModule';
import ShippingTablerate from '../pages/tables/ShippingTablerate';
import SignifydCase from '../pages/tables/SignifydCase';
import Sitemap from '../pages/tables/Sitemap';
import Store from '../pages/tables/Store';
import StoreGroup from '../pages/tables/StoreGroup';
import StoreWebsite from '../pages/tables/StoreWebsite';
import TaxCalculation from '../pages/tables/TaxCalculation';
import TaxCalculationRate from '../pages/tables/TaxCalculationRate';
import TaxCalculationRateTitle from '../pages/tables/TaxCalculationRateTitle';
import TaxCalculationRule from '../pages/tables/TaxCalculationRule';
import TaxClass from '../pages/tables/TaxClass';
import TaxOrderAggregatedCreated from '../pages/tables/TaxOrderAggregatedCreated';
import TaxOrderAggregatedUpdated from '../pages/tables/TaxOrderAggregatedUpdated';
import TemandoCheckoutAddress from '../pages/tables/TemandoCheckoutAddress';
import TemandoCollectionPointSearch from '../pages/tables/TemandoCollectionPointSearch';
import TemandoOrder from '../pages/tables/TemandoOrder';
import TemandoOrderCollectionPoint from '../pages/tables/TemandoOrderCollectionPoint';
import TemandoOrderPickupLocation from '../pages/tables/TemandoOrderPickupLocation';
import TemandoPickupLocationSearch from '../pages/tables/TemandoPickupLocationSearch';
import TemandoQuoteCollectionPoint from '../pages/tables/TemandoQuoteCollectionPoint';
import TemandoQuotePickupLocation from '../pages/tables/TemandoQuotePickupLocation';
import TemandoShipment from '../pages/tables/TemandoShipment';
import Theme from '../pages/tables/Theme';
import ThemeFile from '../pages/tables/ThemeFile';
import Translation from '../pages/tables/Translation';
import UiBookmark from '../pages/tables/UiBookmark';
import UrlRewrite from '../pages/tables/UrlRewrite';
import Variable from '../pages/tables/Variable';
import VariableValue from '../pages/tables/VariableValue';
import VaultPaymentToken from '../pages/tables/VaultPaymentToken';
import VaultPaymentTokenOrderPaymentLink from '../pages/tables/VaultPaymentTokenOrderPaymentLink';
import VertexCustomerCode from '../pages/tables/VertexCustomerCode';
import VertexInvoiceSent from '../pages/tables/VertexInvoiceSent';
import VertexOrderInvoiceStatus from '../pages/tables/VertexOrderInvoiceStatus';
import VertexSalesCreditmemoItemInvoiceTextCode from '../pages/tables/VertexSalesCreditmemoItemInvoiceTextCode';
import VertexSalesCreditmemoItemTaxCode from '../pages/tables/VertexSalesCreditmemoItemTaxCode';
import VertexSalesCreditmemoItemVertexTaxCode from '../pages/tables/VertexSalesCreditmemoItemVertexTaxCode';
import VertexSalesOrderItemInvoiceTextCode from '../pages/tables/VertexSalesOrderItemInvoiceTextCode';
import VertexSalesOrderItemTaxCode from '../pages/tables/VertexSalesOrderItemTaxCode';
import VertexSalesOrderItemVertexTaxCode from '../pages/tables/VertexSalesOrderItemVertexTaxCode';
import VertexTaxrequest from '../pages/tables/VertexTaxrequest';
import WeeeTax from '../pages/tables/WeeeTax';
import Widget from '../pages/tables/Widget';
import WidgetInstance from '../pages/tables/WidgetInstance';
import WidgetInstancePage from '../pages/tables/WidgetInstancePage';
import WidgetInstancePageLayout from '../pages/tables/WidgetInstancePageLayout';
import Wishlist from '../pages/tables/Wishlist';
import WishlistItem from '../pages/tables/WishlistItem';
import WishlistItemOption from '../pages/tables/WishlistItemOption';;

const TableMenu = () => {
  const path = '/' + init.appName;
  return (
    <div>
      <Switch>

          <Route path={path + '/tables/adminpasswords'} component={AdminPasswords} />
          <Route path={path + '/tables/adminsystemmessages'} component={AdminSystemMessages} />
          <Route path={path + '/tables/adminuser'} component={AdminUser} />
          <Route path={path + '/tables/adminusersession'} component={AdminUserSession} />
          <Route path={path + '/tables/adminnotificationinbox'} component={AdminnotificationInbox} />
          <Route path={path + '/tables/amazoncustomer'} component={AmazonCustomer} />
          <Route path={path + '/tables/amazonpendingauthorization'} component={AmazonPendingAuthorization} />
          <Route path={path + '/tables/amazonpendingcapture'} component={AmazonPendingCapture} />
          <Route path={path + '/tables/amazonpendingrefund'} component={AmazonPendingRefund} />
          <Route path={path + '/tables/amazonquote'} component={AmazonQuote} />
          <Route path={path + '/tables/amazonsalesorder'} component={AmazonSalesOrder} />
          <Route path={path + '/tables/authorizationrole'} component={AuthorizationRole} />
          <Route path={path + '/tables/authorizationrule'} component={AuthorizationRule} />
          <Route path={path + '/tables/cache'} component={Cache} />
          <Route path={path + '/tables/cachetag'} component={CacheTag} />
          <Route path={path + '/tables/captchalog'} component={CaptchaLog} />
          <Route path={path + '/tables/catalogcategoryentity'} component={CatalogCategoryEntity} />
          <Route path={path + '/tables/catalogcategoryentitydatetime'} component={CatalogCategoryEntityDatetime} />
          <Route path={path + '/tables/catalogcategoryentitydecimal'} component={CatalogCategoryEntityDecimal} />
          <Route path={path + '/tables/catalogcategoryentityint'} component={CatalogCategoryEntityInt} />
          <Route path={path + '/tables/catalogcategoryentitytext'} component={CatalogCategoryEntityText} />
          <Route path={path + '/tables/catalogcategoryentityvarchar'} component={CatalogCategoryEntityVarchar} />
          <Route path={path + '/tables/catalogcategoryproduct'} component={CatalogCategoryProduct} />
          <Route path={path + '/tables/catalogcategoryproductindex'} component={CatalogCategoryProductIndex} />
          <Route path={path + '/tables/catalogcategoryproductindexreplica'} component={CatalogCategoryProductIndexReplica} />
          <Route path={path + '/tables/catalogcategoryproductindexstore1'} component={CatalogCategoryProductIndexStore1} />
          <Route path={path + '/tables/catalogcategoryproductindexstore1replica'} component={CatalogCategoryProductIndexStore1Replica} />
          <Route path={path + '/tables/catalogcategoryproductindextmp'} component={CatalogCategoryProductIndexTmp} />
          <Route path={path + '/tables/catalogcompareitem'} component={CatalogCompareItem} />
          <Route path={path + '/tables/catalogeavattribute'} component={CatalogEavAttribute} />
          <Route path={path + '/tables/catalogproductbundleoption'} component={CatalogProductBundleOption} />
          <Route path={path + '/tables/catalogproductbundleoptionvalue'} component={CatalogProductBundleOptionValue} />
          <Route path={path + '/tables/catalogproductbundlepriceindex'} component={CatalogProductBundlePriceIndex} />
          <Route path={path + '/tables/catalogproductbundleselection'} component={CatalogProductBundleSelection} />
          <Route path={path + '/tables/catalogproductbundleselectionprice'} component={CatalogProductBundleSelectionPrice} />
          <Route path={path + '/tables/catalogproductbundlestockindex'} component={CatalogProductBundleStockIndex} />
          <Route path={path + '/tables/catalogproductentity'} component={CatalogProductEntity} />
          <Route path={path + '/tables/catalogproductentitydatetime'} component={CatalogProductEntityDatetime} />
          <Route path={path + '/tables/catalogproductentitydecimal'} component={CatalogProductEntityDecimal} />
          <Route path={path + '/tables/catalogproductentitygallery'} component={CatalogProductEntityGallery} />
          <Route path={path + '/tables/catalogproductentityint'} component={CatalogProductEntityInt} />
          <Route path={path + '/tables/catalogproductentitymediagallery'} component={CatalogProductEntityMediaGallery} />
          <Route path={path + '/tables/catalogproductentitymediagalleryvalue'} component={CatalogProductEntityMediaGalleryValue} />
          <Route path={path + '/tables/catalogproductentitymediagalleryvaluetoentity'} component={CatalogProductEntityMediaGalleryValueToEntity} />
          <Route path={path + '/tables/catalogproductentitymediagalleryvaluevideo'} component={CatalogProductEntityMediaGalleryValueVideo} />
          <Route path={path + '/tables/catalogproductentitytext'} component={CatalogProductEntityText} />
          <Route path={path + '/tables/catalogproductentitytierprice'} component={CatalogProductEntityTierPrice} />
          <Route path={path + '/tables/catalogproductentityvarchar'} component={CatalogProductEntityVarchar} />
          <Route path={path + '/tables/catalogproductfrontendaction'} component={CatalogProductFrontendAction} />
          <Route path={path + '/tables/catalogproductindexeav'} component={CatalogProductIndexEav} />
          <Route path={path + '/tables/catalogproductindexeavdecimal'} component={CatalogProductIndexEavDecimal} />
          <Route path={path + '/tables/catalogproductindexeavdecimalidx'} component={CatalogProductIndexEavDecimalIdx} />
          <Route path={path + '/tables/catalogproductindexeavdecimalreplica'} component={CatalogProductIndexEavDecimalReplica} />
          <Route path={path + '/tables/catalogproductindexeavdecimaltmp'} component={CatalogProductIndexEavDecimalTmp} />
          <Route path={path + '/tables/catalogproductindexeavidx'} component={CatalogProductIndexEavIdx} />
          <Route path={path + '/tables/catalogproductindexeavreplica'} component={CatalogProductIndexEavReplica} />
          <Route path={path + '/tables/catalogproductindexeavtmp'} component={CatalogProductIndexEavTmp} />
          <Route path={path + '/tables/catalogproductindexprice'} component={CatalogProductIndexPrice} />
          <Route path={path + '/tables/catalogproductindexpricebundleidx'} component={CatalogProductIndexPriceBundleIdx} />
          <Route path={path + '/tables/catalogproductindexpricebundleoptidx'} component={CatalogProductIndexPriceBundleOptIdx} />
          <Route path={path + '/tables/catalogproductindexpricebundleopttmp'} component={CatalogProductIndexPriceBundleOptTmp} />
          <Route path={path + '/tables/catalogproductindexpricebundleselidx'} component={CatalogProductIndexPriceBundleSelIdx} />
          <Route path={path + '/tables/catalogproductindexpricebundleseltmp'} component={CatalogProductIndexPriceBundleSelTmp} />
          <Route path={path + '/tables/catalogproductindexpricebundletmp'} component={CatalogProductIndexPriceBundleTmp} />
          <Route path={path + '/tables/catalogproductindexpricecfgoptagridx'} component={CatalogProductIndexPriceCfgOptAgrIdx} />
          <Route path={path + '/tables/catalogproductindexpricecfgoptagrtmp'} component={CatalogProductIndexPriceCfgOptAgrTmp} />
          <Route path={path + '/tables/catalogproductindexpricecfgoptidx'} component={CatalogProductIndexPriceCfgOptIdx} />
          <Route path={path + '/tables/catalogproductindexpricecfgopttmp'} component={CatalogProductIndexPriceCfgOptTmp} />
          <Route path={path + '/tables/catalogproductindexpricedownlodidx'} component={CatalogProductIndexPriceDownlodIdx} />
          <Route path={path + '/tables/catalogproductindexpricedownlodtmp'} component={CatalogProductIndexPriceDownlodTmp} />
          <Route path={path + '/tables/catalogproductindexpricefinalidx'} component={CatalogProductIndexPriceFinalIdx} />
          <Route path={path + '/tables/catalogproductindexpricefinaltmp'} component={CatalogProductIndexPriceFinalTmp} />
          <Route path={path + '/tables/catalogproductindexpriceidx'} component={CatalogProductIndexPriceIdx} />
          <Route path={path + '/tables/catalogproductindexpriceoptagridx'} component={CatalogProductIndexPriceOptAgrIdx} />
          <Route path={path + '/tables/catalogproductindexpriceoptagrtmp'} component={CatalogProductIndexPriceOptAgrTmp} />
          <Route path={path + '/tables/catalogproductindexpriceoptidx'} component={CatalogProductIndexPriceOptIdx} />
          <Route path={path + '/tables/catalogproductindexpriceopttmp'} component={CatalogProductIndexPriceOptTmp} />
          <Route path={path + '/tables/catalogproductindexpricereplica'} component={CatalogProductIndexPriceReplica} />
          <Route path={path + '/tables/catalogproductindexpricetmp'} component={CatalogProductIndexPriceTmp} />
          <Route path={path + '/tables/catalogproductindextierprice'} component={CatalogProductIndexTierPrice} />
          <Route path={path + '/tables/catalogproductindexwebsite'} component={CatalogProductIndexWebsite} />
          <Route path={path + '/tables/catalogproductlink'} component={CatalogProductLink} />
          <Route path={path + '/tables/catalogproductlinkattribute'} component={CatalogProductLinkAttribute} />
          <Route path={path + '/tables/catalogproductlinkattributedecimal'} component={CatalogProductLinkAttributeDecimal} />
          <Route path={path + '/tables/catalogproductlinkattributeint'} component={CatalogProductLinkAttributeInt} />
          <Route path={path + '/tables/catalogproductlinkattributevarchar'} component={CatalogProductLinkAttributeVarchar} />
          <Route path={path + '/tables/catalogproductlinktype'} component={CatalogProductLinkType} />
          <Route path={path + '/tables/catalogproductoption'} component={CatalogProductOption} />
          <Route path={path + '/tables/catalogproductoptionprice'} component={CatalogProductOptionPrice} />
          <Route path={path + '/tables/catalogproductoptiontitle'} component={CatalogProductOptionTitle} />
          <Route path={path + '/tables/catalogproductoptiontypeprice'} component={CatalogProductOptionTypePrice} />
          <Route path={path + '/tables/catalogproductoptiontypetitle'} component={CatalogProductOptionTypeTitle} />
          <Route path={path + '/tables/catalogproductoptiontypevalue'} component={CatalogProductOptionTypeValue} />
          <Route path={path + '/tables/catalogproductrelation'} component={CatalogProductRelation} />
          <Route path={path + '/tables/catalogproductsuperattribute'} component={CatalogProductSuperAttribute} />
          <Route path={path + '/tables/catalogproductsuperattributelabel'} component={CatalogProductSuperAttributeLabel} />
          <Route path={path + '/tables/catalogproductsuperlink'} component={CatalogProductSuperLink} />
          <Route path={path + '/tables/catalogproductwebsite'} component={CatalogProductWebsite} />
          <Route path={path + '/tables/catalogurlrewriteproductcategory'} component={CatalogUrlRewriteProductCategory} />
          <Route path={path + '/tables/cataloginventorystock'} component={CataloginventoryStock} />
          <Route path={path + '/tables/cataloginventorystockitem'} component={CataloginventoryStockItem} />
          <Route path={path + '/tables/cataloginventorystockstatus'} component={CataloginventoryStockStatus} />
          <Route path={path + '/tables/cataloginventorystockstatusidx'} component={CataloginventoryStockStatusIdx} />
          <Route path={path + '/tables/cataloginventorystockstatusreplica'} component={CataloginventoryStockStatusReplica} />
          <Route path={path + '/tables/cataloginventorystockstatustmp'} component={CataloginventoryStockStatusTmp} />
          <Route path={path + '/tables/catalogrule'} component={Catalogrule} />
          <Route path={path + '/tables/catalogrulecustomergroup'} component={CatalogruleCustomerGroup} />
          <Route path={path + '/tables/catalogrulegroupwebsite'} component={CatalogruleGroupWebsite} />
          <Route path={path + '/tables/catalogrulegroupwebsitereplica'} component={CatalogruleGroupWebsiteReplica} />
          <Route path={path + '/tables/catalogruleproduct'} component={CatalogruleProduct} />
          <Route path={path + '/tables/catalogruleproductprice'} component={CatalogruleProductPrice} />
          <Route path={path + '/tables/catalogruleproductpricereplica'} component={CatalogruleProductPriceReplica} />
          <Route path={path + '/tables/catalogruleproductreplica'} component={CatalogruleProductReplica} />
          <Route path={path + '/tables/catalogrulewebsite'} component={CatalogruleWebsite} />
          <Route path={path + '/tables/catalogsearchfulltextscope1'} component={CatalogsearchFulltextScope1} />
          <Route path={path + '/tables/catalogsearchrecommendations'} component={CatalogsearchRecommendations} />
          <Route path={path + '/tables/checkoutagreement'} component={CheckoutAgreement} />
          <Route path={path + '/tables/checkoutagreementstore'} component={CheckoutAgreementStore} />
          <Route path={path + '/tables/cmsblock'} component={CmsBlock} />
          <Route path={path + '/tables/cmsblockstore'} component={CmsBlockStore} />
          <Route path={path + '/tables/cmspage'} component={CmsPage} />
          <Route path={path + '/tables/cmspagestore'} component={CmsPageStore} />
          <Route path={path + '/tables/coreconfigdata'} component={CoreConfigData} />
          <Route path={path + '/tables/cronschedule'} component={CronSchedule} />
          <Route path={path + '/tables/customeraddressentity'} component={CustomerAddressEntity} />
          <Route path={path + '/tables/customeraddressentitydatetime'} component={CustomerAddressEntityDatetime} />
          <Route path={path + '/tables/customeraddressentitydecimal'} component={CustomerAddressEntityDecimal} />
          <Route path={path + '/tables/customeraddressentityint'} component={CustomerAddressEntityInt} />
          <Route path={path + '/tables/customeraddressentitytext'} component={CustomerAddressEntityText} />
          <Route path={path + '/tables/customeraddressentityvarchar'} component={CustomerAddressEntityVarchar} />
          <Route path={path + '/tables/customereavattribute'} component={CustomerEavAttribute} />
          <Route path={path + '/tables/customereavattributewebsite'} component={CustomerEavAttributeWebsite} />
          <Route path={path + '/tables/customerentity'} component={CustomerEntity} />
          <Route path={path + '/tables/customerentitydatetime'} component={CustomerEntityDatetime} />
          <Route path={path + '/tables/customerentitydecimal'} component={CustomerEntityDecimal} />
          <Route path={path + '/tables/customerentityint'} component={CustomerEntityInt} />
          <Route path={path + '/tables/customerentitytext'} component={CustomerEntityText} />
          <Route path={path + '/tables/customerentityvarchar'} component={CustomerEntityVarchar} />
          <Route path={path + '/tables/customerformattribute'} component={CustomerFormAttribute} />
          <Route path={path + '/tables/customergridflat'} component={CustomerGridFlat} />
          <Route path={path + '/tables/customergroup'} component={CustomerGroup} />
          <Route path={path + '/tables/customerlog'} component={CustomerLog} />
          <Route path={path + '/tables/customervisitor'} component={CustomerVisitor} />
          <Route path={path + '/tables/designchange'} component={DesignChange} />
          <Route path={path + '/tables/designconfiggridflat'} component={DesignConfigGridFlat} />
          <Route path={path + '/tables/directorycountry'} component={DirectoryCountry} />
          <Route path={path + '/tables/directorycountryformat'} component={DirectoryCountryFormat} />
          <Route path={path + '/tables/directorycountryregion'} component={DirectoryCountryRegion} />
          <Route path={path + '/tables/directorycountryregionname'} component={DirectoryCountryRegionName} />
          <Route path={path + '/tables/directorycurrencyrate'} component={DirectoryCurrencyRate} />
          <Route path={path + '/tables/downloadablelink'} component={DownloadableLink} />
          <Route path={path + '/tables/downloadablelinkprice'} component={DownloadableLinkPrice} />
          <Route path={path + '/tables/downloadablelinkpurchased'} component={DownloadableLinkPurchased} />
          <Route path={path + '/tables/downloadablelinkpurchaseditem'} component={DownloadableLinkPurchasedItem} />
          <Route path={path + '/tables/downloadablelinktitle'} component={DownloadableLinkTitle} />
          <Route path={path + '/tables/downloadablesample'} component={DownloadableSample} />
          <Route path={path + '/tables/downloadablesampletitle'} component={DownloadableSampleTitle} />
          <Route path={path + '/tables/eavattribute'} component={EavAttribute} />
          <Route path={path + '/tables/eavattributegroup'} component={EavAttributeGroup} />
          <Route path={path + '/tables/eavattributelabel'} component={EavAttributeLabel} />
          <Route path={path + '/tables/eavattributeoption'} component={EavAttributeOption} />
          <Route path={path + '/tables/eavattributeoptionswatch'} component={EavAttributeOptionSwatch} />
          <Route path={path + '/tables/eavattributeoptionvalue'} component={EavAttributeOptionValue} />
          <Route path={path + '/tables/eavattributeset'} component={EavAttributeSet} />
          <Route path={path + '/tables/eaventity'} component={EavEntity} />
          <Route path={path + '/tables/eaventityattribute'} component={EavEntityAttribute} />
          <Route path={path + '/tables/eaventitydatetime'} component={EavEntityDatetime} />
          <Route path={path + '/tables/eaventitydecimal'} component={EavEntityDecimal} />
          <Route path={path + '/tables/eaventityint'} component={EavEntityInt} />
          <Route path={path + '/tables/eaventitystore'} component={EavEntityStore} />
          <Route path={path + '/tables/eaventitytext'} component={EavEntityText} />
          <Route path={path + '/tables/eaventitytype'} component={EavEntityType} />
          <Route path={path + '/tables/eaventityvarchar'} component={EavEntityVarchar} />
          <Route path={path + '/tables/eavformelement'} component={EavFormElement} />
          <Route path={path + '/tables/eavformfieldset'} component={EavFormFieldset} />
          <Route path={path + '/tables/eavformfieldsetlabel'} component={EavFormFieldsetLabel} />
          <Route path={path + '/tables/eavformtype'} component={EavFormType} />
          <Route path={path + '/tables/eavformtypeentity'} component={EavFormTypeEntity} />
          <Route path={path + '/tables/emailabandonedcart'} component={EmailAbandonedCart} />
          <Route path={path + '/tables/emailautomation'} component={EmailAutomation} />
          <Route path={path + '/tables/emailcampaign'} component={EmailCampaign} />
          <Route path={path + '/tables/emailcatalog'} component={EmailCatalog} />
          <Route path={path + '/tables/emailcontact'} component={EmailContact} />
          <Route path={path + '/tables/emailcontactconsent'} component={EmailContactConsent} />
          <Route path={path + '/tables/emailfailedauth'} component={EmailFailedAuth} />
          <Route path={path + '/tables/emailimporter'} component={EmailImporter} />
          <Route path={path + '/tables/emailorder'} component={EmailOrder} />
          <Route path={path + '/tables/emailreview'} component={EmailReview} />
          <Route path={path + '/tables/emailrules'} component={EmailRules} />
          <Route path={path + '/tables/emailtemplate'} component={EmailTemplate} />
          <Route path={path + '/tables/emailwishlist'} component={EmailWishlist} />
          <Route path={path + '/tables/flag'} component={Flag} />
          <Route path={path + '/tables/giftmessage'} component={GiftMessage} />
          <Route path={path + '/tables/googleoptimizercode'} component={GoogleoptimizerCode} />
          <Route path={path + '/tables/importhistory'} component={ImportHistory} />
          <Route path={path + '/tables/importexportimportdata'} component={ImportexportImportdata} />
          <Route path={path + '/tables/indexerstate'} component={IndexerState} />
          <Route path={path + '/tables/integration'} component={Integration} />
          <Route path={path + '/tables/inventorygeoname'} component={InventoryGeoname} />
          <Route path={path + '/tables/inventorylowstocknotificationconfiguration'} component={InventoryLowStockNotificationConfiguration} />
          <Route path={path + '/tables/inventoryreservation'} component={InventoryReservation} />
          <Route path={path + '/tables/inventoryshipmentsource'} component={InventoryShipmentSource} />
          <Route path={path + '/tables/inventorysource'} component={InventorySource} />
          <Route path={path + '/tables/inventorysourcecarrierlink'} component={InventorySourceCarrierLink} />
          <Route path={path + '/tables/inventorysourceitem'} component={InventorySourceItem} />
          <Route path={path + '/tables/inventorysourcestocklink'} component={InventorySourceStockLink} />
          <Route path={path + '/tables/inventorystock'} component={InventoryStock} />
          <Route path={path + '/tables/inventorystocksaleschannel'} component={InventoryStockSalesChannel} />
          <Route path={path + '/tables/klarnacoreorder'} component={KlarnaCoreOrder} />
          <Route path={path + '/tables/klarnapaymentsquote'} component={KlarnaPaymentsQuote} />
          <Route path={path + '/tables/layoutlink'} component={LayoutLink} />
          <Route path={path + '/tables/layoutupdate'} component={LayoutUpdate} />
          <Route path={path + '/tables/magentoacknowledgedbulk'} component={MagentoAcknowledgedBulk} />
          <Route path={path + '/tables/magentobulk'} component={MagentoBulk} />
          <Route path={path + '/tables/magentooperation'} component={MagentoOperation} />
          <Route path={path + '/tables/msptfacountrycodes'} component={MspTfaCountryCodes} />
          <Route path={path + '/tables/msptfatrusted'} component={MspTfaTrusted} />
          <Route path={path + '/tables/msptfauserconfig'} component={MspTfaUserConfig} />
          <Route path={path + '/tables/mviewstate'} component={MviewState} />
          <Route path={path + '/tables/newsletterproblem'} component={NewsletterProblem} />
          <Route path={path + '/tables/newsletterqueue'} component={NewsletterQueue} />
          <Route path={path + '/tables/newsletterqueuelink'} component={NewsletterQueueLink} />
          <Route path={path + '/tables/newsletterqueuestorelink'} component={NewsletterQueueStoreLink} />
          <Route path={path + '/tables/newslettersubscriber'} component={NewsletterSubscriber} />
          <Route path={path + '/tables/newslettertemplate'} component={NewsletterTemplate} />
          <Route path={path + '/tables/oauthconsumer'} component={OauthConsumer} />
          <Route path={path + '/tables/oauthnonce'} component={OauthNonce} />
          <Route path={path + '/tables/oauthtoken'} component={OauthToken} />
          <Route path={path + '/tables/oauthtokenrequestlog'} component={OauthTokenRequestLog} />
          <Route path={path + '/tables/passwordresetrequestevent'} component={PasswordResetRequestEvent} />
          <Route path={path + '/tables/patchlist'} component={PatchList} />
          <Route path={path + '/tables/paypalbillingagreement'} component={PaypalBillingAgreement} />
          <Route path={path + '/tables/paypalbillingagreementorder'} component={PaypalBillingAgreementOrder} />
          <Route path={path + '/tables/paypalcert'} component={PaypalCert} />
          <Route path={path + '/tables/paypalpaymenttransaction'} component={PaypalPaymentTransaction} />
          <Route path={path + '/tables/paypalsettlementreport'} component={PaypalSettlementReport} />
          <Route path={path + '/tables/paypalsettlementreportrow'} component={PaypalSettlementReportRow} />
          <Route path={path + '/tables/persistentsession'} component={PersistentSession} />
          <Route path={path + '/tables/productalertprice'} component={ProductAlertPrice} />
          <Route path={path + '/tables/productalertstock'} component={ProductAlertStock} />
          <Route path={path + '/tables/queue'} component={Queue} />
          <Route path={path + '/tables/queuelock'} component={QueueLock} />
          <Route path={path + '/tables/queuemessage'} component={QueueMessage} />
          <Route path={path + '/tables/queuemessagestatus'} component={QueueMessageStatus} />
          <Route path={path + '/tables/queuepoisonpill'} component={QueuePoisonPill} />
          <Route path={path + '/tables/quote'} component={Quote} />
          <Route path={path + '/tables/quoteaddress'} component={QuoteAddress} />
          <Route path={path + '/tables/quoteaddressitem'} component={QuoteAddressItem} />
          <Route path={path + '/tables/quoteidmask'} component={QuoteIdMask} />
          <Route path={path + '/tables/quoteitem'} component={QuoteItem} />
          <Route path={path + '/tables/quoteitemoption'} component={QuoteItemOption} />
          <Route path={path + '/tables/quotepayment'} component={QuotePayment} />
          <Route path={path + '/tables/quoteshippingrate'} component={QuoteShippingRate} />
          <Route path={path + '/tables/rating'} component={Rating} />
          <Route path={path + '/tables/ratingentity'} component={RatingEntity} />
          <Route path={path + '/tables/ratingoption'} component={RatingOption} />
          <Route path={path + '/tables/ratingoptionvote'} component={RatingOptionVote} />
          <Route path={path + '/tables/ratingoptionvoteaggregated'} component={RatingOptionVoteAggregated} />
          <Route path={path + '/tables/ratingstore'} component={RatingStore} />
          <Route path={path + '/tables/ratingtitle'} component={RatingTitle} />
          <Route path={path + '/tables/releasenotificationviewerlog'} component={ReleaseNotificationViewerLog} />
          <Route path={path + '/tables/reportcomparedproductindex'} component={ReportComparedProductIndex} />
          <Route path={path + '/tables/reportevent'} component={ReportEvent} />
          <Route path={path + '/tables/reporteventtypes'} component={ReportEventTypes} />
          <Route path={path + '/tables/reportviewedproductaggregateddaily'} component={ReportViewedProductAggregatedDaily} />
          <Route path={path + '/tables/reportviewedproductaggregatedmonthly'} component={ReportViewedProductAggregatedMonthly} />
          <Route path={path + '/tables/reportviewedproductaggregatedyearly'} component={ReportViewedProductAggregatedYearly} />
          <Route path={path + '/tables/reportviewedproductindex'} component={ReportViewedProductIndex} />
          <Route path={path + '/tables/reportingcounts'} component={ReportingCounts} />
          <Route path={path + '/tables/reportingmodulestatus'} component={ReportingModuleStatus} />
          <Route path={path + '/tables/reportingorders'} component={ReportingOrders} />
          <Route path={path + '/tables/reportingsystemupdates'} component={ReportingSystemUpdates} />
          <Route path={path + '/tables/reportingusers'} component={ReportingUsers} />
          <Route path={path + '/tables/review'} component={Review} />
          <Route path={path + '/tables/reviewdetail'} component={ReviewDetail} />
          <Route path={path + '/tables/reviewentity'} component={ReviewEntity} />
          <Route path={path + '/tables/reviewentitysummary'} component={ReviewEntitySummary} />
          <Route path={path + '/tables/reviewstatus'} component={ReviewStatus} />
          <Route path={path + '/tables/reviewstore'} component={ReviewStore} />
          <Route path={path + '/tables/salesbestsellersaggregateddaily'} component={SalesBestsellersAggregatedDaily} />
          <Route path={path + '/tables/salesbestsellersaggregatedmonthly'} component={SalesBestsellersAggregatedMonthly} />
          <Route path={path + '/tables/salesbestsellersaggregatedyearly'} component={SalesBestsellersAggregatedYearly} />
          <Route path={path + '/tables/salescreditmemo'} component={SalesCreditmemo} />
          <Route path={path + '/tables/salescreditmemocomment'} component={SalesCreditmemoComment} />
          <Route path={path + '/tables/salescreditmemogrid'} component={SalesCreditmemoGrid} />
          <Route path={path + '/tables/salescreditmemoitem'} component={SalesCreditmemoItem} />
          <Route path={path + '/tables/salesinvoice'} component={SalesInvoice} />
          <Route path={path + '/tables/salesinvoicecomment'} component={SalesInvoiceComment} />
          <Route path={path + '/tables/salesinvoicegrid'} component={SalesInvoiceGrid} />
          <Route path={path + '/tables/salesinvoiceitem'} component={SalesInvoiceItem} />
          <Route path={path + '/tables/salesinvoicedaggregated'} component={SalesInvoicedAggregated} />
          <Route path={path + '/tables/salesinvoicedaggregatedorder'} component={SalesInvoicedAggregatedOrder} />
          <Route path={path + '/tables/salesorder'} component={SalesOrder} />
          <Route path={path + '/tables/salesorderaddress'} component={SalesOrderAddress} />
          <Route path={path + '/tables/salesorderaggregatedcreated'} component={SalesOrderAggregatedCreated} />
          <Route path={path + '/tables/salesorderaggregatedupdated'} component={SalesOrderAggregatedUpdated} />
          <Route path={path + '/tables/salesordergrid'} component={SalesOrderGrid} />
          <Route path={path + '/tables/salesorderitem'} component={SalesOrderItem} />
          <Route path={path + '/tables/salesorderpayment'} component={SalesOrderPayment} />
          <Route path={path + '/tables/salesorderstatus'} component={SalesOrderStatus} />
          <Route path={path + '/tables/salesorderstatushistory'} component={SalesOrderStatusHistory} />
          <Route path={path + '/tables/salesorderstatuslabel'} component={SalesOrderStatusLabel} />
          <Route path={path + '/tables/salesorderstatusstate'} component={SalesOrderStatusState} />
          <Route path={path + '/tables/salesordertax'} component={SalesOrderTax} />
          <Route path={path + '/tables/salesordertaxitem'} component={SalesOrderTaxItem} />
          <Route path={path + '/tables/salespaymenttransaction'} component={SalesPaymentTransaction} />
          <Route path={path + '/tables/salesrefundedaggregated'} component={SalesRefundedAggregated} />
          <Route path={path + '/tables/salesrefundedaggregatedorder'} component={SalesRefundedAggregatedOrder} />
          <Route path={path + '/tables/salessequencemeta'} component={SalesSequenceMeta} />
          <Route path={path + '/tables/salessequenceprofile'} component={SalesSequenceProfile} />
          <Route path={path + '/tables/salesshipment'} component={SalesShipment} />
          <Route path={path + '/tables/salesshipmentcomment'} component={SalesShipmentComment} />
          <Route path={path + '/tables/salesshipmentgrid'} component={SalesShipmentGrid} />
          <Route path={path + '/tables/salesshipmentitem'} component={SalesShipmentItem} />
          <Route path={path + '/tables/salesshipmenttrack'} component={SalesShipmentTrack} />
          <Route path={path + '/tables/salesshippingaggregated'} component={SalesShippingAggregated} />
          <Route path={path + '/tables/salesshippingaggregatedorder'} component={SalesShippingAggregatedOrder} />
          <Route path={path + '/tables/salesrule'} component={Salesrule} />
          <Route path={path + '/tables/salesrulecoupon'} component={SalesruleCoupon} />
          <Route path={path + '/tables/salesrulecouponaggregated'} component={SalesruleCouponAggregated} />
          <Route path={path + '/tables/salesrulecouponaggregatedorder'} component={SalesruleCouponAggregatedOrder} />
          <Route path={path + '/tables/salesrulecouponaggregatedupdated'} component={SalesruleCouponAggregatedUpdated} />
          <Route path={path + '/tables/salesrulecouponusage'} component={SalesruleCouponUsage} />
          <Route path={path + '/tables/salesrulecustomer'} component={SalesruleCustomer} />
          <Route path={path + '/tables/salesrulecustomergroup'} component={SalesruleCustomerGroup} />
          <Route path={path + '/tables/salesrulelabel'} component={SalesruleLabel} />
          <Route path={path + '/tables/salesruleproductattribute'} component={SalesruleProductAttribute} />
          <Route path={path + '/tables/salesrulewebsite'} component={SalesruleWebsite} />
          <Route path={path + '/tables/searchquery'} component={SearchQuery} />
          <Route path={path + '/tables/searchsynonyms'} component={SearchSynonyms} />
          <Route path={path + '/tables/sendfriendlog'} component={SendfriendLog} />
          <Route path={path + '/tables/sequencecreditmemo0'} component={SequenceCreditmemo0} />
          <Route path={path + '/tables/sequencecreditmemo1'} component={SequenceCreditmemo1} />
          <Route path={path + '/tables/sequenceinvoice0'} component={SequenceInvoice0} />
          <Route path={path + '/tables/sequenceinvoice1'} component={SequenceInvoice1} />
          <Route path={path + '/tables/sequenceorder0'} component={SequenceOrder0} />
          <Route path={path + '/tables/sequenceorder1'} component={SequenceOrder1} />
          <Route path={path + '/tables/sequenceshipment0'} component={SequenceShipment0} />
          <Route path={path + '/tables/sequenceshipment1'} component={SequenceShipment1} />
          <Route path={path + '/tables/session'} component={Session} />
          <Route path={path + '/tables/setupmodule'} component={SetupModule} />
          <Route path={path + '/tables/shippingtablerate'} component={ShippingTablerate} />
          <Route path={path + '/tables/signifydcase'} component={SignifydCase} />
          <Route path={path + '/tables/sitemap'} component={Sitemap} />
          <Route path={path + '/tables/store'} component={Store} />
          <Route path={path + '/tables/storegroup'} component={StoreGroup} />
          <Route path={path + '/tables/storewebsite'} component={StoreWebsite} />
          <Route path={path + '/tables/taxcalculation'} component={TaxCalculation} />
          <Route path={path + '/tables/taxcalculationrate'} component={TaxCalculationRate} />
          <Route path={path + '/tables/taxcalculationratetitle'} component={TaxCalculationRateTitle} />
          <Route path={path + '/tables/taxcalculationrule'} component={TaxCalculationRule} />
          <Route path={path + '/tables/taxclass'} component={TaxClass} />
          <Route path={path + '/tables/taxorderaggregatedcreated'} component={TaxOrderAggregatedCreated} />
          <Route path={path + '/tables/taxorderaggregatedupdated'} component={TaxOrderAggregatedUpdated} />
          <Route path={path + '/tables/temandocheckoutaddress'} component={TemandoCheckoutAddress} />
          <Route path={path + '/tables/temandocollectionpointsearch'} component={TemandoCollectionPointSearch} />
          <Route path={path + '/tables/temandoorder'} component={TemandoOrder} />
          <Route path={path + '/tables/temandoordercollectionpoint'} component={TemandoOrderCollectionPoint} />
          <Route path={path + '/tables/temandoorderpickuplocation'} component={TemandoOrderPickupLocation} />
          <Route path={path + '/tables/temandopickuplocationsearch'} component={TemandoPickupLocationSearch} />
          <Route path={path + '/tables/temandoquotecollectionpoint'} component={TemandoQuoteCollectionPoint} />
          <Route path={path + '/tables/temandoquotepickuplocation'} component={TemandoQuotePickupLocation} />
          <Route path={path + '/tables/temandoshipment'} component={TemandoShipment} />
          <Route path={path + '/tables/theme'} component={Theme} />
          <Route path={path + '/tables/themefile'} component={ThemeFile} />
          <Route path={path + '/tables/translation'} component={Translation} />
          <Route path={path + '/tables/uibookmark'} component={UiBookmark} />
          <Route path={path + '/tables/urlrewrite'} component={UrlRewrite} />
          <Route path={path + '/tables/variable'} component={Variable} />
          <Route path={path + '/tables/variablevalue'} component={VariableValue} />
          <Route path={path + '/tables/vaultpaymenttoken'} component={VaultPaymentToken} />
          <Route path={path + '/tables/vaultpaymenttokenorderpaymentlink'} component={VaultPaymentTokenOrderPaymentLink} />
          <Route path={path + '/tables/vertexcustomercode'} component={VertexCustomerCode} />
          <Route path={path + '/tables/vertexinvoicesent'} component={VertexInvoiceSent} />
          <Route path={path + '/tables/vertexorderinvoicestatus'} component={VertexOrderInvoiceStatus} />
          <Route path={path + '/tables/vertexsalescreditmemoiteminvoicetextcode'} component={VertexSalesCreditmemoItemInvoiceTextCode} />
          <Route path={path + '/tables/vertexsalescreditmemoitemtaxcode'} component={VertexSalesCreditmemoItemTaxCode} />
          <Route path={path + '/tables/vertexsalescreditmemoitemvertextaxcode'} component={VertexSalesCreditmemoItemVertexTaxCode} />
          <Route path={path + '/tables/vertexsalesorderiteminvoicetextcode'} component={VertexSalesOrderItemInvoiceTextCode} />
          <Route path={path + '/tables/vertexsalesorderitemtaxcode'} component={VertexSalesOrderItemTaxCode} />
          <Route path={path + '/tables/vertexsalesorderitemvertextaxcode'} component={VertexSalesOrderItemVertexTaxCode} />
          <Route path={path + '/tables/vertextaxrequest'} component={VertexTaxrequest} />
          <Route path={path + '/tables/weeetax'} component={WeeeTax} />
          <Route path={path + '/tables/widget'} component={Widget} />
          <Route path={path + '/tables/widgetinstance'} component={WidgetInstance} />
          <Route path={path + '/tables/widgetinstancepage'} component={WidgetInstancePage} />
          <Route path={path + '/tables/widgetinstancepagelayout'} component={WidgetInstancePageLayout} />
          <Route path={path + '/tables/wishlist'} component={Wishlist} />
          <Route path={path + '/tables/wishlistitem'} component={WishlistItem} />
          <Route path={path + '/tables/wishlistitemoption'} component={WishlistItemOption} />
      </Switch>
  </div>
)};

export default TableMenu;