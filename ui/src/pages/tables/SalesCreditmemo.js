import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'adjustmentPositive', header: 'adjustmentPositive', defaultFlex: 1 },
  { name: 'baseShippingTaxAmount', header: 'baseShippingTaxAmount', defaultFlex: 1 },
  { name: 'storeToOrderRate', header: 'storeToOrderRate', defaultFlex: 1 },
  { name: 'baseDiscountAmount', header: 'baseDiscountAmount', defaultFlex: 1 },
  { name: 'baseToOrderRate', header: 'baseToOrderRate', defaultFlex: 1 },
  { name: 'grandTotal', header: 'grandTotal', defaultFlex: 1 },
  { name: 'baseAdjustmentNegative', header: 'baseAdjustmentNegative', defaultFlex: 1 },
  { name: 'baseSubtotalInclTax', header: 'baseSubtotalInclTax', defaultFlex: 1 },
  { name: 'shippingAmount', header: 'shippingAmount', defaultFlex: 1 },
  { name: 'subtotalInclTax', header: 'subtotalInclTax', defaultFlex: 1 },
  { name: 'adjustmentNegative', header: 'adjustmentNegative', defaultFlex: 1 },
  { name: 'baseShippingAmount', header: 'baseShippingAmount', defaultFlex: 1 },
  { name: 'storeToBaseRate', header: 'storeToBaseRate', defaultFlex: 1 },
  { name: 'baseToGlobalRate', header: 'baseToGlobalRate', defaultFlex: 1 },
  { name: 'baseAdjustment', header: 'baseAdjustment', defaultFlex: 1 },
  { name: 'baseSubtotal', header: 'baseSubtotal', defaultFlex: 1 },
  { name: 'discountAmount', header: 'discountAmount', defaultFlex: 1 },
  { name: 'subtotal', header: 'subtotal', defaultFlex: 1 },
  { name: 'adjustment', header: 'adjustment', defaultFlex: 1 },
  { name: 'baseGrandTotal', header: 'baseGrandTotal', defaultFlex: 1 },
  { name: 'baseAdjustmentPositive', header: 'baseAdjustmentPositive', defaultFlex: 1 },
  { name: 'baseTaxAmount', header: 'baseTaxAmount', defaultFlex: 1 },
  { name: 'shippingTaxAmount', header: 'shippingTaxAmount', defaultFlex: 1 },
  { name: 'taxAmount', header: 'taxAmount', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'emailSent', header: 'emailSent', defaultFlex: 1 },
  { name: 'sendEmail', header: 'sendEmail', defaultFlex: 1 },
  { name: 'creditmemoStatus', header: 'creditmemoStatus', defaultFlex: 1 },
  { name: 'state', header: 'state', defaultFlex: 1 },
  { name: 'shippingAddressId', header: 'shippingAddressId', defaultFlex: 1 },
  { name: 'billingAddressId', header: 'billingAddressId', defaultFlex: 1 },
  { name: 'invoiceId', header: 'invoiceId', defaultFlex: 1 },
  { name: 'storeCurrencyCode', header: 'storeCurrencyCode', defaultFlex: 1 },
  { name: 'orderCurrencyCode', header: 'orderCurrencyCode', defaultFlex: 1 },
  { name: 'baseCurrencyCode', header: 'baseCurrencyCode', defaultFlex: 1 },
  { name: 'globalCurrencyCode', header: 'globalCurrencyCode', defaultFlex: 1 },
  { name: 'transactionId', header: 'transactionId', defaultFlex: 1 },
  { name: 'incrementId', header: 'incrementId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'discountTaxCompensationAmount', header: 'discountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'baseDiscountTaxCompensationAmount', header: 'baseDiscountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'shippingDiscountTaxCompensationAmount', header: 'shippingDiscountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'baseShippingDiscountTaxCompensationAmnt', header: 'baseShippingDiscountTaxCompensationAmnt', defaultFlex: 1 },
  { name: 'shippingInclTax', header: 'shippingInclTax', defaultFlex: 1 },
  { name: 'baseShippingInclTax', header: 'baseShippingInclTax', defaultFlex: 1 },
  { name: 'discountDescription', header: 'discountDescription', defaultFlex: 1 },
  { name: 'customerNote', header: 'customerNote', defaultFlex: 1 },
  { name: 'customerNoteNotify', header: 'customerNoteNotify', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salescreditmemo/selectAll',{
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

const SalesCreditmemo = () => {
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

export default SalesCreditmemo;