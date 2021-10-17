import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'addressItemId', header: 'addressItemId', defaultFlex: 1 },
  { name: 'parentItemId', header: 'parentItemId', defaultFlex: 1 },
  { name: 'quoteAddressId', header: 'quoteAddressId', defaultFlex: 1 },
  { name: 'quoteItemId', header: 'quoteItemId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'appliedRuleIds', header: 'appliedRuleIds', defaultFlex: 1 },
  { name: 'additionalData', header: 'additionalData', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'qty', header: 'qty', defaultFlex: 1 },
  { name: 'discountAmount', header: 'discountAmount', defaultFlex: 1 },
  { name: 'taxAmount', header: 'taxAmount', defaultFlex: 1 },
  { name: 'rowTotal', header: 'rowTotal', defaultFlex: 1 },
  { name: 'baseRowTotal', header: 'baseRowTotal', defaultFlex: 1 },
  { name: 'rowTotalWithDiscount', header: 'rowTotalWithDiscount', defaultFlex: 1 },
  { name: 'baseDiscountAmount', header: 'baseDiscountAmount', defaultFlex: 1 },
  { name: 'baseTaxAmount', header: 'baseTaxAmount', defaultFlex: 1 },
  { name: 'rowWeight', header: 'rowWeight', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'superProductId', header: 'superProductId', defaultFlex: 1 },
  { name: 'parentProductId', header: 'parentProductId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'sku', header: 'sku', defaultFlex: 1 },
  { name: 'image', header: 'image', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'description', header: 'description', defaultFlex: 1 },
  { name: 'isQtyDecimal', header: 'isQtyDecimal', defaultFlex: 1 },
  { name: 'price', header: 'price', defaultFlex: 1 },
  { name: 'discountPercent', header: 'discountPercent', defaultFlex: 1 },
  { name: 'noDiscount', header: 'noDiscount', defaultFlex: 1 },
  { name: 'taxPercent', header: 'taxPercent', defaultFlex: 1 },
  { name: 'basePrice', header: 'basePrice', defaultFlex: 1 },
  { name: 'baseCost', header: 'baseCost', defaultFlex: 1 },
  { name: 'priceInclTax', header: 'priceInclTax', defaultFlex: 1 },
  { name: 'basePriceInclTax', header: 'basePriceInclTax', defaultFlex: 1 },
  { name: 'rowTotalInclTax', header: 'rowTotalInclTax', defaultFlex: 1 },
  { name: 'baseRowTotalInclTax', header: 'baseRowTotalInclTax', defaultFlex: 1 },
  { name: 'discountTaxCompensationAmount', header: 'discountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'baseDiscountTaxCompensationAmount', header: 'baseDiscountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'giftMessageId', header: 'giftMessageId', defaultFlex: 1 },
  { name: 'freeShipping', header: 'freeShipping', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'quoteaddressitem/selectAll',{
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

const QuoteAddressItem = () => {
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

export default QuoteAddressItem;