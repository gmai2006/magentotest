import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'parentId', header: 'parentId', defaultFlex: 1 },
  { name: 'baseShippingCaptured', header: 'baseShippingCaptured', defaultFlex: 1 },
  { name: 'shippingCaptured', header: 'shippingCaptured', defaultFlex: 1 },
  { name: 'amountRefunded', header: 'amountRefunded', defaultFlex: 1 },
  { name: 'baseAmountPaid', header: 'baseAmountPaid', defaultFlex: 1 },
  { name: 'amountCanceled', header: 'amountCanceled', defaultFlex: 1 },
  { name: 'baseAmountAuthorized', header: 'baseAmountAuthorized', defaultFlex: 1 },
  { name: 'baseAmountPaidOnline', header: 'baseAmountPaidOnline', defaultFlex: 1 },
  { name: 'baseAmountRefundedOnline', header: 'baseAmountRefundedOnline', defaultFlex: 1 },
  { name: 'baseShippingAmount', header: 'baseShippingAmount', defaultFlex: 1 },
  { name: 'shippingAmount', header: 'shippingAmount', defaultFlex: 1 },
  { name: 'amountPaid', header: 'amountPaid', defaultFlex: 1 },
  { name: 'amountAuthorized', header: 'amountAuthorized', defaultFlex: 1 },
  { name: 'baseAmountOrdered', header: 'baseAmountOrdered', defaultFlex: 1 },
  { name: 'baseShippingRefunded', header: 'baseShippingRefunded', defaultFlex: 1 },
  { name: 'shippingRefunded', header: 'shippingRefunded', defaultFlex: 1 },
  { name: 'baseAmountRefunded', header: 'baseAmountRefunded', defaultFlex: 1 },
  { name: 'amountOrdered', header: 'amountOrdered', defaultFlex: 1 },
  { name: 'baseAmountCanceled', header: 'baseAmountCanceled', defaultFlex: 1 },
  { name: 'quotePaymentId', header: 'quotePaymentId', defaultFlex: 1 },
  { name: 'additionalData', header: 'additionalData', defaultFlex: 1 },
  { name: 'ccExpMonth', header: 'ccExpMonth', defaultFlex: 1 },
  { name: 'ccSsStartYear', header: 'ccSsStartYear', defaultFlex: 1 },
  { name: 'echeckBankName', header: 'echeckBankName', defaultFlex: 1 },
  { name: 'method', header: 'method', defaultFlex: 1 },
  { name: 'ccDebugRequestBody', header: 'ccDebugRequestBody', defaultFlex: 1 },
  { name: 'ccSecureVerify', header: 'ccSecureVerify', defaultFlex: 1 },
  { name: 'protectionEligibility', header: 'protectionEligibility', defaultFlex: 1 },
  { name: 'ccApproval', header: 'ccApproval', defaultFlex: 1 },
  { name: 'ccLast4', header: 'ccLast4', defaultFlex: 1 },
  { name: 'ccStatusDescription', header: 'ccStatusDescription', defaultFlex: 1 },
  { name: 'echeckType', header: 'echeckType', defaultFlex: 1 },
  { name: 'ccDebugResponseSerialized', header: 'ccDebugResponseSerialized', defaultFlex: 1 },
  { name: 'ccSsStartMonth', header: 'ccSsStartMonth', defaultFlex: 1 },
  { name: 'echeckAccountType', header: 'echeckAccountType', defaultFlex: 1 },
  { name: 'lastTransId', header: 'lastTransId', defaultFlex: 1 },
  { name: 'ccCidStatus', header: 'ccCidStatus', defaultFlex: 1 },
  { name: 'ccOwner', header: 'ccOwner', defaultFlex: 1 },
  { name: 'ccType', header: 'ccType', defaultFlex: 1 },
  { name: 'poNumber', header: 'poNumber', defaultFlex: 1 },
  { name: 'ccExpYear', header: 'ccExpYear', defaultFlex: 1 },
  { name: 'ccStatus', header: 'ccStatus', defaultFlex: 1 },
  { name: 'echeckRoutingNumber', header: 'echeckRoutingNumber', defaultFlex: 1 },
  { name: 'accountStatus', header: 'accountStatus', defaultFlex: 1 },
  { name: 'anetTransMethod', header: 'anetTransMethod', defaultFlex: 1 },
  { name: 'ccDebugResponseBody', header: 'ccDebugResponseBody', defaultFlex: 1 },
  { name: 'ccSsIssue', header: 'ccSsIssue', defaultFlex: 1 },
  { name: 'echeckAccountName', header: 'echeckAccountName', defaultFlex: 1 },
  { name: 'ccAvsStatus', header: 'ccAvsStatus', defaultFlex: 1 },
  { name: 'ccNumberEnc', header: 'ccNumberEnc', defaultFlex: 1 },
  { name: 'ccTransId', header: 'ccTransId', defaultFlex: 1 },
  { name: 'addressStatus', header: 'addressStatus', defaultFlex: 1 },
  { name: 'additionalInformation', header: 'additionalInformation', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesorderpayment/selectAll',{
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

const SalesOrderPayment = () => {
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

export default SalesOrderPayment;