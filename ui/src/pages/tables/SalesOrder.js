import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'state', header: 'state', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'couponCode', header: 'couponCode', defaultFlex: 1 },
  { name: 'protectCode', header: 'protectCode', defaultFlex: 1 },
  { name: 'shippingDescription', header: 'shippingDescription', defaultFlex: 1 },
  { name: 'isVirtual', header: 'isVirtual', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'baseDiscountAmount', header: 'baseDiscountAmount', defaultFlex: 1 },
  { name: 'baseDiscountCanceled', header: 'baseDiscountCanceled', defaultFlex: 1 },
  { name: 'baseDiscountInvoiced', header: 'baseDiscountInvoiced', defaultFlex: 1 },
  { name: 'baseDiscountRefunded', header: 'baseDiscountRefunded', defaultFlex: 1 },
  { name: 'baseGrandTotal', header: 'baseGrandTotal', defaultFlex: 1 },
  { name: 'baseShippingAmount', header: 'baseShippingAmount', defaultFlex: 1 },
  { name: 'baseShippingCanceled', header: 'baseShippingCanceled', defaultFlex: 1 },
  { name: 'baseShippingInvoiced', header: 'baseShippingInvoiced', defaultFlex: 1 },
  { name: 'baseShippingRefunded', header: 'baseShippingRefunded', defaultFlex: 1 },
  { name: 'baseShippingTaxAmount', header: 'baseShippingTaxAmount', defaultFlex: 1 },
  { name: 'baseShippingTaxRefunded', header: 'baseShippingTaxRefunded', defaultFlex: 1 },
  { name: 'baseSubtotal', header: 'baseSubtotal', defaultFlex: 1 },
  { name: 'baseSubtotalCanceled', header: 'baseSubtotalCanceled', defaultFlex: 1 },
  { name: 'baseSubtotalInvoiced', header: 'baseSubtotalInvoiced', defaultFlex: 1 },
  { name: 'baseSubtotalRefunded', header: 'baseSubtotalRefunded', defaultFlex: 1 },
  { name: 'baseTaxAmount', header: 'baseTaxAmount', defaultFlex: 1 },
  { name: 'baseTaxCanceled', header: 'baseTaxCanceled', defaultFlex: 1 },
  { name: 'baseTaxInvoiced', header: 'baseTaxInvoiced', defaultFlex: 1 },
  { name: 'baseTaxRefunded', header: 'baseTaxRefunded', defaultFlex: 1 },
  { name: 'baseToGlobalRate', header: 'baseToGlobalRate', defaultFlex: 1 },
  { name: 'baseToOrderRate', header: 'baseToOrderRate', defaultFlex: 1 },
  { name: 'baseTotalCanceled', header: 'baseTotalCanceled', defaultFlex: 1 },
  { name: 'baseTotalInvoiced', header: 'baseTotalInvoiced', defaultFlex: 1 },
  { name: 'baseTotalInvoicedCost', header: 'baseTotalInvoicedCost', defaultFlex: 1 },
  { name: 'baseTotalOfflineRefunded', header: 'baseTotalOfflineRefunded', defaultFlex: 1 },
  { name: 'baseTotalOnlineRefunded', header: 'baseTotalOnlineRefunded', defaultFlex: 1 },
  { name: 'baseTotalPaid', header: 'baseTotalPaid', defaultFlex: 1 },
  { name: 'baseTotalQtyOrdered', header: 'baseTotalQtyOrdered', defaultFlex: 1 },
  { name: 'baseTotalRefunded', header: 'baseTotalRefunded', defaultFlex: 1 },
  { name: 'discountAmount', header: 'discountAmount', defaultFlex: 1 },
  { name: 'discountCanceled', header: 'discountCanceled', defaultFlex: 1 },
  { name: 'discountInvoiced', header: 'discountInvoiced', defaultFlex: 1 },
  { name: 'discountRefunded', header: 'discountRefunded', defaultFlex: 1 },
  { name: 'grandTotal', header: 'grandTotal', defaultFlex: 1 },
  { name: 'shippingAmount', header: 'shippingAmount', defaultFlex: 1 },
  { name: 'shippingCanceled', header: 'shippingCanceled', defaultFlex: 1 },
  { name: 'shippingInvoiced', header: 'shippingInvoiced', defaultFlex: 1 },
  { name: 'shippingRefunded', header: 'shippingRefunded', defaultFlex: 1 },
  { name: 'shippingTaxAmount', header: 'shippingTaxAmount', defaultFlex: 1 },
  { name: 'shippingTaxRefunded', header: 'shippingTaxRefunded', defaultFlex: 1 },
  { name: 'storeToBaseRate', header: 'storeToBaseRate', defaultFlex: 1 },
  { name: 'storeToOrderRate', header: 'storeToOrderRate', defaultFlex: 1 },
  { name: 'subtotal', header: 'subtotal', defaultFlex: 1 },
  { name: 'subtotalCanceled', header: 'subtotalCanceled', defaultFlex: 1 },
  { name: 'subtotalInvoiced', header: 'subtotalInvoiced', defaultFlex: 1 },
  { name: 'subtotalRefunded', header: 'subtotalRefunded', defaultFlex: 1 },
  { name: 'taxAmount', header: 'taxAmount', defaultFlex: 1 },
  { name: 'taxCanceled', header: 'taxCanceled', defaultFlex: 1 },
  { name: 'taxInvoiced', header: 'taxInvoiced', defaultFlex: 1 },
  { name: 'taxRefunded', header: 'taxRefunded', defaultFlex: 1 },
  { name: 'totalCanceled', header: 'totalCanceled', defaultFlex: 1 },
  { name: 'totalInvoiced', header: 'totalInvoiced', defaultFlex: 1 },
  { name: 'totalOfflineRefunded', header: 'totalOfflineRefunded', defaultFlex: 1 },
  { name: 'totalOnlineRefunded', header: 'totalOnlineRefunded', defaultFlex: 1 },
  { name: 'totalPaid', header: 'totalPaid', defaultFlex: 1 },
  { name: 'totalQtyOrdered', header: 'totalQtyOrdered', defaultFlex: 1 },
  { name: 'totalRefunded', header: 'totalRefunded', defaultFlex: 1 },
  { name: 'canShipPartially', header: 'canShipPartially', defaultFlex: 1 },
  { name: 'canShipPartiallyItem', header: 'canShipPartiallyItem', defaultFlex: 1 },
  { name: 'customerIsGuest', header: 'customerIsGuest', defaultFlex: 1 },
  { name: 'customerNoteNotify', header: 'customerNoteNotify', defaultFlex: 1 },
  { name: 'billingAddressId', header: 'billingAddressId', defaultFlex: 1 },
  { name: 'customerGroupId', header: 'customerGroupId', defaultFlex: 1 },
  { name: 'editIncrement', header: 'editIncrement', defaultFlex: 1 },
  { name: 'emailSent', header: 'emailSent', defaultFlex: 1 },
  { name: 'sendEmail', header: 'sendEmail', defaultFlex: 1 },
  { name: 'forcedShipmentWithInvoice', header: 'forcedShipmentWithInvoice', defaultFlex: 1 },
  { name: 'paymentAuthExpiration', header: 'paymentAuthExpiration', defaultFlex: 1 },
  { name: 'quoteAddressId', header: 'quoteAddressId', defaultFlex: 1 },
  { name: 'quoteId', header: 'quoteId', defaultFlex: 1 },
  { name: 'shippingAddressId', header: 'shippingAddressId', defaultFlex: 1 },
  { name: 'adjustmentNegative', header: 'adjustmentNegative', defaultFlex: 1 },
  { name: 'adjustmentPositive', header: 'adjustmentPositive', defaultFlex: 1 },
  { name: 'baseAdjustmentNegative', header: 'baseAdjustmentNegative', defaultFlex: 1 },
  { name: 'baseAdjustmentPositive', header: 'baseAdjustmentPositive', defaultFlex: 1 },
  { name: 'baseShippingDiscountAmount', header: 'baseShippingDiscountAmount', defaultFlex: 1 },
  { name: 'baseSubtotalInclTax', header: 'baseSubtotalInclTax', defaultFlex: 1 },
  { name: 'baseTotalDue', header: 'baseTotalDue', defaultFlex: 1 },
  { name: 'paymentAuthorizationAmount', header: 'paymentAuthorizationAmount', defaultFlex: 1 },
  { name: 'shippingDiscountAmount', header: 'shippingDiscountAmount', defaultFlex: 1 },
  { name: 'subtotalInclTax', header: 'subtotalInclTax', defaultFlex: 1 },
  { name: 'totalDue', header: 'totalDue', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'customerDob', header: 'customerDob', defaultFlex: 1 },
  { name: 'incrementId', header: 'incrementId', defaultFlex: 1 },
  { name: 'appliedRuleIds', header: 'appliedRuleIds', defaultFlex: 1 },
  { name: 'baseCurrencyCode', header: 'baseCurrencyCode', defaultFlex: 1 },
  { name: 'customerEmail', header: 'customerEmail', defaultFlex: 1 },
  { name: 'customerFirstname', header: 'customerFirstname', defaultFlex: 1 },
  { name: 'customerLastname', header: 'customerLastname', defaultFlex: 1 },
  { name: 'customerMiddlename', header: 'customerMiddlename', defaultFlex: 1 },
  { name: 'customerPrefix', header: 'customerPrefix', defaultFlex: 1 },
  { name: 'customerSuffix', header: 'customerSuffix', defaultFlex: 1 },
  { name: 'customerTaxvat', header: 'customerTaxvat', defaultFlex: 1 },
  { name: 'discountDescription', header: 'discountDescription', defaultFlex: 1 },
  { name: 'extCustomerId', header: 'extCustomerId', defaultFlex: 1 },
  { name: 'extOrderId', header: 'extOrderId', defaultFlex: 1 },
  { name: 'globalCurrencyCode', header: 'globalCurrencyCode', defaultFlex: 1 },
  { name: 'holdBeforeState', header: 'holdBeforeState', defaultFlex: 1 },
  { name: 'holdBeforeStatus', header: 'holdBeforeStatus', defaultFlex: 1 },
  { name: 'orderCurrencyCode', header: 'orderCurrencyCode', defaultFlex: 1 },
  { name: 'originalIncrementId', header: 'originalIncrementId', defaultFlex: 1 },
  { name: 'relationChildId', header: 'relationChildId', defaultFlex: 1 },
  { name: 'relationChildRealId', header: 'relationChildRealId', defaultFlex: 1 },
  { name: 'relationParentId', header: 'relationParentId', defaultFlex: 1 },
  { name: 'relationParentRealId', header: 'relationParentRealId', defaultFlex: 1 },
  { name: 'remoteIp', header: 'remoteIp', defaultFlex: 1 },
  { name: 'shippingMethod', header: 'shippingMethod', defaultFlex: 1 },
  { name: 'storeCurrencyCode', header: 'storeCurrencyCode', defaultFlex: 1 },
  { name: 'storeName', header: 'storeName', defaultFlex: 1 },
  { name: 'xForwardedFor', header: 'xForwardedFor', defaultFlex: 1 },
  { name: 'customerNote', header: 'customerNote', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'totalItemCount', header: 'totalItemCount', defaultFlex: 1 },
  { name: 'customerGender', header: 'customerGender', defaultFlex: 1 },
  { name: 'discountTaxCompensationAmount', header: 'discountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'baseDiscountTaxCompensationAmount', header: 'baseDiscountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'shippingDiscountTaxCompensationAmount', header: 'shippingDiscountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'baseShippingDiscountTaxCompensationAmnt', header: 'baseShippingDiscountTaxCompensationAmnt', defaultFlex: 1 },
  { name: 'discountTaxCompensationInvoiced', header: 'discountTaxCompensationInvoiced', defaultFlex: 1 },
  { name: 'baseDiscountTaxCompensationInvoiced', header: 'baseDiscountTaxCompensationInvoiced', defaultFlex: 1 },
  { name: 'discountTaxCompensationRefunded', header: 'discountTaxCompensationRefunded', defaultFlex: 1 },
  { name: 'baseDiscountTaxCompensationRefunded', header: 'baseDiscountTaxCompensationRefunded', defaultFlex: 1 },
  { name: 'shippingInclTax', header: 'shippingInclTax', defaultFlex: 1 },
  { name: 'baseShippingInclTax', header: 'baseShippingInclTax', defaultFlex: 1 },
  { name: 'couponRuleName', header: 'couponRuleName', defaultFlex: 1 },
  { name: 'giftMessageId', header: 'giftMessageId', defaultFlex: 1 },
  { name: 'paypalIpnCustomerNotified', header: 'paypalIpnCustomerNotified', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesorder/selectAll',{
    headers : {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
     }
  }).then(response => {
    return response.json().then(data => {
      console.log(data);
      return data;
    })
  })
}

const SalesOrder = () => {
  const dataSource = useCallback(loadData, []);
  return (
      <ReactDataGrid
        idProperty="id"
        style={gridStyle}
        columns={columns}
        pagination
        defaultLimit={15}
        defaultSkip={15}
        dataSource={dataSource}
        />
  )
}

export default SalesOrder;