import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'itemId', header: 'itemId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'parentItemId', header: 'parentItemId', defaultFlex: 1 },
  { name: 'quoteItemId', header: 'quoteItemId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'productType', header: 'productType', defaultFlex: 1 },
  { name: 'productOptions', header: 'productOptions', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'isVirtual', header: 'isVirtual', defaultFlex: 1 },
  { name: 'sku', header: 'sku', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'description', header: 'description', defaultFlex: 1 },
  { name: 'appliedRuleIds', header: 'appliedRuleIds', defaultFlex: 1 },
  { name: 'additionalData', header: 'additionalData', defaultFlex: 1 },
  { name: 'isQtyDecimal', header: 'isQtyDecimal', defaultFlex: 1 },
  { name: 'noDiscount', header: 'noDiscount', defaultFlex: 1 },
  { name: 'qtyBackordered', header: 'qtyBackordered', defaultFlex: 1 },
  { name: 'qtyCanceled', header: 'qtyCanceled', defaultFlex: 1 },
  { name: 'qtyInvoiced', header: 'qtyInvoiced', defaultFlex: 1 },
  { name: 'qtyOrdered', header: 'qtyOrdered', defaultFlex: 1 },
  { name: 'qtyRefunded', header: 'qtyRefunded', defaultFlex: 1 },
  { name: 'qtyShipped', header: 'qtyShipped', defaultFlex: 1 },
  { name: 'baseCost', header: 'baseCost', defaultFlex: 1 },
  { name: 'price', header: 'price', defaultFlex: 1 },
  { name: 'basePrice', header: 'basePrice', defaultFlex: 1 },
  { name: 'originalPrice', header: 'originalPrice', defaultFlex: 1 },
  { name: 'baseOriginalPrice', header: 'baseOriginalPrice', defaultFlex: 1 },
  { name: 'taxPercent', header: 'taxPercent', defaultFlex: 1 },
  { name: 'taxAmount', header: 'taxAmount', defaultFlex: 1 },
  { name: 'baseTaxAmount', header: 'baseTaxAmount', defaultFlex: 1 },
  { name: 'taxInvoiced', header: 'taxInvoiced', defaultFlex: 1 },
  { name: 'baseTaxInvoiced', header: 'baseTaxInvoiced', defaultFlex: 1 },
  { name: 'discountPercent', header: 'discountPercent', defaultFlex: 1 },
  { name: 'discountAmount', header: 'discountAmount', defaultFlex: 1 },
  { name: 'baseDiscountAmount', header: 'baseDiscountAmount', defaultFlex: 1 },
  { name: 'discountInvoiced', header: 'discountInvoiced', defaultFlex: 1 },
  { name: 'baseDiscountInvoiced', header: 'baseDiscountInvoiced', defaultFlex: 1 },
  { name: 'amountRefunded', header: 'amountRefunded', defaultFlex: 1 },
  { name: 'baseAmountRefunded', header: 'baseAmountRefunded', defaultFlex: 1 },
  { name: 'rowTotal', header: 'rowTotal', defaultFlex: 1 },
  { name: 'baseRowTotal', header: 'baseRowTotal', defaultFlex: 1 },
  { name: 'rowInvoiced', header: 'rowInvoiced', defaultFlex: 1 },
  { name: 'baseRowInvoiced', header: 'baseRowInvoiced', defaultFlex: 1 },
  { name: 'rowWeight', header: 'rowWeight', defaultFlex: 1 },
  { name: 'baseTaxBeforeDiscount', header: 'baseTaxBeforeDiscount', defaultFlex: 1 },
  { name: 'taxBeforeDiscount', header: 'taxBeforeDiscount', defaultFlex: 1 },
  { name: 'extOrderItemId', header: 'extOrderItemId', defaultFlex: 1 },
  { name: 'lockedDoInvoice', header: 'lockedDoInvoice', defaultFlex: 1 },
  { name: 'lockedDoShip', header: 'lockedDoShip', defaultFlex: 1 },
  { name: 'priceInclTax', header: 'priceInclTax', defaultFlex: 1 },
  { name: 'basePriceInclTax', header: 'basePriceInclTax', defaultFlex: 1 },
  { name: 'rowTotalInclTax', header: 'rowTotalInclTax', defaultFlex: 1 },
  { name: 'baseRowTotalInclTax', header: 'baseRowTotalInclTax', defaultFlex: 1 },
  { name: 'discountTaxCompensationAmount', header: 'discountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'baseDiscountTaxCompensationAmount', header: 'baseDiscountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'discountTaxCompensationInvoiced', header: 'discountTaxCompensationInvoiced', defaultFlex: 1 },
  { name: 'baseDiscountTaxCompensationInvoiced', header: 'baseDiscountTaxCompensationInvoiced', defaultFlex: 1 },
  { name: 'discountTaxCompensationRefunded', header: 'discountTaxCompensationRefunded', defaultFlex: 1 },
  { name: 'baseDiscountTaxCompensationRefunded', header: 'baseDiscountTaxCompensationRefunded', defaultFlex: 1 },
  { name: 'taxCanceled', header: 'taxCanceled', defaultFlex: 1 },
  { name: 'discountTaxCompensationCanceled', header: 'discountTaxCompensationCanceled', defaultFlex: 1 },
  { name: 'taxRefunded', header: 'taxRefunded', defaultFlex: 1 },
  { name: 'baseTaxRefunded', header: 'baseTaxRefunded', defaultFlex: 1 },
  { name: 'discountRefunded', header: 'discountRefunded', defaultFlex: 1 },
  { name: 'baseDiscountRefunded', header: 'baseDiscountRefunded', defaultFlex: 1 },
  { name: 'giftMessageId', header: 'giftMessageId', defaultFlex: 1 },
  { name: 'giftMessageAvailable', header: 'giftMessageAvailable', defaultFlex: 1 },
  { name: 'freeShipping', header: 'freeShipping', defaultFlex: 1 },
  { name: 'weeeTaxApplied', header: 'weeeTaxApplied', defaultFlex: 1 },
  { name: 'weeeTaxAppliedAmount', header: 'weeeTaxAppliedAmount', defaultFlex: 1 },
  { name: 'weeeTaxAppliedRowAmount', header: 'weeeTaxAppliedRowAmount', defaultFlex: 1 },
  { name: 'weeeTaxDisposition', header: 'weeeTaxDisposition', defaultFlex: 1 },
  { name: 'weeeTaxRowDisposition', header: 'weeeTaxRowDisposition', defaultFlex: 1 },
  { name: 'baseWeeeTaxAppliedAmount', header: 'baseWeeeTaxAppliedAmount', defaultFlex: 1 },
  { name: 'baseWeeeTaxAppliedRowAmnt', header: 'baseWeeeTaxAppliedRowAmnt', defaultFlex: 1 },
  { name: 'baseWeeeTaxDisposition', header: 'baseWeeeTaxDisposition', defaultFlex: 1 },
  { name: 'baseWeeeTaxRowDisposition', header: 'baseWeeeTaxRowDisposition', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesorderitem/selectAll',{
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

const SalesOrderItem = () => {
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

export default SalesOrderItem;