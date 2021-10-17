import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'addressId', header: 'addressId', defaultFlex: 1 },
  { name: 'quoteId', header: 'quoteId', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'saveInAddressBook', header: 'saveInAddressBook', defaultFlex: 1 },
  { name: 'customerAddressId', header: 'customerAddressId', defaultFlex: 1 },
  { name: 'addressType', header: 'addressType', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'prefix', header: 'prefix', defaultFlex: 1 },
  { name: 'firstname', header: 'firstname', defaultFlex: 1 },
  { name: 'middlename', header: 'middlename', defaultFlex: 1 },
  { name: 'lastname', header: 'lastname', defaultFlex: 1 },
  { name: 'suffix', header: 'suffix', defaultFlex: 1 },
  { name: 'company', header: 'company', defaultFlex: 1 },
  { name: 'street', header: 'street', defaultFlex: 1 },
  { name: 'city', header: 'city', defaultFlex: 1 },
  { name: 'region', header: 'region', defaultFlex: 1 },
  { name: 'regionId', header: 'regionId', defaultFlex: 1 },
  { name: 'postcode', header: 'postcode', defaultFlex: 1 },
  { name: 'countryId', header: 'countryId', defaultFlex: 1 },
  { name: 'telephone', header: 'telephone', defaultFlex: 1 },
  { name: 'fax', header: 'fax', defaultFlex: 1 },
  { name: 'sameAsBilling', header: 'sameAsBilling', defaultFlex: 1 },
  { name: 'collectShippingRates', header: 'collectShippingRates', defaultFlex: 1 },
  { name: 'shippingMethod', header: 'shippingMethod', defaultFlex: 1 },
  { name: 'shippingDescription', header: 'shippingDescription', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'subtotal', header: 'subtotal', defaultFlex: 1 },
  { name: 'baseSubtotal', header: 'baseSubtotal', defaultFlex: 1 },
  { name: 'subtotalWithDiscount', header: 'subtotalWithDiscount', defaultFlex: 1 },
  { name: 'baseSubtotalWithDiscount', header: 'baseSubtotalWithDiscount', defaultFlex: 1 },
  { name: 'taxAmount', header: 'taxAmount', defaultFlex: 1 },
  { name: 'baseTaxAmount', header: 'baseTaxAmount', defaultFlex: 1 },
  { name: 'shippingAmount', header: 'shippingAmount', defaultFlex: 1 },
  { name: 'baseShippingAmount', header: 'baseShippingAmount', defaultFlex: 1 },
  { name: 'shippingTaxAmount', header: 'shippingTaxAmount', defaultFlex: 1 },
  { name: 'baseShippingTaxAmount', header: 'baseShippingTaxAmount', defaultFlex: 1 },
  { name: 'discountAmount', header: 'discountAmount', defaultFlex: 1 },
  { name: 'baseDiscountAmount', header: 'baseDiscountAmount', defaultFlex: 1 },
  { name: 'grandTotal', header: 'grandTotal', defaultFlex: 1 },
  { name: 'baseGrandTotal', header: 'baseGrandTotal', defaultFlex: 1 },
  { name: 'customerNotes', header: 'customerNotes', defaultFlex: 1 },
  { name: 'appliedTaxes', header: 'appliedTaxes', defaultFlex: 1 },
  { name: 'discountDescription', header: 'discountDescription', defaultFlex: 1 },
  { name: 'shippingDiscountAmount', header: 'shippingDiscountAmount', defaultFlex: 1 },
  { name: 'baseShippingDiscountAmount', header: 'baseShippingDiscountAmount', defaultFlex: 1 },
  { name: 'subtotalInclTax', header: 'subtotalInclTax', defaultFlex: 1 },
  { name: 'baseSubtotalTotalInclTax', header: 'baseSubtotalTotalInclTax', defaultFlex: 1 },
  { name: 'discountTaxCompensationAmount', header: 'discountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'baseDiscountTaxCompensationAmount', header: 'baseDiscountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'shippingDiscountTaxCompensationAmount', header: 'shippingDiscountTaxCompensationAmount', defaultFlex: 1 },
  { name: 'baseShippingDiscountTaxCompensationAmnt', header: 'baseShippingDiscountTaxCompensationAmnt', defaultFlex: 1 },
  { name: 'shippingInclTax', header: 'shippingInclTax', defaultFlex: 1 },
  { name: 'baseShippingInclTax', header: 'baseShippingInclTax', defaultFlex: 1 },
  { name: 'vatId', header: 'vatId', defaultFlex: 1 },
  { name: 'vatIsValid', header: 'vatIsValid', defaultFlex: 1 },
  { name: 'vatRequestId', header: 'vatRequestId', defaultFlex: 1 },
  { name: 'vatRequestDate', header: 'vatRequestDate', defaultFlex: 1 },
  { name: 'vatRequestSuccess', header: 'vatRequestSuccess', defaultFlex: 1 },
  { name: 'validatedCountryCode', header: 'validatedCountryCode', defaultFlex: 1 },
  { name: 'validatedVatNumber', header: 'validatedVatNumber', defaultFlex: 1 },
  { name: 'giftMessageId', header: 'giftMessageId', defaultFlex: 1 },
  { name: 'freeShipping', header: 'freeShipping', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'quoteaddress/selectAll',{
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

const QuoteAddress = () => {
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

export default QuoteAddress;