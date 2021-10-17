import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'convertedAt', header: 'convertedAt', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
  { name: 'isVirtual', header: 'isVirtual', defaultFlex: 1 },
  { name: 'isMultiShipping', header: 'isMultiShipping', defaultFlex: 1 },
  { name: 'itemsCount', header: 'itemsCount', defaultFlex: 1 },
  { name: 'itemsQty', header: 'itemsQty', defaultFlex: 1 },
  { name: 'origOrderId', header: 'origOrderId', defaultFlex: 1 },
  { name: 'storeToBaseRate', header: 'storeToBaseRate', defaultFlex: 1 },
  { name: 'storeToQuoteRate', header: 'storeToQuoteRate', defaultFlex: 1 },
  { name: 'baseCurrencyCode', header: 'baseCurrencyCode', defaultFlex: 1 },
  { name: 'storeCurrencyCode', header: 'storeCurrencyCode', defaultFlex: 1 },
  { name: 'quoteCurrencyCode', header: 'quoteCurrencyCode', defaultFlex: 1 },
  { name: 'grandTotal', header: 'grandTotal', defaultFlex: 1 },
  { name: 'baseGrandTotal', header: 'baseGrandTotal', defaultFlex: 1 },
  { name: 'checkoutMethod', header: 'checkoutMethod', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'customerTaxClassId', header: 'customerTaxClassId', defaultFlex: 1 },
  { name: 'customerGroupId', header: 'customerGroupId', defaultFlex: 1 },
  { name: 'customerEmail', header: 'customerEmail', defaultFlex: 1 },
  { name: 'customerPrefix', header: 'customerPrefix', defaultFlex: 1 },
  { name: 'customerFirstname', header: 'customerFirstname', defaultFlex: 1 },
  { name: 'customerMiddlename', header: 'customerMiddlename', defaultFlex: 1 },
  { name: 'customerLastname', header: 'customerLastname', defaultFlex: 1 },
  { name: 'customerSuffix', header: 'customerSuffix', defaultFlex: 1 },
  { name: 'customerDob', header: 'customerDob', defaultFlex: 1 },
  { name: 'customerNote', header: 'customerNote', defaultFlex: 1 },
  { name: 'customerNoteNotify', header: 'customerNoteNotify', defaultFlex: 1 },
  { name: 'customerIsGuest', header: 'customerIsGuest', defaultFlex: 1 },
  { name: 'remoteIp', header: 'remoteIp', defaultFlex: 1 },
  { name: 'appliedRuleIds', header: 'appliedRuleIds', defaultFlex: 1 },
  { name: 'reservedOrderId', header: 'reservedOrderId', defaultFlex: 1 },
  { name: 'passwordHash', header: 'passwordHash', defaultFlex: 1 },
  { name: 'couponCode', header: 'couponCode', defaultFlex: 1 },
  { name: 'globalCurrencyCode', header: 'globalCurrencyCode', defaultFlex: 1 },
  { name: 'baseToGlobalRate', header: 'baseToGlobalRate', defaultFlex: 1 },
  { name: 'baseToQuoteRate', header: 'baseToQuoteRate', defaultFlex: 1 },
  { name: 'customerTaxvat', header: 'customerTaxvat', defaultFlex: 1 },
  { name: 'customerGender', header: 'customerGender', defaultFlex: 1 },
  { name: 'subtotal', header: 'subtotal', defaultFlex: 1 },
  { name: 'baseSubtotal', header: 'baseSubtotal', defaultFlex: 1 },
  { name: 'subtotalWithDiscount', header: 'subtotalWithDiscount', defaultFlex: 1 },
  { name: 'baseSubtotalWithDiscount', header: 'baseSubtotalWithDiscount', defaultFlex: 1 },
  { name: 'isChanged', header: 'isChanged', defaultFlex: 1 },
  { name: 'triggerRecollect', header: 'triggerRecollect', defaultFlex: 1 },
  { name: 'extShippingInfo', header: 'extShippingInfo', defaultFlex: 1 },
  { name: 'giftMessageId', header: 'giftMessageId', defaultFlex: 1 },
  { name: 'isPersistent', header: 'isPersistent', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'quote/selectAll',{
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

const Quote = () => {
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

export default Quote;